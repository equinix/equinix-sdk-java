package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.model.OtherRequest;
import com.equinix.sdk.smarthandsv1.model.OtherRequestServiceDetails;
import java.io.IOException;

/**
 * Orders work that is not in the Smart Hands catalogue, described in free text.
 *
 * <p><b>Creates a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs
 * the EQUINIX_EXAMPLE_* variables described on {@link SmartHandsSupport}. The service answers with
 * an empty success response; the order number is not returned by the generated client.
 */
public class PlaceOtherOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SmartHandsSupport.requireWritesAllowed("PlaceOtherOrder");

        OtherRequest request = new OtherRequest()
                .customerReferenceNumber("sdk-example-PlaceOtherOrder")
                .purchaseOrder(SmartHandsSupport.purchaseOrder())
                .ibxLocation(SmartHandsSupport.ibxLocation())
                .contacts(SmartHandsSupport.contacts())
                .schedule(SmartHandsSupport.schedule())
                .serviceDetails(new OtherRequestServiceDetails().scopeOfWork("Describe the work you need here."));

        SmartHandsSupport.api().handleSmartHandOthersOrder(SmartHandsSupport.authorization(), request);
        System.out.println("order submitted");
    }
}
