

# DeviceRebootResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceUUID** | **String** | Unique Id of the device. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the reboot. |  [optional] |
|**requestedBy** | **String** | Requested by |  [optional] |
|**requestedDateTime** | **OffsetDateTime** | Requested date |  [optional] |
|**completiondDateTime** | **OffsetDateTime** | Completion date |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



