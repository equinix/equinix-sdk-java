

# VirtualDevicHARequest

Request to create a secondary HA device

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | Account number |  [optional] |
|**accountReferenceId** | **String** | Account reference ID |  [optional] |
|**version** | **String** | You can only choose a version for the secondary device when adding a secondary device to an existing device. |  [optional] |
|**additionalBandwidth** | **Integer** | Secondary additional bandwidth to be configured (in Mbps for HA). Default bandwidth provided is 15 Mbps. |  [optional] |
|**licenseFileId** | **String** | License file ID |  [optional] |
|**licenseToken** | **String** | License token |  [optional] |
|**day0TextFileId** | **String** | Some devices require a day0TextFileId. Upload your license file by calling Upload File API. You&#39;ll get a fileUuid in the response. You can enter the value in the day0TextFileId field of the create payload to create a virtual device. Check the payloads of individual devices (provided as Postman Scripts on our API doc site) for details. |  [optional] |
|**metroCode** | **String** | Metro code |  |
|**notifications** | **List&lt;String&gt;** | List of email addresses for notifications |  |
|**aclDetails** | [**List&lt;ACLDetails&gt;**](ACLDetails.md) | An array of ACLs |  [optional] |
|**sshUsers** | [**List&lt;SshUserOperationRequest&gt;**](SshUserOperationRequest.md) | List of SSH users |  [optional] |
|**virtualDeviceName** | **String** | Virtual Device Name |  |
|**hostNamePrefix** | **String** | Host name prefix for identification. Only a-z, A-Z, 0-9, and hyphen(-) are allowed. It should start with a letter and end with a letter or digit. The length should be between 2-30 characters. Exceptions - FTDv 2-14 characters; Aruba 2-24 characters. |  [optional] |
|**siteId** | **String** | Site ID |  [optional] |
|**systemIpAddress** | **String** | System IP address |  [optional] |
|**vendorConfig** | [**VendorConfig**](VendorConfig.md) |  |  [optional] |
|**sshInterfaceId** | **String** | You may specify any available interface on the device as the sshInterfaceId. This field is only applicable to self-configured devices. |  [optional] |
|**smartLicenseUrl** | **String** | License URL. This field is only relevant for Ciso ASAv devices. |  [optional] |
|**cloudInitFileId** | **String** | The Id of a previously uploaded license or cloud_init file. |  [optional] |



