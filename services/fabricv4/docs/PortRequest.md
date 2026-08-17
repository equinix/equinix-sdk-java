

# PortRequest

PortRequest is the Request Object for creating single and bulk fabric ports

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **PortType** |  |  |
|**physicalPortsSpeed** | **Integer** | Physical Ports Speed in Mbps |  |
|**physicalPortsType** | [**PhysicalPortsTypeEnum**](#PhysicalPortsTypeEnum) | Physical Ports Type. 10GBASE_SMF is only applicable for IX ports |  |
|**physicalPortsCount** | **Integer** |  |  [optional] |
|**connectivitySourceType** | [**ConnectivitySourceTypeEnum**](#ConnectivitySourceTypeEnum) | Port connectivity type |  |
|**bmmrType** | [**BmmrTypeEnum**](#BmmrTypeEnum) | BMMR Type is mandatory when connectivitySourceType is BMMR |  [optional] |
|**project** | [**Project**](Project.md) |  |  |
|**order** | [**PortOrder**](PortOrder.md) |  |  [optional] |
|**account** | [**SimplifiedAccountRequest**](SimplifiedAccountRequest.md) |  |  |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Port service Type |  [optional] |
|**serviceCode** | **PortServiceCode** |  |  [optional] |
|**bandwidth** | **Integer** | Equinix assigned response attribute for Port bandwidth in Mbps |  [optional] |
|**location** | [**SimplifiedLocationRequest**](SimplifiedLocationRequest.md) |  |  |
|**demarcationPointIbx** | **String** | A-side/Equinix ibx |  [optional] |
|**tetherIbx** | **String** | z-side/Equinix ibx |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**redundancy** | [**PortRedundancy**](PortRedundancy.md) |  |  [optional] |
|**encapsulation** | [**PortEncapsulation**](PortEncapsulation.md) |  |  |
|**lagEnabled** | **Boolean** | Indicates whether Link Aggregation Group (LAG) is enabled on this port |  [optional] |
|**_package** | [**ModelPackage**](ModelPackage.md) |  |  [optional] |
|**settings** | [**PortSettings**](PortSettings.md) |  |  [optional] |
|**notifications** | [**List&lt;PortNotification&gt;**](PortNotification.md) | Notification preferences |  [optional] |
|**physicalPorts** | [**List&lt;PhysicalPort&gt;**](PhysicalPort.md) | Physical ports that implement this port |  [optional] |
|**loas** | [**List&lt;PortLoa&gt;**](PortLoa.md) | Port Loas |  [optional] |



## Enum: PhysicalPortsTypeEnum

| Name | Value |
|---- | -----|
| _1000BASE_LX | &quot;1000BASE_LX&quot; |
| _10GBASE_LR | &quot;10GBASE_LR&quot; |
| _100GBASE_LR4 | &quot;100GBASE_LR4&quot; |
| _10GBASE_ER | &quot;10GBASE_ER&quot; |
| _1000BASE_SX | &quot;1000BASE_SX&quot; |
| _10GBASE_SMF | &quot;10GBASE_SMF&quot; |
| _400GBASE_LR4 | &quot;400GBASE_LR4&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ConnectivitySourceTypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| BMMR | &quot;BMMR&quot; |
| REMOTE | &quot;REMOTE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: BmmrTypeEnum

| Name | Value |
|---- | -----|
| SELF | &quot;SELF&quot; |
| EQUINIX | &quot;EQUINIX&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| EPL | &quot;EPL&quot; |
| MSP | &quot;MSP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



