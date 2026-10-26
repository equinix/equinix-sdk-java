

# CrossConnectScheduleResponse

Schedule of a Cross Connect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Schedule URI. |  [optional] [readonly] |
|**uuid** | **UUID** | Schedule Identifier. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Sub-resource type. &lt;br&gt; XC_INSTALL_SCHEDULE - Installation schedule. &lt;br&gt; XC_DEINSTALL_SCHEDULE - Deinstallation schedule.  |  [optional] [readonly] |
|**code** | **ScheduleType** |  |  [optional] [readonly] |
|**state** | **CrossConnectScheduleState** |  |  [optional] [readonly] |
|**autoConvertToStandard** | **Boolean** | Indicates whether the Cross Connect is scheduled as STANDARD when no EXPEDITE scheduling is available. Returned only for EXPEDITE schedule.  |  [optional] [readonly] |
|**readinessDateTime** | **OffsetDateTime** | Carrier Circuit delivery date is the date when the Carrier commits to enable the circuit. Your order will be placed on hold, pending the date you enter. Equinix will wait for the Carrier to deliver the service and then will complete the installation.  |  [optional] [readonly] |
|**requestedDateTime** | **OffsetDateTime** | Requested Installation Date and Time. |  [optional] [readonly] |
|**equinixProposedDateTime** | **OffsetDateTime** | Date and Time proposed by Equinix when the EXPEDITE schedule is not available.  |  [optional] [readonly] |
|**installationDateTime** | **OffsetDateTime** | Installation Date and Time. |  [optional] [readonly] |
|**deinstallationDateTime** | **OffsetDateTime** | Deinstallation Date and Time. Returned for a removal schedule. |  [optional] [readonly] |
|**changeLog** | [**CrossConnectChangelog**](CrossConnectChangelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INSTALL_SCHEDULE | &quot;XC_INSTALL_SCHEDULE&quot; |
| DEINSTALL_SCHEDULE | &quot;XC_DEINSTALL_SCHEDULE&quot; |



