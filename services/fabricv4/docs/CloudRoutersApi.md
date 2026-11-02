# CloudRoutersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCloudRouter**](CloudRoutersApi.md#createCloudRouter) | **POST** /fabric/v4/routers | Create Router |
| [**createCloudRouterAction**](CloudRoutersApi.md#createCloudRouterAction) | **POST** /fabric/v4/routers/{routerId}/actions | Create Route Table Action |
| [**createCloudRouterCommand**](CloudRoutersApi.md#createCloudRouterCommand) | **POST** /fabric/v4/routers/{routerId}/commands | Create Command |
| [**deleteCloudRouterByUuid**](CloudRoutersApi.md#deleteCloudRouterByUuid) | **DELETE** /fabric/v4/routers/{routerId} | Delete Router |
| [**deleteCloudRouterCommandByUuid**](CloudRoutersApi.md#deleteCloudRouterCommandByUuid) | **DELETE** /fabric/v4/routers/{routerId}/commands/{commandId} | Delete Command |
| [**getAllCloudRouterCommands**](CloudRoutersApi.md#getAllCloudRouterCommands) | **GET** /fabric/v4/routers/{routerId}/commands | Get Commands |
| [**getCloudRouterActions**](CloudRoutersApi.md#getCloudRouterActions) | **GET** /fabric/v4/routers/{routerId}/actions | Get Route Table Actions |
| [**getCloudRouterActionsByUuid**](CloudRoutersApi.md#getCloudRouterActionsByUuid) | **GET** /fabric/v4/routers/{routerId}/actions/{actionId} | Get Route Table Action by ID |
| [**getCloudRouterByUuid**](CloudRoutersApi.md#getCloudRouterByUuid) | **GET** /fabric/v4/routers/{routerId} | Get Router |
| [**getCloudRouterCommand**](CloudRoutersApi.md#getCloudRouterCommand) | **GET** /fabric/v4/routers/{routerId}/commands/{commandId} | Get Command |
| [**searchCloudRouterCommands**](CloudRoutersApi.md#searchCloudRouterCommands) | **POST** /fabric/v4/routers/{routerId}/commands/search | Search Commands |
| [**searchCloudRouterRoutes**](CloudRoutersApi.md#searchCloudRouterRoutes) | **POST** /fabric/v4/routers/{routerId}/routes/search | Search Route Tables |
| [**searchCloudRouters**](CloudRoutersApi.md#searchCloudRouters) | **POST** /fabric/v4/routers/search | Search Routers |
| [**searchConnectionAdvertisedRoutes**](CloudRoutersApi.md#searchConnectionAdvertisedRoutes) | **POST** /fabric/v4/connections/{connectionId}/advertisedRoutes/search | Search Advertised Routes |
| [**searchConnectionReceivedRoutes**](CloudRoutersApi.md#searchConnectionReceivedRoutes) | **POST** /fabric/v4/connections/{connectionId}/receivedRoutes/search | Search Received Routes |
| [**searchRouterActions**](CloudRoutersApi.md#searchRouterActions) | **POST** /fabric/v4/routers/{routerId}/actions/search | Search Route Table Actions |
| [**updateCloudRouterByUuid**](CloudRoutersApi.md#updateCloudRouterByUuid) | **PATCH** /fabric/v4/routers/{routerId} | Update Router |


<a id="createCloudRouter"></a>
# **createCloudRouter**
> CloudRouter createCloudRouter(cloudRouterPostRequest, dryRun)

Create Router

This API provides capability to create user&#39;s Cloud Router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterPostRequest cloudRouterPostRequest = new CloudRouterPostRequest(); // CloudRouterPostRequest | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      CloudRouter result = apiInstance.createCloudRouter(cloudRouterPostRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouter");
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
| **cloudRouterPostRequest** | [**CloudRouterPostRequest**](CloudRouterPostRequest.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="createCloudRouterAction"></a>
# **createCloudRouterAction**
> CloudRouterActionResponse createCloudRouterAction(routerId, cloudRouterActionRequest)

Create Route Table Action

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    CloudRouterActionRequest cloudRouterActionRequest = new CloudRouterActionRequest(); // CloudRouterActionRequest | 
    try {
      CloudRouterActionResponse result = apiInstance.createCloudRouterAction(routerId, cloudRouterActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouterAction");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterActionRequest** | [**CloudRouterActionRequest**](CloudRouterActionRequest.md)|  | |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

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
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="createCloudRouterCommand"></a>
# **createCloudRouterCommand**
> CloudRouterCommand createCloudRouterCommand(routerId, cloudRouterCommandPostRequest)

Create Command

This API provides capability to initiate Command

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    CloudRouterCommandPostRequest cloudRouterCommandPostRequest = new CloudRouterCommandPostRequest(); // CloudRouterCommandPostRequest | 
    try {
      CloudRouterCommand result = apiInstance.createCloudRouterCommand(routerId, cloudRouterCommandPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouterCommand");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterCommandPostRequest** | [**CloudRouterCommandPostRequest**](CloudRouterCommandPostRequest.md)|  | |

### Return type

[**CloudRouterCommand**](CloudRouterCommand.md)

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
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="deleteCloudRouterByUuid"></a>
# **deleteCloudRouterByUuid**
> deleteCloudRouterByUuid(routerId)

Delete Router

This API provides capability to delete user&#39;s Cloud Router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Cloud Router UUID
    try {
      apiInstance.deleteCloudRouterByUuid(routerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#deleteCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

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
| **204** | Deleted Cloud Router Successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="deleteCloudRouterCommandByUuid"></a>
# **deleteCloudRouterCommandByUuid**
> deleteCloudRouterCommandByUuid(routerId, commandId)

Delete Command

This API provides capability to delete command based on command Id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    UUID commandId = UUID.fromString("37c10edc-ba2e-4240-a850-8a48f9c47d00"); // UUID | Command UUID
    try {
      apiInstance.deleteCloudRouterCommandByUuid(routerId, commandId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#deleteCloudRouterCommandByUuid");
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
| **routerId** | **UUID**| Router UUID | |
| **commandId** | **UUID**| Command UUID | |

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
| **204** | Deleted command successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAllCloudRouterCommands"></a>
# **getAllCloudRouterCommands**
> GetAllCloudRouterCommands getAllCloudRouterCommands(routerId)

Get Commands

This API provides capability to fetch all commands

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    try {
      GetAllCloudRouterCommands result = apiInstance.getAllCloudRouterCommands(routerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getAllCloudRouterCommands");
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
| **routerId** | **UUID**| Router UUID | |

### Return type

[**GetAllCloudRouterCommands**](GetAllCloudRouterCommands.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="getCloudRouterActions"></a>
# **getCloudRouterActions**
> CloudRouterActionsSearchResponse getCloudRouterActions(routerId, state)

Get Route Table Actions

This API provides capability to fetch all actions for a given cloud router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    CloudRouterActionState state = CloudRouterActionState.fromValue("SUCCEEDED"); // CloudRouterActionState | Action state
    try {
      CloudRouterActionsSearchResponse result = apiInstance.getCloudRouterActions(routerId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterActions");
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
| **routerId** | **UUID**| Router UUID | |
| **state** | [**CloudRouterActionState**](.md)| Action state | [optional] [enum: SUCCEEDED, FAILED, PENDING] |

### Return type

[**CloudRouterActionsSearchResponse**](CloudRouterActionsSearchResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="getCloudRouterActionsByUuid"></a>
# **getCloudRouterActionsByUuid**
> CloudRouterActionResponse getCloudRouterActionsByUuid(routerId, actionId, state)

Get Route Table Action by ID

This API provides capability to fetch action status

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    UUID actionId = UUID.fromString("457400f8-d360-11e9-bb65-2a2ae2dbcced"); // UUID | Action UUID
    CloudRouterActionState state = CloudRouterActionState.fromValue("SUCCEEDED"); // CloudRouterActionState | Action state
    try {
      CloudRouterActionResponse result = apiInstance.getCloudRouterActionsByUuid(routerId, actionId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterActionsByUuid");
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
| **routerId** | **UUID**| Router UUID | |
| **actionId** | **UUID**| Action UUID | |
| **state** | [**CloudRouterActionState**](.md)| Action state | [optional] [enum: SUCCEEDED, FAILED, PENDING] |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="getCloudRouterByUuid"></a>
# **getCloudRouterByUuid**
> CloudRouterReadResponse getCloudRouterByUuid(routerId)

Get Router

This API provides capability to retrieve user&#39;s Cloud Router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Cloud Router UUID
    try {
      CloudRouterReadResponse result = apiInstance.getCloudRouterByUuid(routerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

### Return type

[**CloudRouterReadResponse**](CloudRouterReadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getCloudRouterCommand"></a>
# **getCloudRouterCommand**
> CloudRouterCommand getCloudRouterCommand(routerId, commandId)

Get Command

This API provides capability to fetch command using command Id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    UUID commandId = UUID.fromString("37c10edc-ba2e-4240-a850-8a48f9c47d00"); // UUID | Command UUID
    try {
      CloudRouterCommand result = apiInstance.getCloudRouterCommand(routerId, commandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterCommand");
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
| **routerId** | **UUID**| Router UUID | |
| **commandId** | **UUID**| Command UUID | |

### Return type

[**CloudRouterCommand**](CloudRouterCommand.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="searchCloudRouterCommands"></a>
# **searchCloudRouterCommands**
> CloudRouterCommandSearchResponse searchCloudRouterCommands(routerId, cloudRouterCommandSearchRequest)

Search Commands

This API provides capability to search commands

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    CloudRouterCommandSearchRequest cloudRouterCommandSearchRequest = new CloudRouterCommandSearchRequest(); // CloudRouterCommandSearchRequest | 
    try {
      CloudRouterCommandSearchResponse result = apiInstance.searchCloudRouterCommands(routerId, cloudRouterCommandSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouterCommands");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterCommandSearchRequest** | [**CloudRouterCommandSearchRequest**](CloudRouterCommandSearchRequest.md)|  | |

### Return type

[**CloudRouterCommandSearchResponse**](CloudRouterCommandSearchResponse.md)

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
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="searchCloudRouterRoutes"></a>
# **searchCloudRouterRoutes**
> RouteTableEntrySearchResponse searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest)

Search Route Tables

The API provides capability to get list of user&#39;s Fabric Cloud Router route table entries using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    RouteTableEntrySearchRequest routeTableEntrySearchRequest = new RouteTableEntrySearchRequest(); // RouteTableEntrySearchRequest | 
    try {
      RouteTableEntrySearchResponse result = apiInstance.searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouterRoutes");
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
| **routerId** | **UUID**| Router UUID | |
| **routeTableEntrySearchRequest** | [**RouteTableEntrySearchRequest**](RouteTableEntrySearchRequest.md)|  | |

### Return type

[**RouteTableEntrySearchResponse**](RouteTableEntrySearchResponse.md)

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
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="searchCloudRouters"></a>
# **searchCloudRouters**
> SearchResponse searchCloudRouters(cloudRouterSearchRequest)

Search Routers

The API provides capability to get list of user&#39;s Cloud Routers using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterSearchRequest cloudRouterSearchRequest = new CloudRouterSearchRequest(); // CloudRouterSearchRequest | 
    try {
      SearchResponse result = apiInstance.searchCloudRouters(cloudRouterSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouters");
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
| **cloudRouterSearchRequest** | [**CloudRouterSearchRequest**](CloudRouterSearchRequest.md)|  | |

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
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="searchConnectionAdvertisedRoutes"></a>
# **searchConnectionAdvertisedRoutes**
> ConnectionRouteTableEntrySearchResponse searchConnectionAdvertisedRoutes(connectionId, connectionRouteSearchRequest)

Search Advertised Routes

The API provides capability to get list of user&#39;s advertised routes using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    String connectionId = "557400f8-d360-11e9-bb65-2a2ae2dbcce4"; // String | Connection Id
    ConnectionRouteSearchRequest connectionRouteSearchRequest = new ConnectionRouteSearchRequest(); // ConnectionRouteSearchRequest | 
    try {
      ConnectionRouteTableEntrySearchResponse result = apiInstance.searchConnectionAdvertisedRoutes(connectionId, connectionRouteSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchConnectionAdvertisedRoutes");
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
| **connectionRouteSearchRequest** | [**ConnectionRouteSearchRequest**](ConnectionRouteSearchRequest.md)|  | |

### Return type

[**ConnectionRouteTableEntrySearchResponse**](ConnectionRouteTableEntrySearchResponse.md)

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

<a id="searchConnectionReceivedRoutes"></a>
# **searchConnectionReceivedRoutes**
> ConnectionRouteTableEntrySearchResponse searchConnectionReceivedRoutes(connectionId, connectionRouteSearchRequest)

Search Received Routes

The API provides capability to get list of received routes using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    String connectionId = "557400f8-d360-11e9-bb65-2a2ae2dbcce4"; // String | Connection Id
    ConnectionRouteSearchRequest connectionRouteSearchRequest = new ConnectionRouteSearchRequest(); // ConnectionRouteSearchRequest | 
    try {
      ConnectionRouteTableEntrySearchResponse result = apiInstance.searchConnectionReceivedRoutes(connectionId, connectionRouteSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchConnectionReceivedRoutes");
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
| **connectionRouteSearchRequest** | [**ConnectionRouteSearchRequest**](ConnectionRouteSearchRequest.md)|  | |

### Return type

[**ConnectionRouteTableEntrySearchResponse**](ConnectionRouteTableEntrySearchResponse.md)

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

<a id="searchRouterActions"></a>
# **searchRouterActions**
> CloudRouterActionsSearchResponse searchRouterActions(routerId, cloudRouterActionsSearchRequest)

Search Route Table Actions

This API provides capability to search route table actions for a given cloud router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Router UUID
    CloudRouterActionsSearchRequest cloudRouterActionsSearchRequest = new CloudRouterActionsSearchRequest(); // CloudRouterActionsSearchRequest | 
    try {
      CloudRouterActionsSearchResponse result = apiInstance.searchRouterActions(routerId, cloudRouterActionsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchRouterActions");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterActionsSearchRequest** | [**CloudRouterActionsSearchRequest**](CloudRouterActionsSearchRequest.md)|  | |

### Return type

[**CloudRouterActionsSearchResponse**](CloudRouterActionsSearchResponse.md)

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
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a id="updateCloudRouterByUuid"></a>
# **updateCloudRouterByUuid**
> CloudRouter updateCloudRouterByUuid(routerId, cloudRouterChangeOperation)

Update Router

This API provides capability to update user&#39;s Cloud Router

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | Cloud Router UUID
    List<CloudRouterChangeOperation> cloudRouterChangeOperation = Arrays.asList(); // List<CloudRouterChangeOperation> | 
    try {
      CloudRouter result = apiInstance.updateCloudRouterByUuid(routerId, cloudRouterChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#updateCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |
| **cloudRouterChangeOperation** | [**List&lt;CloudRouterChangeOperation&gt;**](CloudRouterChangeOperation.md)|  | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

