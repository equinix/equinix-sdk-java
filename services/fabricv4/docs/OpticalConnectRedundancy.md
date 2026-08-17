

# OpticalConnectRedundancy

Optical Connect redundancy configuration. <br> Required only for DUAL_DIVERSE connection. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**priority** | [**PriorityEnum**](#PriorityEnum) | Role within the diverse pair. &lt;br&gt; PRIMARY - first connection of the pair. &lt;br&gt; SECONDARY - the diverse connection on a separate path.  |  [optional] |
|**group** | **UUID** | Redundancy group identifier |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SECONDARY | &quot;SECONDARY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



