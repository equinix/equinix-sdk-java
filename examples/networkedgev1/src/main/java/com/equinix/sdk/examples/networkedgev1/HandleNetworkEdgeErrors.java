package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.JSON;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;
import com.equinix.sdk.networkedgev1.model.FieldErrorResponse;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately asks for a virtual device that does not exist to trigger the error path. Read-only:
 * it creates, modifies and deletes nothing.
 */
public class HandleNetworkEdgeErrors {
    public static void main(String[] args) {
        ApiClient client = NetworkEdgeClient.create();
        VirtualDeviceApi api = new VirtualDeviceApi(client);

        try {
            api.getVirtualDeviceByUuid("00000000-0000-0000-0000-000000000000");
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                FieldErrorResponse error = JSON.getGson().fromJson(e.getResponseBody(), FieldErrorResponse.class);
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
