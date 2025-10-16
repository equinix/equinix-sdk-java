

# PortPackage

Port Package details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | Port Package URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Port Package Type |  |
|**code** | **String** | Port Package code |  |
|**vcBandwidthMax** | **Integer** | Maximum virtual connection bandwidth in Mbps |  [optional] |
|**vcRemoteSupported** | **Boolean** | Indicates if remote virtual connections are supported |  [optional] |
|**supportedServiceTypes** | [**List&lt;SupportedServiceTypesEnum&gt;**](#List&lt;SupportedServiceTypesEnum&gt;) | List of supported service types |  [optional] |
|**supportedSourceTypes** | **List&lt;PortPackageSourceType&gt;** | List of supported source types |  [optional] |
|**supportedMetros** | **List&lt;String&gt;** | List of supported metros |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PORT_PACKAGE | &quot;PORT_PACKAGE&quot; |



## Enum: List&lt;SupportedServiceTypesEnum&gt;

| Name | Value |
|---- | -----|
| MSP | &quot;MSP&quot; |



