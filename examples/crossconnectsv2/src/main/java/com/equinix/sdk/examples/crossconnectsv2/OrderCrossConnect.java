package com.equinix.sdk.examples.crossconnectsv2;

import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.ApiResponse;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;
import com.equinix.sdk.crossconnectsv2.auth.HttpBearerAuth;
import com.equinix.sdk.crossconnectsv2.model.ASide;
import com.equinix.sdk.crossconnectsv2.model.ConnectionServices;
import com.equinix.sdk.crossconnectsv2.model.ContactRequestRegisteredUser;
import com.equinix.sdk.crossconnectsv2.model.ConnectorTypes;
import com.equinix.sdk.crossconnectsv2.model.Layer1Create;
import com.equinix.sdk.crossconnectsv2.model.Layer1CreateContactsInner;
import com.equinix.sdk.crossconnectsv2.model.Layer1Details;
import com.equinix.sdk.crossconnectsv2.model.MediaTypes;
import com.equinix.sdk.crossconnectsv2.model.PatchPanel;
import com.equinix.sdk.crossconnectsv2.model.ProtocolTypes;
import com.equinix.sdk.crossconnectsv2.model.ZSide;
import com.equinix.sdk.crossconnectsv2.model.ZSideWithPatchPanel;
import com.equinix.sdk.examples.ExampleEnv;
import java.math.BigDecimal;

/**
 * Orders one standard single mode fiber cross connect between two patch panels.
 *
 * <p>Creates an order, which Equinix will then fulfil, so it only sends the request when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true. Replace the patch panel IDs and contact below with your own
 * (look them up in the Lookup API) before enabling it.
 */
public class OrderCrossConnect {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        ((HttpBearerAuth) client.getAuthentication("BearerAuth")).setBearerToken(ExampleEnv.token());
        CrossConnectsApi api = new CrossConnectsApi(client);

        // one entry in details is one cross connect; add more entries to order several in one request
        Layer1Create order = new Layer1Create()
                .customerReferenceId("example-order-1")
                .description("Created from the SDK examples")
                .addDetailsItem(new Layer1Details()
                        .aSide(new ASide()
                                .connectionService(ConnectionServices.SINGLE_MODE_FIBER)
                                .mediaType(MediaTypes.SINGLE_MODE_FIBER)
                                .protocolType(ProtocolTypes._10_GIG_ETHERNET)
                                .connectorType(ConnectorTypes.FC)
                                .patchPanel(new PatchPanel().id("CP:0104:1199890").portA(new BigDecimal(12)).portB(new BigDecimal(13))))
                        // zSide and contacts are oneOf types: wrap the variant that applies. This one
                        // connects to an existing patch panel; ZSideWithLOA is for a new provider.
                        .zSide(new ZSide(new ZSideWithPatchPanel()
                                .connectorType(ConnectorTypes.LC)
                                .circuitId("1-12312312")
                                .patchPanel(new PatchPanel().id("PP:0104:1190123")))))
                .addContactsItem(new Layer1CreateContactsInner(new ContactRequestRegisteredUser()
                        .type(ContactRequestRegisteredUser.TypeEnum.NOTIFICATION)
                        .addRegisteredUsersItem("john_doe")));

        if (!WriteGuard.allowed()) {
            return;
        }

        try {
            ApiResponse<Void> response = api.orderCrossConnectsWithHttpInfo(order);
            System.out.println("HTTP status: " + response.getStatusCode());
            System.out.println("order:       " + response.getHeaders().get("Location"));
        } catch (ApiException e) {
            System.out.println("order rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
