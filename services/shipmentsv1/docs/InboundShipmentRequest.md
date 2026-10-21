

# InboundShipmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contacts** | [**List&lt;ContactInfo&gt;**](ContactInfo.md) | Use this array to pass ordering contact, notification contacts and technical contact. Only one ordering contact, technical contact is allowed. One or more notification contacts are allowed. Ordering and notification contacts are always registered customers with the customer portal. Only username and contactType are valid for ordering and notification contacts, all other attributes will be ignored. &lt;br&gt; &lt;br&gt; Technical contact is optional. workPhoneCountryCode, workPhone and workPhonePrefToCall attributes are mandatory for Technical Contact(when Provided).  &lt;br&gt;&lt;br&gt;  If notification contact is not available to pass, please use ordering contact as notification contact also. &lt;br&gt;  |  |
|**customerReferenceNumber** | **Object** | You may use numbers and text in this field to enter reference information for your records. This will also appear in your reports and details. You may use this information to search for this content on the submitted requests page. |  [optional] |
|**purchaseOrder** | [**PurchaseOrder**](PurchaseOrder.md) |  |  [optional] |
|**ibxLocation** | [**IbxLocation**](IbxLocation.md) |  |  |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Attachments |  [optional] |
|**serviceDetails** | [**InboundServiceDetail**](InboundServiceDetail.md) |  |  |



