/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.tests;

import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.openapi.fabric.tests.helpers.Utils;
import com.equinix.sdk.fabricv4.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static com.equinix.openapi.fabric.tests.helpers.Apis.*;
import static com.equinix.openapi.fabric.tests.helpers.TokenGenerator.users;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

/**
 * API tests for CloudRoutersApi
 */
public class CloudRoutersApiTest {

    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FNV;

    public static void removeCloudRouters(UsersItem.UserName userName) {
        users.get(userName).getUserResources().getCloudRoutersUuid().forEach(uuid -> {
            if (getCloudRouterStatus(uuid) == CloudRouterAccessPointState.PROVISIONED) {
                deleteCloudRouter(uuid);
            }
        });
    }

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    @AfterClass
    public static void removeResources() {
        removeCloudRouters(userName);
    }

    /**
     * Fabric Cloud Router object
     */
    @Test
    public void createCloudRouter() throws ApiException {
        createRouter();
    }

    /**
     * Successful operation
     */
    @Test
    public void createCloudRouterAction() throws ApiException {
        cloudRoutersApi.createCloudRouterAction(createRouter().getUuid(),
                new CloudRouterActionRequest().type(CloudRouterActionType.ROUTE_TABLE_ENTRY_UPDATE));
        assertEquals(202, cloudRoutersApi.getApiClient().getStatusCode());
    }

    /**
     * Deleted Cloud Router Successfully
     */
    @Test
    public void deleteCloudRouterByUuid() throws ApiException {
        deleteCloudRouter(createRouter().getUuid());
    }

    /**
     * Successful operation
     */
    @Test
    public void getCloudRouterActions() throws ApiException {
        CloudRouter cloudRouter = createRouter();
        cloudRoutersApi.createCloudRouterAction(cloudRouter.getUuid(), new CloudRouterActionRequest().type(CloudRouterActionType.ROUTE_TABLE_ENTRY_UPDATE));
        CloudRouterActionResponse cloudRouterActionResponse = cloudRoutersApi.getCloudRouterActions(cloudRouter.getUuid(), CloudRouterActionState.SUCCEEDED);
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
        assertEquals(cloudRouterActionResponse.getType(), CloudRouterActionType.ROUTE_TABLE_ENTRY_UPDATE);
    }

    /**
     * Fabric Cloud Router object
     */
    @Test
    public void getCloudRouterByUuid() throws ApiException {
        CloudRouter cloudRouter = createRouter();
        CloudRouter cloudRouterRead = cloudRoutersApi.getCloudRouterByUuid(cloudRouter.getUuid());

        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
        assertEquals(cloudRouter.getUuid(), cloudRouterRead.getUuid());
        assertEquals(cloudRouter.getName(), cloudRouterRead.getName());
        assertEquals(cloudRouter.getState(), cloudRouterRead.getState());
    }

    /**
     * Fabric Cloud Router Package details
     */
    @Test
    public void getCloudRouterPackageByCode() throws ApiException {
        Code routerPackageCode = Code.STANDARD;
        CloudRouterPackage cloudRouterPackage = cloudRoutersApi.getCloudRouterPackageByCode(RouterPackageCode.STANDARD);
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
        assertEquals(cloudRouterPackage.getCode(), routerPackageCode);
    }

    /**
     * Fabric Cloud Router Packages
     */
    @Test
    public void getCloudRouterPackages() throws ApiException {
        PackageResponse packageResponse = cloudRoutersApi.getCloudRouterPackages(10, 10);
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
        assertNotNull(packageResponse.getData());
    }

    /**
     * Successful operation
     */
    @Test
    public void searchCloudRouterRoutes() throws ApiException {
        RouteTableEntrySimpleExpression routeTableEntrySimpleExpression = new RouteTableEntrySimpleExpression();
        routeTableEntrySimpleExpression.setProperty(SortItem.PropertyEnum.STATE.getValue());
        routeTableEntrySimpleExpression.setOperator(SearchExpression.OperatorEnum.NOT_EQUAL.getValue());
        routeTableEntrySimpleExpression.setValues(singletonList("ACTIVE"));

        RouteTableEntryFilter routeTableEntryFilter = new RouteTableEntryFilter(routeTableEntrySimpleExpression);

        RouteTableEntryFilters routeTableEntryFilters = new RouteTableEntryFilters();
        routeTableEntryFilters.addAndItem(routeTableEntryFilter);

        RouteTableEntrySearchRequest routeTableEntrySearchRequest = new RouteTableEntrySearchRequest()
                .filter(routeTableEntryFilters)
                .pagination(new PaginationRequest().offset(10).limit(20))
                .sort(singletonList(new RouteTableEntrySortCriteria()
                        .direction(RouteTableEntrySortDirection.DESC)
                        .property(RouteTableEntrySortBy.CHANGELOG_CREATEDDATETIME)));

        cloudRoutersApi.searchCloudRouterRoutes(createRouter().getUuid(), routeTableEntrySearchRequest);
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
    }

    /**
     * Successful operation
     */
    @Test
    public void searchCloudRouters() throws ApiException {
        CloudRouter cloudRouter = createRouter();

        CloudRouterSimpleExpression cloudRouterSimpleExpression = new CloudRouterSimpleExpression();
        cloudRouterSimpleExpression.setOperator(SearchExpression.OperatorEnum.EQUAL.getValue());
        cloudRouterSimpleExpression.setProperty(SortItem.PropertyEnum.NAME.getValue());
        cloudRouterSimpleExpression.values(singletonList(cloudRouter.getName()));

        CloudRouterSimpleExpression cloudRouterSimpleExpression2 = new CloudRouterSimpleExpression();
        cloudRouterSimpleExpression2.setOperator(SearchExpression.OperatorEnum.EQUAL.getValue());
        cloudRouterSimpleExpression2.setProperty(SortItem.PropertyEnum.STATE.getValue());
        cloudRouterSimpleExpression2.values(singletonList(cloudRouter.getState().getValue()));

        CloudRouterFilters cloudRouterFilters = new CloudRouterFilters();
        CloudRouterFilter cloudRouterFilter = new CloudRouterFilter(cloudRouterSimpleExpression);
        CloudRouterFilter cloudRouterFilter2 = new CloudRouterFilter(cloudRouterSimpleExpression2);
        cloudRouterFilters.addAndItem(cloudRouterFilter);
        cloudRouterFilters.addAndItem(cloudRouterFilter2);

        CloudRouterSearchRequest cloudRouterSearchRequest = new CloudRouterSearchRequest()
                .filter(cloudRouterFilters)
                .pagination(new PaginationRequest().offset(10).limit(20))
                .sort(singletonList(new CloudRouterSortCriteria()
                        .direction(CloudRouterSortDirection.DESC)
                        .property(CloudRouterSortBy.CHANGELOG_CREATEDDATETIME)));

        SearchResponse searchResponse = cloudRoutersApi.searchCloudRouters(cloudRouterSearchRequest);
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());

        boolean found = searchResponse.getData().stream().anyMatch(router -> router.getName().equals(cloudRouter.getName()));
        assertTrue(found);
    }

    /**
     * Fabric Cloud Router object
     */
    @Test
    public void updateCloudRouterByUuid() throws ApiException {
        CloudRouter cloudRouter = createRouter();
        String updatedName = "panthers_new_fcr_name";

        CloudRouterChangeOperation cloudRouterChangeOperation = new CloudRouterChangeOperation()
                .op(CloudRouterChangeOperation.OpEnum.REPLACE)
                .path(CloudRouterSortBy.NAME.getValue())
                .value(updatedName);

        CloudRouter updatedCloudRouter = cloudRoutersApi.updateCloudRouterByUuid(cloudRouter.getUuid(), singletonList(cloudRouterChangeOperation));
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());
        assertEquals(updatedName, updatedCloudRouter.getName());
    }

    public static void deleteCloudRouter(UUID uuid) {
        try {
            waitForCloudRouterIsProvisioned(uuid);
            cloudRoutersApi.deleteCloudRouterByUuid(uuid);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
        assertEquals(204, cloudRoutersApi.getApiClient().getStatusCode());
    }

    public static CloudRouterAccessPointState getCloudRouterStatus(UUID cloudRouterUuid) {
        try {
            return cloudRoutersApi.getCloudRouterByUuid(cloudRouterUuid).getState();
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    public static CloudRouter createRouter() throws ApiException {
        UsersItem user = Utils.getUserData(getCurrentUser());

        String cloudRouterName = "panthers-test-java-sdk";
        CloudRouterPostRequest cloudRouterPostRequest = new CloudRouterPostRequest();
        cloudRouterPostRequest.type(CloudRouterPostRequest.TypeEnum.XF_ROUTER)
                .name(cloudRouterName)
                .location(new SimplifiedLocationWithoutIBX().metroCode("DC"))
                ._package(new CloudRouterPostRequestPackage().code(CloudRouterPostRequestPackage.CodeEnum.STANDARD))
                .notifications(singletonList(new SimplifiedNotification().type(SimplifiedNotification.TypeEnum.ALL).emails(singletonList("test@test.com"))))
                .project(new Project().projectId(user.getProjectId()))
                .account(new SimplifiedAccount().accountNumber(Long.valueOf(user.getAccountNumber())));

        CloudRouter cloudRouter = cloudRoutersApi.createCloudRouter(cloudRouterPostRequest, false);

        users.get(getCurrentUser()).getUserResources().addCloudRouterUuid(cloudRouter.getUuid());
        assertEquals(200, cloudRoutersApi.getApiClient().getStatusCode());

        UUID cloudRouterUuid = cloudRouter.getUuid();

        for (int i = 0; i < 5; i++) {
            cloudRouter = cloudRoutersApi.getCloudRouterByUuid(cloudRouterUuid);

            if (cloudRouter.getState().equals(CloudRouterAccessPointState.PROVISIONED)) {
                break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return cloudRouter;
    }

    private static void waitForCloudRouterIsProvisioned(UUID cloudRouterUuid) {
        boolean result = false;
        CloudRouterAccessPointState currentState = null;
        for (int i = 0; i < 5; i++) {
            currentState = getCloudRouterStatus(cloudRouterUuid);
            if (currentState.equals(CloudRouterAccessPointState.PROVISIONED)) {
                result = true;
                break;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        assertTrue("Cloud Router has not reached the expected state: " + CloudRouterAccessPointState.PROVISIONED + " current state: " + currentState.getValue(), result);
    }
}
