# RouteAggregationRulesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRouteAggregationRule**](RouteAggregationRulesApi.md#createRouteAggregationRule) | **POST** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules | Create Route Aggregation Rule |
| [**createRouteAggregationRulesInBulk**](RouteAggregationRulesApi.md#createRouteAggregationRulesInBulk) | **POST** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/bulk | Bulk Create Route Aggregation Rules |
| [**deleteRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#deleteRouteAggregationRuleByUuid) | **DELETE** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | Delete Route Aggregation Rule |
| [**getRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#getRouteAggregationRuleByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | Get Route Aggregation Rule by ID |
| [**getRouteAggregationRuleChangeByUuid**](RouteAggregationRulesApi.md#getRouteAggregationRuleChangeByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId}/changes/{changeId} | Get Change By ID |
| [**getRouteAggregationRuleChanges**](RouteAggregationRulesApi.md#getRouteAggregationRuleChanges) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId}/changes | Get Route Aggregation Rule Changes |
| [**getRouteAggregationRules**](RouteAggregationRulesApi.md#getRouteAggregationRules) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules | Get Route Aggregation Rules |
| [**patchRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#patchRouteAggregationRuleByUuid) | **PATCH** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | Update Route Aggregation Rule |
| [**replaceRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#replaceRouteAggregationRuleByUuid) | **PUT** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | Replace Route Aggregation Rule |
| [**searchRouteAggregationRules**](RouteAggregationRulesApi.md#searchRouteAggregationRules) | **POST** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/search | Search Route Aggregation Rules |


<a id="createRouteAggregationRule"></a>
# **createRouteAggregationRule**
> RouteAggregationRulesData createRouteAggregationRule(routeAggregationId, routeAggregationRulesBase)

Create Route Aggregation Rule

This API provides capability to create a Route Aggregation Rule

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    RouteAggregationRulesBase routeAggregationRulesBase = new RouteAggregationRulesBase(); // RouteAggregationRulesBase | 
    try {
      RouteAggregationRulesData result = apiInstance.createRouteAggregationRule(routeAggregationId, routeAggregationRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#createRouteAggregationRule");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRulesBase** | [**RouteAggregationRulesBase**](RouteAggregationRulesBase.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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
| **404** | Route Aggregation Rule ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="createRouteAggregationRulesInBulk"></a>
# **createRouteAggregationRulesInBulk**
> GetRouteAggregationRulesResponse createRouteAggregationRulesInBulk(routeAggregationId, routeAggregationRulesPostRequest)

Bulk Create Route Aggregation Rules

This API provides capability to create bulk route aggregation rules

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    RouteAggregationRulesPostRequest routeAggregationRulesPostRequest = new RouteAggregationRulesPostRequest(); // RouteAggregationRulesPostRequest | 
    try {
      GetRouteAggregationRulesResponse result = apiInstance.createRouteAggregationRulesInBulk(routeAggregationId, routeAggregationRulesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#createRouteAggregationRulesInBulk");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRulesPostRequest** | [**RouteAggregationRulesPostRequest**](RouteAggregationRulesPostRequest.md)|  | |

### Return type

[**GetRouteAggregationRulesResponse**](GetRouteAggregationRulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Resource not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteRouteAggregationRuleByUuid"></a>
# **deleteRouteAggregationRuleByUuid**
> RouteAggregationRulesData deleteRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId)

Delete Route Aggregation Rule

This API provides capability to delete a Route aggregation Rule

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    try {
      RouteAggregationRulesData result = apiInstance.deleteRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#deleteRouteAggregationRuleByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getRouteAggregationRuleByUuid"></a>
# **getRouteAggregationRuleByUuid**
> RouteAggregationRulesData getRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId)

Get Route Aggregation Rule by ID

This API provides capability to view a Route Aggregation Rule by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    try {
      RouteAggregationRulesData result = apiInstance.getRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getRouteAggregationRuleChangeByUuid"></a>
# **getRouteAggregationRuleChangeByUuid**
> RouteAggregationRulesChangeData getRouteAggregationRuleChangeByUuid(routeAggregationId, routeAggregationRuleId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Aggregation Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    UUID changeId = UUID.fromString("6d500177-9404-41f2-99e8-2bf1a84d8db5"); // UUID | Route Aggregation Rule Change UUID
    try {
      RouteAggregationRulesChangeData result = apiInstance.getRouteAggregationRuleChangeByUuid(routeAggregationId, routeAggregationRuleId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleChangeByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **changeId** | **UUID**| Route Aggregation Rule Change UUID | |

### Return type

[**RouteAggregationRulesChangeData**](RouteAggregationRulesChangeData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Aggregation Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getRouteAggregationRuleChanges"></a>
# **getRouteAggregationRuleChanges**
> RouteAggregationRulesChangeDataResponse getRouteAggregationRuleChanges(routeAggregationId, routeAggregationRuleId, offset, limit)

Get Route Aggregation Rule Changes

This API provides capability to retrieve all of a Route Aggregation Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RouteAggregationRulesChangeDataResponse result = apiInstance.getRouteAggregationRuleChanges(routeAggregationId, routeAggregationRuleId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleChanges");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RouteAggregationRulesChangeDataResponse**](RouteAggregationRulesChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Aggregation Rule Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getRouteAggregationRules"></a>
# **getRouteAggregationRules**
> GetRouteAggregationRulesResponse getRouteAggregationRules(routeAggregationId, offset, limit)

Get Route Aggregation Rules

This API provides capability to get all Route Aggregations Rules for Fabric

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetRouteAggregationRulesResponse result = apiInstance.getRouteAggregationRules(routeAggregationId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRules");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetRouteAggregationRulesResponse**](GetRouteAggregationRulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Resource not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation Rule ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="patchRouteAggregationRuleByUuid"></a>
# **patchRouteAggregationRuleByUuid**
> RouteAggregationRulesData patchRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesPatchRequestItem)

Update Route Aggregation Rule

This API provides capability to partially update a Route Aggregation Rule

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    List<RouteAggregationRulesPatchRequestItem> routeAggregationRulesPatchRequestItem = Arrays.asList(); // List<RouteAggregationRulesPatchRequestItem> | 
    try {
      RouteAggregationRulesData result = apiInstance.patchRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesPatchRequestItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#patchRouteAggregationRuleByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **routeAggregationRulesPatchRequestItem** | [**List&lt;RouteAggregationRulesPatchRequestItem&gt;**](RouteAggregationRulesPatchRequestItem.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="replaceRouteAggregationRuleByUuid"></a>
# **replaceRouteAggregationRuleByUuid**
> RouteAggregationRulesData replaceRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesBase)

Replace Route Aggregation Rule

This API provides capability to replace a Route Aggregation Rule completely

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    String routeAggregationRuleId = "65b025ef-022b-4180-85cf-82cfc1ab655b"; // String | Route Aggregation Rules Id
    RouteAggregationRulesBase routeAggregationRulesBase = new RouteAggregationRulesBase(); // RouteAggregationRulesBase | 
    try {
      RouteAggregationRulesData result = apiInstance.replaceRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#replaceRouteAggregationRuleByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **routeAggregationRulesBase** | [**RouteAggregationRulesBase**](RouteAggregationRulesBase.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="searchRouteAggregationRules"></a>
# **searchRouteAggregationRules**
> RouteAggregationRulesSearchResponse searchRouteAggregationRules(routeAggregationId, routeAggregationRulesSearchRequest)

Search Route Aggregation Rules

This API provides capability to search Route Aggregation Rules

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "695a8471-6595-4ac6-a2f4-b3d96ed3a59d"; // String | Route Aggregations Id
    RouteAggregationRulesSearchRequest routeAggregationRulesSearchRequest = new RouteAggregationRulesSearchRequest(); // RouteAggregationRulesSearchRequest | 
    try {
      RouteAggregationRulesSearchResponse result = apiInstance.searchRouteAggregationRules(routeAggregationId, routeAggregationRulesSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#searchRouteAggregationRules");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationRulesSearchRequest** | [**RouteAggregationRulesSearchRequest**](RouteAggregationRulesSearchRequest.md)|  | |

### Return type

[**RouteAggregationRulesSearchResponse**](RouteAggregationRulesSearchResponse.md)

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
| **404** | Route Aggregation Rule ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

