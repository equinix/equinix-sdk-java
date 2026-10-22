package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import java.io.IOException;
import java.util.UUID;

/**
 * Deletes a service.
 *
 * <p><b>Deletes a real service.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and
 * needs EQUINIX_EXAMPLE_SERVICE_ID. The request is sent with {@code dryRun=true}, so the service
 * validates it without deleting anything; change that flag in the source to delete for real.
 */
public class DeleteService {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        InternetAccessSupport.requireWritesAllowed("DeleteService");
        UUID serviceId = UUID.fromString(InternetAccessSupport.requireEnv("EQUINIX_EXAMPLE_SERVICE_ID"));

        InternetAccessSupport.serviceApi().deleteEquinixInternetAccess(serviceId, true);
        System.out.println("delete validated for " + serviceId + " (dry run)");
    }
}
