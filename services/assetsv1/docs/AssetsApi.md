# AssetsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssetById**](AssetsApi.md#getAssetById) | **GET** /v1/assets/{assetId} | Get details of an asset |
| [**searchAssets**](AssetsApi.md#searchAssets) | **POST** /v1/assets/search | Search permissible assets |


<a id="getAssetById"></a>
# **getAssetById**
> Asset getAssetById(authorization, assetId)

Get details of an asset

The Get assets by Id API returns all details for a specific asset from its identification number. The authorization token and content-type are the only headers that are passed to this API and a response is received based on the values passed.

### Example
```java
// Import classes:
import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.ApiException;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.models.*;
import com.equinix.sdk.assetsv1.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    String assetId = "assetId_example"; // String | {assetId} identification number
    try {
      Asset result = apiInstance.getAssetById(authorization, assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetById");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |
| **assetId** | **String**| {assetId} identification number | |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Assets search response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |
| **503** | System unavaiable |  -  |

<a id="searchAssets"></a>
# **searchAssets**
> AssetsSearchResponse searchAssets(authorization, sorts, source, q, exactMatch, offset, limit, body)

Search permissible assets

The POST assets API returns all assets for a specific asset from search form. The authorization token and content-type are the only headers that are passed to this API and a response is received based on the values passed.

### Example
```java
// Import classes:
import com.equinix.sdk.assetsv1.ApiClient;
import com.equinix.sdk.assetsv1.ApiException;
import com.equinix.sdk.assetsv1.Configuration;
import com.equinix.sdk.assetsv1.models.*;
import com.equinix.sdk.assetsv1.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    List<String> sorts = Arrays.asList(); // List<String> | Sort fields 
    List<String> source = Arrays.asList(); // List<String> | \"q\" parameter will be searched in these fields, by default search will performed on all fields
    String q = "q_example"; // String | To support add a keyword, free text search on source fields. Min 3 character for efficient search results.
    Boolean exactMatch = true; // Boolean | flag determines the q should be Exact match or partial match, By default flag is false
    Integer offset = 56; // Integer | The start index from which the list is created.
    Integer limit = 56; // Integer | Number of entries in response.
    AssetsSearchRequest body = new AssetsSearchRequest(); // AssetsSearchRequest | 
    try {
      AssetsSearchResponse result = apiInstance.searchAssets(authorization, sorts, source, q, exactMatch, offset, limit, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#searchAssets");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |
| **sorts** | [**List&lt;String&gt;**](String.md)| Sort fields  | [optional] [enum: SERIAL_NUMBER, ORDER_NUMBER, PRODUCT_TYPE, PRODUCT_NAME, CAGE, IBX, PRODUCT_DESCRIPTION, ACCOUNT_NUMBER, INSTALLED_DATE, ASSET_NUMBER, -SERIAL_NUMBER, -ORDER_NUMBER, -PRODUCT_TYPE, -PRODUCT_NAME, -CAGE, -IBX, -PRODUCT_DESCRIPTION, -ACCOUNT_NUMBER, -INSTALLED_DATE, -ASSET_NUMBER] |
| **source** | [**List&lt;String&gt;**](String.md)| \&quot;q\&quot; parameter will be searched in these fields, by default search will performed on all fields | [optional] [enum: LEGACY_CAGE, LEGACY_CABINET, LEGACY_PATCH_PANEL, LEGACY_SALES_ORDER, BILLING_AGREEMENT, CAGE, CABINET, PATCH_PANEL, ASSET_NUMBER, CUSTOMER_INTERNAL_REFERENCE, SALES_ORDER_NUMBER, CABLE_ID, CARRIER_CIRCUIT_ID, SERIAL_NUMBER, EXTERNAL_REFERENCE_NUMBER, ACCOUNT_NUMBER] |
| **q** | **String**| To support add a keyword, free text search on source fields. Min 3 character for efficient search results. | [optional] |
| **exactMatch** | **Boolean**| flag determines the q should be Exact match or partial match, By default flag is false | [optional] |
| **offset** | **Integer**| The start index from which the list is created. | [optional] |
| **limit** | **Integer**| Number of entries in response. | [optional] |
| **body** | [**AssetsSearchRequest**](AssetsSearchRequest.md)|  | [optional] |

### Return type

[**AssetsSearchResponse**](AssetsSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Assets search response |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | System unavaiable |  -  |

