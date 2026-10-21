package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;
import com.equinix.sdk.networkedgev1.model.DeviceRebootResponse;
import com.equinix.sdk.networkedgev1.model.DeviceUpgradeDetailsResponse;
import com.equinix.sdk.networkedgev1.model.GetDeviceReloadResponse;
import com.equinix.sdk.networkedgev1.model.GetDeviceUpgradeResponse;
import java.util.List;

/**
 * Lists the reload (soft reboot) history and the resource upgrade history of one virtual device,
 * walking all pages of each. The first argument is the device UUID, or EQUINIX_EXAMPLE_DEVICE_UUID.
 *
 * <p>Read-only: it only reads history and does not reload or upgrade the device.
 */
public class ListDeviceHistory {
    public static void main(String[] args) throws ApiException {
        String uuid = args.length > 0 ? args[0] : Writes.requireEnv("EQUINIX_EXAMPLE_DEVICE_UUID", "a virtual device UUID");
        ApiClient client = NetworkEdgeClient.create();
        VirtualDeviceApi api = new VirtualDeviceApi(client);

        List<DeviceRebootResponse> reloads = Paging.fetchAll((offset, limit) -> {
            GetDeviceReloadResponse page = api.getDeviceReloadByUuid(uuid, offset, limit);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });
        for (DeviceRebootResponse reload : reloads) {
            System.out.println("reload   " + reload.getStatus() + "  requested " + reload.getRequestedDateTime()
                    + " by " + reload.getRequestedBy());
        }

        List<DeviceUpgradeDetailsResponse> upgrades = Paging.fetchAll((offset, limit) -> {
            GetDeviceUpgradeResponse page = api.getDeviceUpgradeByUuid(uuid, offset, limit);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });
        for (DeviceUpgradeDetailsResponse upgrade : upgrades) {
            System.out.println("upgrade  " + upgrade.getStatus() + "  requested " + upgrade.getRequestedDateTime()
                    + " by " + upgrade.getRequestedBy());
        }
        System.out.println(reloads.size() + " reloads, " + upgrades.size() + " upgrades");
    }
}
