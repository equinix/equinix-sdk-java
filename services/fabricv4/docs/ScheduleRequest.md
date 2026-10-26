

# ScheduleRequest

Cross Connect Installation Schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Schedule type. |  [optional] |
|**code** | **ScheduleType** |  |  |
|**autoConvertToStandard** | **Boolean** | Applicable only when the code is EXPEDITE. When true, Equinix schedules the Cross Connect as STANDARD when no EXPEDITE scheduling is available.  |  [optional] |
|**readinessDateTime** | **OffsetDateTime** | Carrier Circuit delivery date is the date when the Carrier commits to enable the circuit. Your order will be placed on hold, pending the date you enter. Equinix will wait for the Carrier to deliver the service and then will complete the installation.  |  [optional] |
|**requestedDateTime** | **OffsetDateTime** | Requested Installation Date and Time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XC_INSTALL_SCHEDULE | &quot;XC_INSTALL_SCHEDULE&quot; |



