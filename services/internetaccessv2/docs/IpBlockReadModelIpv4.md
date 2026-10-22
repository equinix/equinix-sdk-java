

# IpBlockReadModelIpv4


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Ip block URI |  [optional] |
|**uuid** | **UUID** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Determines the type of Routing Protocol |  |
|**prefix** | **String** | Subnet prefix |  [optional] |
|**prefixLength** | **Integer** | Determines the size of ip subnet |  [optional] |
|**addressingPlans** | [**List&lt;IpBlockAddressingPlans&gt;**](IpBlockAddressingPlans.md) | Collection of addressing plans |  [optional] |
|**questions** | [**List&lt;IpBlockQuestions&gt;**](IpBlockQuestions.md) | Connection of questions |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IA_IP_BLOCK | &quot;IA_IP_BLOCK&quot; |



