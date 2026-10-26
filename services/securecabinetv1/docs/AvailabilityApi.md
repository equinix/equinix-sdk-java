# AvailabilityApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProductsAvailability**](AvailabilityApi.md#getProductsAvailability) | **GET** /securecabinet/v1/availability/{accountNumber} | Secure Cabinet availability. |


<a id="getProductsAvailability"></a>
# **getProductsAvailability**
> List&lt;ProductsAvailability&gt; getProductsAvailability(accountNumber)

Secure Cabinet availability.

Returns the availability of Secure Cabinets and recommended additional products for provided billing account. 

### Example
```java
// Import classes:
import com.equinix.sdk.securecabinetv1.ApiClient;
import com.equinix.sdk.securecabinetv1.ApiException;
import com.equinix.sdk.securecabinetv1.Configuration;
import com.equinix.sdk.securecabinetv1.auth.*;
import com.equinix.sdk.securecabinetv1.models.*;
import com.equinix.sdk.securecabinetv1.api.AvailabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
    String accountNumber = "accountNumber_example"; // String | Billing Account Number.
    try {
      List<ProductsAvailability> result = apiInstance.getProductsAvailability(accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#getProductsAvailability");
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
| **accountNumber** | **String**| Billing Account Number. | |

### Return type

[**List&lt;ProductsAvailability&gt;**](ProductsAvailability.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Products availability details. |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

