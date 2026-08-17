

# CreateLoa

Create Loa

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **LoaType** |  |  |
|**name** | **String** | A short, descriptive name for this LOA. |  |
|**description** | **String** | Additional context about this LOA. |  [optional] |
|**authorizedProductType** | **LoaProductType** |  |  |
|**expirationDateTime** | **OffsetDateTime** | Date and time when this LOA expires.&lt;br&gt; Default to 3 months from the creation date  |  [optional] |
|**requestor** | [**LoaRequestor**](LoaRequestor.md) |  |  [optional] |
|**demarcationPoint** | [**LoaDemarcationPoint**](LoaDemarcationPoint.md) |  |  |
|**issuer** | [**LoaIssuer**](LoaIssuer.md) |  |  [optional] |
|**location** | [**LoaLocation**](LoaLocation.md) |  |  |



