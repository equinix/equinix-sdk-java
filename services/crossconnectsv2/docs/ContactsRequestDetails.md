

# ContactsRequestDetails

Contact details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Contact information such as email, phone and mobile number. Note that email is always required. |  |
|**value** | **String** | Value of related &#x60;type&#x60;. Use email addresss when type of &#x60;EMAIL&#x60;. Use phone number and prefix with country (i.e. +1 for US) for &#x60;PHONE&#x60; and &#x60;MOBILE&#x60; type. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PHONE | &quot;PHONE&quot; |
| MOBILE | &quot;MOBILE&quot; |
| EMAIL | &quot;EMAIL&quot; |



