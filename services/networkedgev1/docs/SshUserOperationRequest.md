

# SshUserOperationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sshUserUuid** | **String** | Required for DELETE operation. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | SSH operation to be performed |  |
|**sshUsername** | **String** | SSH User name |  [optional] |
|**sshPassword** | **String** | SSH Password |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| DELETE | &quot;DELETE&quot; |
| REUSE | &quot;REUSE&quot; |



