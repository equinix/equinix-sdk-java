

# CrossConnectScheduleAvailability

Cross Connect schedule window offered at an IBX.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Schedule URI. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Sub-resource type. &lt;br&gt; XC_INSTALL_SCHEDULE - Installation schedule windows.  |  [optional] [readonly] |
|**code** | **ScheduleType** |  |  [optional] [readonly] |
|**aSide** | [**CrossConnectScheduleAvailabilityASide**](CrossConnectScheduleAvailabilityASide.md) |  |  [optional] |
|**zSide** | [**CrossConnectScheduleAvailabilityZSide**](CrossConnectScheduleAvailabilityZSide.md) |  |  [optional] |
|**startDateTime** | **OffsetDateTime** | Start of the schedule window. |  [optional] [readonly] |
|**endDateTime** | **OffsetDateTime** | End of the schedule window. |  [optional] [readonly] |
|**unavailableDates** | **List&lt;LocalDate&gt;** | Dates within the schedule window when the IBX is unavailable, such as the holidays observed at the IBX.  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XC_INSTALL_SCHEDULE | &quot;XC_INSTALL_SCHEDULE&quot; |



