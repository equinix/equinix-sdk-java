

# PicturesDocumentRequestServiceDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cameraProvidedBy** | [**CameraProvidedByEnum**](#CameraProvidedByEnum) | Who is providing the camera? If documentOnly is false, this field is mandatory. |  [optional] |
|**specificDateAndTime** | **Boolean** | Would you like to request a specific date and time? If true, Scheduling should not be STANDARD. If documentOnly is false, this field is mandatory. |  [optional] |
|**documentOnly** | **Boolean** | Do you need documents or pictures? Set true if you need documents. |  |
|**description** | **String** | Descrption of the Photo/Document. If documentOnly is false, this field is mandatory. |  [optional] |
|**scopeOfWork** | **String** | Enter any additional details that will help our technicians execute your request. You may also attach your scope of work as a document if you exceed the character limit in this field. |  |



## Enum: CameraProvidedByEnum

| Name | Value |
|---- | -----|
| EQUINIX | &quot;Equinix&quot; |
| CUSTOMER | &quot;Customer&quot; |



