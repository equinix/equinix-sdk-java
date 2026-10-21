

# PurchaseOrder

Use this model to pass purchase order reference information. When purchase order selection type is EXEMTED, number is not required

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | Purchase Order Number |  [optional] |
|**purchaseOrderType** | [**PurchaseOrderTypeEnum**](#PurchaseOrderTypeEnum) | Purchase Order Selection Type |  |



## Enum: PurchaseOrderTypeEnum

| Name | Value |
|---- | -----|
| EXISTING | &quot;EXISTING&quot; |
| EXEMPTED | &quot;EXEMPTED&quot; |



