

# ContactRequestNonRegisteredUser

Contact information of a non-registered contact, including contact details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of the contact. |  |
|**lastName** | **String** | Last name of the contact. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Note that only one technical contact is allowed. |  |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Contact&#39;s availability to receive calls. |  [optional] |
|**timezone** | **TIMEZONELIST** |  |  [optional] |
|**details** | [**List&lt;ContactsRequestDetails&gt;**](ContactsRequestDetails.md) | Reference of the related party, could be a party reference or a party role reference |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TECHNICAL | &quot;TECHNICAL&quot; |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| WORK_HOURS | &quot;WORK_HOURS&quot; |
| ANYTIME | &quot;ANYTIME&quot; |



