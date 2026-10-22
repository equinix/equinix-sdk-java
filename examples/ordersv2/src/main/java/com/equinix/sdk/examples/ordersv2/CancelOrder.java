package com.equinix.sdk.examples.ordersv2;

import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.model.CancelRequest;
import java.io.IOException;

/**
 * Cancels an existing order.
 *
 * <p><b>Cancels a real order, which cannot be undone.</b> It does nothing unless
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs {@code EQUINIX_EXAMPLE_ORDER_ID}. Only orders reported
 * as cancellable by {@link GetOrderDetails} can be cancelled.
 */
public class CancelOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        OrdersSupport.requireWritesAllowed("CancelOrder");

        CancelRequest request = new CancelRequest().reason("Cancelled by the SDK example CancelOrder.");
        OrdersSupport.api().cancelAnOrder(OrdersSupport.orderId(), request);
        System.out.println("order cancelled");
    }
}
