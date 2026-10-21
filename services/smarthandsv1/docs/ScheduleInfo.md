

# ScheduleInfo

Use this model to pass the scheduling option that best meets your needs. Please remember that additional approvals or fees may be required for expedited requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | &lt;u&gt;STANDARD:&lt;/u&gt; &lt;br&gt;Choose this option and we will complete your request in the standard turnaround time pending install base readiness. Most requests are processed within 24 to 72 hours. Requests will be processed on a first come, first served basis unless they are expedited. RequestedStartDate and requestedCompletionDate ignored for standard scheduling &lt;br&gt;&lt;br&gt; &lt;u&gt;EXPEDITED:&lt;/u&gt; Choose this option and Equinix will prioritize your request and attempt to fulfill it as soon as reasonably possible. Additional fees may apply. RequestedCompletionDate is mandatory for expedite scheduling. RequestedStartDate is ignored for expedite scheduling. &lt;br&gt;&lt;br&gt; &lt;u&gt;SCHEDULED_MAINTENANCE:&lt;/u&gt; Choose this option to schedule a request for a specific date and time, including today. RequestedStartDate and requestedCompletionDate are mandatory for schedule maintenance |  |
|**requestedStartDate** | **OffsetDateTime** | Requested Start Date Time (ISO Date)&lt;br&gt; Cannot Past Date. |  [optional] |
|**requestedCompletionDate** | **OffsetDateTime** | Requested Completion Date Time (ISO Date)&lt;br&gt;Cannot Past Date. |  [optional] |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| EXPEDITED | &quot;EXPEDITED&quot; |
| SCHEDULED_MAINTENANCE | &quot;SCHEDULED_MAINTENANCE&quot; |



