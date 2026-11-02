# AsnsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsn**](AsnsApi.md#createAsn) | **POST** /fabric/v4/asns | Create ASN |
| [**deleteAsnById**](AsnsApi.md#deleteAsnById) | **DELETE** /fabric/v4/asns/{asnId} | Delete ASN |
| [**getAsnById**](AsnsApi.md#getAsnById) | **GET** /fabric/v4/asns/{asnId} | Get ASN |
| [**patchAsnById**](AsnsApi.md#patchAsnById) | **PATCH** /fabric/v4/asns/{asnId} | Update ASN |
| [**searchAsns**](AsnsApi.md#searchAsns) | **POST** /fabric/v4/asns/search | Search ASNs |


<a id="createAsn"></a>
# **createAsn**
> Asn createAsn(createAsnRequest)

Create ASN

Create a new Public or Private ASN record

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.AsnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AsnsApi apiInstance = new AsnsApi(defaultClient);
    CreateAsnRequest createAsnRequest = new CreateAsnRequest(); // CreateAsnRequest | 
    try {
      Asn result = apiInstance.createAsn(createAsnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnsApi#createAsn");
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
| **createAsnRequest** | [**CreateAsnRequest**](CreateAsnRequest.md)|  | |

### Return type

[**Asn**](Asn.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | ASN request accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="deleteAsnById"></a>
# **deleteAsnById**
> Asn deleteAsnById(asnId)

Delete ASN

Deprovision ASN record by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.AsnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AsnsApi apiInstance = new AsnsApi(defaultClient);
    UUID asnId = UUID.randomUUID(); // UUID | UUID of the ASN record
    try {
      Asn result = apiInstance.deleteAsnById(asnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnsApi#deleteAsnById");
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
| **asnId** | **UUID**| UUID of the ASN record | |

### Return type

[**Asn**](Asn.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | ASN request accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAsnById"></a>
# **getAsnById**
> Asn getAsnById(asnId)

Get ASN

Retrieve ASN record by UUID

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.AsnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AsnsApi apiInstance = new AsnsApi(defaultClient);
    UUID asnId = UUID.randomUUID(); // UUID | UUID of the ASN record
    try {
      Asn result = apiInstance.getAsnById(asnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnsApi#getAsnById");
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
| **asnId** | **UUID**| UUID of the ASN record | |

### Return type

[**Asn**](Asn.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ASN retrieved successfully |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="patchAsnById"></a>
# **patchAsnById**
> Asn patchAsnById(asnId, asnPatchOperation)

Update ASN

Update ASN record

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.AsnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AsnsApi apiInstance = new AsnsApi(defaultClient);
    UUID asnId = UUID.randomUUID(); // UUID | UUID of the ASN record
    List<AsnPatchOperation> asnPatchOperation = Arrays.asList(); // List<AsnPatchOperation> | 
    try {
      Asn result = apiInstance.patchAsnById(asnId, asnPatchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnsApi#patchAsnById");
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
| **asnId** | **UUID**| UUID of the ASN record | |
| **asnPatchOperation** | [**List&lt;AsnPatchOperation&gt;**](AsnPatchOperation.md)|  | |

### Return type

[**Asn**](Asn.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | ASN request accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="searchAsns"></a>
# **searchAsns**
> AsnSearchResponseBody searchAsns(asnSearchRequestBody)

Search ASNs

Search for ASN records based on criteria

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.AsnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AsnsApi apiInstance = new AsnsApi(defaultClient);
    AsnSearchRequestBody asnSearchRequestBody = new AsnSearchRequestBody(); // AsnSearchRequestBody | 
    try {
      AsnSearchResponseBody result = apiInstance.searchAsns(asnSearchRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnsApi#searchAsns");
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
| **asnSearchRequestBody** | [**AsnSearchRequestBody**](AsnSearchRequestBody.md)|  | |

### Return type

[**AsnSearchResponseBody**](AsnSearchResponseBody.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ASN records found successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

