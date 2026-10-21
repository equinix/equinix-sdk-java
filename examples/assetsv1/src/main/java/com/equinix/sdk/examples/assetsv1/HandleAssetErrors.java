package com.equinix.sdk.examples.assetsv1;

import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.ApiException;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.JSON;
import com.equinix.sdk.assetsv1.api.AssetsApi;
import com.equinix.sdk.assetsv1.model.Genricerrorinfo;
import com.equinix.sdk.assetsv1.model.GenricerrorType;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately asks for an asset that does not exist to trigger the error path. Read-only.
 */
public class HandleAssetErrors {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AssetsApi api = new AssetsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        try {
            api.getAssetById(authorization, "0-00000000");
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                Genricerrorinfo error = JSON.getGson().fromJson(e.getResponseBody(), Genricerrorinfo.class);
                System.out.println("ticket id:   " + error.getTicketId());
                for (GenricerrorType detail : error.getErrors()) {
                    System.out.println("error:       " + detail.getCode() + " " + detail.getMessage());
                }
            } catch (RuntimeException notJson) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
