

# DetectionMethodResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | * THRESHOLD - Alert when a metric crosses a defined threshold by user. * OUTLIER - Intelligent Alert that has an outlier behavior. This option is currently supported for metro latency metric.  |  [optional] |
|**windowSize** | **String** | Stream alert rule metric window size |  [optional] |
|**operand** | [**OperandEnum**](#OperandEnum) | Stream alert rule metric operand |  [optional] |
|**warningThreshold** | **String** | Stream alert rule metric warning threshold |  [optional] |
|**criticalThreshold** | **String** | Stream alert rule metric critical threshold |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| THRESHOLD | &quot;THRESHOLD&quot; |
| OUTLIER | &quot;OUTLIER&quot; |



## Enum: OperandEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



