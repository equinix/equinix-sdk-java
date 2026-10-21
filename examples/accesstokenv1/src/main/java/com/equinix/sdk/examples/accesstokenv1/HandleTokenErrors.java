package com.equinix.sdk.examples.accesstokenv1;

import com.equinix.sdk.accesstokenv1.ApiClient;
import com.equinix.sdk.accesstokenv1.ApiException;
import com.equinix.sdk.accesstokenv1.Configuration;
import com.equinix.sdk.accesstokenv1.JSON;
import com.equinix.sdk.accesstokenv1.api.OAuth2TokenApi;
import com.equinix.sdk.accesstokenv1.model.Oauth2TokenErrorResponse;
import com.equinix.sdk.accesstokenv1.model.Oauth2TokenRequest;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Shows how failures surface: every non-2xx response is thrown as an {@link ApiException} carrying the
 * HTTP status, response headers and raw body, and the body can be parsed into the service's error
 * model.
 *
 * <p>Deliberately sends invalid credentials to trigger the error path. Creates no resources.
 */
public class HandleTokenErrors {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        OAuth2TokenApi api = new OAuth2TokenApi(client);

        Oauth2TokenRequest request = new Oauth2TokenRequest()
                .grantType("client_credentials")
                .clientId("not-a-real-client-id")
                .clientSecret("not-a-real-secret");

        try {
            api.getOAuth2AccessToken(request);
            System.out.println("unexpectedly succeeded");
        } catch (ApiException e) {
            System.out.println("HTTP status: " + e.getCode());
            System.out.println("headers:     " + e.getResponseHeaders());
            try {
                Oauth2TokenErrorResponse error = JSON.getGson().fromJson(e.getResponseBody(), Oauth2TokenErrorResponse.class);
                System.out.println("error code:  " + error.getErrorCode());
                System.out.println("message:     " + error.getErrorMessage());
            } catch (RuntimeException notJson) {
                // gateways and proxies can return non-JSON bodies, e.g. for 502/503
                System.out.println("raw body:    " + e.getResponseBody());
            }
        }
    }
}
