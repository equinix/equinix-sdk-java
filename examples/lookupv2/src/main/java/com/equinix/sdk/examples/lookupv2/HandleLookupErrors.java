package com.equinix.sdk.examples.lookupv2;

import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.JSON;
import com.equinix.sdk.lookupv2.api.LookupApi;
import com.equinix.sdk.lookupv2.model.ErrorDetails;
import com.equinix.sdk.examples.ExampleEnv;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body. The service returns a JSON array of error objects,
 * which the example tries to parse, falling back to the raw body.
 *
 * <p>Deliberately sends an invalid token to trigger the error path. Read-only: it creates nothing.
 */
public class HandleLookupErrors {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken("not-a-real-token");

        try {
            new LookupApi(client).getLocationsByPermissionCode("CROSS_CONNECT", null, null, null, null, null);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                List<ErrorDetails> errors = JSON.getGson()
                        .fromJson(e.getResponseBody(), new TypeToken<List<ErrorDetails>>() {}.getType());
                errors.forEach(error -> System.out.println(
                        "error " + error.getErrorCode() + ": " + error.getErrorMessage()
                                + " (correlation id " + error.getCorrelationId() + ")"));
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 401/502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
