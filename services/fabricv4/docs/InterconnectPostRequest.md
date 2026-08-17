

# InterconnectPostRequest

Create Interconnect request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Interconnect type |  |
|**name** | **String** | Customer-provided interconnect name |  |
|**description** | **String** | Customer-provided interconnect description |  [optional] |
|**location** | [**InterconnectLocationRequest**](InterconnectLocationRequest.md) |  |  |
|**_package** | [**InterconnectPackage**](InterconnectPackage.md) |  |  |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  |
|**project** | [**Project**](Project.md) |  |  |
|**notifications** | [**List&lt;InterconnectNotification&gt;**](InterconnectNotification.md) | Preferences for notifications on interconnect configuration or status changes |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_IC | &quot;XF_IC&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



