package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;
import com.equinix.sdk.networkedgev1.model.DeviceBackupInfoVerbose;
import com.equinix.sdk.networkedgev1.model.GetDeviceBackupsResponse;
import java.util.List;

/**
 * Lists device backups, walking all pages of the result. Pass a virtual device UUID as the first
 * argument to list only the backups of that device.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListDeviceBackups {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        DeviceBackupAndRestoreApi api = new DeviceBackupAndRestoreApi(client);
        String deviceUuid = args.length > 0 ? args[0] : null;

        List<DeviceBackupInfoVerbose> backups = Paging.fetchAll((offset, limit) -> {
            GetDeviceBackupsResponse page = api.getDeviceBackups(null, deviceUuid, null, offset, limit);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (DeviceBackupInfoVerbose backup : backups) {
            System.out.println(backup.getUuid() + "  " + backup.getStatus() + "  " + backup.getName()
                    + "  device " + backup.getDeviceUuid());
        }
        System.out.println(backups.size() + " backups");
    }
}
