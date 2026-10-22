package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.JSON;
import com.equinix.sdk.internetaccessv2.model.Error;
import java.io.IOException;
import java.util.UUID;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model, which is a list of errors.
 *
 * <p>Deliberately asks for a service that does not exist to trigger the error path. Read-only.
 */
public class HandleInternetAccessErrors {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            InternetAccessSupport.serviceApi().getEquinixInternetAccessServiceDetails(UUID.randomUUID());
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                Error[] errors = JSON.getGson().fromJson(e.getResponseBody(), Error[].class);
                for (Error error : errors) {
                    System.out.println("error:       " + error.getErrorCode() + " " + error.getErrorMessage()
                            + " (correlation id " + error.getCorrelationId() + ")");
                }
            } catch (RuntimeException notParsable) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
