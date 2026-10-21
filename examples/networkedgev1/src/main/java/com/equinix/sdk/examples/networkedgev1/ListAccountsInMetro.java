package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;
import com.equinix.sdk.networkedgev1.model.MetroAccountResponse;
import com.equinix.sdk.networkedgev1.model.PageResponseMetroAccountResponse;

/**
 * Lists the billing accounts you can use to order devices in one metro (SV by default, or the first
 * argument). The account number is what a create-device request needs as {@code accountNumber}.
 *
 * <p>Read-only: it creates, modifies and deletes nothing. The operation is not paged.
 */
public class ListAccountsInMetro {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        AvailabilityAndMetrosApi api = new AvailabilityAndMetrosApi(client);
        String metro = args.length > 0 ? args[0] : "SV";

        PageResponseMetroAccountResponse response = api.getAccountsWithStatus(metro, null);
        if (response.getData() == null) {
            System.out.println("no accounts in " + metro);
            return;
        }
        for (MetroAccountResponse account : response.getData()) {
            System.out.println(account.getAccountNumber() + "  " + account.getAccountStatus() + "  "
                    + account.getAccountName() + "  credit hold: " + account.getCreditHold());
        }
    }
}
