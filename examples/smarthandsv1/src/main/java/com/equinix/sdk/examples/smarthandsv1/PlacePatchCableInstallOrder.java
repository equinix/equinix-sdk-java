package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.model.PatchCableInstallRequest;
import com.equinix.sdk.smarthandsv1.model.PatchCableInstallRequestServiceDetails;
import com.equinix.sdk.smarthandsv1.model.CrossConnectInstall;
import java.io.IOException;

/**
 * Orders installation of a cross connect patch cable by an IBX technician for one cross connect.
 *
 * <p><b>Creates a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs
 * the EQUINIX_EXAMPLE_* variables described on {@link SmartHandsSupport}. The service answers with
 * an empty success response; the order number is not returned by the generated client.
 */
public class PlacePatchCableInstallOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SmartHandsSupport.requireWritesAllowed("PlacePatchCableInstallOrder");

        PatchCableInstallRequest request = new PatchCableInstallRequest()
                .customerReferenceNumber("sdk-example-PlacePatchCableInstallOrder")
                .purchaseOrder(SmartHandsSupport.purchaseOrder())
                .ibxLocation(SmartHandsSupport.ibxLocation())
                .contacts(SmartHandsSupport.contacts())
                .schedule(SmartHandsSupport.schedule())
                .serviceDetails(new PatchCableInstallRequestServiceDetails().addCrossConnectsItem(new CrossConnectInstall()
                        .serialNumber("Serial # Not Found")
                        .deviceCabinet(SmartHandsSupport.env("EQUINIX_EXAMPLE_CABINET"))
                        .deviceConnectorType("LC")
                        .deviceDetails("Router1")
                        .devicePort("Next Available")
                        .lightLinkVerification(true)
                        .scopeOfWork("Install the patch cable and verify the light link.")));

        SmartHandsSupport.api().handleSmartHandPatchCableInstallOrder(SmartHandsSupport.authorization(), request);
        System.out.println("order submitted");
    }
}
