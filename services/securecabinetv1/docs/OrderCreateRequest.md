

# OrderCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | Identifier of a billing account, with permission to order colocation products. |  |
|**customerReference** | **String** | Supplementary identifier for your discretionary use. For example, your internal identifier. |  [optional] |
|**endCustomerName** | **String** | End customer name. Applicable and required if a reseller billing account is used. |  [optional] |
|**ibxCode** | **String** | IBX data center identifier. |  |
|**contractTerm** | **ContractTerm** |  |  |
|**orderItem** | [**OrderItem**](OrderItem.md) |  |  |
|**purchaseOrderNumber** | **String** | Purchase order number. Optional, unless the billing account requires it. |  [optional] |
|**technicalContact** | [**ContactDetails**](ContactDetails.md) |  |  [optional] |



