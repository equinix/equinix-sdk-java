

# DeviceACLDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the ACL template. |  [optional] |
|**uuid** | **String** | The unique Id of the ACL template. |  [optional] |
|**description** | **String** | The description of the ACL template. |  [optional] |
|**inboundRules** | [**List&lt;InboundRules&gt;**](InboundRules.md) | An array of inbound rules |  [optional] |
|**createdBy** | **String** | Created by |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Created date |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the ACL template on the device. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEVICE_NOT_READY | &quot;DEVICE_NOT_READY&quot; |
| FAILED | &quot;FAILED&quot; |
| NOT_APPLIED | &quot;NOT_APPLIED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |



