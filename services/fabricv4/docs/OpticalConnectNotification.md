

# OpticalConnectNotification

Notification preferences for this connection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Notification category. &lt;br&gt; NOTIFICATION - states and configuration updates. &lt;br&gt; ORDERING - order and fulfilment correspondence. &lt;br&gt; TECHNICAL - maintenance and technical advisories.  |  |
|**emails** | **List&lt;String&gt;** | Email addresses to notify. |  |
|**registeredUsers** | **List&lt;String&gt;** | Usernames of registered Equinix Portal users to notify. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| ORDERING | &quot;ORDERING&quot; |
| TECHNICAL | &quot;TECHNICAL&quot; |



