package com.equinix.sdk.examples.orderhistoryv1;

import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.model.PermissibleLocation;
import java.io.IOException;
import java.util.List;

/**
 * Lists the IBX locations and cages whose order history the caller may view.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListOrderLocations {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        var api = OrderHistorySupport.api();
        String authorization = OrderHistorySupport.authorization();

        List<PermissibleLocation> locations = api.gETRetrieveOrdersLocations(authorization);
        System.out.println("locations:");
        locations.forEach(location -> System.out.println(
                "  " + (location.getIbx() == null ? "?" : location.getIbx().getCode()) + " cages " + location.getCages()));
    }
}
