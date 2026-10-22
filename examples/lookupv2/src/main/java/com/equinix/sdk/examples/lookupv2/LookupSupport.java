package com.equinix.sdk.examples.lookupv2;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.api.LookupApi;
import java.io.IOException;

/** Shared client setup for the Lookup examples. */
final class LookupSupport {
    private LookupSupport() {}

    /** A client pointed at {@code EQUINIX_EXAMPLE_ENDPOINT} and authenticated with a fresh bearer token. */
    static LookupApi api() throws IOException, InterruptedException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        client.setBearerToken(ExampleEnv.token());
        return new LookupApi(client);
    }
}
