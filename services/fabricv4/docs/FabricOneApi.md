# FabricOneApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInterconnect**](FabricOneApi.md#createInterconnect) | **POST** /fabric/v4/interconnects | Create Interconnect |
| [**deleteInterconnectByUuid**](FabricOneApi.md#deleteInterconnectByUuid) | **DELETE** /fabric/v4/interconnects/{interconnectId} | Delete Interconnect By ID |
| [**getInterconnectByUuid**](FabricOneApi.md#getInterconnectByUuid) | **GET** /fabric/v4/interconnects/{interconnectId} | Get Interconnect By ID |
| [**getInterconnectPackages**](FabricOneApi.md#getInterconnectPackages) | **GET** /fabric/v4/interconnectPackages | Get All Interconnect Packages |
| [**searchInterconnects**](FabricOneApi.md#searchInterconnects) | **POST** /fabric/v4/interconnects/search | Search Interconnects |


<a id="createInterconnect"></a>
# **createInterconnect**
> Interconnect createInterconnect(interconnectPostRequest)

Create Interconnect

This API provides capability to create user&#39;s Interconnect &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.FabricOneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FabricOneApi apiInstance = new FabricOneApi(defaultClient);
    InterconnectPostRequest interconnectPostRequest = new InterconnectPostRequest(); // InterconnectPostRequest | 
    try {
      Interconnect result = apiInstance.createInterconnect(interconnectPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FabricOneApi#createInterconnect");
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
| **interconnectPostRequest** | [**InterconnectPostRequest**](InterconnectPostRequest.md)|  | |

### Return type

[**Interconnect**](Interconnect.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Interconnect created successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteInterconnectByUuid"></a>
# **deleteInterconnectByUuid**
> Interconnect deleteInterconnectByUuid(interconnectId)

Delete Interconnect By ID

This API provides capability to delete user&#39;s Interconnect &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.FabricOneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FabricOneApi apiInstance = new FabricOneApi(defaultClient);
    UUID interconnectId = UUID.randomUUID(); // UUID | Interconnect UUID
    try {
      Interconnect result = apiInstance.deleteInterconnectByUuid(interconnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FabricOneApi#deleteInterconnectByUuid");
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
| **interconnectId** | **UUID**| Interconnect UUID | |

### Return type

[**Interconnect**](Interconnect.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Fabric Interconnect object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getInterconnectByUuid"></a>
# **getInterconnectByUuid**
> Interconnect getInterconnectByUuid(interconnectId)

Get Interconnect By ID

This API provides capability to retrieve user&#39;s Interconnect &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.FabricOneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FabricOneApi apiInstance = new FabricOneApi(defaultClient);
    UUID interconnectId = UUID.randomUUID(); // UUID | Interconnect UUID
    try {
      Interconnect result = apiInstance.getInterconnectByUuid(interconnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FabricOneApi#getInterconnectByUuid");
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
| **interconnectId** | **UUID**| Interconnect UUID | |

### Return type

[**Interconnect**](Interconnect.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Interconnect object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getInterconnectPackages"></a>
# **getInterconnectPackages**
> AllInterconnectPackagesResponse getInterconnectPackages(offset, limit)

Get All Interconnect Packages

Get All Interconnect Packages returns details of all available interconnect packages for the specified user credentials. &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.FabricOneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FabricOneApi apiInstance = new FabricOneApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      AllInterconnectPackagesResponse result = apiInstance.getInterconnectPackages(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FabricOneApi#getInterconnectPackages");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**AllInterconnectPackagesResponse**](AllInterconnectPackagesResponse.md)

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
| **415** | Unsupported Media Type |  -  |

<a id="searchInterconnects"></a>
# **searchInterconnects**
> InterconnectSearchResponse searchInterconnects(interconnectSearchRequest)

Search Interconnects

The API provides capability to get list of user&#39;s Interconnects using search criteria, including optional filtering, pagination and sorting &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.FabricOneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FabricOneApi apiInstance = new FabricOneApi(defaultClient);
    InterconnectSearchRequest interconnectSearchRequest = new InterconnectSearchRequest(); // InterconnectSearchRequest | 
    try {
      InterconnectSearchResponse result = apiInstance.searchInterconnects(interconnectSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FabricOneApi#searchInterconnects");
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
| **interconnectSearchRequest** | [**InterconnectSearchRequest**](InterconnectSearchRequest.md)|  | |

### Return type

[**InterconnectSearchResponse**](InterconnectSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Interconnect Search Response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

