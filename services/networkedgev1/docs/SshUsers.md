

# SshUsers

Details of an SSH user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sshUsername** | **String** | sshUsername. This should be minimum 3 and maximum 32 characters and include alphanumeric characters, dash, and underscore. |  [optional] |
|**sshPassword** | **String** | sshPassword |  [optional] |
|**sshUserUuid** | **String** | sshUserUuid |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action to perform on the SSH user |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |



