package com.equinix.sdk.examples;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Reads endpoint and credentials for the examples from the environment, using the same variable
 * names as the Equinix Terraform provider:
 *
 * <ul>
 *   <li>{@code EQUINIX_API_ENDPOINT} - defaults to https://api.equinix.com
 *   <li>{@code EQUINIX_API_TOKEN} - a bearer token; used as-is when set
 *   <li>{@code EQUINIX_API_CLIENTID} and {@code EQUINIX_API_CLIENTSECRET} - exchanged for a token
 *       using the client_credentials grant when no token is set
 * </ul>
 */
public final class ExampleEnv {
    public static final String DEFAULT_ENDPOINT = "https://api.equinix.com";

    private ExampleEnv() {}

    public static String endpoint() {
        String endpoint = System.getenv("EQUINIX_API_ENDPOINT");
        return endpoint == null || endpoint.isEmpty() ? DEFAULT_ENDPOINT : endpoint;
    }

    /** Returns a bearer token, requesting one from the token endpoint if none is configured. */
    public static String token() throws IOException, InterruptedException {
        String token = System.getenv("EQUINIX_API_TOKEN");
        if (token != null && !token.isEmpty()) {
            return token;
        }
        return requestToken(require("EQUINIX_API_CLIENTID"), require("EQUINIX_API_CLIENTSECRET"));
    }

    static String requestToken(String clientId, String clientSecret) throws IOException, InterruptedException {
        JsonObject body = new JsonObject();
        body.addProperty("grant_type", "client_credentials");
        body.addProperty("client_id", clientId);
        body.addProperty("client_secret", clientSecret);

        HttpRequest request = HttpRequest.newBuilder(URI.create(endpoint() + "/oauth2/v1/token"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body.toString()))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("token request failed with status " + response.statusCode());
        }
        return JsonParser.parseString(response.body()).getAsJsonObject().get("access_token").getAsString();
    }

    private static String require(String name) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException("set EQUINIX_API_TOKEN, or both EQUINIX_API_CLIENTID and EQUINIX_API_CLIENTSECRET (missing " + name + ")");
        }
        return value;
    }
}
