package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;
import com.equinix.sdk.networkedgev1.model.DeviceLinkGroup;
import com.equinix.sdk.networkedgev1.model.GetLinksResponse;
import java.util.List;

/**
 * Lists your device link groups, walking all pages of the result.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListDeviceLinkGroups {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        DeviceLinkGroupsAndConnectionsApi api = new DeviceLinkGroupsAndConnectionsApi(client);

        List<DeviceLinkGroup> groups = Paging.fetchAll((offset, limit) -> {
            GetLinksResponse page = api.getDeviceLinkGroups(null, null, null, null, null, null, offset, limit);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (DeviceLinkGroup group : groups) {
            int devices = group.getLinkDevices() == null ? 0 : group.getLinkDevices().size();
            System.out.println(group.getUuid() + "  " + group.getStatus() + "  " + group.getGroupName()
                    + "  (" + devices + " devices)");
        }
        System.out.println(groups.size() + " device link groups");
    }
}
