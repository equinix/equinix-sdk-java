

# Asset

assets details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetNumber** | **String** | Asset number. |  [optional] |
|**serialNumber** | **String** | Serial number of the asset. |  [optional] |
|**orderNumber** | **String** | Order number associated with the asset/service. |  [optional] |
|**productName** | **String** | Product type. |  [optional] |
|**ibx** | **String** | Ibx of the location. |  [optional] |
|**cage** | **String** | Cage of the location. |  [optional] |
|**productDescription** | **String** | Product description. |  [optional] |
|**accountNumber** | **String** | Account number of the product/services belongs to. |  [optional] |
|**accountName** | **String** | Account name of the product/services. |  [optional] |
|**installationDate** | **OffsetDateTime** | Date time of the product or service is purchased/installed. |  [optional] |
|**customerReferenceNumber** | **String** | Customer reference number. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**productDetails** | [**List&lt;AssetsProperty&gt;**](AssetsProperty.md) | key/value pairs of product details. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



