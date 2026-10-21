package com.equinix.sdk.examples.troubleticketv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.JSON;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;
import com.equinix.sdk.troubleticketv1.model.GenericError;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately sends an invalid bearer token to trigger the error path. Read-only: the one call
 * it makes is a lookup, and it creates nothing.
 */
public class HandleTicketErrors {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        TroubleticketApi api = new TroubleticketApi(client);

        try {
            api.getLocation("Bearer not-a-real-token", false, null, null);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                GenericError error = JSON.getGson().fromJson(e.getResponseBody(), GenericError.class);
                System.out.println("ticket id:   " + error.getTicketId());
                System.out.println("errors:      " + error.getErrors());
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503; the service's own
                // errors may also carry objects where the error model declares plain strings
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
