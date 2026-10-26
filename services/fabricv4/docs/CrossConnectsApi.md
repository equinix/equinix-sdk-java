# CrossConnectsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCrossConnect**](CrossConnectsApi.md#createCrossConnect) | **POST** /fabric/v4/crossConnects | Create Cross Connect |
| [**createDiverseCrossConnect**](CrossConnectsApi.md#createDiverseCrossConnect) | **POST** /fabric/v4/crossConnects/bulk | Create Diverse Cross Connect |
| [**getCrossConnectActionByUuid**](CrossConnectsApi.md#getCrossConnectActionByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId}/actions/{actionId} | Get Cross Connect Action by Action ID |
| [**getCrossConnectAttachmentsByUuid**](CrossConnectsApi.md#getCrossConnectAttachmentsByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId}/attachments | Get Cross Connect Attachments |
| [**getCrossConnectByUuid**](CrossConnectsApi.md#getCrossConnectByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId} | Get Cross Connect |
| [**getCrossConnectNotesByUuid**](CrossConnectsApi.md#getCrossConnectNotesByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId}/notes | Get Cross Connect Notes |
| [**getCrossConnectSchedulesByUuid**](CrossConnectsApi.md#getCrossConnectSchedulesByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId}/schedules | Get Cross Connect Schedules |
| [**getCrossConnectServicesByUuid**](CrossConnectsApi.md#getCrossConnectServicesByUuid) | **GET** /fabric/v4/crossConnects/{crossConnectId}/services | Get Cross Connect Services |
| [**performCrossConnectAction**](CrossConnectsApi.md#performCrossConnectAction) | **POST** /fabric/v4/crossConnects/{crossConnectId}/actions | Cross Connect Actions |
| [**searchCrossConnectAction**](CrossConnectsApi.md#searchCrossConnectAction) | **POST** /fabric/v4/crossConnects/{crossConnectId}/actions/search | Search Cross Connect Actions |
| [**searchCrossConnectSchedules**](CrossConnectsApi.md#searchCrossConnectSchedules) | **POST** /fabric/v4/crossConnectSchedules/search | Search Cross Connect Schedules |
| [**searchCrossConnects**](CrossConnectsApi.md#searchCrossConnects) | **POST** /fabric/v4/crossConnects/search | Search Cross Connects |


<a id="createCrossConnect"></a>
# **createCrossConnect**
> CrossConnectResponse createCrossConnect(createCrossConnect)

Create Cross Connect

The API provides capability to create a new Cross Connect.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    CreateCrossConnect createCrossConnect = new CreateCrossConnect(); // CreateCrossConnect | 
    try {
      CrossConnectResponse result = apiInstance.createCrossConnect(createCrossConnect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#createCrossConnect");
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
| **createCrossConnect** | [**CreateCrossConnect**](CreateCrossConnect.md)|  | |

### Return type

[**CrossConnectResponse**](CrossConnectResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="createDiverseCrossConnect"></a>
# **createDiverseCrossConnect**
> CrossConnectDiverse createDiverseCrossConnect(diverseCrossConnectRequest)

Create Diverse Cross Connect

The API provides capability to create several Cross Connects in a single order - a diverse pair where the PRIMARY and the SECONDARY Cross Connect are placed at the same time, or multiple Cross Connects by sending one entry per Cross Connect. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    DiverseCrossConnectRequest diverseCrossConnectRequest = new DiverseCrossConnectRequest(); // DiverseCrossConnectRequest | 
    try {
      CrossConnectDiverse result = apiInstance.createDiverseCrossConnect(diverseCrossConnectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#createDiverseCrossConnect");
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
| **diverseCrossConnectRequest** | [**DiverseCrossConnectRequest**](DiverseCrossConnectRequest.md)|  | |

### Return type

[**CrossConnectDiverse**](CrossConnectDiverse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectActionByUuid"></a>
# **getCrossConnectActionByUuid**
> CrossConnectActionResponse getCrossConnectActionByUuid(crossConnectId, actionId)

Get Cross Connect Action by Action ID

The API provides capability to fetch Cross Connect action details by Action ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    UUID actionId = UUID.randomUUID(); // UUID | Cross Connect Action UUID.
    try {
      CrossConnectActionResponse result = apiInstance.getCrossConnectActionByUuid(crossConnectId, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectActionByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |
| **actionId** | **UUID**| Cross Connect Action UUID. | |

### Return type

[**CrossConnectActionResponse**](CrossConnectActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectAttachmentsByUuid"></a>
# **getCrossConnectAttachmentsByUuid**
> CrossConnectAttachmentsResponse getCrossConnectAttachmentsByUuid(crossConnectId)

Get Cross Connect Attachments

The API provides capability to get the documents attached to a Cross Connect by Cross Connect ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    try {
      CrossConnectAttachmentsResponse result = apiInstance.getCrossConnectAttachmentsByUuid(crossConnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectAttachmentsByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |

### Return type

[**CrossConnectAttachmentsResponse**](CrossConnectAttachmentsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectByUuid"></a>
# **getCrossConnectByUuid**
> CrossConnectResponse getCrossConnectByUuid(crossConnectId)

Get Cross Connect

The API provides capability to get Cross Connect details by Cross Connect ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    try {
      CrossConnectResponse result = apiInstance.getCrossConnectByUuid(crossConnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |

### Return type

[**CrossConnectResponse**](CrossConnectResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectNotesByUuid"></a>
# **getCrossConnectNotesByUuid**
> CrossConnectNotesResponse getCrossConnectNotesByUuid(crossConnectId, offset, limit)

Get Cross Connect Notes

The API provides capability to get the notes added to a Cross Connect by Cross Connect ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      CrossConnectNotesResponse result = apiInstance.getCrossConnectNotesByUuid(crossConnectId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectNotesByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**CrossConnectNotesResponse**](CrossConnectNotesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectSchedulesByUuid"></a>
# **getCrossConnectSchedulesByUuid**
> SchedulesResponse getCrossConnectSchedulesByUuid(crossConnectId)

Get Cross Connect Schedules

The API provides capability to get the schedules of a Cross Connect by Cross Connect ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    try {
      SchedulesResponse result = apiInstance.getCrossConnectSchedulesByUuid(crossConnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectSchedulesByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |

### Return type

[**SchedulesResponse**](SchedulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="getCrossConnectServicesByUuid"></a>
# **getCrossConnectServicesByUuid**
> CrossConnectServicesResponse getCrossConnectServicesByUuid(crossConnectId)

Get Cross Connect Services

The API provides capability to get the services ordered alongside a Cross Connect by Cross Connect ID.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    try {
      CrossConnectServicesResponse result = apiInstance.getCrossConnectServicesByUuid(crossConnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#getCrossConnectServicesByUuid");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |

### Return type

[**CrossConnectServicesResponse**](CrossConnectServicesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="performCrossConnectAction"></a>
# **performCrossConnectAction**
> CrossConnectActionResponse performCrossConnectAction(crossConnectId, crossConnectActionRequest)

Cross Connect Actions

The API provides capability to perform an action on a Cross Connect that is in the PENDING_ACTION state. The applicable action types are listed in the allowedActions of the Cross Connect. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    CrossConnectActionRequest crossConnectActionRequest = new CrossConnectActionRequest(); // CrossConnectActionRequest | 
    try {
      CrossConnectActionResponse result = apiInstance.performCrossConnectAction(crossConnectId, crossConnectActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#performCrossConnectAction");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |
| **crossConnectActionRequest** | [**CrossConnectActionRequest**](CrossConnectActionRequest.md)|  | |

### Return type

[**CrossConnectActionResponse**](CrossConnectActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="searchCrossConnectAction"></a>
# **searchCrossConnectAction**
> CrossConnectActionSearchResponse searchCrossConnectAction(crossConnectId, crossConnectActionSearchRequest)

Search Cross Connect Actions

The API provides capability to get list of Cross Connect Actions using search criteria, including optional filtering, pagination and sorting.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    UUID crossConnectId = UUID.randomUUID(); // UUID | Cross Connect UUID.
    CrossConnectActionSearchRequest crossConnectActionSearchRequest = new CrossConnectActionSearchRequest(); // CrossConnectActionSearchRequest | 
    try {
      CrossConnectActionSearchResponse result = apiInstance.searchCrossConnectAction(crossConnectId, crossConnectActionSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#searchCrossConnectAction");
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
| **crossConnectId** | **UUID**| Cross Connect UUID. | |
| **crossConnectActionSearchRequest** | [**CrossConnectActionSearchRequest**](CrossConnectActionSearchRequest.md)|  | |

### Return type

[**CrossConnectActionSearchResponse**](CrossConnectActionSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="searchCrossConnectSchedules"></a>
# **searchCrossConnectSchedules**
> SearchSchedulesResponse searchCrossConnectSchedules(crossConnectScheduleSearchRequest)

Search Cross Connect Schedules

The API provides capability to search the Cross Connect schedule windows offered at an IBX, including optional filtering, pagination and sorting. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    CrossConnectScheduleSearchRequest crossConnectScheduleSearchRequest = new CrossConnectScheduleSearchRequest(); // CrossConnectScheduleSearchRequest | 
    try {
      SearchSchedulesResponse result = apiInstance.searchCrossConnectSchedules(crossConnectScheduleSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#searchCrossConnectSchedules");
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
| **crossConnectScheduleSearchRequest** | [**CrossConnectScheduleSearchRequest**](CrossConnectScheduleSearchRequest.md)|  | |

### Return type

[**SearchSchedulesResponse**](SearchSchedulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

<a id="searchCrossConnects"></a>
# **searchCrossConnects**
> CrossConnectSearchResponse searchCrossConnects(crossConnectSearchRequest)

Search Cross Connects

The API provides capability to get list of user&#39;s Cross Connects using search criteria, including optional filtering, pagination and sorting.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    CrossConnectSearchRequest crossConnectSearchRequest = new CrossConnectSearchRequest(); // CrossConnectSearchRequest | 
    try {
      CrossConnectSearchResponse result = apiInstance.searchCrossConnects(crossConnectSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#searchCrossConnects");
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
| **crossConnectSearchRequest** | [**CrossConnectSearchRequest**](CrossConnectSearchRequest.md)|  | |

### Return type

[**CrossConnectSearchResponse**](CrossConnectSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Operation not allowed. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal Server error. |  -  |

