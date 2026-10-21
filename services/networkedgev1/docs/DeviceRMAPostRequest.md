

# DeviceRMAPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | Any version you want. |  |
|**cloudInitFileId** | **String** | For a C8KV device, this is the Id of the uploaded bootstrap file. Upload your Cisco bootstrap file by calling Upload File. In the response, you&#39;ll get a fileUuid that you can enter here as cloudInitFileId. This field may be required for some vendors. |  [optional] |
|**licenseFileId** | **String** | This is the Id of the uploaded license file. For a CSR1KV SDWAN device, upload your license file by calling Upload License File. In the response, you&#39;ll get a fileId that you can enter here as licenseFileId. This field may be required for some vendors. |  [optional] |
|**token** | **String** | License token. For a cluster, you will need to provide license tokens for both node0 and node1. To get the exact payload for different vendors, check the Postman script on the API Reference page of online documentation. |  [optional] |
|**vendorConfig** | [**RMAVendorConfig**](RMAVendorConfig.md) |  |  [optional] |
|**userPublicKey** | [**UserPublicKeyRequest**](UserPublicKeyRequest.md) |  |  [optional] |



