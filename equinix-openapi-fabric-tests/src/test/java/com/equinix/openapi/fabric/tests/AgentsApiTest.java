package com.equinix.openapi.fabric.tests;

import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.model.*;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.equinix.openapi.fabric.tests.helpers.Apis.*;
import static org.junit.Assert.*;

/**
 * API tests for AgentsApi
 */
public class AgentsApiTest {

    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FCR;

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    private static Agents getFirstAgent() throws ApiException {
        AgentGetAllResponse response = agentsApi.getAgents(null, null);
        Assume.assumeTrue("No agents available", !response.getData().isEmpty());
        return response.getData().get(0);
    }

    @Test
    public void getAgents() throws ApiException {
        AgentGetAllResponse response = agentsApi.getAgents(null, null);
        assertEquals(200, agentsApi.getApiClient().getStatusCode());
        assertNotNull(response.getData());
    }

    @Test
    public void getAgentByUuid() throws ApiException {
        Agents agent = getFirstAgent();
        Agents agentGet = agentsApi.getAgentByUuid(agent.getUuid(), null, null);
        assertEquals(200, agentsApi.getApiClient().getStatusCode());
        assertEquals(agent.getUuid(), agentGet.getUuid());
    }

    @Test
    public void getAgentActivities() throws ApiException {
        Agents agent = getFirstAgent();
        AgentGetActivities activities = agentsApi.getAgentActivities(agent.getUuid(), null, null);
        assertEquals(200, agentsApi.getApiClient().getStatusCode());
        assertNotNull(activities);
    }
}
