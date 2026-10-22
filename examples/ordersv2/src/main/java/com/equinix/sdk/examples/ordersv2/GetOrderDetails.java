package com.equinix.sdk.examples.ordersv2;

import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.api.OrdersApi;
import com.equinix.sdk.ordersv2.model.Negotiations;
import com.equinix.sdk.ordersv2.model.Orders;
import java.io.IOException;
import java.util.List;

/**
 * Fetches one order, with its line items, and any schedule negotiations on it.
 *
 * <p>Read-only: it creates, modifies and deletes nothing. Needs {@code EQUINIX_EXAMPLE_ORDER_ID}.
 */
public class GetOrderDetails {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        OrdersApi api = OrdersSupport.api();
        String orderId = OrdersSupport.orderId();

        Orders order = api.gETOrderDetails(orderId, null);
        System.out.println("order " + order.getOrderId() + " status " + order.getStatus()
                + " account " + order.getAccountNumber() + " created " + order.getCreatedDateTime());
        System.out.println("cancellable: " + order.getCancellable() + ", modifiable: " + order.getModifiable());
        if (order.getDetails() != null) {
            order.getDetails().forEach(line -> System.out.println("  line " + line.getLineId()
                    + " " + line.getProductType() + " " + line.getProductCode() + " status " + line.getStatus()));
        }

        List<Negotiations> negotiations = api.retrieveOrderNegotiations(orderId);
        System.out.println("negotiations: " + negotiations.size());
        negotiations.forEach(n -> System.out.println("  " + n.getReferenceId()
                + " proposed " + n.getProposedDateTime() + " expires " + n.getExpirationDateTime()));
    }
}
