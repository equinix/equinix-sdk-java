

# SimplifiedNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Notification Type |  |
|**sendInterval** | **String** |  |  [optional] |
|**emails** | **List&lt;String&gt;** | Array of contact emails |  |
|**registeredUsers** | **List&lt;String&gt;** | Array of registered users |  [optional] |
|**phone** | [**List&lt;Phone&gt;**](Phone.md) | Array of contact phone numbers |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| BANDWIDTH_ALERT | &quot;BANDWIDTH_ALERT&quot; |
| CONNECTION_APPROVAL | &quot;CONNECTION_APPROVAL&quot; |
| PROFILE_LIFECYCLE | &quot;PROFILE_LIFECYCLE&quot; |
| ALL | &quot;ALL&quot; |
| SALES_REP_NOTIFICATIONS | &quot;SALES_REP_NOTIFICATIONS&quot; |
| TECHNICAL | &quot;TECHNICAL&quot; |
| ORDERING | &quot;ORDERING&quot; |
| QUOTE_NOTIFICATIONS | &quot;QUOTE_NOTIFICATIONS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



