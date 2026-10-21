

# Layer1CreateContactsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**registeredUsers** | **List&lt;String&gt;** | Username of a registered user. |  |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Contact&#39;s availability to receive calls. |  [optional] |
|**timezone** | **TIMEZONELIST** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Note that only one technical contact is allowed. |  |
|**firstName** | **String** | First name of the contact. |  |
|**lastName** | **String** | Last name of the contact. |  |
|**details** | [**List&lt;ContactsRequestDetails&gt;**](ContactsRequestDetails.md) | Reference of the related party, could be a party reference or a party role reference |  |



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



