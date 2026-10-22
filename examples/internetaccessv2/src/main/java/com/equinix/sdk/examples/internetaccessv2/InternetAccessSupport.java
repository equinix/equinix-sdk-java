package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;
import com.equinix.sdk.internetaccessv2.api.ProductAvailabilityApi;
import java.io.IOException;

/**
 * Shared setup for the Internet Access examples.
 *
 * <p>The client is configured with the bearer token from {@link ExampleEnv}. Examples that change
 * state read their inputs from {@code EQUINIX_EXAMPLE_*} environment variables:
 *
 * <ul>
 *   <li>{@code EQUINIX_EXAMPLE_ALLOW_WRITES=true} - required by every example that creates, changes
 *       or deletes a service
 *   <li>{@code EQUINIX_EXAMPLE_CONNECTION_ID} - UUID of the connection the new service attaches to
 *       (CreateService)
 *   <li>{@code EQUINIX_EXAMPLE_SERVICE_ID} - UUID of an existing service (GetServiceDetails,
 *       UpdateServiceBandwidth, DeleteService)
 *   <li>{@code EQUINIX_EXAMPLE_BANDWIDTH} - new bandwidth in Mbps (UpdateServiceBandwidth)
 * </ul>
 */
final class InternetAccessSupport {
    private InternetAccessSupport() {}

    private static ApiClient client() throws IOException, InterruptedException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken(ExampleEnv.token());
        return client;
    }

    static EiaServiceApi serviceApi() throws IOException, InterruptedException {
        return new EiaServiceApi(client());
    }

    static ProductAvailabilityApi availabilityApi() throws IOException, InterruptedException {
        return new ProductAvailabilityApi(client());
    }

    /** Stops the example unless the caller has explicitly allowed it to change anything. */
    static void requireWritesAllowed(String example) {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.err.println(example + " changes real Internet Access services, so it does not run by default.");
            System.err.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true to run it.");
            System.exit(1);
        }
    }

    static String requireEnv(String name) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            System.err.println("Set " + name + " to run this example.");
            System.exit(1);
        }
        return value;
    }
}
