

# AlertRulePutRequest

Create Stream Alert Rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Customer-provided stream name |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricSelector** | [**MetricSelector**](MetricSelector.md) |  |  [optional] |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  [optional] |
|**detectionMethod** | [**DetectionMethod**](DetectionMethod.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METRIC_ALERT | &quot;METRIC_ALERT&quot; |



