package com.equinix.sdk.examples.securecabinetv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.securecabinetv1.ApiClient;
import com.equinix.sdk.securecabinetv1.Configuration;
import java.io.IOException;

/**
 * Shared client setup for the Secure Cabinet examples.
 *
 * <p>The billing account number is read from {@code EQUINIX_EXAMPLE_ACCOUNT}. The service only
 * answers for accounts that are allowed to order colocation products.
 */
final class SecureCabinetSupport {
    private SecureCabinetSupport() {}

    /** A client pointed at the configured endpoint and authenticated with a bearer token. */
    static ApiClient client() throws IOException, InterruptedException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken(ExampleEnv.token());
        return client;
    }

    /** The billing account number, or an exception naming the missing variable. */
    static String account() {
        return require("EQUINIX_EXAMPLE_ACCOUNT");
    }

    static String require(String name) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException("set " + name);
        }
        return value;
    }

    /**
     * Stops the example unless the caller has explicitly allowed it to create orders. Orders
     * commit to a multi-year contract and may be billed.
     */
    static void requireWritesAllowed(String example) {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.err.println(example + " places a real Secure Cabinet order, so it does not run by default.");
            System.err.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true to send it.");
            System.exit(1);
        }
    }
}
