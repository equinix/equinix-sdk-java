

# IpBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Unique identifier for the IP Block |  |
|**href** | **String** | Resource URL path for the IP Block |  |
|**type** | **TypeOfIpBlockProduct** |  |  |
|**state** | **IpBlockState** |  |  |
|**ownership** | **IpBlockOwnership** |  |  |
|**location** | [**IpBlockLocation**](IpBlockLocation.md) |  |  [optional] |
|**prefixLength** | **Integer** | IpBlockPrefix length |  |
|**prefix** | **String** | CIDR prefix |  [optional] |
|**order** | [**IpBlockOrderResponse**](IpBlockOrderResponse.md) |  |  [optional] |
|**account** | [**IpBlockAccount**](IpBlockAccount.md) |  |  [optional] |
|**project** | [**IpBlockProject**](IpBlockProject.md) |  |  |
|**regulations** | [**IpBlockRegulations**](IpBlockRegulations.md) |  |  [optional] |
|**assets** | [**List&lt;IpBlockAsset&gt;**](IpBlockAsset.md) | Products using this IP Block |  [optional] |
|**change** | [**IpBlockChange**](IpBlockChange.md) |  |  [optional] |
|**changeLog** | [**IpBlockChangeLog**](IpBlockChangeLog.md) |  |  |
|**error** | [**Error**](Error.md) |  |  [optional] |



