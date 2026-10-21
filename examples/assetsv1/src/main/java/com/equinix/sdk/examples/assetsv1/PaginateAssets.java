package com.equinix.sdk.examples.assetsv1;

import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.api.AssetsApi;
import com.equinix.sdk.assetsv1.model.AssetsSearchResponse;
import com.equinix.sdk.assetsv1.model.AssetsSummary;
import com.equinix.sdk.examples.ExampleEnv;
import java.util.List;

/**
 * Walks every page of an asset search using the offset and limit query parameters until all matching
 * assets have been read.
 *
 * <p>Read-only. Stops when a page comes back empty, when the reported total is reached, or after
 * MAX_PAGES requests, so a misbehaving server cannot keep it looping forever.
 */
public class PaginateAssets {
    private static final int PAGE_SIZE = 100; // the largest limit the spec allows
    private static final int MAX_PAGES = 1000;

    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AssetsApi api = new AssetsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        int offset = 0;
        int seen = 0;
        for (int page = 1; page <= MAX_PAGES; page++) {
            // a stable sort keeps assets from moving between pages while we walk them
            AssetsSearchResponse response = api.searchAssets(
                    authorization, List.of("ASSET_NUMBER"), null, null, null, offset, PAGE_SIZE, null);

            List<AssetsSummary> assets = response.getData();
            if (assets == null || assets.isEmpty()) {
                break;
            }
            seen += assets.size();
            System.out.println("page " + page + ": " + assets.size() + " assets (offset " + offset + ")");

            offset += assets.size();
            Integer total = response.getPage() == null ? null : response.getPage().getTotal();
            if (total != null && offset >= total) {
                break;
            }
        }
        System.out.println("read " + seen + " assets");
    }
}
