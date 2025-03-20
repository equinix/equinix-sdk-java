

# RouteAggregationsChange

Current state of latest Route Aggregation change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**href** | **URI** | Route AGGREGATION Change URI |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP_IPV4_PREFIX_AGGREGATION_UPDATE | &quot;BGP_IPv4_PREFIX_AGGREGATION_UPDATE&quot; |
| BGP_IPV4_PREFIX_AGGREGATION_CREATION | &quot;BGP_IPv4_PREFIX_AGGREGATION_CREATION&quot; |
| BGP_IPV4_PREFIX_AGGREGATION_DELETION | &quot;BGP_IPv4_PREFIX_AGGREGATION_DELETION&quot; |
| BGP_IPV6_PREFIX_AGGREGATION_UPDATE | &quot;BGP_IPv6_PREFIX_AGGREGATION_UPDATE&quot; |
| BGP_IPV6_PREFIX_AGGREGATION_CREATION | &quot;BGP_IPv6_PREFIX_AGGREGATION_CREATION&quot; |
| BGP_IPV6_PREFIX_AGGREGATION_DELETION | &quot;BGP_IPv6_PREFIX_AGGREGATION_DELETION&quot; |



