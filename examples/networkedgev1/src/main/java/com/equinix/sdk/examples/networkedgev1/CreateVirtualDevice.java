package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;
import com.equinix.sdk.networkedgev1.model.ACLDetails;
import com.equinix.sdk.networkedgev1.model.DeviceTypeCode;
import com.equinix.sdk.networkedgev1.model.UserPublicKeyRequest;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceCreateResponse;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceDetailsResponse;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceRequest;

/**
 * Orders a single self-configured Cisco C8000V router (bring-your-own-license) in Silicon Valley, then
 * reads it back to show its provisioning status.
 *
 * <p>CREATES A BILLABLE RESOURCE. Ordering a device starts charges on the account. It only runs when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true is set. It does not delete the device; remove it afterwards in the
 * portal or with the delete operation of {@code VirtualDeviceApi}.
 *
 * <p>Required environment: EQUINIX_EXAMPLE_ACCOUNT_NUMBER (see {@code ListAccountsInMetro}),
 * EQUINIX_EXAMPLE_ACL_TEMPLATE_UUID (see {@code AclTemplateLifecycle}), EQUINIX_EXAMPLE_SSH_USERNAME and
 * EQUINIX_EXAMPLE_SSH_KEY_NAME (an SSH public key already stored in the account). Optional:
 * EQUINIX_EXAMPLE_LICENSE_FILE_ID for the BYOL license. Metro, package code, version and core count
 * are illustrative; use {@code ListDeviceTypes} to find the ones available to your account.
 */
public class CreateVirtualDevice {
    public static void main(String[] args) throws ApiException {
        Writes.requireOptIn("orders a billable virtual device");
        String accountNumber = Writes.requireEnv("EQUINIX_EXAMPLE_ACCOUNT_NUMBER", "a billing account number");
        String aclTemplateUuid = Writes.requireEnv("EQUINIX_EXAMPLE_ACL_TEMPLATE_UUID", "an ACL template UUID");
        String sshUsername = Writes.requireEnv("EQUINIX_EXAMPLE_SSH_USERNAME", "the user name to create on the device");
        String sshKeyName = Writes.requireEnv("EQUINIX_EXAMPLE_SSH_KEY_NAME", "the name of a stored SSH public key");

        ApiClient client = NetworkEdgeClient.create();
        VirtualDeviceApi api = new VirtualDeviceApi(client);

        VirtualDeviceRequest request = new VirtualDeviceRequest()
                .deviceTypeCode(DeviceTypeCode.C8000V)
                .metroCode("SV")
                .packageCode("network-essentials")
                .version("17.11.01a")
                .core(2)
                .interfaceCount(10)
                .licenseMode(VirtualDeviceRequest.LicenseModeEnum.BYOL)
                .licenseFileId(System.getenv("EQUINIX_EXAMPLE_LICENSE_FILE_ID"))
                .deviceManagementType(VirtualDeviceRequest.DeviceManagementTypeEnum.SELF_CONFIGURED)
                .termlength("12")
                .virtualDeviceName("sdk-example-c8000v")
                .hostNamePrefix("sdkexample")
                .accountNumber(accountNumber)
                .addNotificationsItem("noc@example.com")
                .addAclDetailsItem(new ACLDetails().interfaceType(ACLDetails.InterfaceTypeEnum.WAN).uuid(aclTemplateUuid))
                .userPublicKey(new UserPublicKeyRequest().username(sshUsername).keyName(sshKeyName))
                .agreeOrderTerms(true);

        // draft=false orders the device; draft=true would only save it as a draft
        VirtualDeviceCreateResponse created = api.createVirtualDevice(request, false, null);
        System.out.println("ordered device " + created.getUuid());

        VirtualDeviceDetailsResponse device = api.getVirtualDeviceByUuid(created.getUuid());
        System.out.println("status: " + device.getStatus() + " in " + device.getMetroCode());
    }
}
