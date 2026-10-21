package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import com.equinix.sdk.shipmentsv1.model.ContactInfo;
import com.equinix.sdk.shipmentsv1.model.IbxLocation;
import com.equinix.sdk.shipmentsv1.model.IbxLocationCagesInner;
import com.equinix.sdk.shipmentsv1.model.OutboundServiceDetail;
import com.equinix.sdk.shipmentsv1.model.OutboundServiceDetailShipmentDetails;
import com.equinix.sdk.shipmentsv1.model.OutboundServiceDetailShipmentDetailsShipToAddress;
import com.equinix.sdk.shipmentsv1.model.OutboundShipmentRequest;
import com.equinix.sdk.shipmentsv1.model.ShipmentOrderResponse;
import java.time.OffsetDateTime;

/**
 * Schedules an outbound shipment: a package leaving a cage, collected by the customer or sent by a
 * carrier to a ship-to address.
 *
 * <p>Creates a real shipment order. The request is built but only sent when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true; replace the placeholder IBX, cage, account, address and user
 * values first (ListShipmentLocations shows the ones you have access to).
 */
public class SubmitOutboundShipment {
    public static void main(String[] args) throws Exception {
        OutboundShipmentRequest request = new OutboundShipmentRequest()
                .ibxLocation(new IbxLocation()
                        .ibx("<ibx>")
                        .addCagesItem(new IbxLocationCagesInner().cage("<cage>").accountNumber("<account number>")))
                .serviceDetails(new OutboundServiceDetail()
                        // shipments must be scheduled at least 24 hours ahead
                        .estimatedDateTime(OffsetDateTime.now().plusDays(2))
                        .outboundRequestDescription("Return of decommissioned hardware")
                        .shipmentDetails(new OutboundServiceDetailShipmentDetails()
                                .outboundType(OutboundServiceDetailShipmentDetails.OutboundTypeEnum.CARRIER)
                                .carrierName(OutboundServiceDetailShipmentDetails.CarrierNameEnum.DHL)
                                .noOfBoxes(1)
                                .declaredValue("100")
                                .labelExists(false)
                                .shipToAddress(new OutboundServiceDetailShipmentDetailsShipToAddress()
                                        .name("<recipient name>")
                                        .address("<street address>")
                                        .city("<city>")
                                        .state("<state>")
                                        .country("<country>")
                                        .zipCode("<zip code>")
                                        .phoneNumber("<phone number>")
                                        .carrierAccountNumber("<carrier account number>"))))
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
            ShipmentOrderResponse order = api.outboundShipmentSubmit(ShipmentExampleSupport.authorization(), request);
            System.out.println("created outbound shipment order " + order.getOrderNumber());
        } catch (ApiException e) {
            System.out.println("order rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
