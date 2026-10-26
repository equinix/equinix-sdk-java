

# DeinstallScheduleRequest

Cross Connect Deinstallation Schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Schedule type. |  [optional] |
|**code** | [**CodeEnum**](#CodeEnum) | Schedule code of the removal. Only STANDARD is supported, and it is applied when the code is omitted.  |  [optional] |
|**requestedDateTime** | **OffsetDateTime** | Requested Removal Date and Time. |  |
|**deinstallationDateTime** | **OffsetDateTime** | Deinstallation Date and Time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XC_DEINSTALL_SCHEDULE | &quot;XC_DEINSTALL_SCHEDULE&quot; |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |



