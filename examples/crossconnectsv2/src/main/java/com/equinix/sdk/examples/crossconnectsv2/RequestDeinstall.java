package com.equinix.sdk.examples.crossconnectsv2;

import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.ApiResponse;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;
import com.equinix.sdk.crossconnectsv2.auth.HttpBearerAuth;
import com.equinix.sdk.crossconnectsv2.model.Layer1DeinstallDetails;
import com.equinix.sdk.crossconnectsv2.model.Layer1DeinstallRequest;
import com.equinix.sdk.examples.ExampleEnv;
import java.time.LocalDate;

/**
 * Places an order to remove an existing cross connect.
 *
 * <p>Requests the removal of real infrastructure, so it only sends the request when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true. Set EQUINIX_EXAMPLE_ASSET_ID to the asset ID of the cross
 * connect to remove; the removal date is one week from today.
 */
public class RequestDeinstall {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        ((HttpBearerAuth) client.getAuthentication("BearerAuth")).setBearerToken(ExampleEnv.token());
        CrossConnectsApi api = new CrossConnectsApi(client);

        String assetId = System.getenv().getOrDefault("EQUINIX_EXAMPLE_ASSET_ID", "4-1234567890");
        Layer1DeinstallRequest request = new Layer1DeinstallRequest()
                .customerReferenceId("example-deinstall-1")
                .description("Created from the SDK examples")
                .removalDate(LocalDate.now().plusDays(7))
                .addDetailsItem(new Layer1DeinstallDetails()
                        .assetId(assetId)
                        // false: do not proceed if Equinix detects live traffic on the connection
                        .proceedWithLiveTraffic(false));

        if (!WriteGuard.allowed()) {
            return;
        }

        try {
            ApiResponse<Void> response = api.placeCrossConnectDeinstallationOrderWithHttpInfo(request);
            System.out.println("HTTP status: " + response.getStatusCode());
            System.out.println("order:       " + response.getHeaders().get("Location"));
        } catch (ApiException e) {
            System.out.println("deinstall rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
