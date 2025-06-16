

# ProviderResponse

Describes the response structure for different orchestrator provider types, including their specific configuration details. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**resources** | [**List&lt;GCPProviderResourceResponse&gt;**](GCPProviderResourceResponse.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FABRIC_PROVIDER | &quot;FABRIC_PROVIDER&quot; |
| AWS_PROVIDER | &quot;AWS_PROVIDER&quot; |
| GCP_PROVIDER | &quot;GCP_PROVIDER&quot; |



