package com.equinix.sdk.examples.crossconnectsv2;

import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;
import com.equinix.sdk.crossconnectsv2.auth.HttpBearerAuth;
import com.equinix.sdk.crossconnectsv2.model.ContactRequestRegisteredUserUpdate;
import com.equinix.sdk.crossconnectsv2.model.ModifyRequest;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Adds a notification contact to an existing cross connect order.
 *
 * <p>Modifies an order, so it only sends the request when EQUINIX_EXAMPLE_ALLOW_WRITES=true. Set
 * EQUINIX_EXAMPLE_ORDER_ID to the order to change.
 */
public class UpdateOrderContacts {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        ((HttpBearerAuth) client.getAuthentication("BearerAuth")).setBearerToken(ExampleEnv.token());
        CrossConnectsApi api = new CrossConnectsApi(client);

        String orderId = System.getenv().getOrDefault("EQUINIX_EXAMPLE_ORDER_ID", "1-123456789");
        ModifyRequest request = new ModifyRequest()
                .addContactsItem(new ContactRequestRegisteredUserUpdate()
                        .type(ContactRequestRegisteredUserUpdate.TypeEnum.NOTIFICATION)
                        .addRegisteredUsersItem("john_doe"));

        if (!WriteGuard.allowed()) {
            return;
        }

        try {
            api.updateACrossConnectOrder(orderId, request);
            System.out.println("order " + orderId + " updated");
        } catch (ApiException e) {
            System.out.println("update rejected with HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
