

# PortOperation

Operational specifications for ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum) | Availability of a given physical port. |  [optional] |
|**connectionCount** | **Long** | Total number of connections. |  [optional] |
|**evplVCCount** | **Long** | Total number of connections. |  [optional] |
|**fgVCCount** | **Long** | Total number of connections. |  [optional] |
|**accessVCCount** | **Long** | Total number of connections. |  [optional] |
|**opStatusChangedAt** | **OffsetDateTime** | Date and time at which port availability changed. |  [optional] |
|**maintenanceStatus** | **MaintenanceState** |  |  [optional] |
|**lockEnabled** | **Boolean** | Indicates whether the port configuration is locked due to an ongoing or scheduled maintenance. |  [optional] |



## Enum: OperationalStatusEnum

| Name | Value |
|---- | -----|
| UP | &quot;UP&quot; |
| DOWN | &quot;DOWN&quot; |
| PARTIAL | &quot;PARTIAL&quot; |



