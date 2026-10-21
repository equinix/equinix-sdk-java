

# DeviceUpgradeDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Unique Id of the upgrade. |  [optional] |
|**virtualDeviceUuid** | **String** | Unique Id of the device. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the upgrade. REQUEST_ACCEPTED, IN_PROGRESS, SUCCESS, FAILED, CANCELLED |  [optional] |
|**requestedDateTime** | **OffsetDateTime** | Requested date |  [optional] |
|**completiondDateTime** | **OffsetDateTime** | Completion date |  [optional] |
|**requestedBy** | **String** | Requested by. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUEST_ACCEPTED | &quot;REQUEST_ACCEPTED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



