

# DeviceBackupRestore

Details of a device backup for restore

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique ID of the backup. |  [optional] |
|**name** | **String** | The name of the backup. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the backup. |  [optional] |
|**deleteAllowed** | **Boolean** | Whether you can delete the backup. Only backups in the COMPELTED or FAILED states can be deleted. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



