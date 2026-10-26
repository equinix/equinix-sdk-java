# PrecisionTimePackagesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTimeServicesPackageByCode**](PrecisionTimePackagesApi.md#getTimeServicesPackageByCode) | **GET** /fabric/v4/timeServicePackages/{packageCode} | Get Package By Code |
| [**getTimeServicesPackages**](PrecisionTimePackagesApi.md#getTimeServicesPackages) | **GET** /fabric/v4/timeServicePackages | Get Packages |


<a id="getTimeServicesPackageByCode"></a>
# **getTimeServicesPackageByCode**
> PrecisionTimePackageResponse getTimeServicesPackageByCode(packageCode)

Get Package By Code

The API provides capability to get timing service&#39;s package by code

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimePackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimePackagesApi apiInstance = new PrecisionTimePackagesApi(defaultClient);
    String packageCode = "NTP_STANDARD"; // String | Package Code
    try {
      PrecisionTimePackageResponse result = apiInstance.getTimeServicesPackageByCode(packageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimePackagesApi#getTimeServicesPackageByCode");
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
| **packageCode** | **String**| Package Code | [enum: NTP_STANDARD, NTP_ENTERPRISE, PTP_STANDARD, PTP_ENTERPRISE] |

### Return type

[**PrecisionTimePackageResponse**](PrecisionTimePackageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getTimeServicesPackages"></a>
# **getTimeServicesPackages**
> PrecisionTimeServicePackagesResponse getTimeServicesPackages()

Get Packages

The API provides capability to get timing service&#39;s packages

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimePackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimePackagesApi apiInstance = new PrecisionTimePackagesApi(defaultClient);
    try {
      PrecisionTimeServicePackagesResponse result = apiInstance.getTimeServicesPackages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimePackagesApi#getTimeServicesPackages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrecisionTimeServicePackagesResponse**](PrecisionTimeServicePackagesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

