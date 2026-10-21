package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.shipmentsv1.ApiClient;
import com.equinix.sdk.shipmentsv1.Configuration;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import java.io.IOException;

/** Shared setup for the shipmentsv1 examples. */
final class ShipmentExampleSupport {
    private ShipmentExampleSupport() {}

    static ShipmentApi api() {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        return new ShipmentApi(client);
    }

    /**
     * The shipments operations take the Authorization header as an ordinary parameter (the spec
     * declares no security scheme), so the "Bearer " prefix is added here.
     */
    static String authorization() throws IOException, InterruptedException {
        return "Bearer " + ExampleEnv.token();
    }

    /** Stops the example unless the caller has explicitly opted in to creating orders. */
    static boolean writesAllowed() {
        if ("true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            return true;
        }
        System.out.println("This example places a real shipment order, so it did not send the request.");
        System.out.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true (and replace the placeholder values) to run it.");
        return false;
    }
}
