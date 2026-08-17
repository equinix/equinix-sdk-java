# LoasApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLoa**](LoasApi.md#createLoa) | **POST** /fabric/v4/loas | Create Loa |
| [**createLoaNoteByLoaId**](LoasApi.md#createLoaNoteByLoaId) | **POST** /fabric/v4/loas/{loaId}/notes | Create Loa Note |
| [**getLoaActionsByUuid**](LoasApi.md#getLoaActionsByUuid) | **GET** /fabric/v4/loas/{loaId}/actions/{actionId} | Get Loa Action by Action ID |
| [**getLoaByUuid**](LoasApi.md#getLoaByUuid) | **GET** /fabric/v4/loas/{loaId} | Get Loa |
| [**getLoaConsumersByLoaId**](LoasApi.md#getLoaConsumersByLoaId) | **GET** /fabric/v4/loas/{loaId}/consumers | Get Loa Consumers |
| [**getLoaNotesByUuid**](LoasApi.md#getLoaNotesByUuid) | **GET** /fabric/v4/loas/{loaId}/notes | Get Loa Notes |
| [**performLoaAction**](LoasApi.md#performLoaAction) | **POST** /fabric/v4/loas/{loaId}/actions | Loa Actions |
| [**searchLoa**](LoasApi.md#searchLoa) | **POST** /fabric/v4/loas/search | Search Loas |
| [**searchLoaAction**](LoasApi.md#searchLoaAction) | **POST** /fabric/v4/loas/{loaId}/actions/search | Search Loa Actions |
| [**updateLoaByUuid**](LoasApi.md#updateLoaByUuid) | **PATCH** /fabric/v4/loas/{loaId} | Update Loa |


<a id="createLoa"></a>
# **createLoa**
> LoaResponse createLoa(createLoa)

Create Loa

The API provides capability to create a new Loa

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    CreateLoa createLoa = new CreateLoa(); // CreateLoa | 
    try {
      LoaResponse result = apiInstance.createLoa(createLoa);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#createLoa");
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
| **createLoa** | [**CreateLoa**](CreateLoa.md)|  | |

### Return type

[**LoaResponse**](LoaResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="createLoaNoteByLoaId"></a>
# **createLoaNoteByLoaId**
> LoaNoteDetails createLoaNoteByLoaId(loaId, createLoaNote)

Create Loa Note

The API provides capability to create Loa note by Loa ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    CreateLoaNote createLoaNote = new CreateLoaNote(); // CreateLoaNote | 
    try {
      LoaNoteDetails result = apiInstance.createLoaNoteByLoaId(loaId, createLoaNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#createLoaNoteByLoaId");
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
| **loaId** | **UUID**| Loa UUID | |
| **createLoaNote** | [**CreateLoaNote**](CreateLoaNote.md)|  | |

### Return type

[**LoaNoteDetails**](LoaNoteDetails.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="getLoaActionsByUuid"></a>
# **getLoaActionsByUuid**
> LoaActionResponse getLoaActionsByUuid(loaId, actionId)

Get Loa Action by Action ID

This API provides capability to fetch action details

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    UUID actionId = UUID.randomUUID(); // UUID | Action UUID
    try {
      LoaActionResponse result = apiInstance.getLoaActionsByUuid(loaId, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#getLoaActionsByUuid");
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
| **loaId** | **UUID**| Loa UUID | |
| **actionId** | **UUID**| Action UUID | |

### Return type

[**LoaActionResponse**](LoaActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="getLoaByUuid"></a>
# **getLoaByUuid**
> LoaResponse getLoaByUuid(loaId)

Get Loa

The API provides capability to get Loa details by Loa ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    try {
      LoaResponse result = apiInstance.getLoaByUuid(loaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#getLoaByUuid");
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
| **loaId** | **UUID**| Loa UUID | |

### Return type

[**LoaResponse**](LoaResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="getLoaConsumersByLoaId"></a>
# **getLoaConsumersByLoaId**
> LoaConsumersResponse getLoaConsumersByLoaId(loaId)

Get Loa Consumers

The API provides capability to get Loa consumers by Loa ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    try {
      LoaConsumersResponse result = apiInstance.getLoaConsumersByLoaId(loaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#getLoaConsumersByLoaId");
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
| **loaId** | **UUID**| Loa UUID | |

### Return type

[**LoaConsumersResponse**](LoaConsumersResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="getLoaNotesByUuid"></a>
# **getLoaNotesByUuid**
> LoaNotesResponse getLoaNotesByUuid(loaId)

Get Loa Notes

The API provides capability to get Loa notes by Loa ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    try {
      LoaNotesResponse result = apiInstance.getLoaNotesByUuid(loaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#getLoaNotesByUuid");
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
| **loaId** | **UUID**| Loa UUID | |

### Return type

[**LoaNotesResponse**](LoaNotesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="performLoaAction"></a>
# **performLoaAction**
> LoaActionResponse performLoaAction(loaId, loaActionRequest)

Loa Actions

The API provides capability to perform actions on Loa

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    LoaActionRequest loaActionRequest = new LoaActionRequest(); // LoaActionRequest | 
    try {
      LoaActionResponse result = apiInstance.performLoaAction(loaId, loaActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#performLoaAction");
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
| **loaId** | **UUID**| Loa UUID | |
| **loaActionRequest** | [**LoaActionRequest**](LoaActionRequest.md)|  | |

### Return type

[**LoaActionResponse**](LoaActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="searchLoa"></a>
# **searchLoa**
> LoaSearchResponse searchLoa(loaSearchRequest)

Search Loas

The API provides capability to get list of user&#39;s Loa using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    LoaSearchRequest loaSearchRequest = new LoaSearchRequest(); // LoaSearchRequest | 
    try {
      LoaSearchResponse result = apiInstance.searchLoa(loaSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#searchLoa");
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
| **loaSearchRequest** | [**LoaSearchRequest**](LoaSearchRequest.md)|  | |

### Return type

[**LoaSearchResponse**](LoaSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="searchLoaAction"></a>
# **searchLoaAction**
> LoaActionSearchResponse searchLoaAction(loaId, loaActionSearchRequest)

Search Loa Actions

The API provides capability to get list of user&#39;s Loa Actions using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    LoaActionSearchRequest loaActionSearchRequest = new LoaActionSearchRequest(); // LoaActionSearchRequest | 
    try {
      LoaActionSearchResponse result = apiInstance.searchLoaAction(loaId, loaActionSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#searchLoaAction");
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
| **loaId** | **UUID**| Loa UUID | |
| **loaActionSearchRequest** | [**LoaActionSearchRequest**](LoaActionSearchRequest.md)|  | |

### Return type

[**LoaActionSearchResponse**](LoaActionSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

<a id="updateLoaByUuid"></a>
# **updateLoaByUuid**
> LoaResponse updateLoaByUuid(loaId, loaReplaceOperation)

Update Loa

The API provides capability to update Loa details by Loa ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.LoasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LoasApi apiInstance = new LoasApi(defaultClient);
    UUID loaId = UUID.randomUUID(); // UUID | Loa UUID
    List<LoaReplaceOperation> loaReplaceOperation = Arrays.asList(); // List<LoaReplaceOperation> | 
    try {
      LoaResponse result = apiInstance.updateLoaByUuid(loaId, loaReplaceOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoasApi#updateLoaByUuid");
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
| **loaId** | **UUID**| Loa UUID | |
| **loaReplaceOperation** | [**List&lt;LoaReplaceOperation&gt;**](LoaReplaceOperation.md)|  | |

### Return type

[**LoaResponse**](LoaResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Operation not allowed |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server error |  -  |

