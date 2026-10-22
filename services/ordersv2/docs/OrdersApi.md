# OrdersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNotesToAnOrder**](OrdersApi.md#addNotesToAnOrder) | **POST** /colocations/v2/orders/{orderId}/notes | Add notes to an order |
| [**cancelAnOrder**](OrdersApi.md#cancelAnOrder) | **POST** /colocations/v2/orders/{orderId}/cancel | Cancel an order |
| [**gETOrderDetails**](OrdersApi.md#gETOrderDetails) | **GET** /colocations/v2/orders/{orderId} | Retrieve an order |
| [**replyToAnOrderNegotiation**](OrdersApi.md#replyToAnOrderNegotiation) | **POST** /colocations/v2/orders/{orderId}/negotiations | Reply to an order negotiation |
| [**retrieveOrderNegotiations**](OrdersApi.md#retrieveOrderNegotiations) | **GET** /colocations/v2/orders/{orderId}/negotiations | Retrieve order negotiations |


<a id="addNotesToAnOrder"></a>
# **addNotesToAnOrder**
> addNotesToAnOrder(orderId, noteRequest)

Add notes to an order

This method adds notes to an order by its ID for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.auth.*;
import com.equinix.sdk.ordersv2.models.*;
import com.equinix.sdk.ordersv2.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "{orderId}"; // String | Identifier of the order
    NoteRequest noteRequest = new NoteRequest(); // NoteRequest | The Order Id to be updated
    try {
      apiInstance.addNotesToAnOrder(orderId, noteRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#addNotesToAnOrder");
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
| **orderId** | **String**| Identifier of the order | |
| **noteRequest** | [**NoteRequest**](NoteRequest.md)| The Order Id to be updated | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **204** | No content |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not allowed |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

<a id="cancelAnOrder"></a>
# **cancelAnOrder**
> cancelAnOrder(orderId, cancelRequest)

Cancel an order

This method cancels an order by its ID for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.auth.*;
import com.equinix.sdk.ordersv2.models.*;
import com.equinix.sdk.ordersv2.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "orderId_example"; // String | Identifier of the order
    CancelRequest cancelRequest = new CancelRequest(); // CancelRequest | The Orders to be cancelled
    try {
      apiInstance.cancelAnOrder(orderId, cancelRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#cancelAnOrder");
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
| **orderId** | **String**| Identifier of the order | |
| **cancelRequest** | [**CancelRequest**](CancelRequest.md)| The Orders to be cancelled | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **204** | No content |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not allowed |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

<a id="gETOrderDetails"></a>
# **gETOrderDetails**
> Orders gETOrderDetails(orderId, ibxs)

Retrieve an order

This method retrieves an order by its ID for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.auth.*;
import com.equinix.sdk.ordersv2.models.*;
import com.equinix.sdk.ordersv2.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "orderId_example"; // String | Identifier of the Order
    List<String> ibxs = Arrays.asList(); // List<String> | List of IBXs to be filtered
    try {
      Orders result = apiInstance.gETOrderDetails(orderId, ibxs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#gETOrderDetails");
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
| **orderId** | **String**| Identifier of the Order | |
| **ibxs** | [**List&lt;String&gt;**](String.md)| List of IBXs to be filtered | [optional] |

### Return type

[**Orders**](Orders.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not allowed |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

<a id="replyToAnOrderNegotiation"></a>
# **replyToAnOrderNegotiation**
> replyToAnOrderNegotiation(orderId, negotiationsRequest)

Reply to an order negotiation

This method approves or rejects an order negotiation for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.auth.*;
import com.equinix.sdk.ordersv2.models.*;
import com.equinix.sdk.ordersv2.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "{orderId}"; // String | Identifier of the order
    NegotiationsRequest negotiationsRequest = new NegotiationsRequest(); // NegotiationsRequest | The action to be taken for an order negotiation
    try {
      apiInstance.replyToAnOrderNegotiation(orderId, negotiationsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#replyToAnOrderNegotiation");
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
| **orderId** | **String**| Identifier of the order | |
| **negotiationsRequest** | [**NegotiationsRequest**](NegotiationsRequest.md)| The action to be taken for an order negotiation | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **204** | No content |  * Location - Location of an order \&quot;/orders/1-23232322\&quot; <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveOrderNegotiations"></a>
# **retrieveOrderNegotiations**
> List&lt;Negotiations&gt; retrieveOrderNegotiations(orderId)

Retrieve order negotiations

This method retrieves order negotiations by its ID for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.ordersv2.ApiClient;
import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.Configuration;
import com.equinix.sdk.ordersv2.auth.*;
import com.equinix.sdk.ordersv2.models.*;
import com.equinix.sdk.ordersv2.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "{orderId}"; // String | Identifier of the order
    try {
      List<Negotiations> result = apiInstance.retrieveOrderNegotiations(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#retrieveOrderNegotiations");
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
| **orderId** | **String**| Identifier of the order | |

### Return type

[**List&lt;Negotiations&gt;**](Negotiations.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of negotiations messages |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

