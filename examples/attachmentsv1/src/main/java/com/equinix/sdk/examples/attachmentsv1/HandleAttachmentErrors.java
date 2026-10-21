package com.equinix.sdk.examples.attachmentsv1;

import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.JSON;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;
import com.equinix.sdk.attachmentsv1.model.Genricerrorinfo;
import com.equinix.sdk.attachmentsv1.model.Genricerrortype;
import com.equinix.sdk.examples.ExampleEnv;
import java.util.UUID;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately asks for an attachment ID that does not exist to trigger the error path. Read-only:
 * creates nothing.
 */
public class HandleAttachmentErrors {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AttachmentsApi api = new AttachmentsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        try {
            api.getAttachment(UUID.randomUUID(), authorization);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                Genricerrorinfo info = JSON.getGson().fromJson(e.getResponseBody(), Genricerrorinfo.class);
                System.out.println("ticket ID:   " + info.getTicketId());
                for (Genricerrortype error : info.getErrors()) {
                    System.out.println("error:       " + error.getCode() + " " + error.getMessage());
                }
            } catch (RuntimeException notJson) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
