package com.equinix.sdk.examples.ordersv2;

import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.JSON;
import com.equinix.sdk.ordersv2.model.ErrorDetails;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Asks for an order id that does not exist to trigger the error path. Read-only: it creates
 * nothing.
 */
public class HandleOrderErrors {
    public static void main(String[] args) throws Exception {
        try {
            OrdersSupport.api().gETOrderDetails("does-not-exist", null);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                ErrorDetails error = JSON.getGson().fromJson(e.getResponseBody(), ErrorDetails.class);
                System.out.println("error code:  " + error.getErrorCode());
                System.out.println("message:     " + error.getErrorMessage());
                System.out.println("correlation: " + error.getCorrelationId());
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
