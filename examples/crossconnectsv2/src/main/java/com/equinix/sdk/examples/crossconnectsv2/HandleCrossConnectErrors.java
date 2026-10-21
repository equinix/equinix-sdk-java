package com.equinix.sdk.examples.crossconnectsv2;

import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.JSON;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;
import com.equinix.sdk.crossconnectsv2.auth.HttpBearerAuth;
import com.equinix.sdk.crossconnectsv2.model.ErrorDetails;
import com.equinix.sdk.crossconnectsv2.model.Layer1Create;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately authenticates with an invalid token so that the order request is refused before
 * anything is created. It needs no credentials and creates no resources.
 */
public class HandleCrossConnectErrors {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        ((HttpBearerAuth) client.getAuthentication("BearerAuth")).setBearerToken("not-a-real-token");
        CrossConnectsApi api = new CrossConnectsApi(client);

        try {
            api.orderCrossConnects(new Layer1Create());
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                ErrorDetails error = JSON.getGson().fromJson(e.getResponseBody(), ErrorDetails.class);
                System.out.println("error code:  " + error.getErrorCode());
                System.out.println("message:     " + error.getErrorMessage());
                System.out.println("correlation: " + error.getCorrelationId());
            } catch (RuntimeException notJson) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
