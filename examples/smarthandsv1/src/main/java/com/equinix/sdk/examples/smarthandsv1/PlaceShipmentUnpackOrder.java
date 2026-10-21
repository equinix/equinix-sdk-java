package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.model.ShipmentUnpackRequest;
import com.equinix.sdk.smarthandsv1.model.ShipmentUnpackRequestServiceDetails;
import java.io.IOException;

/**
 * Orders unpacking of an inbound shipment and disposal of the packaging.
 *
 * <p><b>Creates a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs
 * the EQUINIX_EXAMPLE_* variables described on {@link SmartHandsSupport}, plus EQUINIX_EXAMPLE_SHIPMENT_ORDER (the inbound shipment order number). The service answers with
 * an empty success response; the order number is not returned by the generated client.
 */
public class PlaceShipmentUnpackOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SmartHandsSupport.requireWritesAllowed("PlaceShipmentUnpackOrder");

        ShipmentUnpackRequest request = new ShipmentUnpackRequest()
                .customerReferenceNumber("sdk-example-PlaceShipmentUnpackOrder")
                .purchaseOrder(SmartHandsSupport.purchaseOrder())
                .ibxLocation(SmartHandsSupport.ibxLocation())
                .contacts(SmartHandsSupport.contacts())
                .schedule(SmartHandsSupport.schedule())
                .serviceDetails(new ShipmentUnpackRequestServiceDetails()
                        .inboundShipmentOrderNumber(SmartHandsSupport.env("EQUINIX_EXAMPLE_SHIPMENT_ORDER"))
                        .copyOfPackingSlipNeeded(true)
                        .discardShipmentMaterial(false)
                        .scopeOfWork("Unpack the shipment and leave the contents in the cabinet."));

        SmartHandsSupport.api().handleSmartHandShipmentUnpackOrder(SmartHandsSupport.authorization(), request);
        System.out.println("order submitted");
    }
}
