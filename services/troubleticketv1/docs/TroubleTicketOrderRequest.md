

# TroubleTicketOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerReferenceNumber** | **String** | You may use numbers and text in this field to enter reference information for your records. This will also appear in your reports and details. You may use this information to search for this content on the submitted requests page. |  [optional] |
|**ibxLocation** | [**IbxLocation**](IbxLocation.md) |  |  |
|**contacts** | [**List&lt;ContactInfo&gt;**](ContactInfo.md) | Use this array to pass ordering contact, notification contacts and technical contact. Ordering contact and notification contact are mandatory.Only one ordering contact, technical contact are allowed. One or more notification contacts are allowed. Ordering and notification contacts are always registered customers with the customer portal |  |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Use this to pass uploaded attachments. Attachments need to be uploaded using the attachments API |  [optional] |
|**serviceDetails** | [**TroubleTicketOrderRequestServiceDetails**](TroubleTicketOrderRequestServiceDetails.md) |  |  |



