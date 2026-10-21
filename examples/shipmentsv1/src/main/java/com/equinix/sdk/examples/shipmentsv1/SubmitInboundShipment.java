package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import com.equinix.sdk.shipmentsv1.model.ContactInfo;
import com.equinix.sdk.shipmentsv1.model.IbxLocation;
import com.equinix.sdk.shipmentsv1.model.IbxLocationCagesInner;
import com.equinix.sdk.shipmentsv1.model.InboundServiceDetail;
import com.equinix.sdk.shipmentsv1.model.InboundServiceDetailShipmentDetails;
import com.equinix.sdk.shipmentsv1.model.InboundShipmentRequest;
import com.equinix.sdk.shipmentsv1.model.ShipmentOrderResponse;
import java.time.OffsetDateTime;

/**
 * Schedules an inbound shipment: a delivery of boxes to a cage, brought by the customer or by a
 * carrier.
 *
 * <p>Creates a real shipment order. The request is built but only sent when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true; replace the placeholder IBX, cage, account and user values
 * first (ListShipmentLocations shows the ones you have access to).
 */
public class SubmitInboundShipment {
    public static void main(String[] args) throws Exception {
        InboundShipmentRequest request = new InboundShipmentRequest()
                .ibxLocation(new IbxLocation()
                        .ibx("<ibx>")
                        .addCagesItem(new IbxLocationCagesInner().cage("<cage>").accountNumber("<account number>")))
                .serviceDetails(new InboundServiceDetail()
                        // shipments must be scheduled at least 24 hours ahead
                        .estimatedDateTime(OffsetDateTime.now().plusDays(2))
                        .deliverToCage(true)
                        .inboundRequestDescription("Server hardware delivery")
                        .shipmentDetails(new InboundServiceDetailShipmentDetails()
                                .inboundType(InboundServiceDetailShipmentDetails.InboundTypeEnum.CUSTOMER_CARRY)
                                .noOfBoxes(1)
                                .description("One box of servers")))
                // at least an ordering and a notification contact are required
                .addContactsItem(new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.ORDERING)
                        .userName("<ordering user name>"))
                .addContactsItem(new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.NOTIFICATION)
                        .userName("<notification user name>"));

        if (!ShipmentExampleSupport.writesAllowed()) {
            return;
        }

        ShipmentApi api = ShipmentExampleSupport.api();
        try {
            ShipmentOrderResponse order = api.shipmentInbound(ShipmentExampleSupport.authorization(), request);
            System.out.println("created inbound shipment order " + order.getOrderNumber());
        } catch (ApiException e) {
            System.out.println("order rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
