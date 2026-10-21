package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.model.CageEscortRequest;
import com.equinix.sdk.smarthandsv1.model.CageEscortRequestServiceDetails;
import java.io.IOException;

/**
 * Orders an IBX technician to escort a visitor and open the cage and cabinet for the visit.
 *
 * <p><b>Creates a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs
 * the EQUINIX_EXAMPLE_* variables described on {@link SmartHandsSupport}. The service answers with
 * an empty success response; the order number is not returned by the generated client.
 */
public class PlaceCageEscortOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SmartHandsSupport.requireWritesAllowed("PlaceCageEscortOrder");

        CageEscortRequest request = new CageEscortRequest()
                .customerReferenceNumber("sdk-example-PlaceCageEscortOrder")
                .purchaseOrder(SmartHandsSupport.purchaseOrder())
                .ibxLocation(SmartHandsSupport.ibxLocation())
                .contacts(SmartHandsSupport.contacts())
                .schedule(SmartHandsSupport.schedule())
                .serviceDetails(new CageEscortRequestServiceDetails()
                        .durationVisit(CageEscortRequestServiceDetails.DurationVisitEnum._2_HOURS)
                        .openCabinetForVisitor(true)
                        .supervisionReqForVisitor(false)
                        .scopeOfWork("Escort the visitor to the cage and open the cabinet."));

        SmartHandsSupport.api().handleSmartHandCageEscortOrder(SmartHandsSupport.authorization(), request);
        System.out.println("order submitted");
    }
}
