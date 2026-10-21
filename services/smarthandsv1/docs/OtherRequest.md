

# OtherRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerReferenceNumber** | **String** | You may use numbers and text in this field to enter reference information for your records. This will also appear in your reports and details. You may use this information to search for this content on the submitted requests page. |  [optional] |
|**purchaseOrder** | [**PurchaseOrder**](PurchaseOrder.md) |  |  [optional] |
|**ibxLocation** | [**IbxLocation**](IbxLocation.md) |  |  |
|**contacts** | [**List&lt;ContactInfo&gt;**](ContactInfo.md) | Use this array to pass ordering contact, notification contacts and technical contact. Only one ordering contact, technical contact is allowed. One or more notification contacts are allowed. Ordering and notification contacts are always registered customers with the customer portal. |  |
|**schedule** | [**ScheduleInfo**](ScheduleInfo.md) |  |  |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Use this to pass uploaded attachments. Attachments need to be uploaded using the attachments API. Maximum size of an attachment is 2MB with the following formats - bmp, jpg, jpeg, gif, png, tif, tiff, txt, doc, docx, xls, xlsx, ppt, pps, ppsx, pdf, and vsd. |  [optional] |
|**serviceDetails** | [**OtherRequestServiceDetails**](OtherRequestServiceDetails.md) |  |  |



