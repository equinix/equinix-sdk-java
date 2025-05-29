# PricesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchPrices**](PricesApi.md#searchPrices) | **POST** /fabric/v4/prices/search | Get Prices |


<a id="searchPrices"></a>
# **searchPrices**
> PriceSearchResponse searchPrices(filterBody)

Get Prices

Search prices by search criteria

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PricesApi apiInstance = new PricesApi(defaultClient);
    FilterBody filterBody = new FilterBody(); // FilterBody | 
    try {
      PriceSearchResponse result = apiInstance.searchPrices(filterBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#searchPrices");
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
| **filterBody** | [**FilterBody**](FilterBody.md)|  | |

### Return type

[**PriceSearchResponse**](PriceSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal server error |  -  |

