# CloudRouterPackagesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCloudRouterPackageByCode**](CloudRouterPackagesApi.md#getCloudRouterPackageByCode) | **GET** /fabric/v4/routerPackages/{routerPackageCode} | Get Package Details |
| [**getCloudRouterPackages**](CloudRouterPackagesApi.md#getCloudRouterPackages) | **GET** /fabric/v4/routerPackages | List Packages |


<a id="getCloudRouterPackageByCode"></a>
# **getCloudRouterPackageByCode**
> CloudRouterPackage getCloudRouterPackageByCode(routerPackageCode)

Get Package Details

This API provides capability to retrieve user&#39;s Cloud Routers Package Details

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRouterPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRouterPackagesApi apiInstance = new CloudRouterPackagesApi(defaultClient);
    RouterPackageCode routerPackageCode = RouterPackageCode.fromValue("LAB"); // RouterPackageCode | Equinix-assigned Cloud Router package identifier
    try {
      CloudRouterPackage result = apiInstance.getCloudRouterPackageByCode(routerPackageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRouterPackagesApi#getCloudRouterPackageByCode");
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
| **routerPackageCode** | [**RouterPackageCode**](.md)| Equinix-assigned Cloud Router package identifier | [enum: LAB, BASIC, STANDARD, ADVANCED, PREMIUM] |

### Return type

[**CloudRouterPackage**](CloudRouterPackage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router Package details |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getCloudRouterPackages"></a>
# **getCloudRouterPackages**
> PackageResponse getCloudRouterPackages(offset, limit)

List Packages

This API provides capability to retrieve user&#39;s Cloud Routers Packages

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRouterPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRouterPackagesApi apiInstance = new CloudRouterPackagesApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      PackageResponse result = apiInstance.getCloudRouterPackages(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRouterPackagesApi#getCloudRouterPackages");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**PackageResponse**](PackageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router Packages |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

