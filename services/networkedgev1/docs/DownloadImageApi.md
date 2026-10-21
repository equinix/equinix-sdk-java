# DownloadImageApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDownloadImageByDeviceType**](DownloadImageApi.md#getDownloadImageByDeviceType) | **POST** /ne/v1/devices/{deviceType}/repositories/{version}/download | Download an Image |
| [**getDownloadableImagesByDeviceType**](DownloadImageApi.md#getDownloadableImagesByDeviceType) | **GET** /ne/v1/devices/{deviceType}/repositories | Get Downloadable Images |


<a id="getDownloadImageByDeviceType"></a>
# **getDownloadImageByDeviceType**
> PostDownloadImageResponse getDownloadImageByDeviceType(deviceType, version)

Download an Image

Returns a link to download image. You need to provide a device type and version as path parameters.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DownloadImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DownloadImageApi apiInstance = new DownloadImageApi(defaultClient);
    DeviceTypeCode deviceType = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | Device type
    String version = "17.06.01"; // String | Version
    try {
      PostDownloadImageResponse result = apiInstance.getDownloadImageByDeviceType(deviceType, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadImageApi#getDownloadImageByDeviceType");
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
| **deviceType** | [**DeviceTypeCode**](.md)| Device type | [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |
| **version** | **String**| Version | |

### Return type

[**PostDownloadImageResponse**](PostDownloadImageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Download link of the image |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDownloadableImagesByDeviceType"></a>
# **getDownloadableImagesByDeviceType**
> List&lt;ListOfDownloadableImages&gt; getDownloadableImagesByDeviceType(deviceType)

Get Downloadable Images

Returns the downloadable images of a device type. Pass any device type as a path parameter to get the list of downloadable images.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DownloadImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DownloadImageApi apiInstance = new DownloadImageApi(defaultClient);
    DeviceTypeCode deviceType = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | Device type
    try {
      List<ListOfDownloadableImages> result = apiInstance.getDownloadableImagesByDeviceType(deviceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadImageApi#getDownloadableImagesByDeviceType");
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
| **deviceType** | [**DeviceTypeCode**](.md)| Device type | [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |

### Return type

[**List&lt;ListOfDownloadableImages&gt;**](ListOfDownloadableImages.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

