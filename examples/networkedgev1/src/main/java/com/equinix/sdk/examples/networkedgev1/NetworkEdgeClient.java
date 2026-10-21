package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.HttpBearerAuth;
import java.io.IOException;

/** Builds the {@link ApiClient} every example in this module uses. */
final class NetworkEdgeClient {
    private NetworkEdgeClient() {}

    /** Returns a client pointed at EQUINIX_API_ENDPOINT and authenticated with a bearer token. */
    static ApiClient create() {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        try {
            ((HttpBearerAuth) client.getAuthentication("BearerAuth")).setBearerToken(ExampleEnv.token());
        } catch (IOException e) {
            throw new IllegalStateException("could not obtain an access token", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("interrupted while obtaining an access token", e);
        }
        return client;
    }
}
