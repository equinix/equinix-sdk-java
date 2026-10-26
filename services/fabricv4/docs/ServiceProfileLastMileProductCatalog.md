

# ServiceProfileLastMileProductCatalog

Last-mile provider catalog details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Last-mile provider or catalog name. |  [optional] |
|**id** | **String** | Last-mile provider or catalog identifier. |  [optional] |
|**webUrl** | **String** | Last-mile catalog or provider website URL. |  [optional] |
|**deliveryDate** | [**ServiceProfileLastMileDeliveryDateRange**](ServiceProfileLastMileDeliveryDateRange.md) |  |  [optional] |
|**billingTerms** | [**List&lt;BillingTermsEnum&gt;**](#List&lt;BillingTermsEnum&gt;) | Available billing terms in months. |  [optional] |
|**offerings** | [**List&lt;ServiceProfileLastMileOffering&gt;**](ServiceProfileLastMileOffering.md) | Available last-mile offerings. |  [optional] |



## Enum: List&lt;BillingTermsEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_12 | 12 |
| NUMBER_24 | 24 |
| NUMBER_36 | 36 |
| NUMBER_48 | 48 |
| NUMBER_60 | 60 |



