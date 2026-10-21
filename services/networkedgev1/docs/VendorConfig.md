

# VendorConfig

Vendor-specific configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Physical location within the Viptela overlay network, such as a branch office, or a campus (relevant only for Cisco SD-WANs) |  [optional] |
|**systemIpAddress** | **String** | IP assigned to the router and vSmart controller (relevant only for Cisco SD-WANs) |  [optional] |
|**licenseKey** | **String** | License key |  [optional] |
|**licenseSecret** | **String** | License secret |  [optional] |
|**localId** | **String** | Local ID |  [optional] |
|**remoteId** | **String** | Remote ID |  [optional] |
|**managementType** | [**ManagementTypeEnum**](#ManagementTypeEnum) | Device management type. |  [optional] |
|**controller1** | **String** | For Fortinet devices, this is the System IP address. |  [optional] |
|**controller2** | **String** | Controller 2 IP address |  [optional] |
|**serialNumber** | **String** | Serial number |  [optional] |
|**adminPassword** | **String** | The administrative password of the device. You can use it to log in to the console. This field is not available for all device types. Should be at least 6 characters long and must include an uppercase letter and a number. This field may be required for some vendors. |  [optional] |
|**activationKey** | **String** | Activation key |  [optional] |
|**controllerFqdn** | **String** | Controller FQDN |  [optional] |
|**rootPassword** | **String** | Root password |  [optional] |
|**accountName** | **String** | The name of account. |  [optional] |
|**hostname** | **String** | The host name. |  [optional] |
|**accountKey** | **String** | The account key. |  [optional] |
|**applianceTag** | **String** | The appliance tag. |  [optional] |
|**userName** | **String** | This field is rel |  [optional] |
|**connectToCloudVision** | **Boolean** | Whether you want your Arista device to connect to Cloud Vision. Only relevant for Arista devices. |  [optional] |
|**cvpType** | [**CvpTypeEnum**](#CvpTypeEnum) | Either As-a-Service or On-Premise. Only relevant for Arista devices. |  [optional] |
|**cvpFqdn** | **String** | Fully qualified domain name for Cloud Vision As-a-Service. |  [optional] |
|**cvpIpAddress** | **String** | Cloud Vision IP address. |  [optional] |
|**cvaasPort** | **String** | Cloud Vision As-a-Service port. |  [optional] |
|**cvpPort** | **String** | Cloud Vision port. |  [optional] |
|**cvpToken** | **String** | Cloud Vision token. |  [optional] |
|**provisioningKey** | **String** | Only relevant for Zscaler devices |  [optional] |
|**privateAddress** | **String** | Private address. Only relevant for BlueCat devices. |  [optional] |
|**privateCidrMask** | **String** | Private CIDR mask. Only relevant for BlueCat devices. |  [optional] |
|**privateGateway** | **String** | Private gateway. Only relevant for BlueCat devices. |  [optional] |
|**licenseId** | **String** | License Id. Only relevant for BlueCat devices. |  [optional] |
|**panoramaIpAddress** | **String** | Provide this field to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access |  [optional] |
|**panoramaAuthKey** | **String** | Provide this field to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access |  [optional] |



## Enum: ManagementTypeEnum

| Name | Value |
|---- | -----|
| FMC | &quot;FMC&quot; |
| CLI | &quot;CLI&quot; |



## Enum: CvpTypeEnum

| Name | Value |
|---- | -----|
| AS_A_SERVICE | &quot;As-a-Service&quot; |
| ON_PREMISE | &quot;On-Premise&quot; |



