package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;
import com.equinix.sdk.networkedgev1.model.DeviceBackupCreateRequest;
import com.equinix.sdk.networkedgev1.model.DeviceBackupInfoVerbose;
import com.equinix.sdk.networkedgev1.model.SshUserCreateResponse;

/**
 * Starts a configuration backup of an existing virtual device, reads its status, then deletes the
 * backup.
 *
 * <p>CREATES AND DELETES a resource, but only the backup this example creates; the device is not
 * changed. It only runs when EQUINIX_EXAMPLE_ALLOW_WRITES=true is set. The backup runs asynchronously,
 * so the delete may be rejected while the status is still IN_PROGRESS; the UUID printed first can be
 * used to delete it later.
 *
 * <p>Required environment: EQUINIX_EXAMPLE_DEVICE_UUID, the UUID of an active device.
 */
public class DeviceBackupLifecycle {
    public static void main(String[] args) throws ApiException {
        Writes.requireOptIn("creates and deletes a device backup");
        String deviceUuid = Writes.requireEnv("EQUINIX_EXAMPLE_DEVICE_UUID", "the UUID of an active virtual device");

        ApiClient client = NetworkEdgeClient.create();
        DeviceBackupAndRestoreApi api = new DeviceBackupAndRestoreApi(client);

        // the generated client names the response type after the create-SSH-user response; it only carries a UUID
        SshUserCreateResponse created = api.createDeviceBackup(
                new DeviceBackupCreateRequest().deviceUuid(deviceUuid).name("sdk-example-backup"));
        System.out.println("created backup " + created.getUuid());

        DeviceBackupInfoVerbose backup = api.getDetailsOfBackupsByUuid(created.getUuid());
        System.out.println("status: " + backup.getStatus() + ", delete allowed: " + backup.getDeleteAllowed());

        api.deleteDeviceBackupByUuid(created.getUuid());
        System.out.println("deleted backup " + created.getUuid());
    }
}
