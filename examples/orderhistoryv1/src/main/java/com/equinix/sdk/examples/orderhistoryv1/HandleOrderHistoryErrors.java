package com.equinix.sdk.examples.orderhistoryv1;

import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.JSON;
import com.equinix.sdk.orderhistoryv1.model.GenericError;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately sends an invalid token to trigger the error path. Read-only: it creates nothing.
 */
public class HandleOrderHistoryErrors {
    public static void main(String[] args) {
        try {
            OrderHistorySupport.api().gETRetrieveOrdersLocations("Bearer not-a-real-token");
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                GenericError error = JSON.getGson().fromJson(e.getResponseBody(), GenericError.class);
                System.out.println("ticket id:   " + error.getTicketId());
                System.out.println("errors:      " + error.getErrors());
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503, and the
                // service's own errors may not match the declared model
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
