

# VirtualDeviceDetailsResponse

Detailed virtual device information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | Account name |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**createdBy** | **String** | Created by user |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Date and time of creation |  [optional] |
|**deletedBy** | **String** | Deleted by user |  [optional] |
|**deletedDateTime** | **OffsetDateTime** | Date and time of deletion |  [optional] |
|**deviceSerialNo** | **String** | Device serial number |  [optional] |
|**deviceTypeCategory** | [**DeviceTypeCategoryEnum**](#DeviceTypeCategoryEnum) | Device type category (e.g., ROUTER, FIREWALL) |  [optional] |
|**diverseFromDeviceName** | **String** | The name of a device that is in a location different from this device. |  [optional] |
|**diverseFromDeviceUuid** | **String** | The unique ID of a device that is in a location different from this device. |  [optional] |
|**deviceTypeCode** | **DeviceTypeCode** |  |  [optional] |
|**deviceTypeName** | **DeviceTypeCode** |  |  [optional] |
|**expiry** | **String** | Expiry time |  [optional] |
|**region** | **String** | Region |  [optional] |
|**deviceTypeVendor** | [**DeviceTypeVendorEnum**](#DeviceTypeVendorEnum) | Device type vendor |  [optional] |
|**hostName** | **String** | Host name |  [optional] |
|**uuid** | **String** | Device UUID |  [optional] |
|**lastUpdatedBy** | **String** | Last updated by user |  [optional] |
|**lastUpdatedDateTime** | **OffsetDateTime** | Date and time of last update |  [optional] |
|**licenseFileId** | **String** | License file ID |  [optional] |
|**licenseName** | **String** | License name |  [optional] |
|**licenseStatus** | [**LicenseStatusEnum**](#LicenseStatusEnum) | License status |  [optional] |
|**licenseType** | [**LicenseTypeEnum**](#LicenseTypeEnum) | License type (e.g., BYOL, SUB) |  [optional] |
|**metroCode** | **String** | Metro code |  [optional] |
|**metroName** | **String** | Metro name |  [optional] |
|**name** | **String** | Device name |  [optional] |
|**notifications** | **List&lt;String&gt;** | List of notifications |  [optional] |
|**packageCode** | **String** | Package code |  [optional] |
|**packageName** | **String** | Package name |  [optional] |
|**version** | **String** | Device version |  [optional] |
|**purchaseOrderNumber** | **String** | Purchase order number |  [optional] |
|**redundancyType** | [**RedundancyTypeEnum**](#RedundancyTypeEnum) | Redundancy type |  [optional] |
|**redundantUuid** | **String** | Redundant device UUID |  [optional] |
|**connectivity** | **String** | Connectivity type |  [optional] |
|**sshIpAddress** | **String** | SSH IP address |  [optional] |
|**sshIpFqdn** | **String** | SSH IP FQDN |  [optional] |
|**sshIpFqdnStatus** | [**SshIpFqdnStatusEnum**](#SshIpFqdnStatusEnum) | SSH IP FQDN status |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Device status |  [optional] |
|**throughput** | **Integer** | Throughput |  [optional] |
|**throughputUnit** | **String** | Throughput unit |  [optional] |
|**core** | [**CoresDisplayConfig**](CoresDisplayConfig.md) |  |  [optional] |
|**pricingDetails** | [**PricingSiebelConfig**](PricingSiebelConfig.md) |  |  [optional] |
|**interfaceCount** | **Integer** |  |  [optional] |
|**deviceManagementType** | [**DeviceManagementTypeEnum**](#DeviceManagementTypeEnum) | Device management type (e.g., SELF-CONFIGURED, EQUINIX-CONFIGURED) |  [optional] |
|**plane** | **String** |  |  [optional] |
|**userPublicKey** | [**UserPublicKeyConfig**](UserPublicKeyConfig.md) |  |  [optional] |
|**managementIp** | **String** |  |  [optional] |
|**managementGatewayIp** | **String** |  |  [optional] |
|**publicIp** | **String** |  |  [optional] |
|**publicGatewayIp** | **String** |  |  [optional] |
|**primaryDnsName** | **String** | Primary DNS name |  [optional] |
|**secondaryDnsName** | **String** | Secondary DNS name |  [optional] |
|**termLength** | **String** | Term length in months. |  [optional] |
|**newTermLength** | **String** | The term length effective upon the expiration of the current term. |  [optional] |
|**additionalBandwidth** | **String** | Additional bandwidth |  [optional] |
|**siteId** | **String** | Site ID |  [optional] |
|**systemIpAddress** | **String** | System IP address |  [optional] |
|**vendorConfig** | [**VendorConfig**](VendorConfig.md) |  |  [optional] |
|**interfaces** | [**List&lt;InterfaceBasicInfoResponse&gt;**](InterfaceBasicInfoResponse.md) |  |  [optional] |
|**asn** | **BigDecimal** | The ASN number. |  [optional] |
|**channelPartner** | **String** | The name of the channel partner. |  [optional] |



## Enum: DeviceTypeCategoryEnum

| Name | Value |
|---- | -----|
| ROUTER | &quot;ROUTER&quot; |
| FIREWALL | &quot;FIREWALL&quot; |
| SDWAN | &quot;SDWAN&quot; |



## Enum: DeviceTypeVendorEnum

| Name | Value |
|---- | -----|
| CISCO | &quot;CISCO&quot; |
| PALO_ALTO_NETWORKS | &quot;PALO_ALTO_NETWORKS&quot; |
| JUNIPER | &quot;JUNIPER&quot; |
| FORTINET | &quot;FORTINET&quot; |
| ARISTA | &quot;ARISTA&quot; |
| ARUBA | &quot;ARUBA&quot; |
| F5 | &quot;F5&quot; |
| BLUECAT | &quot;BLUECAT&quot; |
| ZSCALER | &quot;ZSCALER&quot; |
| CHECK_POINT | &quot;CHECK_POINT&quot; |
| VMWARE | &quot;VMWARE&quot; |
| SILVER_PEAK | &quot;SILVER_PEAK&quot; |
| VERSA_NETWORKS | &quot;VERSA_NETWORKS&quot; |
| AVIATRIX | &quot;AVIATRIX&quot; |



## Enum: LicenseStatusEnum

| Name | Value |
|---- | -----|
| REGISTERED | &quot;REGISTERED&quot; |
| UNREGISTERED | &quot;UNREGISTERED&quot; |
| PENDING | &quot;PENDING&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



## Enum: LicenseTypeEnum

| Name | Value |
|---- | -----|
| BYOL | &quot;BYOL&quot; |
| SUB | &quot;SUB&quot; |



## Enum: RedundancyTypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SECONDARY | &quot;SECONDARY&quot; |



## Enum: SshIpFqdnStatusEnum

| Name | Value |
|---- | -----|
| ASSIGNED | &quot;ASSIGNED&quot; |
| UNASSIGNED | &quot;UNASSIGNED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: DeviceManagementTypeEnum

| Name | Value |
|---- | -----|
| SELF_CONFIGURED | &quot;SELF-CONFIGURED&quot; |
| EQUINIX_CONFIGURED | &quot;EQUINIX-CONFIGURED&quot; |



