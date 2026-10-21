# CrossConnectsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderCrossConnects**](CrossConnectsApi.md#orderCrossConnects) | **POST** /colocations/v2/orders/crossConnects | Order cross connects |
| [**placeCrossConnectDeinstallationOrder**](CrossConnectsApi.md#placeCrossConnectDeinstallationOrder) | **POST** /colocations/v2/orders/crossConnects/deinstall | Place cross connect deinstallation order |
| [**updateACrossConnectOrder**](CrossConnectsApi.md#updateACrossConnectOrder) | **PATCH** /colocations/v2/orders/crossConnects/{orderId} | Update a cross connects order |


<a id="orderCrossConnects"></a>
# **orderCrossConnects**
> orderCrossConnects(layer1Create)

Order cross connects

This method creates an order for single or multiple standard cross connects at locations where a user has cross connects ordering permission.

### Example
```java
// Import classes:
import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.auth.*;
import com.equinix.sdk.crossconnectsv2.models.*;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    Layer1Create layer1Create = new Layer1Create(); // Layer1Create | 
    try {
      apiInstance.orderCrossConnects(layer1Create);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#orderCrossConnects");
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
| **layer1Create** | [**Layer1Create**](Layer1Create.md)|  | [optional] |

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
| **201** | Layer 1 Created |  * Location - Location on newly created deinstall request <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="placeCrossConnectDeinstallationOrder"></a>
# **placeCrossConnectDeinstallationOrder**
> placeCrossConnectDeinstallationOrder(layer1DeinstallRequest)

Place cross connect deinstallation order

This API allows user to initiate a cross connect deinstallation request. Cross connect asset will be removed according to order placed.

### Example
```java
// Import classes:
import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.auth.*;
import com.equinix.sdk.crossconnectsv2.models.*;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    Layer1DeinstallRequest layer1DeinstallRequest = new Layer1DeinstallRequest(); // Layer1DeinstallRequest | 
    try {
      apiInstance.placeCrossConnectDeinstallationOrder(layer1DeinstallRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#placeCrossConnectDeinstallationOrder");
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
| **layer1DeinstallRequest** | [**Layer1DeinstallRequest**](Layer1DeinstallRequest.md)|  | [optional] |

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
| **201** | Layer 1 deinstall requested |  * Location - Location on newly created deinstall request <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateACrossConnectOrder"></a>
# **updateACrossConnectOrder**
> updateACrossConnectOrder(orderId, modifyRequest)

Update a cross connects order

This method updates a cross connects order by its ID for a user with permission to view this request.

### Example
```java
// Import classes:
import com.equinix.sdk.crossconnectsv2.ApiClient;
import com.equinix.sdk.crossconnectsv2.ApiException;
import com.equinix.sdk.crossconnectsv2.Configuration;
import com.equinix.sdk.crossconnectsv2.auth.*;
import com.equinix.sdk.crossconnectsv2.models.*;
import com.equinix.sdk.crossconnectsv2.api.CrossConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CrossConnectsApi apiInstance = new CrossConnectsApi(defaultClient);
    String orderId = "orderId_example"; // String | Identifier of the cross connect order
    ModifyRequest modifyRequest = new ModifyRequest(); // ModifyRequest | The cross connect to be updated
    try {
      apiInstance.updateACrossConnectOrder(orderId, modifyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossConnectsApi#updateACrossConnectOrder");
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
| **orderId** | **String**| Identifier of the cross connect order | |
| **modifyRequest** | [**ModifyRequest**](ModifyRequest.md)| The cross connect to be updated | |

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
| **202** | Accepted |  * Location - Location on newly created deinstall request <br>  |
| **204** | No content |  * Location - Location on newly created deinstall request <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

