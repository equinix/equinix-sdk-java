package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.JSON;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import com.equinix.sdk.shipmentsv1.model.GenericErrorType;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body. The service reports errors as a JSON array of
 * code/message pairs, which is parsed here into {@link GenericErrorType}.
 *
 * <p>Deliberately sends an invalid access token to trigger the error path. Read-only: creates,
 * modifies and deletes nothing.
 */
public class HandleShipmentErrors {
    public static void main(String[] args) {
        ShipmentApi api = ShipmentExampleSupport.api();

        try {
            api.getLocation("Bearer not-a-real-token", false, null, null);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                GenericErrorType[] errors = JSON.getGson().fromJson(e.getResponseBody(), GenericErrorType[].class);
                for (GenericErrorType error : errors) {
                    System.out.println("error code:  " + error.getCode());
                    System.out.println("message:     " + error.getMessage());
                }
            } catch (RuntimeException notJson) {
                // gateways and proxies can return non-JSON or differently shaped bodies, e.g. for 401/502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
