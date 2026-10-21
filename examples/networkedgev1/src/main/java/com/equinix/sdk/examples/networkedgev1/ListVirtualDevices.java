package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;
import com.equinix.sdk.networkedgev1.model.GetDevicesResponse;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceDetailsResponse;
import java.util.List;

/**
 * Lists your virtual devices, walking all pages of the result. Pass a metro code such as SV as the
 * first argument to list only devices in that metro.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListVirtualDevices {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        VirtualDeviceApi api = new VirtualDeviceApi(client);
        String metroCode = args.length > 0 ? args[0] : null;

        List<VirtualDeviceDetailsResponse> devices = Paging.fetchAll((offset, limit) -> {
            GetDevicesResponse page = api.getVirtualDevices(offset, limit, metroCode, null, null, null, null, null, null);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (VirtualDeviceDetailsResponse device : devices) {
            System.out.println(device.getUuid() + "  " + device.getStatus() + "  " + device.getMetroCode() + "  "
                    + device.getDeviceTypeCode() + "  " + device.getName());
        }
        System.out.println(devices.size() + " devices");
    }
}
