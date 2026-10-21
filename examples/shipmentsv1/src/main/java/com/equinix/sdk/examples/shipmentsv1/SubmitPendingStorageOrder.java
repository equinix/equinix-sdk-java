package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import com.equinix.sdk.shipmentsv1.model.ContactInfo;
import com.equinix.sdk.shipmentsv1.model.PendingStorageOrderResponseInner;
import com.equinix.sdk.shipmentsv1.model.PendingStorageRequest;
import com.equinix.sdk.shipmentsv1.model.PendingStorageRequestShipmentDetailsInner;
import java.util.List;

/**
 * Requests delivery of items already held in pending storage, either to the cage or for pick-up.
 *
 * <p>Creates real shipment orders, one per storage ID. The request is built but only sent when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true; replace the placeholder storage ID, cage, account and user
 * values first.
 */
public class SubmitPendingStorageOrder {
    public static void main(String[] args) throws Exception {
        PendingStorageRequest request = new PendingStorageRequest()
                .addShipmentDetailsItem(new PendingStorageRequestShipmentDetailsInner()
                        .storageId("<storage id>")
                        .cage("<cage>")
                        .accountNumber("<account number>")
                        .deliverToCage(true))
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
            List<PendingStorageOrderResponseInner> orders =
                    api.shipmentPending(ShipmentExampleSupport.authorization(), request);
            for (PendingStorageOrderResponseInner order : orders) {
                System.out.println("created order " + order.getOrderNumber() + " for storage " + order.getStorageID()
                        + " at " + order.getIbx() + " " + order.getCage());
            }
        } catch (ApiException e) {
            System.out.println("order rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
