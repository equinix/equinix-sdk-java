

# LoaResponse

Loa Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | URI of this LOA resource. |  [optional] |
|**uuid** | **UUID** | Unique identifier of this LOA. |  [optional] |
|**type** | **LoaType** |  |  [optional] |
|**name** | **String** | A short, descriptive name for this LOA |  [optional] |
|**description** | **String** | Additional context about this LOA |  [optional] |
|**authorizedProductType** | **LoaProductType** |  |  [optional] |
|**state** | **LoaState** |  |  [optional] |
|**operation** | [**LoaResponseOperation**](LoaResponseOperation.md) |  |  [optional] |
|**requestor** | [**LoaRequestor**](LoaRequestor.md) |  |  [optional] |
|**issuer** | [**LoaIssuer**](LoaIssuer.md) |  |  [optional] |
|**demarcationPoint** | [**LoaDemarcationPoint**](LoaDemarcationPoint.md) |  |  [optional] |
|**location** | [**LoaLocation**](LoaLocation.md) |  |  [optional] |
|**expirationDateTime** | **OffsetDateTime** | Date and time when this LOA expires.&lt;br&gt; Default to 3 months from the creation date  |  [optional] |
|**changeLog** | [**LoaChangelog**](LoaChangelog.md) |  |  [optional] |



