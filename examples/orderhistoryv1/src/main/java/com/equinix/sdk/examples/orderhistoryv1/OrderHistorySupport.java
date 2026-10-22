package com.equinix.sdk.examples.orderhistoryv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.orderhistoryv1.ApiClient;
import com.equinix.sdk.orderhistoryv1.Configuration;
import com.equinix.sdk.orderhistoryv1.api.RetrieveOrdersApi;
import java.io.IOException;

/**
 * Shared setup for the Order History examples.
 *
 * <p>The Order History API takes its bearer token as an {@code Authorization} header parameter on
 * every call rather than through a configured security scheme, so {@link #authorization()} returns
 * the full header value to pass to each operation.
 */
final class OrderHistorySupport {
    private OrderHistorySupport() {}

    static RetrieveOrdersApi api() {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        return new RetrieveOrdersApi(client);
    }

    /** The value for the {@code Authorization} header parameter. */
    static String authorization() throws IOException, InterruptedException {
        return "Bearer " + ExampleEnv.token();
    }
}
