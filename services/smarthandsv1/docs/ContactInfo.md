

# ContactInfo

Use this model to build contact object. Ordering and notification contacts are are always equinix registered contacts and we only expect username and rest of the details will be looked up. It is important to know that when username is provided all other attributes apart from contactType will be ignored 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) | Contact Type, possible values are ORDERING, NOTIFICATION, TECHNICAL |  |
|**userName** | **String** | User Name |  [optional] |
|**name** | **String** | Full Name of the Contact, Eg. &#39;First_Name&#39; + &#39;Last_Name&#39; |  [optional] |
|**email** | **String** | Valid email address of the contact |  [optional] |
|**workPhoneCountryCode** | **String** | Country Code of Primary Phone of the contact |  [optional] |
|**workPhone** | **String** | Primary Phone of the contact |  [optional] |
|**workPhonePrefToCall** | [**WorkPhonePrefToCallEnum**](#WorkPhonePrefToCallEnum) | Possible values are NEVER, ANYTIME, BUSINESS_HOURS, MY_BUSINESS_HOURS,IBX_BUSINESS_HOURS. But BUSINESS_HOURS is deprecated and will be removed in future release |  [optional] |
|**mobilePhoneCountryCode** | **String** | Country Code of Mobile Phone of the contact |  [optional] |
|**mobilePhone** | **String** | Mobile Phone of the contact |  [optional] |
|**mobilePhonePrefToCall** | [**MobilePhonePrefToCallEnum**](#MobilePhonePrefToCallEnum) | Possible values are NEVER, ANYTIME, BUSINESS_HOURS, MY_BUSINESS_HOURS,IBX_BUSINESS_HOURS. But BUSINESS_HOURS is deprecated and will be removed in future release |  [optional] |
|**workPhoneTimeZone** | **String** | Work Phone TimeZone |  [optional] |
|**mobilePhoneTimeZone** | **String** | Mobile Phone TimeZone |  [optional] |



## Enum: ContactTypeEnum

| Name | Value |
|---- | -----|
| TECHNICAL | &quot;TECHNICAL&quot; |
| ORDERING | &quot;ORDERING&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |



## Enum: WorkPhonePrefToCallEnum

| Name | Value |
|---- | -----|
| NEVER | &quot;NEVER&quot; |
| ANYTIME | &quot;ANYTIME&quot; |
| MY_BUSINESS_HOURS | &quot;MY_BUSINESS_HOURS&quot; |
| IBX_BUSINESS_HOURS | &quot;IBX_BUSINESS_HOURS&quot; |
| BUSINESS_HOURS | &quot;BUSINESS_HOURS&quot; |



## Enum: MobilePhonePrefToCallEnum

| Name | Value |
|---- | -----|
| NEVER | &quot;NEVER&quot; |
| ANYTIME | &quot;ANYTIME&quot; |
| MY_BUSINESS_HOURS | &quot;MY_BUSINESS_HOURS&quot; |
| IBX_BUSINESS_HOURS | &quot;IBX_BUSINESS_HOURS&quot; |
| BUSINESS_HOURS | &quot;BUSINESS_HOURS&quot; |



