

# DeviceLinkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupName** | **String** | Group name. |  |
|**subnet** | **String** | Subnet of the link group. |  |
|**redundancyType** | [**RedundancyTypeEnum**](#RedundancyTypeEnum) | Whether the connection should be created through Fabric&#39;s primary or secondary port. |  [optional] |
|**linkDevices** | [**List&lt;LinkDeviceInfo&gt;**](LinkDeviceInfo.md) | An array of devices to link. |  [optional] |
|**metroLinks** | [**List&lt;LinkInfo&gt;**](LinkInfo.md) | An array of links. |  [optional] |



## Enum: RedundancyTypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SECONDARY | &quot;SECONDARY&quot; |



