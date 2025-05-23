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
import com.equinix.openapi.fabric.tests.dto.port.PortDto;
import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.openapi.fabric.tests.helpers.Utils;
import com.equinix.sdk.fabricv4.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static com.equinix.openapi.fabric.tests.helpers.Apis.portsApi;
import static com.equinix.openapi.fabric.tests.helpers.Apis.setUserName;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for PortsApi
 */
public class PortsApiTest {
    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FCR;

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    /**
     * Successful operation
     */
    @Test
    public void getPort() throws ApiException {
        UsersItem usersItem = Utils.getUserData(userName);
        PortDto portDto = usersItem.getPorts().get(0);
        Port port = portsApi.getPorts(portDto.getName()).getData().get(0);
        assertEquals(200, portsApi.getApiClient().getStatusCode());
        assertEquals(port.getName(), portDto.getName());
        assertEquals(port.getUuid().toString(), portDto.getUuid());
    }

    @Test
    public void searchPorts() throws ApiException {
        List<Port> ports = getPorts(userName).getData();
        assertEquals(200, portsApi.getApiClient().getStatusCode());
        assertTrue(!ports.isEmpty());
    }

    public static AllPortsResponse getPorts(UsersItem.UserName userName) throws ApiException {
        UsersItem user = Utils.getUserData(userName);

        PortV4SearchRequest portV4SearchRequest = new PortV4SearchRequest()
                .filter(new PortExpression().addOrItem(new PortExpression()
                        .addAndItem(new PortExpression()
                                .operator(PortExpression.OperatorEnum.EQUAL)
                                .property(PortSearchFieldName.STATE)
                                .values(singletonList("ACTIVE")))
                        .addAndItem(new PortExpression()
                                .operator(PortExpression.OperatorEnum.EQUAL)
                                .property(PortSearchFieldName.PROJECT_PROJECTID)
                                .values(singletonList(user.getProjectId())))
                        .addAndItem(new PortExpression()
                                .operator(PortExpression.OperatorEnum.EQUAL)
                                .property(PortSearchFieldName.SETTINGS_PRODUCTCODE)
                                .values(singletonList("CX"))
                        )))
                .pagination(new PaginationRequest()
                        .offset(0)
                        .limit(100))
                .sort(singletonList(new PortSortCriteria().property(PortSortBy._DEVICE_NAME).direction(PortSortDirection.DESC)));

        return portsApi.searchPorts(portV4SearchRequest);
    }
}
