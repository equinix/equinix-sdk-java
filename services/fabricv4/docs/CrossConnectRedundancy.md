

# CrossConnectRedundancy

Cross Connect Redundancy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**group** | **String** | Redundancy group identifier. When placing a diverse Cross Connect against an existing one, provide either this identifier or the serial number of the existing Cross Connect.  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | Priority within the redundancy group. |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SECONDARY | &quot;SECONDARY&quot; |



