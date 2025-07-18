# ConnectionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnection**](ConnectionsApi.md#createConnection) | **POST** /fabric/v4/connections | Create Connection |
| [**createConnectionAction**](ConnectionsApi.md#createConnectionAction) | **POST** /fabric/v4/connections/{connectionId}/actions | Connection Actions |
| [**deleteConnectionByUuid**](ConnectionsApi.md#deleteConnectionByUuid) | **DELETE** /fabric/v4/connections/{connectionId} | Delete by ID |
| [**getConnectionByUuid**](ConnectionsApi.md#getConnectionByUuid) | **GET** /fabric/v4/connections/{connectionId} | Get Connection by ID |
| [**searchConnections**](ConnectionsApi.md#searchConnections) | **POST** /fabric/v4/connections/search | Search connections |
| [**updateConnectionByUuid**](ConnectionsApi.md#updateConnectionByUuid) | **PATCH** /fabric/v4/connections/{connectionId} | Update by ID |
| [**validateConnections**](ConnectionsApi.md#validateConnections) | **POST** /fabric/v4/connections/validate | Validate Connection |


<a id="createConnection"></a>
# **createConnection**
> Connection createConnection(connectionPostRequest, dryRun)

Create Connection

This API provides capability to create user&#39;s virtual connection

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    ConnectionPostRequest connectionPostRequest = new ConnectionPostRequest(); // ConnectionPostRequest | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      Connection result = apiInstance.createConnection(connectionPostRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnection");
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
| **connectionPostRequest** | [**ConnectionPostRequest**](ConnectionPostRequest.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **201** | Accept Connection Request |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method not allowed |  -  |

<a id="createConnectionAction"></a>
# **createConnectionAction**
> ConnectionAction createConnectionAction(connectionId, connectionActionRequest)

Connection Actions

This API provides capability to accept/reject user&#39;s virtual connection

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionActionRequest connectionActionRequest = new ConnectionActionRequest(); // ConnectionActionRequest | 
    try {
      ConnectionAction result = apiInstance.createConnectionAction(connectionId, connectionActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnectionAction");
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
| **connectionId** | **String**| Connection Id | |
| **connectionActionRequest** | [**ConnectionActionRequest**](ConnectionActionRequest.md)|  | |

### Return type

[**ConnectionAction**](ConnectionAction.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="deleteConnectionByUuid"></a>
# **deleteConnectionByUuid**
> Connection deleteConnectionByUuid(connectionId)

Delete by ID

Delete Connection by ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection UUID
    try {
      Connection result = apiInstance.deleteConnectionByUuid(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#deleteConnectionByUuid");
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
| **connectionId** | **String**| Connection UUID | |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Connection Request |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method not allowed |  -  |

<a id="getConnectionByUuid"></a>
# **getConnectionByUuid**
> Connection getConnectionByUuid(connectionId, direction)

Get Connection by ID

The API provides capability to get user&#39;s virtual connection details (Service Tokens, Access Points, Link Protocols, etc) by it&#39;s connection ID (UUID)

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionDirection direction = ConnectionDirection.fromValue("INTERNAL"); // ConnectionDirection | Connection Direction
    try {
      Connection result = apiInstance.getConnectionByUuid(connectionId, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getConnectionByUuid");
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
| **connectionId** | **String**| Connection Id | |
| **direction** | [**ConnectionDirection**](.md)| Connection Direction | [optional] [enum: INTERNAL, INCOMING, OUTGOING] |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="searchConnections"></a>
# **searchConnections**
> ConnectionSearchResponse searchConnections(searchRequest)

Search connections

The API provides capability to get list of user&#39;s virtual connections using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
    try {
      ConnectionSearchResponse result = apiInstance.searchConnections(searchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#searchConnections");
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
| **searchRequest** | [**SearchRequest**](SearchRequest.md)|  | |

### Return type

[**ConnectionSearchResponse**](ConnectionSearchResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateConnectionByUuid"></a>
# **updateConnectionByUuid**
> Connection updateConnectionByUuid(connectionId, connectionChangeOperation, dryRun)

Update by ID

Update Connection by ID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    List<ConnectionChangeOperation> connectionChangeOperation = Arrays.asList(); // List<ConnectionChangeOperation> | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      Connection result = apiInstance.updateConnectionByUuid(connectionId, connectionChangeOperation, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateConnectionByUuid");
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
| **connectionId** | **String**| Connection Id | |
| **connectionChangeOperation** | [**List&lt;ConnectionChangeOperation&gt;**](ConnectionChangeOperation.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="validateConnections"></a>
# **validateConnections**
> ConnectionResponse validateConnections(validateRequest)

Validate Connection

This API provides capability to validate by auth key

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    ValidateRequest validateRequest = new ValidateRequest(); // ValidateRequest | 
    try {
      ConnectionResponse result = apiInstance.validateConnections(validateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#validateConnections");
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
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ConnectionResponse**](ConnectionResponse.md)

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

