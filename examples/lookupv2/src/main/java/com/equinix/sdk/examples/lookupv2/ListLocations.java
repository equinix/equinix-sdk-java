package com.equinix.sdk.examples.lookupv2;

import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.api.LookupApi;
import com.equinix.sdk.lookupv2.model.LocationsDetailsResponse;
import java.io.IOException;

/**
 * Lists the IBX locations, accounts, cages and cabinets the caller may place cross connect orders
 * for. The cage and cabinet IDs it prints are the inputs to {@link ListPatchPanels}.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListLocations {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        LookupApi api = LookupSupport.api();

        // details=true adds the accounts, cages and cabinets available at each IBX
        LocationsDetailsResponse response =
                api.getLocationsByPermissionCode("CROSS_CONNECT", null, null, null, null, true);

        response.getCrossConnects().forEach(location -> {
            System.out.println(location.getIbx());
            location.getAccounts().forEach(account ->
                    System.out.println("  account " + account.getAccountNumber() + " " + account.getAccountName()));
            location.getCages().forEach(cage -> System.out.println("  cage " + cage.getId() + " cabinet "
                    + cage.getCabinetId() + " type " + cage.getType() + " accounts " + cage.getAccountNumbers()));
        });
    }
}
