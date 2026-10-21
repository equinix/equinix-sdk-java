package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;
import com.equinix.sdk.networkedgev1.model.GetMetrosResponse;
import com.equinix.sdk.networkedgev1.model.MetroResponse;
import java.util.List;

/**
 * Lists every metro where Network Edge devices can be deployed, walking all pages of the result.
 * Pass a region such as AMER, EMEA or APAC as the first argument to filter.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListMetros {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        AvailabilityAndMetrosApi api = new AvailabilityAndMetrosApi(client);
        String region = args.length > 0 ? args[0] : null;

        List<MetroResponse> metros = Paging.fetchAll((offset, limit) -> {
            GetMetrosResponse page = api.getMetros(region, offset, limit);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (MetroResponse metro : metros) {
            System.out.println(metro.getMetroCode() + "  " + metro.getRegion() + "  " + metro.getMetroDescription());
        }
        System.out.println(metros.size() + " metros");
    }
}
