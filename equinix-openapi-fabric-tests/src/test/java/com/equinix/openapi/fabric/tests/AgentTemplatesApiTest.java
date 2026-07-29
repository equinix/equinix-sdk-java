package com.equinix.openapi.fabric.tests;

import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static com.equinix.openapi.fabric.tests.helpers.Apis.*;
import static org.junit.Assert.*;

/**
 * API tests for AgentTemplatesApi
 */
public class AgentTemplatesApiTest {

    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FCR;

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    @Test
    public void getAgentTemplates() throws ApiException {
        AgentTemplateGetAllResponse response = agentTemplatesApi.getAgentTemplates(null, null);
        assertEquals(200, agentTemplatesApi.getApiClient().getStatusCode());
        assertNotNull(response.getData());
    }

    @Test
    public void getAgentTemplateByUuid() throws ApiException {
        AgentTemplateGetAllResponse templates = agentTemplatesApi.getAgentTemplates(null, null);
        assertFalse("No agent templates available", templates.getData().isEmpty());
        UUID templateUuid = templates.getData().get(0).getUuid();

        AgentTemplates template = agentTemplatesApi.getAgentTemplateByUuid(templateUuid, null, null);
        assertEquals(200, agentTemplatesApi.getApiClient().getStatusCode());
        assertEquals(templateUuid, template.getUuid());
    }
}
