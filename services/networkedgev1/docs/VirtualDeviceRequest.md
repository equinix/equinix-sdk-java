

# VirtualDeviceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | Account number. Either an account number or accountReferenceId is required. |  [optional] |
|**accountReferenceId** | **String** | AccountReferenceId. This is a temporary ID that can be used to create a device when the account status is still pending, not active. Either an account number or accountReferenceId is required. |  [optional] |
|**projectId** | **String** | Customer project Id. Check your projectId under Resource Management on Equinix Portal. You should have access to a project to see or create assets under it. Equinix will assign a projectId if you do not provide one. |  [optional] |
|**version** | **String** | Version. |  |
|**deviceTypeCode** | **DeviceTypeCode** |  |  |
|**hostNamePrefix** | **String** | Host name prefix for identification. Only a-z, A-Z, 0-9, and hyphen(-) are allowed. It should start with a letter and end with a letter or digit. The length should be between 2-30 characters. Exceptions - FTDv 2-14 characters; Aruba 2-24 characters. |  [optional] |
|**agreeOrderTerms** | **Boolean** | To create a device, you must accept the order terms. Call Get Order Terms to review the details. If you are creating an Equinix-Configured device, read your vendor&#39;s terms by calling Get Vendor Terms. |  |
|**licenseMode** | [**LicenseModeEnum**](#LicenseModeEnum) | License type. One of SUB (Subscription) or BYOL (Bring Your Own License) |  |
|**licenseCategory** | **String** | This field will be deprecated in the future. |  [optional] |
|**licenseFileId** | **String** | For Juniper devices you need to provide a licenseFileId if you want to BYOL (Bring Your Own License). You get a licenseFileId when you upload a license file by calling license upload API (Upload a license file before creating a virtual device). For Cisco devices, you do not need to provide a licenseFileId at the time of device creation. Once the device is provisioned, you can get the deviceSerialNo by calling Get virtual device {uuid} API. With the deviceSerialNo you can generate a license file on Cisco site. Afterward, you can upload the license file by calling license upload API (Upload a license file after creating a virtual device). |  [optional] |
|**licenseToken** | **String** | In case you want to BYOL (Bring Your Own License) for a Palo Alto device, you must provide a license token. This field must have 8 alphanumeric characters. |  [optional] |
|**day0TextFileId** | **String** | Some devices require a day0TextFileId. Upload your license file by calling Upload File API. You&#39;ll get a fileUuid in the response. You can enter the value in the day0TextFileId field of the create payload to create a virtual device. Check the payloads of individual devices (provided as Postman Scripts on our API doc site) for details. |  [optional] |
|**termlength** | **String** | Term length in months. |  [optional] |
|**metroCode** | **String** | Metro code |  |
|**packageCode** | **String** | Software package code |  [optional] |
|**sshUsers** | [**List&lt;SshUsers&gt;**](SshUsers.md) | An array of sshUsernames and passwords |  [optional] |
|**throughput** | **Integer** | Numeric throughput. For Cisco8KV self-configured devices, you can choose either numeric or tier throughput options. |  [optional] |
|**throughputUnit** | **String** | Throughput unit. |  [optional] |
|**tier** | **Integer** | Tier throughput. Relevant for Cisco8KV devices. For Cisco8KV self-configured devices, you can choose either numeric or tier throughput options. Possible values - 0, 1, 2, 3. Default - 2 |  [optional] |
|**virtualDeviceName** | **String** | Virtual device name for identification. This should be minimum 3 and maximum 50 characters long. |  |
|**orderingContact** | **String** | Username of the ordering contact. |  [optional] |
|**notifications** | **List&lt;String&gt;** | Email addresses for notification. We need a minimum of 1 and no more than 5 email addresses. |  |
|**aclDetails** | [**List&lt;ACLDetails&gt;**](ACLDetails.md) | An array of ACLs |  [optional] |
|**additionalBandwidth** | **Integer** | Secondary additional bandwidth to be configured (in Mbps for HA). Default bandwidth provided is 15 Mbps. |  [optional] |
|**deviceManagementType** | [**DeviceManagementTypeEnum**](#DeviceManagementTypeEnum) | Whether the device is SELF-CONFIGURED or EQUINIX-CONFIGURED |  |
|**core** | **Integer** | The desired number of cores. |  |
|**interfaceCount** | **Integer** | The desired number of interfaces. |  [optional] |
|**siteId** | **String** | Site ID. |  [optional] |
|**systemIpAddress** | **String** | System IP address. |  [optional] |
|**vendorConfig** | [**VendorConfig**](VendorConfig.md) |  |  [optional] |
|**userPublicKey** | [**UserPublicKeyRequest**](UserPublicKeyRequest.md) |  |  [optional] |
|**ipType** | [**IpTypeEnum**](#IpTypeEnum) | This field is deprecated. The ipType value always defaults to STATIC. |  [optional] |
|**sshInterfaceId** | **String** | You may specify any available interface on the device as the sshInterfaceId. This field is only applicable to self-configured devices. |  [optional] |
|**smartLicenseUrl** | **String** | License URL. This field is only relevant for Ciso ASAv devices. |  [optional] |
|**diverseFromDeviceUuid** | **String** | Unique ID of an existing device. Use this field to let Equinix know if you want  your new device to be in a different location from any existing virtual device. This field is only meaningful for single devices. |  [optional] |
|**clusterDetails** | [**ClusterConfig**](ClusterConfig.md) |  |  [optional] |
|**primaryDeviceUuid** | **String** | This field is mandatory if you are using this API to add a secondary device to an existing primary device. |  [optional] |
|**connectivity** | [**ConnectivityEnum**](#ConnectivityEnum) | Specifies the connectivity on the device. You can have INTERNET-ACCESS, PRIVATE, or INTERNET-ACCESS-WITH-PRVT-MGMT. Private devices don&#39;t have ACLs or bandwidth. |  [optional] |
|**channelPartner** | **String** | The name of the channel partner. |  [optional] |
|**cloudInitFileId** | **String** | The Id of a previously uploaded license or cloud_init file. |  [optional] |
|**purchaseOrderNumber** | **String** | Purchase Order information will be included in your order confirmation email. |  [optional] |
|**orderReference** | **String** | Enter a short name/number to identify this order on the invoice. |  [optional] |
|**secondary** | [**VirtualDevicHARequest**](VirtualDevicHARequest.md) |  |  [optional] |



## Enum: LicenseModeEnum

| Name | Value |
|---- | -----|
| SUB | &quot;SUB&quot; |
| BYOL | &quot;BYOL&quot; |



## Enum: DeviceManagementTypeEnum

| Name | Value |
|---- | -----|
| SELF_CONFIGURED | &quot;SELF-CONFIGURED&quot; |
| EQUINIX_CONFIGURED | &quot;EQUINIX-CONFIGURED&quot; |



## Enum: IpTypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |



## Enum: ConnectivityEnum

| Name | Value |
|---- | -----|
| INTERNET_ACCESS | &quot;INTERNET-ACCESS&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| INTERNET_ACCESS_WITH_PRVT_MGMT | &quot;INTERNET-ACCESS-WITH-PRVT-MGMT&quot; |



