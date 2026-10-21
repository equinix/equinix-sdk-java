

# ContactInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) | Contact Type, possible values are ORDERING, NOTIFICATION, TECHNICAL |  |
|**userName** | **String** | User Name |  [optional] |
|**name** | **String** | Technical Contact Name |  [optional] |
|**email** | **String** | Contact Email |  [optional] |
|**workPhoneCountryCode** | **String** | Primary Phone of the contact |  [optional] |
|**workPhone** | **String** | Primary Phone of the contact |  [optional] |
|**workPhonePrefToCall** | [**WorkPhonePrefToCallEnum**](#WorkPhonePrefToCallEnum) | Possible values are NEVER, ANYTIME, BUSINESS_HOURS, MY_BUSINESS_HOURS,IBX_BUSINESS_HOURS. But BUSINESS_HOURS is deprecated and will be removed in future release |  [optional] |
|**mobilePhoneCountryCode** | **String** | Mobile Phone of the contact |  [optional] |
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



