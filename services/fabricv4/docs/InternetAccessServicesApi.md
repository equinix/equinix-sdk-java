# InternetAccessServicesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEiaService**](InternetAccessServicesApi.md#createEiaService) | **POST** /fabric/v4/internetAccessServices | Creates Internet Access Service |
| [**deleteEiaService**](InternetAccessServicesApi.md#deleteEiaService) | **DELETE** /fabric/v4/internetAccessServices/{uuid} | Delete Internet Access Service by UUID |
| [**getEiaService**](InternetAccessServicesApi.md#getEiaService) | **GET** /fabric/v4/internetAccessServices/{uuid} | Retrieve Internet Access Service by UUID |
| [**patchEiaService**](InternetAccessServicesApi.md#patchEiaService) | **PATCH** /fabric/v4/internetAccessServices/{uuid} | Patch Internet Access Service by UUID |
| [**searchEiaServices**](InternetAccessServicesApi.md#searchEiaServices) | **POST** /fabric/v4/internetAccessServices/search | Search for Internet Access Services |


<a id="createEiaService"></a>
# **createEiaService**
> InternetAccessService createEiaService(internetAccessPostRequest)

Creates Internet Access Service

Creates Internet Access Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetAccessServicesApi apiInstance = new InternetAccessServicesApi(defaultClient);
    InternetAccessPostRequest internetAccessPostRequest = new InternetAccessPostRequest(); // InternetAccessPostRequest | 
    try {
      InternetAccessService result = apiInstance.createEiaService(internetAccessPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetAccessServicesApi#createEiaService");
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
| **internetAccessPostRequest** | [**InternetAccessPostRequest**](InternetAccessPostRequest.md)|  | |

### Return type

[**InternetAccessService**](InternetAccessService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | EIA Service creation or update accepted |  -  |
| **400** | Invalid input parameter |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="deleteEiaService"></a>
# **deleteEiaService**
> InternetAccessService deleteEiaService(uuid)

Delete Internet Access Service by UUID

Delete Internet Access Service by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetAccessServicesApi apiInstance = new InternetAccessServicesApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the EIA Service
    try {
      InternetAccessService result = apiInstance.deleteEiaService(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetAccessServicesApi#deleteEiaService");
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
| **uuid** | **UUID**| UUID of the EIA Service | |

### Return type

[**InternetAccessService**](InternetAccessService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | EIA Service creation or update accepted |  -  |
| **404** | EIA Service not found |  -  |
| **409** | EIA Service cannot be deleted due to active products |  -  |

<a id="getEiaService"></a>
# **getEiaService**
> InternetAccessService getEiaService(uuid)

Retrieve Internet Access Service by UUID

Retrieve Internet Access Service by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetAccessServicesApi apiInstance = new InternetAccessServicesApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the EIA Service
    try {
      InternetAccessService result = apiInstance.getEiaService(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetAccessServicesApi#getEiaService");
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
| **uuid** | **UUID**| UUID of the EIA Service | |

### Return type

[**InternetAccessService**](InternetAccessService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | EIA Service retrieved successfully |  -  |
| **404** | EIA Service not found |  -  |

<a id="patchEiaService"></a>
# **patchEiaService**
> InternetAccessService patchEiaService(uuid, internetAccessPatchOperationUpdate)

Patch Internet Access Service by UUID

Patch Internet Access Service by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetAccessServicesApi apiInstance = new InternetAccessServicesApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the EIA Service
    List<InternetAccessPatchOperationUpdate> internetAccessPatchOperationUpdate = Arrays.asList(); // List<InternetAccessPatchOperationUpdate> | 
    try {
      InternetAccessService result = apiInstance.patchEiaService(uuid, internetAccessPatchOperationUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetAccessServicesApi#patchEiaService");
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
| **uuid** | **UUID**| UUID of the EIA Service | |
| **internetAccessPatchOperationUpdate** | [**List&lt;InternetAccessPatchOperationUpdate&gt;**](InternetAccessPatchOperationUpdate.md)|  | |

### Return type

[**InternetAccessService**](InternetAccessService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | EIA Service creation or update accepted |  -  |
| **404** | EIA Service not found |  -  |

<a id="searchEiaServices"></a>
# **searchEiaServices**
> InternetAccessServices searchEiaServices(internetAccessSearchRequest)

Search for Internet Access Services

Search for Internet Access Services

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetAccessServicesApi apiInstance = new InternetAccessServicesApi(defaultClient);
    InternetAccessSearchRequest internetAccessSearchRequest = new InternetAccessSearchRequest(); // InternetAccessSearchRequest | 
    try {
      InternetAccessServices result = apiInstance.searchEiaServices(internetAccessSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetAccessServicesApi#searchEiaServices");
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
| **internetAccessSearchRequest** | [**InternetAccessSearchRequest**](InternetAccessSearchRequest.md)|  | |

### Return type

[**InternetAccessServices**](InternetAccessServices.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | EIA Services retrieved successfully |  -  |
| **400** | Invalid input parameter |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

