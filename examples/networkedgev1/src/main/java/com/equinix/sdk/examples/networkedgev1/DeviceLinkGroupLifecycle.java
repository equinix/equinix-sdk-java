package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;
import com.equinix.sdk.networkedgev1.model.DeviceLinkGroup;
import com.equinix.sdk.networkedgev1.model.DeviceLinkGroupResponse;
import com.equinix.sdk.networkedgev1.model.DeviceLinkRequest;
import com.equinix.sdk.networkedgev1.model.LinkDeviceInfo;
import com.equinix.sdk.networkedgev1.model.LinkInfo;

/**
 * Links two existing virtual devices in different metros with a device link group, reads the group
 * back, then deletes it.
 *
 * <p>CREATES AND DELETES a resource, but only the group this example creates; the devices are not
 * changed. A link group with a metro link may be billable while it exists. It only runs when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true is set.
 *
 * <p>Required environment: EQUINIX_EXAMPLE_DEVICE_UUID and EQUINIX_EXAMPLE_SECONDARY_DEVICE_UUID (two
 * active devices), EQUINIX_EXAMPLE_ACCOUNT_NUMBER, EQUINIX_EXAMPLE_SECONDARY_ACCOUNT_NUMBER,
 * EQUINIX_EXAMPLE_METRO and EQUINIX_EXAMPLE_SECONDARY_METRO (the devices' metros). The interface IDs
 * (6 and 7) are illustrative; use a free data interface of each device.
 */
public class DeviceLinkGroupLifecycle {
    public static void main(String[] args) throws ApiException {
        Writes.requireOptIn("creates and deletes a device link group");
        String primaryUuid = Writes.requireEnv("EQUINIX_EXAMPLE_DEVICE_UUID", "the first device's UUID");
        String secondaryUuid = Writes.requireEnv("EQUINIX_EXAMPLE_SECONDARY_DEVICE_UUID", "the second device's UUID");
        String primaryAccount = Writes.requireEnv("EQUINIX_EXAMPLE_ACCOUNT_NUMBER", "the first device's account number");
        String secondaryAccount =
                Writes.requireEnv("EQUINIX_EXAMPLE_SECONDARY_ACCOUNT_NUMBER", "the second device's account number");
        String primaryMetro = Writes.requireEnv("EQUINIX_EXAMPLE_METRO", "the first device's metro code");
        String secondaryMetro = Writes.requireEnv("EQUINIX_EXAMPLE_SECONDARY_METRO", "the second device's metro code");

        ApiClient client = NetworkEdgeClient.create();
        DeviceLinkGroupsAndConnectionsApi api = new DeviceLinkGroupsAndConnectionsApi(client);

        DeviceLinkRequest request = new DeviceLinkRequest()
                .groupName("sdk-example-link")
                .addLinkDevicesItem(new LinkDeviceInfo().deviceUuid(primaryUuid).interfaceId(6))
                .addLinkDevicesItem(new LinkDeviceInfo().deviceUuid(secondaryUuid).interfaceId(7))
                .addMetroLinksItem(new LinkInfo()
                        .accountNumber(primaryAccount)
                        .metroCode(primaryMetro)
                        .throughput("50")
                        .throughputUnit("Mbps"))
                .addMetroLinksItem(new LinkInfo()
                        .accountNumber(secondaryAccount)
                        .metroCode(secondaryMetro)
                        .throughput("50")
                        .throughputUnit("Mbps"));

        DeviceLinkGroupResponse created = api.createDeviceLinkGroup(request);
        System.out.println("created device link group " + created.getUuid());

        DeviceLinkGroup group = api.getDeviceLinkGroupByUUID(created.getUuid());
        System.out.println("status: " + group.getStatus());

        api.deleteDeviceLinkGroupByUuid(created.getUuid());
        System.out.println("deleted device link group " + created.getUuid());
    }
}
