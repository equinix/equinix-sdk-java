

# ValidationErrorAdditionalInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Property at which the validation violation occurs. Can be empty when validation happens at the object top level. |  [optional] |
|**reason** | **String** | Fallback error message in plain English. |  |
|**validationRuleTag** | **String** | Violated validation rule tag. |  |
|**validationRoot** | **String** | Name of the object at which the validation violation occurs. Can be empty when validation happens inline at the request params. |  [optional] |
|**validationParameters** | **Map&lt;String, String&gt;** | A map containing additional violation parameters, these can be used to render localized error messages. The list of available parameters is different for each validationRuleTag. |  [optional] |



