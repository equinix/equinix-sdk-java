package com.equinix.sdk.examples.assetsv1;

import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.api.AssetsApi;
import com.equinix.sdk.assetsv1.model.Asset;
import com.equinix.sdk.assetsv1.model.AssetsProperty;
import com.equinix.sdk.assetsv1.model.AssetsSearchResponse;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Fetches the details of one asset by its asset number.
 *
 * <p>Set EQUINIX_EXAMPLE_ASSET_ID to choose the asset; when it is not set, the first asset returned by
 * a search is used. Read-only.
 */
public class GetAsset {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AssetsApi api = new AssetsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        String assetId = System.getenv("EQUINIX_EXAMPLE_ASSET_ID");
        if (assetId == null || assetId.isEmpty()) {
            AssetsSearchResponse first = api.searchAssets(authorization, null, null, null, null, 0, 1, null);
            if (first.getData() == null || first.getData().isEmpty()) {
                System.out.println("no assets found; set EQUINIX_EXAMPLE_ASSET_ID to look one up directly");
                return;
            }
            assetId = first.getData().get(0).getAssetNumber();
        }

        Asset asset = api.getAssetById(authorization, assetId);
        System.out.println("asset:       " + asset.getAssetNumber());
        System.out.println("product:     " + asset.getProductName() + " (" + asset.getProductDescription() + ")");
        System.out.println("location:    " + asset.getIbx() + " " + asset.getCage());
        System.out.println("installed:   " + asset.getInstallationDate());
        System.out.println("status:      " + asset.getStatus());
        if (asset.getProductDetails() != null) {
            for (AssetsProperty detail : asset.getProductDetails()) {
                System.out.println("  " + detail.getTag() + " " + detail.getKey() + " = " + detail.getValue());
            }
        }
    }
}
