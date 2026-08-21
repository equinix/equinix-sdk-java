# IpBlocksApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteIpBlockById**](IpBlocksApi.md#deleteIpBlockById) | **DELETE** /fabric/v4/ipBlocks/{uuid} | Delete IP Block by UUID |
| [**getIpBlock**](IpBlocksApi.md#getIpBlock) | **GET** /fabric/v4/ipBlocks/{uuid} | Retrieve IP Block by UUID |
| [**patchIpBlockById**](IpBlocksApi.md#patchIpBlockById) | **PATCH** /fabric/v4/ipBlocks/{uuid} | patch IP Block by UUID |
| [**searchIpBlocks**](IpBlocksApi.md#searchIpBlocks) | **POST** /fabric/v4/ipBlocks/search | Search for IP Blocks |
| [**submitIpBlock**](IpBlocksApi.md#submitIpBlock) | **POST** /fabric/v4/ipBlocks | Submits new Equinix owned or customer owned IP Block request |


<a id="deleteIpBlockById"></a>
# **deleteIpBlockById**
> IpBlock deleteIpBlockById(uuid)

Delete IP Block by UUID

Delete IP Block by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the IP Block
    try {
      IpBlock result = apiInstance.deleteIpBlockById(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#deleteIpBlockById");
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
| **uuid** | **UUID**| UUID of the IP Block | |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | IP Block submitted, patched, or deletion accepted |  -  |
| **400** | Invalid input parameter |  -  |
| **403** | Forbidden |  -  |
| **404** | IP Block not found |  -  |
| **409** | IP Block cannot be deleted due to active products |  -  |
| **500** | Internal server error |  -  |

<a id="getIpBlock"></a>
# **getIpBlock**
> IpBlock getIpBlock(uuid)

Retrieve IP Block by UUID

Retrieve IP Block by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the IP Block
    try {
      IpBlock result = apiInstance.getIpBlock(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#getIpBlock");
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
| **uuid** | **UUID**| UUID of the IP Block | |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | IP Block retrieved successfully |  -  |
| **403** | Forbidden |  -  |
| **404** | IP Block not found |  -  |
| **500** | Internal server error |  -  |

<a id="patchIpBlockById"></a>
# **patchIpBlockById**
> IpBlock patchIpBlockById(uuid, patchIpBlockRequestBodyItem)

patch IP Block by UUID

patch IP Block by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | UUID of the IP Block
    List<PatchIpBlockRequestBodyItem> patchIpBlockRequestBodyItem = Arrays.asList(); // List<PatchIpBlockRequestBodyItem> | 
    try {
      IpBlock result = apiInstance.patchIpBlockById(uuid, patchIpBlockRequestBodyItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#patchIpBlockById");
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
| **uuid** | **UUID**| UUID of the IP Block | |
| **patchIpBlockRequestBodyItem** | [**List&lt;PatchIpBlockRequestBodyItem&gt;**](PatchIpBlockRequestBodyItem.md)|  | |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | IP Block submitted, patched, or deletion accepted |  -  |
| **404** | IP Block not found |  -  |
| **500** | Internal server error |  -  |

<a id="searchIpBlocks"></a>
# **searchIpBlocks**
> IpBlockSearchResponseBody searchIpBlocks(ipBlocksSearchRequestBody)

Search for IP Blocks

Search for IP Blocks based on criteria

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    IpBlocksSearchRequestBody ipBlocksSearchRequestBody = new IpBlocksSearchRequestBody(); // IpBlocksSearchRequestBody | 
    try {
      IpBlockSearchResponseBody result = apiInstance.searchIpBlocks(ipBlocksSearchRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#searchIpBlocks");
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
| **ipBlocksSearchRequestBody** | [**IpBlocksSearchRequestBody**](IpBlocksSearchRequestBody.md)|  | |

### Return type

[**IpBlockSearchResponseBody**](IpBlockSearchResponseBody.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | IP Blocks found successfully |  -  |
| **400** | Invalid input parameter |  -  |
| **500** | Internal server error |  -  |

<a id="submitIpBlock"></a>
# **submitIpBlock**
> IpBlock submitIpBlock(submitIpBlockRequestBody)

Submits new Equinix owned or customer owned IP Block request

Submits new Equinix owned or customer owned IP Block request

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    SubmitIpBlockRequestBody submitIpBlockRequestBody = new SubmitIpBlockRequestBody(); // SubmitIpBlockRequestBody | 
    try {
      IpBlock result = apiInstance.submitIpBlock(submitIpBlockRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#submitIpBlock");
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
| **submitIpBlockRequestBody** | [**SubmitIpBlockRequestBody**](SubmitIpBlockRequestBody.md)|  | |

### Return type

[**IpBlock**](IpBlock.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | IP Block submitted, patched, or deletion accepted |  -  |
| **400** | Invalid input parameter |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

