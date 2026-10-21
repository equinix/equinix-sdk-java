

# PreviousBackups


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique Id of a backup. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the backup. |  [optional] |
|**createdBy** | **String** | Created by. |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Created date. |  [optional] |
|**lastUpdatedDateTime** | **OffsetDateTime** | Last updated date. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



