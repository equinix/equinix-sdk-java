

# DeviceBackupInfoVerbose


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique Id of the device backup. |  [optional] |
|**name** | **String** | The name of the backup. |  [optional] |
|**version** | **String** | Version of the device |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of backup. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the backup. |  [optional] |
|**createdBy** | **String** | Created by. |  [optional] |
|**lastUpdatedDateTime** | **OffsetDateTime** | Last updated date. |  [optional] |
|**downloadUrl** | **String** | URL where you can download the backup. |  [optional] |
|**deleteAllowed** | **Boolean** | Whether or not you can delete the backup. |  [optional] |
|**restores** | [**List&lt;PreviousBackups&gt;**](PreviousBackups.md) |  |  [optional] |
|**deviceUuid** | **String** | Unique Id of the device |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONFIG | &quot;CONFIG&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



