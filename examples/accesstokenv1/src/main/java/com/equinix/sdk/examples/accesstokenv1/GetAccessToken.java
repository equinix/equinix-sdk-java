package com.equinix.sdk.examples.accesstokenv1;

import com.equinix.sdk.accesstokenv1.ApiClient;
import com.equinix.sdk.accesstokenv1.ApiException;
import com.equinix.sdk.accesstokenv1.Configuration;
import com.equinix.sdk.accesstokenv1.api.OAuth2TokenApi;
import com.equinix.sdk.accesstokenv1.model.Oauth2RefreshTokenRequest;
import com.equinix.sdk.accesstokenv1.model.Oauth2TokenRequest;
import com.equinix.sdk.accesstokenv1.model.Oauth2TokenResponse;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Exchanges an application's client ID and secret for an access token using the client_credentials
 * grant, then renews it with the refresh token when the service returns one.
 *
 * <p>Requires EQUINIX_API_CLIENTID and EQUINIX_API_CLIENTSECRET. Read-only: it creates tokens but no
 * Equinix resources.
 */
public class GetAccessToken {
    public static void main(String[] args) throws ApiException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        OAuth2TokenApi api = new OAuth2TokenApi(client);

        Oauth2TokenRequest request = new Oauth2TokenRequest()
                .grantType("client_credentials")
                .clientId(System.getenv("EQUINIX_API_CLIENTID"))
                .clientSecret(System.getenv("EQUINIX_API_CLIENTSECRET"));

        Oauth2TokenResponse token = api.getOAuth2AccessToken(request);
        System.out.println("token type:    " + token.getTokenType());
        System.out.println("expires in:    " + token.getTokenTimeout() + " seconds");

        if (token.getRefreshToken() != null) {
            Oauth2TokenResponse renewed = api.refreshOAuth2AccessToken(new Oauth2RefreshTokenRequest()
                    .clientId(System.getenv("EQUINIX_API_CLIENTID"))
                    .clientSecret(System.getenv("EQUINIX_API_CLIENTSECRET"))
                    .refreshToken(token.getRefreshToken()));
            System.out.println("renewed, new token expires in " + renewed.getTokenTimeout() + " seconds");
        }
    }
}
