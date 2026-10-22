# OrdersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /securecabinet/v1/orders | Order a new Secure Cabinet deployment |


<a id="createOrder"></a>
# **createOrder**
> OrderCreateResponse createOrder(orderCreateRequest, idempotencyKey)

Order a new Secure Cabinet deployment

Order a new Secure Cabinet deployment and recommended additional products at IBX data centers worldwide. 

### Example
```java
// Import classes:
import com.equinix.sdk.securecabinetv1.ApiClient;
import com.equinix.sdk.securecabinetv1.ApiException;
import com.equinix.sdk.securecabinetv1.Configuration;
import com.equinix.sdk.securecabinetv1.auth.*;
import com.equinix.sdk.securecabinetv1.models.*;
import com.equinix.sdk.securecabinetv1.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrderCreateRequest orderCreateRequest = new OrderCreateRequest(); // OrderCreateRequest | 
    String idempotencyKey = "idempotencyKey_example"; // String | Optional, caller-provided unique token that makes order creation idempotent. When supplied, retrying the same request with the same key returns the original order result instead of creating a duplicate order. Reusing the same key with a materially different request payload results in a 409 Conflict response. 
    try {
      OrderCreateResponse result = apiInstance.createOrder(orderCreateRequest, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
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
| **orderCreateRequest** | [**OrderCreateRequest**](OrderCreateRequest.md)|  | |
| **idempotencyKey** | **String**| Optional, caller-provided unique token that makes order creation idempotent. When supplied, retrying the same request with the same key returns the original order result instead of creating a duplicate order. Reusing the same key with a materially different request payload results in a 409 Conflict response.  | [optional] |

### Return type

[**OrderCreateResponse**](OrderCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Generated Order Number |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | The supplied Idempotency-Key was already used with a materially different request payload.  |  -  |
| **422** | Input validation error |  -  |
| **500** | Internal server error |  -  |

