package com.equinix.sdk.examples.shipmentsv1;

import com.equinix.sdk.shipmentsv1.api.ShipmentApi;
import com.equinix.sdk.shipmentsv1.model.Account;
import com.equinix.sdk.shipmentsv1.model.Cage;
import com.equinix.sdk.shipmentsv1.model.GetLocation200Response;
import com.equinix.sdk.shipmentsv1.model.Location;

/**
 * Lists the IBX sites, cages and accounts the caller may place shipment orders for. These are the
 * values the order examples need for their ibx, cage and account number fields.
 *
 * <p>Read-only: creates, modifies and deletes nothing.
 */
public class ListShipmentLocations {
    public static void main(String[] args) throws Exception {
        ShipmentApi api = ShipmentExampleSupport.api();

        // detail=true adds the accounts for each cage; ibxs and cages can narrow the result
        GetLocation200Response response = api.getLocation(ShipmentExampleSupport.authorization(), true, null, null);

        for (Location location : response.getLocations()) {
            System.out.println(location.getIbx());
            for (Cage cage : location.getCages()) {
                System.out.println("  cage " + cage.getCage() + " " + cage.getCageTypes());
                if (cage.getAccounts() == null) {
                    continue;
                }
                for (Account account : cage.getAccounts()) {
                    System.out.println("    account " + account.getNumber() + " (" + account.getName() + ")"
                            + (Boolean.TRUE.equals(account.getIsCreditHold()) ? " [credit hold]" : ""));
                }
            }
        }
    }
}
