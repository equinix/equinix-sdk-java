package com.equinix.openapi.fabric.tests;

import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.openapi.fabric.tests.helpers.Utils;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.equinix.openapi.fabric.tests.ConnectionsApiTest.waitForConnectionIsInState;
import static com.equinix.openapi.fabric.tests.PortsApiTest.getPorts;
import static com.equinix.openapi.fabric.tests.helpers.Apis.*;
import static com.equinix.openapi.fabric.tests.helpers.TokenGenerator.users;
import static com.equinix.openapi.fabric.tests.helpers.Utils.getRandomVlanNumber;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InternetAccessApiTest {

    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FNV;
    private static final UsersItem testData = Utils.getUserData(userName);
    private static final String IA_METRO = "SV";
    private static final int DELETE_RETRY_INTERVAL_MS = 5000;
    private static final int DELETE_MAX_ATTEMPTS = 11;
    private static final int STATE_RETRY_INTERVAL_MS = 5000;
    private static final int STATE_MAX_ATTEMPTS = 20;
    private static final int INITIAL_BANDWIDTH = 50;
    private static final int[] BANDWIDTH_CANDIDATES = {100, 200, 500, 1000};
    private static UUID createdServiceUuid;
    private static UUID createdIpBlockUuid;

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    @AfterClass
    public static void tearDown() {
        boolean serviceDeleted = waitForServiceDeleted();
        deleteCreatedIpBlock();
        assertTrue("Internet Access Service " + createdServiceUuid + " was not deleted", serviceDeleted);
    }

    @Test
    public void test1_createEiaService() throws ApiException {
        InternetAccessService service = createInternetAccessService();
        createdServiceUuid = service.getUuid();
        assertNotNull("Created Internet Access Service has no UUID", createdServiceUuid);
    }

    @Test
    public void test2_getEiaService() throws ApiException {
        assertNotNull("No Internet Access Service was created", createdServiceUuid);
        InternetAccessService service = internetAccessServicesApi.getEiaService(createdServiceUuid);
        assertEquals(200, internetAccessServicesApi.getApiClient().getStatusCode());
        assertEquals(createdServiceUuid, service.getUuid());
    }

    @Test
    public void test3_searchEiaServices() throws ApiException {
        assertNotNull("No Internet Access Service was created", createdServiceUuid);
        InternetAccessServices services = searchServices();
        assertEquals(200, internetAccessServicesApi.getApiClient().getStatusCode());
        assertFalse(services.getData().isEmpty());
        assertTrue("Search returned services that are not PROVISIONED", services.getData().stream()
                .allMatch(s -> s.getState() == InternetAccessServiceState.PROVISIONED));
        boolean found = services.getData().stream()
                .anyMatch(s -> createdServiceUuid.equals(s.getUuid()));
        assertTrue("Created Internet Access Service " + createdServiceUuid + " not found in search results", found);
    }

    @Test
    public void test4_patchEiaService() throws ApiException {
        assertNotNull("No Internet Access Service was created", createdServiceUuid);

        for (int bandwidth : BANDWIDTH_CANDIDATES) {
            try {
                InternetAccessPatchOperationUpdate operation = new InternetAccessPatchOperationUpdate()
                        .op(InternetAccessPatchOperationUpdateAllowedOp.REPLACE)
                        .path("/bandwidth")
                        .value(bandwidth);

                internetAccessServicesApi.patchEiaService(createdServiceUuid, singletonList(operation));
                assertEquals(202, internetAccessServicesApi.getApiClient().getStatusCode());
                return;
            } catch (ApiException e) {
                String body = String.valueOf(e.getResponseBody());
                if (body.contains("EQ-7100076")) {
                    continue;
                }
                if (body.contains("EQ-7100077")) {
                    try {
                        Thread.sleep(STATE_RETRY_INTERVAL_MS);
                    } catch (InterruptedException ie) {
                        throw new RuntimeException(ie);
                    }
                    continue;
                }
                throw e;
            }
        }
        fail("Could not patch bandwidth to a new value for service " + createdServiceUuid);
    }

    @Test
    public void test5_deleteEiaService() throws ApiException {
        assertNotNull("No Internet Access Service was created", createdServiceUuid);
        assertTrue("Internet Access Service was not PROVISIONED before delete",
                waitForServiceIsInState(createdServiceUuid, InternetAccessServiceState.PROVISIONED));
        assertTrue("Internet Access Service was not deleted in time", deleteEiaService(createdServiceUuid));
    }

    private static boolean waitForServiceDeleted() {
        if (createdServiceUuid == null) {
            return true;
        }
        for (int attempt = 1; attempt <= DELETE_MAX_ATTEMPTS; attempt++) {
            try {
                InternetAccessServiceState state = internetAccessServicesApi.getEiaService(createdServiceUuid).getState();
                if (state == InternetAccessServiceState.DEPROVISIONED) {
                    return true;
                }
            } catch (ApiException e) {
                if (e.getCode() == 404) {
                    return true;
                }
                System.out.println("Service delete check attempt " + attempt + " for " + createdServiceUuid + ": " + e.getMessage());
            }
            try {
                Thread.sleep(DELETE_RETRY_INTERVAL_MS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Internet Access Service " + createdServiceUuid + " was not deprovisioned within the timeout");
        return false;
    }

    private static void deleteCreatedIpBlock() {
        if (createdIpBlockUuid == null) {
            return;
        }
        for (int attempt = 1; attempt <= DELETE_MAX_ATTEMPTS; attempt++) {
            try {
                ipBlocksApi.deleteIpBlockById(createdIpBlockUuid);
                if (ipBlocksApi.getApiClient().getStatusCode() / 100 == 2) {
                    return;
                }
            } catch (ApiException e) {
                System.out.println("Ip block delete attempt " + attempt + " for " + createdIpBlockUuid + " not ready: " + e.getMessage());
            }
            try {
                Thread.sleep(DELETE_RETRY_INTERVAL_MS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Ip block " + createdIpBlockUuid + " could not be deleted within the timeout");
    }

    private static InternetAccessServices searchServices() throws ApiException {
        InternetAccessSearchRequest requestBody = new InternetAccessSearchRequest().filter(
                        new SearchExpression()
                                .addAndItem(new SearchExpression()
                                        .property("/project/projectId")
                                        .operator(SearchExpression.OperatorEnum.EQUAL)
                                        .values(singletonList(testData.getProjectId())))
                                .addAndItem(new SearchExpression()
                                        .property("/state")
                                        .operator(SearchExpression.OperatorEnum.EQUAL)
                                        .values(singletonList(InternetAccessServiceState.PROVISIONED.getValue()))))
                .pagination(new PaginationRequest().offset(0).limit(100));

        return internetAccessServicesApi.searchEiaServices(requestBody);
    }

    private static boolean waitForServiceIsInState(UUID uuid, InternetAccessServiceState expectedState) throws ApiException {
        InternetAccessServiceState currentState = null;
        for (int attempt = 1; attempt <= STATE_MAX_ATTEMPTS; attempt++) {
            currentState = internetAccessServicesApi.getEiaService(uuid).getState();
            if (currentState == expectedState) {
                return true;
            }
            if (currentState == InternetAccessServiceState.FAILED) {
                fail("Internet Access Service " + uuid + " reached FAILED state");
            }
            try {
                Thread.sleep(STATE_RETRY_INTERVAL_MS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Internet Access Service " + uuid + " did not reach " + expectedState
                + " state (current: " + currentState + ")");
        return false;
    }

    private static UUID createIaConnection() throws ApiException {
        Port port = selectDot1qPort();

        ConnectionPostRequest connectionPostRequest = new ConnectionPostRequest()
                .name("panthers-eia-con-" + getRandomVlanNumber())
                .type(ConnectionType.IA_VC).bandwidth(INITIAL_BANDWIDTH)
                .project(new Project().projectId(testData.getProjectId()))
                .notifications(singletonList(new SimplifiedNotification().type(SimplifiedNotification.TypeEnum.ALL)
                        .emails(singletonList("panthers_auto@equinix.com"))))
                .zSide(new ConnectionSide()
                        .accessPoint(new AccessPoint().type(AccessPointType.SP)
                                .profile(new SimplifiedServiceProfile()
                                        .type(ServiceProfileTypeEnum.IA_PROFILE)
                                        .uuid(UUID.fromString(testData.getIaProfileUuid())))
                                .location(new SimplifiedLocation()
                                        .metroCode(IA_METRO))));

        Connection connection = null;
        for (int i = 0; i < 3; i++) {
            connectionPostRequest.aSide(new ConnectionSide()
                    .accessPoint(new AccessPoint()
                            .type(AccessPointType.COLO)
                            .port(new SimplifiedPort()
                                    .uuid(port.getUuid()))
                            .linkProtocol(new SimplifiedLinkProtocol()
                                    .type(LinkProtocolType.DOT1Q)
                                    .vlanTag(getRandomVlanNumber()))));

            connection = connectionsApi.createConnection(connectionPostRequest, false);
            if (connectionsApi.getApiClient().getStatusCode() == 201) {
                break;
            }
        }

        assertEquals(201, connectionsApi.getApiClient().getStatusCode());
        users.get(userName).getUserResources().addConnectionUuid(connection.getUuid());
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.PROVISIONED);
        return UUID.fromString(connection.getUuid());
    }

    private static Port selectDot1qPort() throws ApiException {
        List<Port> ports = getPorts(userName).getData().stream()
                .filter(p -> p.getLocation() != null && IA_METRO.equals(
                        p.getLocation().getMetroCode()))
                .filter(p -> p.getEncapsulation() != null && p.getEncapsulation().getType() == PortEncapsulation.TypeEnum.DOT1Q)
                .collect(Collectors.toList());

        assertFalse("No DOT1Q port available in metro " + IA_METRO, ports.isEmpty());
        return ports.get(0);
    }

    // For a DIRECT routing protocol the connection must carry the Equinix peering IP, which is a
    // host of a customer-owned IPv4 block referenced in customerRoutes. Always create a fresh
    // /24 block (mirrors the portal flow captured in test3.har); it is removed in @AfterClass.
    private static IpBlock createCustomerIpv4Block() throws ApiException {
        String prefix = "67.223." + (1 + Math.floorMod(getRandomVlanNumber(), 254)) + ".0/24";
        SubmitIpBlockRequestBody requestBody = new SubmitIpBlockRequestBody()
                .type(TypeOfIpBlockProduct.IPV4_IP_BLOCK)
                .prefix(prefix)
                .project(new IpBlockProjectRequest().projectId(testData.getProjectId()));

        IpBlock ipBlock = ipBlocksApi.submitIpBlock(requestBody);
        assertEquals(202, ipBlocksApi.getApiClient().getStatusCode());
        createdIpBlockUuid = ipBlock.getUuid();
        return ipBlock;
    }

    // Equinix peering IP = the 6th host of the customer block (e.g. 67.223.23.0/24 -> 67.223.23.5),
    // matching the portal request in test3.har.
    private static String equinixPeerIpFor(IpBlock ipBlock) {
        String[] octets = ipBlock.getPrefix().split("/")[0].split("\\.");
        return octets[0] + "." + octets[1] + "." + octets[2] + ".5";
    }

    private static boolean deleteEiaService(UUID uuid) {
        for (int attempt = 1; attempt <= DELETE_MAX_ATTEMPTS; attempt++) {
            try {
                InternetAccessServiceState state = internetAccessServicesApi.getEiaService(uuid).getState();
                if (state == InternetAccessServiceState.DEPROVISIONED || state == InternetAccessServiceState.DEPROVISIONING) {
                    return true;
                }
                internetAccessServicesApi.deleteEiaService(uuid);
                if (internetAccessServicesApi.getApiClient().getStatusCode() / 100 == 2) {
                    return true;
                }
            } catch (ApiException e) {
                System.out.println("Delete attempt " + attempt + " for " + uuid + " not ready: " + e.getMessage());
            }
            try {
                Thread.sleep(DELETE_RETRY_INTERVAL_MS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Internet Access Service " + uuid + " could not be deleted within the timeout");
        return false;
    }

    private InternetAccessService createInternetAccessService() throws ApiException {
        UUID connectionUuid = createIaConnection();
        IpBlock ipBlock = createCustomerIpv4Block();
        String equinixPeerIp = equinixPeerIpFor(ipBlock);

        InternetAccessRoutingProtocolDirectRequest routingProtocol = new InternetAccessRoutingProtocolDirectRequest()
                .addConnectionsItem(new InternetAccessConnectionDirectRequest()
                        .uuid(connectionUuid)
                        .peeringIpv4(new InternetAccessPeeringIpv4Request().equinixPeerIp(equinixPeerIp)));
        routingProtocol.type(InternetAccessRoutingProtocolType.DIRECT);
        routingProtocol.addCustomerRoutesItem(new InternetAccessCustomerRouteRequest()
                .ipBlock(new InternetAccessIpBlockRequest()
                        .uuid(ipBlock.getUuid())));

        InternetAccessPostRequest requestBody = new InternetAccessPostRequest()
                .type(InternetAccessServiceType.SINGLE_IA)
                .name("panthers_eia_" + getRandomVlanNumber())
                .bandwidth(INITIAL_BANDWIDTH)
                .routingProtocol(routingProtocol)
                .billing(new InternetAccessPostRequestBilling()
                        .type(InternetAccessBillingType.FIXED))
                .project(new Project().projectId(testData.getProjectId()))
                .account(new InternetAccessAccount()
                        .accountNumber(testData.getAccountNumberEIA()));

        InternetAccessService service = internetAccessServicesApi.createEiaService(requestBody);
        users.get(userName).getUserResources().addInternetAccessServiceUuid(service.getUuid());
        assertEquals(201, internetAccessServicesApi.getApiClient().getStatusCode());

        assertTrue("Internet Access Service did not reach PROVISIONED state",
                waitForServiceIsInState(service.getUuid(), InternetAccessServiceState.PROVISIONED));
        return service;
    }
}
