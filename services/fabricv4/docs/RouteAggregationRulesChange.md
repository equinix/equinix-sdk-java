

# RouteAggregationRulesChange

Current state of latest Route Aggregation Rule change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**href** | **URI** | Route Aggregation Change URI |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP_IPV4_PREFIX_AGGREGATION_RULE_UPDATE | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_UPDATE&quot; |
| BGP_IPV4_PREFIX_AGGREGATION_RULE_CREATION | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_CREATION&quot; |
| BGP_IPV4_PREFIX_AGGREGATION_RULE_DELETION | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_DELETION&quot; |



