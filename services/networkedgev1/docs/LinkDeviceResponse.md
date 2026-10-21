

# LinkDeviceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceUuid** | **String** | A device that is part of the device linked group |  [optional] |
|**deviceName** | **String** | Device name |  [optional] |
|**metroCode** | **String** | Metro Code |  [optional] |
|**metroName** | **String** | Name of the metro. |  [optional] |
|**deviceTypeCode** | **DeviceTypeCode** |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | Device category |  [optional] |
|**ipAssigned** | **String** | Assigned IP address |  [optional] |
|**interfaceId** | **Integer** | Interface ID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the device |  [optional] |
|**deviceManagementType** | [**DeviceManagementTypeEnum**](#DeviceManagementTypeEnum) | Device management type |  [optional] |
|**networkScope** | **String** | Network scope |  [optional] |
|**isDeviceAccessible** | **Boolean** | Whether the device is accessible |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ROUTER | &quot;ROUTER&quot; |
| FIREWALL | &quot;FIREWALL&quot; |
| SDWAN | &quot;SDWAN&quot; |



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



