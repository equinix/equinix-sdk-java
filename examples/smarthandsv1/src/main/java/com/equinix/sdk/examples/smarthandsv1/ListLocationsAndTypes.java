package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;
import com.equinix.sdk.smarthandsv1.model.GetLocation200Response;
import com.equinix.sdk.smarthandsv1.model.SmartHandTypes200Response;
import java.io.IOException;

/**
 * Lists the Smart Hands order types and the IBX locations, cages and cabinets the caller may place
 * orders for. These are the values the order examples need.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListLocationsAndTypes {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        SmarthandsApi api = SmartHandsSupport.api();
        String authorization = SmartHandsSupport.authorization();

        SmartHandTypes200Response types = api.smartHandTypes(authorization);
        System.out.println("order types:");
        types.getSmarthands()
                .forEach(type -> System.out.println("  " + type.getType() + ": " + type.getTypeDescription()));

        // detail=true adds the cages and cabinets the caller can order for at each IBX
        GetLocation200Response locations = api.getLocation(authorization, true, null, null);
        System.out.println("locations:");
        locations.getLocations().forEach(location -> {
            System.out.println("  " + location.getIbx());
            location.getCages().forEach(cage -> System.out.println(
                    "    cage " + cage.getCage() + " types " + cage.getCageTypes() + " accounts " + cage.getAccounts().size()));
        });
    }
}
