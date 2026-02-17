# MetricsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetricByAssetId**](MetricsApi.md#getMetricByAssetId) | **GET** /fabric/v4/{asset}/{assetId}/metrics | Get Metrics by Asset Id |
| [**getMetricByName**](MetricsApi.md#getMetricByName) | **GET** /fabric/v4/metrics | Get Metrics by Name |
| [**searchMetrics**](MetricsApi.md#searchMetrics) | **POST** /fabric/v4/metrics/search | Search Metrics |


<a id="getMetricByAssetId"></a>
# **getMetricByAssetId**
> GetMetricsByAssetResponse getMetricByAssetId(asset, assetId, name, fromDateTime, toDateTime, offset, limit)

Get Metrics by Asset Id

This API provides capability to retrieve Metrics of an asset id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricAssetType asset = MetricAssetType.fromValue("ports"); // MetricAssetType | asset
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    String name = "equinix.fabric.connection.bandwidth_rx.usage"; // String | Name of the metric types:  - `equinix.fabric.connection.bandwidth_rx.usage` - `equinix.fabric.connection.bandwidth_tx.usage` - `equinix.fabric.connection.packets_dropped_rx_aside_rateexceeded.count` - `equinix.fabric.connection.packets_dropped_tx_aside_rateexceeded.count` - `equinix.fabric.connection.packets_dropped_rx_zside_rateexceeded.count` - `equinix.fabric.connection.packets_dropped_tx_zside_rateexceeded.count` - `equinix.fabric.port.bandwidth_rx.usage` - `equinix.fabric.port.bandwidth_tx.usage` - `equinix.fabric.port.packets_dropped_rx.count` - `equinix.fabric.port.packets_dropped_tx.count` - `equinix.fabric.port.packets_erred_rx.count` - `equinix.fabric.port.packets_erred_tx.count` - `equinix.fabric.metro.{SOURCE_METRO_CODE}_{DESTINATION_METRO_CODE}.latency` - `equinix.fabric.metro.{SOURCE_METRO_CODE}_{DESTINATION_METRO_CODE}.jitter_avg` 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date and time
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | End date and time
    Integer offset = 0; // Integer | offset
    Integer limit = 20; // Integer | limit
    try {
      GetMetricsByAssetResponse result = apiInstance.getMetricByAssetId(asset, assetId, name, fromDateTime, toDateTime, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricByAssetId");
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
| **asset** | [**MetricAssetType**](.md)| asset | [enum: ports, connections, metros] |
| **assetId** | **UUID**| asset UUID | |
| **name** | **String**| Name of the metric types:  - &#x60;equinix.fabric.connection.bandwidth_rx.usage&#x60; - &#x60;equinix.fabric.connection.bandwidth_tx.usage&#x60; - &#x60;equinix.fabric.connection.packets_dropped_rx_aside_rateexceeded.count&#x60; - &#x60;equinix.fabric.connection.packets_dropped_tx_aside_rateexceeded.count&#x60; - &#x60;equinix.fabric.connection.packets_dropped_rx_zside_rateexceeded.count&#x60; - &#x60;equinix.fabric.connection.packets_dropped_tx_zside_rateexceeded.count&#x60; - &#x60;equinix.fabric.port.bandwidth_rx.usage&#x60; - &#x60;equinix.fabric.port.bandwidth_tx.usage&#x60; - &#x60;equinix.fabric.port.packets_dropped_rx.count&#x60; - &#x60;equinix.fabric.port.packets_dropped_tx.count&#x60; - &#x60;equinix.fabric.port.packets_erred_rx.count&#x60; - &#x60;equinix.fabric.port.packets_erred_tx.count&#x60; - &#x60;equinix.fabric.metro.{SOURCE_METRO_CODE}_{DESTINATION_METRO_CODE}.latency&#x60; - &#x60;equinix.fabric.metro.{SOURCE_METRO_CODE}_{DESTINATION_METRO_CODE}.jitter_avg&#x60;  | |
| **fromDateTime** | **OffsetDateTime**| Start date and time | [optional] |
| **toDateTime** | **OffsetDateTime**| End date and time | [optional] |
| **offset** | **Integer**| offset | [optional] [default to 0] |
| **limit** | **Integer**| limit | [optional] [default to 20] |

### Return type

[**GetMetricsByAssetResponse**](GetMetricsByAssetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getMetricByName"></a>
# **getMetricByName**
> GetMetricsByNameResponse getMetricByName(name, value, offset, limit)

Get Metrics by Name

This API provides capability to retrieve Metrics by specific wildcard metric types

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String name = "equinix.fabric.metro.*.latency"; // String | Name of the metric types with wildcard:  - `equinix.fabric.metro.*.latency` - `equinix.fabric.metro.*.jitter_avg` 
    String value = "value_example"; // String | value
    Integer offset = 0; // Integer | offset
    Integer limit = 20; // Integer | limit
    try {
      GetMetricsByNameResponse result = apiInstance.getMetricByName(name, value, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricByName");
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
| **name** | **String**| Name of the metric types with wildcard:  - &#x60;equinix.fabric.metro.*.latency&#x60; - &#x60;equinix.fabric.metro.*.jitter_avg&#x60;  | |
| **value** | **String**| value | |
| **offset** | **Integer**| offset | [optional] [default to 0] |
| **limit** | **Integer**| limit | [optional] [default to 20] |

### Return type

[**GetMetricsByNameResponse**](GetMetricsByNameResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="searchMetrics"></a>
# **searchMetrics**
> GetMetricsByAssetResponse searchMetrics(metricsSearchRequest)

Search Metrics

This API provides capability to search metrics from a filtered query

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricsSearchRequest metricsSearchRequest = new MetricsSearchRequest(); // MetricsSearchRequest | 
    try {
      GetMetricsByAssetResponse result = apiInstance.searchMetrics(metricsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#searchMetrics");
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
| **metricsSearchRequest** | [**MetricsSearchRequest**](MetricsSearchRequest.md)|  | |

### Return type

[**GetMetricsByAssetResponse**](GetMetricsByAssetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

