# LookupApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationsByPermissionCode**](LookupApi.md#getLocationsByPermissionCode) | **GET** /colocations/v2/locations | Get Locations by permission code |
| [**retrieveAllPatchPanels**](LookupApi.md#retrieveAllPatchPanels) | **GET** /colocations/v2/patchPanels | Retrieve all patch panels |
| [**retrieveListOfConnectionServices**](LookupApi.md#retrieveListOfConnectionServices) | **GET** /colocations/v2/connectionServices | Retrieve list of connection services |
| [**retrieveListOfProviders**](LookupApi.md#retrieveListOfProviders) | **GET** /colocations/v2/providers | Retrieve list of providers |
| [**retrievePatchPanelDetails**](LookupApi.md#retrievePatchPanelDetails) | **GET** /colocations/v2/patchPanels/{patchPanelId} | Retrieve patch panel details |


<a id="getLocationsByPermissionCode"></a>
# **getLocationsByPermissionCode**
> LocationsDetailsResponse getLocationsByPermissionCode(permissionCode, ibxs, providerAccountNumber, aSideIbx, connectionService, details)

Get Locations by permission code

This method retrieves all the user’s IBX locations, accounts, cages and cabinets information according to their ordering permission. This includes A-side and Z-side location information for a cross connect order.

### Example
```java
// Import classes:
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.auth.*;
import com.equinix.sdk.lookupv2.models.*;
import com.equinix.sdk.lookupv2.api.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String permissionCode = "CROSS_CONNECT"; // String | List of Permission code to be filtered
    List<String> ibxs = Arrays.asList(); // List<String> | List of IBXs to be filtered
    String providerAccountNumber = "providerAccountNumber_example"; // String | The service provider's account number (Z-side) linked to their cage. Mandatory when used together with `aSideIbx`. This is only applicable when permissionCode is `CROSS_CONNECT`
    String aSideIbx = "aSideIbx_example"; // String | A-Side IBX details to fetch the (Z-side). This is only applicable when permissionCode is `CROSS_CONNECT`
    String connectionService = "connectionService_example"; // String | Type of connection service to fetch the Z-side details. This is only applicable when permissionCode is `CROSS_CONNECT` and is required when searching for zSide details.
    Boolean details = false; // Boolean | When `true`, API response returns cage, cabinet and account details
    try {
      LocationsDetailsResponse result = apiInstance.getLocationsByPermissionCode(permissionCode, ibxs, providerAccountNumber, aSideIbx, connectionService, details);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#getLocationsByPermissionCode");
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
| **permissionCode** | **String**| List of Permission code to be filtered | [enum: CROSS_CONNECT, WORK_VISIT, SHIPMENTS] |
| **ibxs** | [**List&lt;String&gt;**](String.md)| List of IBXs to be filtered | [optional] |
| **providerAccountNumber** | **String**| The service provider&#39;s account number (Z-side) linked to their cage. Mandatory when used together with &#x60;aSideIbx&#x60;. This is only applicable when permissionCode is &#x60;CROSS_CONNECT&#x60; | [optional] |
| **aSideIbx** | **String**| A-Side IBX details to fetch the (Z-side). This is only applicable when permissionCode is &#x60;CROSS_CONNECT&#x60; | [optional] |
| **connectionService** | **String**| Type of connection service to fetch the Z-side details. This is only applicable when permissionCode is &#x60;CROSS_CONNECT&#x60; and is required when searching for zSide details. | [optional] |
| **details** | **Boolean**| When &#x60;true&#x60;, API response returns cage, cabinet and account details | [optional] [default to false] |

### Return type

[**LocationsDetailsResponse**](LocationsDetailsResponse.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveAllPatchPanels"></a>
# **retrieveAllPatchPanels**
> List&lt;PatchPanelResponse&gt; retrieveAllPatchPanels(cabinetId, providerAccountNumber, aSideIbx, accountNumber)

Retrieve all patch panels

This method retrieves all available patch panels associated with a cabinet for a user with cross connects ordering permission.

### Example
```java
// Import classes:
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.auth.*;
import com.equinix.sdk.lookupv2.models.*;
import com.equinix.sdk.lookupv2.api.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String cabinetId = "cabinetId_example"; // String | ID of the cabinet
    String providerAccountNumber = "providerAccountNumber_example"; // String | The service provider's account number (Z-side) linked to their cage. Mandatory when used together with `aSideIbx`
    String aSideIbx = "aSideIbx_example"; // String | The IBX location code for A-Side. When used together with `providerAccountNumber`, this returns Z-side patch panel details.
    String accountNumber = "accountNumber_example"; // String | Account number is only required when cabinet is shared.
    try {
      List<PatchPanelResponse> result = apiInstance.retrieveAllPatchPanels(cabinetId, providerAccountNumber, aSideIbx, accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#retrieveAllPatchPanels");
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
| **cabinetId** | **String**| ID of the cabinet | |
| **providerAccountNumber** | **String**| The service provider&#39;s account number (Z-side) linked to their cage. Mandatory when used together with &#x60;aSideIbx&#x60; | [optional] |
| **aSideIbx** | **String**| The IBX location code for A-Side. When used together with &#x60;providerAccountNumber&#x60;, this returns Z-side patch panel details. | [optional] |
| **accountNumber** | **String**| Account number is only required when cabinet is shared. | [optional] |

### Return type

[**List&lt;PatchPanelResponse&gt;**](PatchPanelResponse.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveListOfConnectionServices"></a>
# **retrieveListOfConnectionServices**
> List&lt;ConnectionServicesDetailsInner&gt; retrieveListOfConnectionServices(ibx)

Retrieve list of connection services

This method retrieves a list of supported connection services such as media types, protocol types, connector types and circuit counts.

### Example
```java
// Import classes:
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.auth.*;
import com.equinix.sdk.lookupv2.models.*;
import com.equinix.sdk.lookupv2.api.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String ibx = "ibx_example"; // String | IBX
    try {
      List<ConnectionServicesDetailsInner> result = apiInstance.retrieveListOfConnectionServices(ibx);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#retrieveListOfConnectionServices");
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
| **ibx** | **String**| IBX | |

### Return type

[**List&lt;ConnectionServicesDetailsInner&gt;**](ConnectionServicesDetailsInner.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrieveListOfProviders"></a>
# **retrieveListOfProviders**
> List&lt;Provider&gt; retrieveListOfProviders(cageId, accountNumber)

Retrieve list of providers

This method retrieves all available cross connect service providers to a user with cross connects ordering permission.

### Example
```java
// Import classes:
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.auth.*;
import com.equinix.sdk.lookupv2.models.*;
import com.equinix.sdk.lookupv2.api.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String cageId = "cageId_example"; // String | Cage ID
    String accountNumber = "accountNumber_example"; // String | Account number of A-Side cage
    try {
      List<Provider> result = apiInstance.retrieveListOfProviders(cageId, accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#retrieveListOfProviders");
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
| **cageId** | **String**| Cage ID | |
| **accountNumber** | **String**| Account number of A-Side cage | |

### Return type

[**List&lt;Provider&gt;**](Provider.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrievePatchPanelDetails"></a>
# **retrievePatchPanelDetails**
> PatchPanelDetails retrievePatchPanelDetails(patchPanelId, providerAccountNumber, aSideIbx, accountNumber)

Retrieve patch panel details

This method retrieves details of a patch panel by its ID to a user with cross connects ordering permission.

### Example
```java
// Import classes:
import com.equinix.sdk.lookupv2.ApiClient;
import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.Configuration;
import com.equinix.sdk.lookupv2.auth.*;
import com.equinix.sdk.lookupv2.models.*;
import com.equinix.sdk.lookupv2.api.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String patchPanelId = "patchPanelId_example"; // String | ID of patch panel
    String providerAccountNumber = "providerAccountNumber_example"; // String | The service provider's account number (Z-side) linked to their cage. Mandatory when used together with `aSideIbx`
    String aSideIbx = "aSideIbx_example"; // String | The IBX location code for A-Side. When used together with `providerAccountNumber` and `accountNumber`, this returns Z-side patch panel details.
    String accountNumber = "accountNumber_example"; // String | A-Side cage account number
    try {
      PatchPanelDetails result = apiInstance.retrievePatchPanelDetails(patchPanelId, providerAccountNumber, aSideIbx, accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#retrievePatchPanelDetails");
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
| **patchPanelId** | **String**| ID of patch panel | |
| **providerAccountNumber** | **String**| The service provider&#39;s account number (Z-side) linked to their cage. Mandatory when used together with &#x60;aSideIbx&#x60; | [optional] |
| **aSideIbx** | **String**| The IBX location code for A-Side. When used together with &#x60;providerAccountNumber&#x60; and &#x60;accountNumber&#x60;, this returns Z-side patch panel details. | [optional] |
| **accountNumber** | **String**| A-Side cage account number | [optional] |

### Return type

[**PatchPanelDetails**](PatchPanelDetails.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

