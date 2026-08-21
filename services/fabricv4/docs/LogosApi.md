# LogosApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLogo**](LogosApi.md#createLogo) | **POST** /fabric/v4/logos | Create Logo |
| [**deleteLogoByUuid**](LogosApi.md#deleteLogoByUuid) | **DELETE** /fabric/v4/logos/{uuid} | Delete Logo |
| [**getLogoByUuid**](LogosApi.md#getLogoByUuid) | **GET** /fabric/v4/logos/{uuid} | Get Logo |


<a id="createLogo"></a>
# **createLogo**
> LogoResponse createLogo(logo, name, description, type)

Create Logo

Create Logo for Equinix Fabric™ Company Profile.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LogosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LogosApi apiInstance = new LogosApi(defaultClient);
    File logo = new File("/path/to/file"); // File | Logo image file
    String name = "name_example"; // String | Name of the Logo
    String description = "description_example"; // String | Description of the logo
    String type = "type_example"; // String | Type of logo
    try {
      LogoResponse result = apiInstance.createLogo(logo, name, description, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogosApi#createLogo");
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
| **logo** | **File**| Logo image file | |
| **name** | **String**| Name of the Logo | |
| **description** | **String**| Description of the logo | |
| **type** | **String**| Type of logo | |

### Return type

[**LogoResponse**](LogoResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Create operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteLogoByUuid"></a>
# **deleteLogoByUuid**
> LogoResponse deleteLogoByUuid(uuid)

Delete Logo

Delete Logo by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LogosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LogosApi apiInstance = new LogosApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the Logo
    try {
      LogoResponse result = apiInstance.deleteLogoByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogosApi#deleteLogoByUuid");
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
| **uuid** | **UUID**| UUID of the Logo | |

### Return type

[**LogoResponse**](LogoResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Delete operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getLogoByUuid"></a>
# **getLogoByUuid**
> File getLogoByUuid(uuid)

Get Logo

Get Logo by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LogosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LogosApi apiInstance = new LogosApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the Logo
    try {
      File result = apiInstance.getLogoByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogosApi#getLogoByUuid");
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
| **uuid** | **UUID**| UUID of the Logo | |

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: multipart/mixed, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Get operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

