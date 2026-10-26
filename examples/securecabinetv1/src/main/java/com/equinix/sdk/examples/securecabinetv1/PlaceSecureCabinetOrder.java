package com.equinix.sdk.examples.securecabinetv1;

import com.equinix.sdk.securecabinetv1.ApiClient;
import com.equinix.sdk.securecabinetv1.ApiException;
import com.equinix.sdk.securecabinetv1.api.AvailabilityApi;
import com.equinix.sdk.securecabinetv1.api.OrdersApi;
import com.equinix.sdk.securecabinetv1.model.ContactDetails;
import com.equinix.sdk.securecabinetv1.model.ContractTerm;
import com.equinix.sdk.securecabinetv1.model.OrderCreateRequest;
import com.equinix.sdk.securecabinetv1.model.OrderCreateResponse;
import com.equinix.sdk.securecabinetv1.model.OrderItem;
import com.equinix.sdk.securecabinetv1.model.ProductsAvailability;
import java.io.IOException;
import java.util.UUID;

/**
 * Orders one Secure Cabinet at the IBX named by {@code EQUINIX_EXAMPLE_IBX}, with the smallest
 * allowed power draw, the IBX's standard cabinet size, and a 24 month contract. The size and power
 * limits come from the availability call so the request is valid for that IBX.
 *
 * <p><b>Creates a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true. It also
 * needs {@code EQUINIX_EXAMPLE_ACCOUNT}, {@code EQUINIX_EXAMPLE_IBX} (see CheckAvailability),
 * {@code EQUINIX_EXAMPLE_CONTACT_FIRST_NAME}, {@code EQUINIX_EXAMPLE_CONTACT_LAST_NAME} and {@code
 * EQUINIX_EXAMPLE_CONTACT_EMAIL} for the technical contact. {@code EQUINIX_EXAMPLE_PO_NUMBER} is
 * optional unless the billing account requires a purchase order.
 *
 * <p>The request carries a random Idempotency-Key, so retrying a call that timed out with the same
 * key would not create a second order.
 */
public class PlaceSecureCabinetOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SecureCabinetSupport.requireWritesAllowed("PlaceSecureCabinetOrder");

        ApiClient client = SecureCabinetSupport.client();
        String account = SecureCabinetSupport.account();
        String ibx = SecureCabinetSupport.require("EQUINIX_EXAMPLE_IBX");

        ProductsAvailability available = new AvailabilityApi(client).getProductsAvailability(account).stream()
                .filter(candidate -> ibx.equals(candidate.getIbx()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Secure Cabinet is not available at " + ibx));

        OrderCreateRequest request = new OrderCreateRequest()
                .accountNumber(account)
                .ibxCode(ibx)
                .customerReference("sdk-example-PlaceSecureCabinetOrder")
                .contractTerm(ContractTerm._24_MONTHS)
                .orderItem(new OrderItem()
                        .numberOfCabinets(1)
                        .drawCapacity(available.getMinimumDrawCapacityPerCabinet())
                        .cabinetDimensions(available.getCabinetDimensions())
                        .fabricPort(false)
                        .pdus(false))
                .technicalContact(new ContactDetails()
                        .firstName(SecureCabinetSupport.require("EQUINIX_EXAMPLE_CONTACT_FIRST_NAME"))
                        .lastName(SecureCabinetSupport.require("EQUINIX_EXAMPLE_CONTACT_LAST_NAME"))
                        .email(SecureCabinetSupport.require("EQUINIX_EXAMPLE_CONTACT_EMAIL")));

        String purchaseOrder = System.getenv("EQUINIX_EXAMPLE_PO_NUMBER");
        if (purchaseOrder != null && !purchaseOrder.isEmpty()) {
            request.purchaseOrderNumber(purchaseOrder);
        }

        OrderCreateResponse response = new OrdersApi(client).createOrder(request, UUID.randomUUID().toString());
        System.out.println("order accepted: " + response.getOrderNumber());
    }
}
