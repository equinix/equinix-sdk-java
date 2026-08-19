

# AlertRulePostRequest

Create Stream Alert Rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Customer-provided stream name |  |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricSelector** | [**MetricSelector**](MetricSelector.md) |  |  |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  |
|**detectionMethod** | [**DetectionMethod**](DetectionMethod.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METRIC_ALERT | &quot;METRIC_ALERT&quot; |



