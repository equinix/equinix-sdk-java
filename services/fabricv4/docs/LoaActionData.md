

# LoaActionData

Action Data. <br> For LOA_ISSUER_AUTHORIZATION — always required. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**demarcationPoint** | [**LoaDemarcationPoint**](LoaDemarcationPoint.md) |  |  [optional] |
|**expirationDateTime** | **OffsetDateTime** | Date and time when this LOA expires.&lt;br&gt; Default to 3 months from the creation date  |  [optional] |
|**portalUrl** | **String** | Portal URL for the LOA to either accept from requestor &lt;br&gt; or authorize from the issuer.  |  [optional] [readonly] |



