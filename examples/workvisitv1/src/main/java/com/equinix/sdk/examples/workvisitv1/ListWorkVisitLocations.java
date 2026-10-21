package com.equinix.sdk.examples.workvisitv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.workvisitv1.ApiClient;
import com.equinix.sdk.workvisitv1.ApiException;
import com.equinix.sdk.workvisitv1.Configuration;
import com.equinix.sdk.workvisitv1.api.WorkvisitApi;
import com.equinix.sdk.workvisitv1.model.Account;
import com.equinix.sdk.workvisitv1.model.Cage;
import com.equinix.sdk.workvisitv1.model.GetLocation200Response;
import com.equinix.sdk.workvisitv1.model.Location;
import java.io.IOException;

/**
 * Lists the IBXs, cages and accounts where the caller may place a work visit order, including the
 * cabinets of each account.
 *
 * <p>Read-only: it creates, modifies and deletes nothing. The locations are returned in a single
 * response; the operation takes no paging parameters.
 */
public class ListWorkVisitLocations {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        WorkvisitApi api = new WorkvisitApi(client);

        // the token goes in the Authorization header parameter, with the Bearer prefix
        String authorization = "Bearer " + ExampleEnv.token();

        // detail=true adds the cabinets of each account; ibxs and cages are optional filters
        GetLocation200Response response = api.getLocation(authorization, true, null, null);

        if (response.getLocations() == null || response.getLocations().isEmpty()) {
            System.out.println("no locations: the user needs the 'IBX Access Services Request' permission");
            return;
        }
        for (Location location : response.getLocations()) {
            System.out.println("IBX " + location.getIbx());
            for (Cage cage : location.getCages()) {
                System.out.println("  cage " + cage.getCage() + " types=" + cage.getCageTypes());
                if (cage.getAccounts() == null) {
                    continue;
                }
                for (Account account : cage.getAccounts()) {
                    int cabinets = account.getCabinets() == null ? 0 : account.getCabinets().size();
                    System.out.println("    account " + account.getNumber() + " (" + account.getName() + "), "
                            + cabinets + " cabinets");
                }
            }
        }
    }
}
