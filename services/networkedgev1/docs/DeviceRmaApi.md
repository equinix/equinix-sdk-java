# DeviceRmaApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeviceRMAByUuid**](DeviceRmaApi.md#createDeviceRMAByUuid) | **POST** /ne/v1/devices/{virtualDeviceUuid}/rma | Trigger Device RMA |


<a id="createDeviceRMAByUuid"></a>
# **createDeviceRMAByUuid**
> createDeviceRMAByUuid(virtualDeviceUuid, request)

Trigger Device RMA

Triggers a request to create an RMA of a device. The payload to create an RMA is different for different vendors. You will need to enter a license to create an RMA.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceRmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceRmaApi apiInstance = new DeviceRmaApi(defaultClient);
    String virtualDeviceUuid = "877a3aa2-c49a-4af1-98a6-007424e737ae"; // String | Unique ID of a device
    DeviceRMAPostRequest request = new DeviceRMAPostRequest(); // DeviceRMAPostRequest | Post RMA request
    try {
      apiInstance.createDeviceRMAByUuid(virtualDeviceUuid, request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceRmaApi#createDeviceRMAByUuid");
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
| **virtualDeviceUuid** | **String**| Unique ID of a device | |
| **request** | [**DeviceRMAPostRequest**](DeviceRMAPostRequest.md)| Post RMA request | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | You successfully triggered an RMA request. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

