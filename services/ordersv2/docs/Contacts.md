

# Contacts

Contact information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**registeredUser** | **String** | Username of a registered user. |  [optional] |
|**firstName** | **String** | First name of the contact. |  [optional] |
|**lastName** | **String** | Last name of the contact. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Communications type |  [optional] |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Contact&#39;s availability to receive calls. |  [optional] |
|**timezone** | **TIMEZONELIST** |  |  [optional] |
|**details** | [**List&lt;ContactsDetails&gt;**](ContactsDetails.md) | Reference of the related party, could be a party reference or a party role reference |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ORDERING | &quot;ORDERING&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| TECHNICAL | &quot;TECHNICAL&quot; |
| RESELLER | &quot;RESELLER&quot; |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| WORK_HOURS | &quot;WORK_HOURS&quot; |
| ANYTIME | &quot;ANYTIME&quot; |



