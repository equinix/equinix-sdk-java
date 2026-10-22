# EiaServiceApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEquinixInternetAccessv2**](EiaServiceApi.md#createEquinixInternetAccessv2) | **POST** /internetAccess/v2/services | Creates Equinix Internet Access Service |
| [**deleteEquinixInternetAccess**](EiaServiceApi.md#deleteEquinixInternetAccess) | **DELETE** /internetAccess/v2/services/{serviceId} | Deletes Equinix Internet Access Service |
| [**getEquinixInternetAccessServiceDetails**](EiaServiceApi.md#getEquinixInternetAccessServiceDetails) | **GET** /internetAccess/v2/services/{serviceId} | Get Equinix Internet Access Service details |
| [**getEquinixInternetAccessServices**](EiaServiceApi.md#getEquinixInternetAccessServices) | **POST** /internetAccess/v2/services/search | Get Equinix Internet Access Services |
| [**updateEquinixInternetAccess**](EiaServiceApi.md#updateEquinixInternetAccess) | **PATCH** /internetAccess/v2/services/{serviceId} | Updates Equinix Internet Access Service |


<a id="createEquinixInternetAccessv2"></a>
# **createEquinixInternetAccessv2**
> ServiceCreateResponse createEquinixInternetAccessv2(serviceCreateRequest)

Creates Equinix Internet Access Service

By passing in the appropriate options, you can create Equinix Internet Access Service product. The entire request either succeeds or fails. In case of failure all the changes in the system are rolled back, so the system gets back to its stated before submitting the request 

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EiaServiceApi apiInstance = new EiaServiceApi(defaultClient);
    ServiceCreateRequest serviceCreateRequest = new ServiceCreateRequest(); // ServiceCreateRequest | Options for creating Equinix Internet Access Service product
    try {
      ServiceCreateResponse result = apiInstance.createEquinixInternetAccessv2(serviceCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EiaServiceApi#createEquinixInternetAccessv2");
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
| **serviceCreateRequest** | [**ServiceCreateRequest**](ServiceCreateRequest.md)| Options for creating Equinix Internet Access Service product | |

### Return type

[**ServiceCreateResponse**](ServiceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Equinix Internet Access Service Response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteEquinixInternetAccess"></a>
# **deleteEquinixInternetAccess**
> deleteEquinixInternetAccess(serviceId, dryRun)

Deletes Equinix Internet Access Service

Delete Equinix Internet Access product by passing the id of the service. The entire request either succeeds or fails. &lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;sup color&#x3D;\&quot;red\&quot;&gt;Beta&lt;/sup&gt;&lt;/font&gt; 

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EiaServiceApi apiInstance = new EiaServiceApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service identifier
    Boolean dryRun = true; // Boolean | Setting this parameter to true will perform only request validation without actually deleting the service
    try {
      apiInstance.deleteEquinixInternetAccess(serviceId, dryRun);
    } catch (ApiException e) {
      System.err.println("Exception when calling EiaServiceApi#deleteEquinixInternetAccess");
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
| **serviceId** | **UUID**| Service identifier | |
| **dryRun** | **Boolean**| Setting this parameter to true will perform only request validation without actually deleting the service | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted deletion request |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEquinixInternetAccessServiceDetails"></a>
# **getEquinixInternetAccessServiceDetails**
> ServiceReadModel getEquinixInternetAccessServiceDetails(serviceId)

Get Equinix Internet Access Service details

Get Equinix Internet Access Service details. &lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;sup color&#x3D;\&quot;red\&quot;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EiaServiceApi apiInstance = new EiaServiceApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service identifier
    try {
      ServiceReadModel result = apiInstance.getEquinixInternetAccessServiceDetails(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EiaServiceApi#getEquinixInternetAccessServiceDetails");
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
| **serviceId** | **UUID**| Service identifier | |

### Return type

[**ServiceReadModel**](ServiceReadModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equinix Internet Access Service details response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEquinixInternetAccessServices"></a>
# **getEquinixInternetAccessServices**
> SearchResponse getEquinixInternetAccessServices(offset, limit, sort, searchRequest)

Get Equinix Internet Access Services

Get Equinix Internet Access Services that match specified criteria. &lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;sup color&#x3D;\&quot;red\&quot;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EiaServiceApi apiInstance = new EiaServiceApi(defaultClient);
    BigDecimal offset = new BigDecimal("20"); // BigDecimal | Search result offset
    BigDecimal limit = new BigDecimal("35"); // BigDecimal | Search result limit
    String sort = "/name,-/type"; // String | Search result sorting
    SearchRequest searchRequest = new SearchRequest(); // SearchRequest | Search filters
    try {
      SearchResponse result = apiInstance.getEquinixInternetAccessServices(offset, limit, sort, searchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EiaServiceApi#getEquinixInternetAccessServices");
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
| **offset** | **BigDecimal**| Search result offset | [optional] |
| **limit** | **BigDecimal**| Search result limit | [optional] |
| **sort** | **String**| Search result sorting | [optional] |
| **searchRequest** | [**SearchRequest**](SearchRequest.md)| Search filters | [optional] |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equinix Internet Access Viewer response |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthenticated |  -  |
| **403** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a id="updateEquinixInternetAccess"></a>
# **updateEquinixInternetAccess**
> ServiceReadModel updateEquinixInternetAccess(serviceId, changeOperationUpdate, dryRun)

Updates Equinix Internet Access Service

Updates properties of Equinix Internet Access 

### Example
```java
// Import classes:
import com.equinix.sdk.internetaccessv2.ApiClient;
import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.Configuration;
import com.equinix.sdk.internetaccessv2.auth.*;
import com.equinix.sdk.internetaccessv2.models.*;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EiaServiceApi apiInstance = new EiaServiceApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service identifier
    List<ChangeOperationUpdate> changeOperationUpdate = Arrays.asList(); // List<ChangeOperationUpdate> | 
    Boolean dryRun = true; // Boolean | Setting this parameter to true will perform only request validation without actually updating the service
    try {
      ServiceReadModel result = apiInstance.updateEquinixInternetAccess(serviceId, changeOperationUpdate, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EiaServiceApi#updateEquinixInternetAccess");
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
| **serviceId** | **UUID**| Service identifier | |
| **changeOperationUpdate** | [**List&lt;ChangeOperationUpdate&gt;**](ChangeOperationUpdate.md)|  | |
| **dryRun** | **Boolean**| Setting this parameter to true will perform only request validation without actually updating the service | [optional] |

### Return type

[**ServiceReadModel**](ServiceReadModel.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted update request |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

