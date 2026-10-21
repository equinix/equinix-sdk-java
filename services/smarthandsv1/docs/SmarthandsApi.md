# SmarthandsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocation**](SmarthandsApi.md#getLocation) | **GET** /v1/orders/smarthands/locations | Get locations(ibx, cage) details for placing smart hands based on smart hands permission for user |
| [**handleSmartHandCableRequestOrder**](SmarthandsApi.md#handleSmartHandCableRequestOrder) | **POST** /v1/orders/smarthands/cableRequest | This API is used to request cables per your specifications for your equipment. |
| [**handleSmartHandCageCleanupOrder**](SmarthandsApi.md#handleSmartHandCageCleanupOrder) | **POST** /v1/orders/smarthands/cageCleanup | Request trash removal or cage cleanup |
| [**handleSmartHandCageEscortOrder**](SmarthandsApi.md#handleSmartHandCageEscortOrder) | **POST** /v1/orders/smarthands/cageEscort | Request a patch cable to be moved between devices |
| [**handleSmartHandLocatePackageOrder**](SmarthandsApi.md#handleSmartHandLocatePackageOrder) | **POST** /v1/orders/smarthands/locatePackage | Get the location of your package(s) at an IBX. |
| [**handleSmartHandMoveJumperCableOrder**](SmarthandsApi.md#handleSmartHandMoveJumperCableOrder) | **POST** /v1/orders/smarthands/moveJumperCable | This API is used to request a patch cable to be moved between devices. |
| [**handleSmartHandOrder**](SmarthandsApi.md#handleSmartHandOrder) | **POST** /v1/orders/smarthands/equipmentInstall | Request equipment installation per your specifications by an IBX Technician |
| [**handleSmartHandOthersOrder**](SmarthandsApi.md#handleSmartHandOthersOrder) | **POST** /v1/orders/smarthands/other | Request a Smart Hands order not listed in catalogue |
| [**handleSmartHandPatchCableInstallOrder**](SmarthandsApi.md#handleSmartHandPatchCableInstallOrder) | **POST** /v1/orders/smarthands/patchCableInstall | Request installation of a cross connect patch cable by an IBX Technician. |
| [**handleSmartHandPatchCableRemovalOrder**](SmarthandsApi.md#handleSmartHandPatchCableRemovalOrder) | **POST** /v1/orders/smarthands/patchCableRemoval | Request removal of a cross connect cable by an IBX Technician. |
| [**handleSmartHandPicturesDocumentOrder**](SmarthandsApi.md#handleSmartHandPicturesDocumentOrder) | **POST** /v1/orders/smarthands/picturesDocument | Request an IBX Technician to provide cage-related pictures or documentation. |
| [**handleSmartHandRunJumperCableOrder**](SmarthandsApi.md#handleSmartHandRunJumperCableOrder) | **POST** /v1/orders/smarthands/runJumperCable | This API is used to request a jumper cable to be ran between devices. |
| [**handleSmartHandShipmentUnpackOrder**](SmarthandsApi.md#handleSmartHandShipmentUnpackOrder) | **POST** /v1/orders/smarthands/shipmentUnpack | Request inbound shipment unpacking and packaging disposal. |
| [**smartHandTypes**](SmarthandsApi.md#smartHandTypes) | **GET** /v1/orders/smarthands/types | All supported smart hands types API. |


<a id="getLocation"></a>
# **getLocation**
> GetLocation200Response getLocation(authorization, detail, ibxs, cages)

Get locations(ibx, cage) details for placing smart hands based on smart hands permission for user

Get locations(ibx, cage) details for placing smart hands based on smart hands permission for user

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    Boolean detail = false; // Boolean | When enable this flag returns detailed permission with Cage & Cabinets.
    String ibxs = "ibxs_example"; // String | Example: AM1,AM2
    String cages = "cages_example"; // String | Example: AM1:02:002MC1
    try {
      GetLocation200Response result = apiInstance.getLocation(authorization, detail, ibxs, cages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#getLocation");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **detail** | **Boolean**| When enable this flag returns detailed permission with Cage &amp; Cabinets. | [optional] [default to false] |
| **ibxs** | **String**| Example: AM1,AM2 | [optional] |
| **cages** | **String**| Example: AM1:02:002MC1 | [optional] |

### Return type

[**GetLocation200Response**](GetLocation200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return list of Ibx, Cage, Cabinets where user has access |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandCableRequestOrder"></a>
# **handleSmartHandCableRequestOrder**
> handleSmartHandCableRequestOrder(authorization, body)

This API is used to request cables per your specifications for your equipment.

This API is used to request cables per your specifications for your equipment.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    CableRequestRequest body = new CableRequestRequest(); // CableRequestRequest | 
    try {
      apiInstance.handleSmartHandCableRequestOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandCableRequestOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**CableRequestRequest**](CableRequestRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandCageCleanupOrder"></a>
# **handleSmartHandCageCleanupOrder**
> handleSmartHandCageCleanupOrder(authorization, body)

Request trash removal or cage cleanup

This API is used to request trash removal or cage cleanup

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    CageCleanupRequest body = new CageCleanupRequest(); // CageCleanupRequest | 
    try {
      apiInstance.handleSmartHandCageCleanupOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandCageCleanupOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**CageCleanupRequest**](CageCleanupRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandCageEscortOrder"></a>
# **handleSmartHandCageEscortOrder**
> handleSmartHandCageEscortOrder(authorization, body)

Request a patch cable to be moved between devices

This API is used to request a patch cable to be moved between devices

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    CageEscortRequest body = new CageEscortRequest(); // CageEscortRequest | 
    try {
      apiInstance.handleSmartHandCageEscortOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandCageEscortOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**CageEscortRequest**](CageEscortRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandLocatePackageOrder"></a>
# **handleSmartHandLocatePackageOrder**
> handleSmartHandLocatePackageOrder(authorization, body)

Get the location of your package(s) at an IBX.

This API is used to get the location of your package(s) at an IBX.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    LocatePackageRequest body = new LocatePackageRequest(); // LocatePackageRequest | 
    try {
      apiInstance.handleSmartHandLocatePackageOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandLocatePackageOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**LocatePackageRequest**](LocatePackageRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandMoveJumperCableOrder"></a>
# **handleSmartHandMoveJumperCableOrder**
> handleSmartHandMoveJumperCableOrder(authorization, body)

This API is used to request a patch cable to be moved between devices.

This API is used to request a patch cable to be moved between devices.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    MoveJumperCableRequest body = new MoveJumperCableRequest(); // MoveJumperCableRequest | 
    try {
      apiInstance.handleSmartHandMoveJumperCableOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandMoveJumperCableOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**MoveJumperCableRequest**](MoveJumperCableRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandOrder"></a>
# **handleSmartHandOrder**
> handleSmartHandOrder(authorization, body)

Request equipment installation per your specifications by an IBX Technician

Request equipment installation per your specifications by an IBX Technician

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    EquipmentInstallRequest body = new EquipmentInstallRequest(); // EquipmentInstallRequest | 
    try {
      apiInstance.handleSmartHandOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**EquipmentInstallRequest**](EquipmentInstallRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandOthersOrder"></a>
# **handleSmartHandOthersOrder**
> handleSmartHandOthersOrder(authorization, body)

Request a Smart Hands order not listed in catalogue

This API is used to request a Smart Hands order not listed in catalogue

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    OtherRequest body = new OtherRequest(); // OtherRequest | 
    try {
      apiInstance.handleSmartHandOthersOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandOthersOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**OtherRequest**](OtherRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandPatchCableInstallOrder"></a>
# **handleSmartHandPatchCableInstallOrder**
> handleSmartHandPatchCableInstallOrder(authorization, body)

Request installation of a cross connect patch cable by an IBX Technician.

Request installation of a cross connect patch cable by an IBX Technician.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    PatchCableInstallRequest body = new PatchCableInstallRequest(); // PatchCableInstallRequest | 
    try {
      apiInstance.handleSmartHandPatchCableInstallOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandPatchCableInstallOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**PatchCableInstallRequest**](PatchCableInstallRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandPatchCableRemovalOrder"></a>
# **handleSmartHandPatchCableRemovalOrder**
> handleSmartHandPatchCableRemovalOrder(authorization, body)

Request removal of a cross connect cable by an IBX Technician.

Request removal of a cross connect cable by an IBX Technician.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    PatchCableRemovalRequest body = new PatchCableRemovalRequest(); // PatchCableRemovalRequest | 
    try {
      apiInstance.handleSmartHandPatchCableRemovalOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandPatchCableRemovalOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**PatchCableRemovalRequest**](PatchCableRemovalRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandPicturesDocumentOrder"></a>
# **handleSmartHandPicturesDocumentOrder**
> handleSmartHandPicturesDocumentOrder(authorization, body)

Request an IBX Technician to provide cage-related pictures or documentation.

Request an IBX Technician to provide cage-related pictures or documentation.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    PicturesDocumentRequest body = new PicturesDocumentRequest(); // PicturesDocumentRequest | 
    try {
      apiInstance.handleSmartHandPicturesDocumentOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandPicturesDocumentOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**PicturesDocumentRequest**](PicturesDocumentRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandRunJumperCableOrder"></a>
# **handleSmartHandRunJumperCableOrder**
> handleSmartHandRunJumperCableOrder(authorization, body)

This API is used to request a jumper cable to be ran between devices.

This API is used to request a jumper cable to be ran between devices.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    RunJumperCableRequest body = new RunJumperCableRequest(); // RunJumperCableRequest | 
    try {
      apiInstance.handleSmartHandRunJumperCableOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandRunJumperCableOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**RunJumperCableRequest**](RunJumperCableRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="handleSmartHandShipmentUnpackOrder"></a>
# **handleSmartHandShipmentUnpackOrder**
> handleSmartHandShipmentUnpackOrder(authorization, body)

Request inbound shipment unpacking and packaging disposal.

This API is used to request inbound shipment unpacking and packaging disposal.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    ShipmentUnpackRequest body = new ShipmentUnpackRequest(); // ShipmentUnpackRequest | 
    try {
      apiInstance.handleSmartHandShipmentUnpackOrder(authorization, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#handleSmartHandShipmentUnpackOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**ShipmentUnpackRequest**](ShipmentUnpackRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="smartHandTypes"></a>
# **smartHandTypes**
> SmartHandTypes200Response smartHandTypes(authorization)

All supported smart hands types API.

Smart Hands Types API provides all types of supported smart hands.

### Example
```java
// Import classes:
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.ApiException;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.models.*;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    SmarthandsApi apiInstance = new SmarthandsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    try {
      SmartHandTypes200Response result = apiInstance.smartHandTypes(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmarthandsApi#smartHandTypes");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |

### Return type

[**SmartHandTypes200Response**](SmartHandTypes200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

