# ProductAvailabilityApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIbxs**](ProductAvailabilityApi.md#getIbxs) | **GET** /internetAccess/v2/ibxs | Returns IBXs where EIA is available |


<a id="getIbxs"></a>
# **getIbxs**
> IbxPage getIbxs(serviceConnectionType, offset, limit, connectionAsideAccessPointType, assetType)

Returns IBXs where EIA is available

Get IBXs

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.ProductAvailabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ProductAvailabilityApi apiInstance = new ProductAvailabilityApi(defaultClient);
    ConnectionType serviceConnectionType = ConnectionType.fromValue("IA_C"); // ConnectionType | Service connection type (physical, virtual)
    Integer offset = 0; // Integer | Pagination offset
    Integer limit = 50; // Integer | Max number of returned results
    String connectionAsideAccessPointType = "COLO"; // String | Service connection access point type. When not provided, COLO type is used by default.
    String assetType = "CABINET"; // String | Specifies the type of an asset the user must have in the IBX
    try {
      IbxPage result = apiInstance.getIbxs(serviceConnectionType, offset, limit, connectionAsideAccessPointType, assetType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAvailabilityApi#getIbxs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceConnectionType** | [**ConnectionType**](.md)| Service connection type (physical, virtual) | [enum: IA_C, IA_VC] |
| **offset** | **Integer**| Pagination offset | [optional] [default to 0] |
| **limit** | **Integer**| Max number of returned results | [optional] [default to 50] |
| **connectionAsideAccessPointType** | **String**| Service connection access point type. When not provided, COLO type is used by default. | [optional] [enum: COLO, VD, PORT] |
| **assetType** | **String**| Specifies the type of an asset the user must have in the IBX | [optional] [enum: CABINET] |

### Return type

[**IbxPage**](IbxPage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Metros and IBXs |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

