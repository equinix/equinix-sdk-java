

# InterfaceBasicInfoResponse

Basic interface information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** | Interface ID. |  [optional] |
|**name** | **String** | Interface name. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Interface status |  [optional] |
|**operationStatus** | [**OperationStatusEnum**](#OperationStatusEnum) | Interface operational status |  [optional] |
|**macAddress** | **String** | MAC address. |  [optional] |
|**ipAddress** | **String** | IP address. |  [optional] |
|**assignedType** | [**AssignedTypeEnum**](#AssignedTypeEnum) | Assigned type |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of interface (e.g., DATA, MGMT, WAN) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ASSIGNED | &quot;ASSIGNED&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| RESERVED | &quot;RESERVED&quot; |



## Enum: OperationStatusEnum

| Name | Value |
|---- | -----|
| UP | &quot;UP&quot; |
| DOWN | &quot;DOWN&quot; |



## Enum: AssignedTypeEnum

| Name | Value |
|---- | -----|
| EQUINIX_MANAGED | &quot;EQUINIX_MANAGED&quot; |
| USER_MANAGED | &quot;USER_MANAGED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATA | &quot;DATA&quot; |
| MGMT | &quot;MGMT&quot; |
| WAN | &quot;WAN&quot; |



