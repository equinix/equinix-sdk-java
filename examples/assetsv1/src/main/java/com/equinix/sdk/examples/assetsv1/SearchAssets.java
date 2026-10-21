package com.equinix.sdk.examples.assetsv1;

import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.api.AssetsApi;
import com.equinix.sdk.assetsv1.model.AssetsSearchRequest;
import com.equinix.sdk.assetsv1.model.AssetsSearchRequestFilter;
import com.equinix.sdk.assetsv1.model.AssetsSearchResponse;
import com.equinix.sdk.assetsv1.model.AssetsSummary;
import com.equinix.sdk.examples.ExampleEnv;
import java.util.List;

/**
 * Searches the installed assets of your organization, filtered by IBX and sorted by asset number, and
 * prints the first page of results.
 *
 * <p>Set EQUINIX_EXAMPLE_IBX to search a different IBX than the default. Read-only: the search is a POST
 * but it creates or changes nothing.
 */
public class SearchAssets {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AssetsApi api = new AssetsApi(client);

        // the spec declares the Authorization header as a plain parameter, so it is passed on each call
        String authorization = "Bearer " + ExampleEnv.token();

        String ibx = System.getenv().getOrDefault("EQUINIX_EXAMPLE_IBX", "DA1");
        AssetsSearchRequest request = new AssetsSearchRequest()
                .filter(new AssetsSearchRequestFilter().ibxs(List.of(ibx)));

        AssetsSearchResponse response = api.searchAssets(
                authorization, List.of("ASSET_NUMBER"), null, null, null, 0, 10, request);

        System.out.println("matching assets: " + response.getPage().getTotal());
        for (AssetsSummary asset : response.getData()) {
            System.out.println(asset.getAssetNumber() + "  " + asset.getProductName() + "  " + asset.getIbx()
                    + "  " + asset.getCage() + "  " + asset.getStatus());
        }
    }
}
