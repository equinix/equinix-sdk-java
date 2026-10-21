

# MetroAccountResponse

Details of a metro account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | Account name |  [optional] |
|**accountNumber** | **Integer** | Account number |  [optional] |
|**accountUcmId** | **String** | Account UCM ID |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Account status |  [optional] |
|**metros** | **List&lt;String&gt;** | An array of metros where the account is valid |  [optional] |
|**creditHold** | **Boolean** | Whether the account has a credit hold. You cannot use an account on credit hold to create a device. |  [optional] |
|**referenceId** | **String** | referenceId |  [optional] |



## Enum: AccountStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| PENDING | &quot;PENDING&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



