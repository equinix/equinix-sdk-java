package com.equinix.sdk.examples.securecabinetv1;

import com.equinix.sdk.securecabinetv1.ApiClient;
import com.equinix.sdk.securecabinetv1.ApiException;
import com.equinix.sdk.securecabinetv1.Configuration;
import com.equinix.sdk.securecabinetv1.JSON;
import com.equinix.sdk.securecabinetv1.api.AvailabilityApi;
import com.equinix.sdk.securecabinetv1.model.Error;
import com.equinix.sdk.examples.ExampleEnv;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body. The service's error bodies are JSON arrays of error
 * objects, which can be parsed into {@link Error}.
 *
 * <p>Deliberately sends an invalid token to trigger the error path. Read-only: it creates nothing.
 */
public class HandleSecureCabinetErrors {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken("not-a-real-token");

        try {
            new AvailabilityApi(client).getProductsAvailability("0");
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                List<Error> errors = JSON.getGson()
                        .fromJson(e.getResponseBody(), new TypeToken<List<Error>>() {}.getType());
                for (Error error : errors) {
                    System.out.println(error.getErrorCode() + ": " + error.getErrorMessage()
                            + " (correlation id " + error.getCorrelationId() + ")");
                }
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
