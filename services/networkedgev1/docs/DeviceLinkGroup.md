

# DeviceLinkGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Unique Id of the linked group. |  [optional] |
|**groupName** | **String** | The name of the linked group |  [optional] |
|**subnet** | **String** | Subnet of the link group. |  [optional] |
|**redundancyType** | [**RedundancyTypeEnum**](#RedundancyTypeEnum) | Whether the connection is through Fabric&#39;s primary or secondary port. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the linked group |  [optional] |
|**createdBy** | **String** | Created by username. |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Created date. |  [optional] |
|**lastUpdatedBy** | **String** | Last updated by user |  [optional] |
|**lastUpdatedDateTime** | **OffsetDateTime** | Last updated date |  [optional] |
|**metroLinks** | [**List&lt;LinkInfoResponse&gt;**](LinkInfoResponse.md) | An array of links between metros. |  [optional] |
|**linkDevices** | [**List&lt;LinkDeviceResponse&gt;**](LinkDeviceResponse.md) | An array of metros and the devices in the metros belonging to the group. |  [optional] |



## Enum: RedundancyTypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SECONDARY | &quot;SECONDARY&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



