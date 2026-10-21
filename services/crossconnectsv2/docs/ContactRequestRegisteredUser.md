

# ContactRequestRegisteredUser

Contact information of a registered user. Ensure that the user status of this contact is approved, active or locked.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**registeredUsers** | **List&lt;String&gt;** | Username of a registered user. |  |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Contact&#39;s availability to receive calls. |  [optional] |
|**timezone** | **TIMEZONELIST** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Note that only one technical contact is allowed. |  |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| WORK_HOURS | &quot;WORK_HOURS&quot; |
| ANYTIME | &quot;ANYTIME&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| TECHNICAL | &quot;TECHNICAL&quot; |



