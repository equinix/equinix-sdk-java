

# OrchestratorProviders

The OrchestratorProvider schema defines the structure for the orchestrator provider configuration. It includes details about the provider type and its specific configurations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**resources** | [**List&lt;GCPProviderResource&gt;**](GCPProviderResource.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FABRIC_PROVIDER | &quot;FABRIC_PROVIDER&quot; |
| AWS_PROVIDER | &quot;AWS_PROVIDER&quot; |
| GCP_PROVIDER | &quot;GCP_PROVIDER&quot; |



