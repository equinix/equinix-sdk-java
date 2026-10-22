package com.equinix.sdk.examples.ordersv2;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.api.OrdersApi;
import java.io.IOException;

/**
 * Shared setup for the Orders examples.
 *
 * <p>The order to work with is read from {@code EQUINIX_EXAMPLE_ORDER_ID}. The service has no list
 * operation, so use the id of an order you already have, for example one returned when it was placed.
 */
final class OrdersSupport {
    private OrdersSupport() {}

    static OrdersApi api() throws IOException, InterruptedException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken(ExampleEnv.token());
        return new OrdersApi(client);
    }

    /** The id of the order to operate on; exits with a message when it is not set. */
    static String orderId() {
        String orderId = System.getenv("EQUINIX_EXAMPLE_ORDER_ID");
        if (orderId == null || orderId.isEmpty()) {
            System.err.println("Set EQUINIX_EXAMPLE_ORDER_ID to the id of an existing order.");
            System.exit(1);
        }
        return orderId;
    }

    /**
     * Stops the example unless the caller has explicitly allowed it to change an order. Notes are
     * visible to Equinix staff and cancellation cannot be undone.
     */
    static void requireWritesAllowed(String example) {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.err.println(example + " changes a real order, so it does not run by default.");
            System.err.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true to send it.");
            System.exit(1);
        }
    }
}
