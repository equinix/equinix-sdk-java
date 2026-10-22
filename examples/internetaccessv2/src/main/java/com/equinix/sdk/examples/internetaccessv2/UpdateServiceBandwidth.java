package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.model.ChangeOperationUpdate;
import com.equinix.sdk.internetaccessv2.model.ServiceReadModel;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Changes the bandwidth of a service with a single replace operation on {@code /bandwidth}.
 *
 * <p><b>Changes a real service.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and
 * needs EQUINIX_EXAMPLE_SERVICE_ID and EQUINIX_EXAMPLE_BANDWIDTH (Mbps). The request is sent with
 * {@code dryRun=true}, so the service validates it without applying the change; change that flag in
 * the source to apply it.
 */
public class UpdateServiceBandwidth {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        InternetAccessSupport.requireWritesAllowed("UpdateServiceBandwidth");
        UUID serviceId = UUID.fromString(InternetAccessSupport.requireEnv("EQUINIX_EXAMPLE_SERVICE_ID"));
        String bandwidth = InternetAccessSupport.requireEnv("EQUINIX_EXAMPLE_BANDWIDTH");

        List<ChangeOperationUpdate> changes =
                List.of(new ChangeOperationUpdate().op("replace").path("/bandwidth").value(bandwidth));

        ServiceReadModel service = InternetAccessSupport.serviceApi().updateEquinixInternetAccess(serviceId, changes, true);
        System.out.println("validated change for " + service.getName() + " (dry run)");
    }
}
