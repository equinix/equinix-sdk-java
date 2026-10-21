# AvailabilityAndMetrosApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAgreement**](AvailabilityAndMetrosApi.md#createAgreement) | **POST** /ne/v1/agreements/accounts | Create an agreement |
| [**getAccountsWithStatus**](AvailabilityAndMetrosApi.md#getAccountsWithStatus) | **GET** /ne/v1/accounts/{metro} | List Accounts by Metro |
| [**getAgreementStatus**](AvailabilityAndMetrosApi.md#getAgreementStatus) | **GET** /ne/v1/agreements/accounts | Get Agreement Status |
| [**getAllowedInterfaces**](AvailabilityAndMetrosApi.md#getAllowedInterfaces) | **GET** /ne/v1/deviceTypes/{deviceType}/interfaces | List Allowed Interfaces |
| [**getMetros**](AvailabilityAndMetrosApi.md#getMetros) | **GET** /ne/v1/metros | List Available Metros |
| [**getNotifications**](AvailabilityAndMetrosApi.md#getNotifications) | **GET** /ne/v1/notifications | Get Downtime Notifications |
| [**getOrderSummary**](AvailabilityAndMetrosApi.md#getOrderSummary) | **GET** /ne/v1/orderSummaries | Get Order Summary |
| [**getOrderTerms**](AvailabilityAndMetrosApi.md#getOrderTerms) | **GET** /ne/v1/agreements/orders | Get Order Terms |
| [**getPublicKeys**](AvailabilityAndMetrosApi.md#getPublicKeys) | **GET** /ne/v1/publicKeys | Get Public Keys |
| [**getVendorTerms**](AvailabilityAndMetrosApi.md#getVendorTerms) | **GET** /ne/v1/agreements/vendors | Get Vendor Terms |
| [**getVirtualDeviceTypes**](AvailabilityAndMetrosApi.md#getVirtualDeviceTypes) | **GET** /ne/v1/deviceTypes | List Device Types |
| [**postPublicKey**](AvailabilityAndMetrosApi.md#postPublicKey) | **POST** /ne/v1/publicKeys | Create Public Key |
| [**retrievePrice**](AvailabilityAndMetrosApi.md#retrievePrice) | **GET** /ne/v1/prices | Calculate Price |
| [**updateLicenseToken**](AvailabilityAndMetrosApi.md#updateLicenseToken) | **PUT** /ne/v1/devices/{uuid}/licenseTokens | Update License Token/ID/Code |
| [**uploadFile**](AvailabilityAndMetrosApi.md#uploadFile) | **POST** /ne/v1/files | Upload File |
| [**uploadLicense**](AvailabilityAndMetrosApi.md#uploadLicense) | **POST** /ne/v1/devices/licenseFiles | Upload License File |
| [**uploadLicenseForDevice**](AvailabilityAndMetrosApi.md#uploadLicenseForDevice) | **POST** /ne/v1/devices/licenseFiles/{uuid} | Upload License for a Virtual Device |


<a id="createAgreement"></a>
# **createAgreement**
> AgreementAcceptResponse createAgreement(agreementAcceptRequest)

Create an agreement

Call this API to post an agreement. The authorization token and content-type are the only headers that are passed to this API and a response is received based on the values passed.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    AgreementAcceptRequest agreementAcceptRequest = new AgreementAcceptRequest(); // AgreementAcceptRequest | agreementAcceptRequest
    try {
      AgreementAcceptResponse result = apiInstance.createAgreement(agreementAcceptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#createAgreement");
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
| **agreementAcceptRequest** | [**AgreementAcceptRequest**](AgreementAcceptRequest.md)| agreementAcceptRequest | |

### Return type

[**AgreementAcceptResponse**](AgreementAcceptResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is fulfilled. |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAccountsWithStatus"></a>
# **getAccountsWithStatus**
> PageResponseMetroAccountResponse getAccountsWithStatus(metro, accountUcmId)

List Accounts by Metro

Gets accounts by metro. You must have an account in a metro to create a virtual device there. To create an account go to \&quot;accountCreateUrl\&quot;.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String metro = "SV"; // String | Metro region for which you want to check your account status
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | Unique ID of an account
    try {
      PageResponseMetroAccountResponse result = apiInstance.getAccountsWithStatus(metro, accountUcmId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getAccountsWithStatus");
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
| **metro** | **String**| Metro region for which you want to check your account status | |
| **accountUcmId** | **String**| Unique ID of an account | [optional] |

### Return type

[**PageResponseMetroAccountResponse**](PageResponseMetroAccountResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the account details |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAgreementStatus"></a>
# **getAgreementStatus**
> AgreementStatusResponse getAgreementStatus(accountNumber)

Get Agreement Status

Call this API to find out the status of your agreement, whether it is valid or not, or to just read the agreement terms.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String accountNumber = "123456"; // String | Unique identifier of the customer account.
    try {
      AgreementStatusResponse result = apiInstance.getAgreementStatus(accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getAgreementStatus");
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
| **accountNumber** | **String**| Unique identifier of the customer account. | [optional] |

### Return type

[**AgreementStatusResponse**](AgreementStatusResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved Status |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllowedInterfaces"></a>
# **getAllowedInterfaces**
> AllowedInterfaceResponse getAllowedInterfaces(deviceType, deviceManagementType, mode, cluster, sdwan, connectivity, core, memory, unit, flavor, version, softwarePkg)

List Allowed Interfaces

Returns the interface details for a device type with a chosen configuration. You must pass the device type as the path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    DeviceTypeCode deviceType = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | Device type code. PA-VM.
    String deviceManagementType = "SELF-CONFIGURED"; // String | Device management type. SELF-CONFIGURED
    String mode = "Subscription"; // String | License mode, either Subscription or BYOL.
    Boolean cluster = false; // Boolean | Whether you want a cluster device.
    Boolean sdwan = false; // Boolean | Whether you want an SD-WAN device.
    String connectivity = "INTERNET-ACCESS"; // String | Type of connectivity you want. INTERNET-ACCESS, PRIVATE, or INTERNET-ACCESS-WITH-PRVT-MGMT. PRIVATE devices do not have ACLs or bandwidth.
    Integer core = 4; // Integer | The desired number of cores.
    Integer memory = 4; // Integer | Desired memory.
    String unit = "GB"; // String | Unit of memory. GB or MB.
    String flavor = "small"; // String | Flavor of device.
    String version = "17.06.01"; // String | Version.
    String softwarePkg = "SEC"; // String | Software package.
    try {
      AllowedInterfaceResponse result = apiInstance.getAllowedInterfaces(deviceType, deviceManagementType, mode, cluster, sdwan, connectivity, core, memory, unit, flavor, version, softwarePkg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getAllowedInterfaces");
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
| **deviceType** | [**DeviceTypeCode**](.md)| Device type code. PA-VM. | [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |
| **deviceManagementType** | **String**| Device management type. SELF-CONFIGURED | [enum: SELF-CONFIGURED, EQUINIX-CONFIGURED] |
| **mode** | **String**| License mode, either Subscription or BYOL. | [optional] [enum: Subscription, BYOL] |
| **cluster** | **Boolean**| Whether you want a cluster device. | [optional] |
| **sdwan** | **Boolean**| Whether you want an SD-WAN device. | [optional] |
| **connectivity** | **String**| Type of connectivity you want. INTERNET-ACCESS, PRIVATE, or INTERNET-ACCESS-WITH-PRVT-MGMT. PRIVATE devices do not have ACLs or bandwidth. | [optional] [enum: INTERNET-ACCESS, PRIVATE, INTERNET-ACCESS-WITH-PRVT-MGMT] |
| **core** | **Integer**| The desired number of cores. | [optional] |
| **memory** | **Integer**| Desired memory. | [optional] |
| **unit** | **String**| Unit of memory. GB or MB. | [optional] |
| **flavor** | **String**| Flavor of device. | [optional] |
| **version** | **String**| Version. | [optional] |
| **softwarePkg** | **String**| Software package. | [optional] |

### Return type

[**AllowedInterfaceResponse**](AllowedInterfaceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getMetros"></a>
# **getMetros**
> GetMetrosResponse getMetros(region, offset, limit)

List Available Metros

Gets the available list of metros where NE platform is available. Please note that an account must be created for each country where virtual devices are being purchased.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String region = "AMER"; // String | Name of the region for which you want metros (e.g., AMER)
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    try {
      GetMetrosResponse result = apiInstance.getMetros(region, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getMetros");
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
| **region** | **String**| Name of the region for which you want metros (e.g., AMER) | [optional] |
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |

### Return type

[**GetMetrosResponse**](GetMetrosResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getNotifications"></a>
# **getNotifications**
> DowntimeNotification getNotifications()

Get Downtime Notifications

Returns all planned and unplanned downtime notifications related to APIs and infrastructure. Please pass a token in the header.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    try {
      DowntimeNotification result = apiInstance.getNotifications();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getNotifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DowntimeNotification**](DowntimeNotification.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getOrderSummary"></a>
# **getOrderSummary**
> PageResponse getOrderSummary(accountNumber, metro, vendorPackage, licenseType, softwarePackage, throughput, throughputUnit, termLength, additionalBandwidth, virtualDeviceUuid, deviceManagementType, core, secondaryAccountNumber, secondaryMetro, secondaryAdditionalBandwidth, accountUcmId, orderingContact)

Get Order Summary

Gets the order summary as a printable pdf file. This API helps customers who have to go through a PO process at their end to make a purchase and need a formal quote

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    Integer accountNumber = 123456; // Integer | Account number
    String metro = "SV"; // String | Metro
    String vendorPackage = "VM02"; // String | Vendor package
    String licenseType = "Subscription"; // String | License type
    String softwarePackage = "AX"; // String | Software package
    Integer throughput = 100; // Integer | Throughput
    String throughputUnit = "Mbps"; // String | Throughput unit
    String termLength = "12"; // String | Term length (in months)
    Integer additionalBandwidth = 100; // Integer | Additional bandwidth (in Mbps)
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Virtual device unique Id (only required if existing device is being modified)
    String deviceManagementType = "SELF-CONFIGURED"; // String | The device management type
    Integer core = 4; // Integer | The number of cores
    Integer secondaryAccountNumber = 123457; // Integer | Secondary account number (in case you have a device pair)
    String secondaryMetro = "SV"; // String | Secondary metro (in case you have a device pair)
    Integer secondaryAdditionalBandwidth = 100; // Integer | Secondary additional bandwidth (in Mbps)
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | Account unique ID
    String orderingContact = "cust0001"; // String | Reseller customer username
    try {
      PageResponse result = apiInstance.getOrderSummary(accountNumber, metro, vendorPackage, licenseType, softwarePackage, throughput, throughputUnit, termLength, additionalBandwidth, virtualDeviceUuid, deviceManagementType, core, secondaryAccountNumber, secondaryMetro, secondaryAdditionalBandwidth, accountUcmId, orderingContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getOrderSummary");
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
| **accountNumber** | **Integer**| Account number | [optional] |
| **metro** | **String**| Metro | [optional] |
| **vendorPackage** | **String**| Vendor package | [optional] [enum: VM02, VM03, NETWORK-ESSENTIALS] |
| **licenseType** | **String**| License type | [optional] [enum: Subscription, BYOL] |
| **softwarePackage** | **String**| Software package | [optional] |
| **throughput** | **Integer**| Throughput | [optional] |
| **throughputUnit** | **String**| Throughput unit | [optional] |
| **termLength** | **String**| Term length (in months) | [optional] |
| **additionalBandwidth** | **Integer**| Additional bandwidth (in Mbps) | [optional] |
| **virtualDeviceUuid** | **String**| Virtual device unique Id (only required if existing device is being modified) | [optional] |
| **deviceManagementType** | **String**| The device management type | [optional] [enum: SELF-CONFIGURED, EQUINIX-CONFIGURED] |
| **core** | **Integer**| The number of cores | [optional] |
| **secondaryAccountNumber** | **Integer**| Secondary account number (in case you have a device pair) | [optional] |
| **secondaryMetro** | **String**| Secondary metro (in case you have a device pair) | [optional] |
| **secondaryAdditionalBandwidth** | **Integer**| Secondary additional bandwidth (in Mbps) | [optional] |
| **accountUcmId** | **String**| Account unique ID | [optional] |
| **orderingContact** | **String**| Reseller customer username | [optional] |

### Return type

[**PageResponse**](PageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ContentType- application/pdf, charset UTF-8. The response is a pdf file that you can save or view online. |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="getOrderTerms"></a>
# **getOrderTerms**
> OrderTermsResponse getOrderTerms()

Get Order Terms

Retrieves the terms and conditions of orders. Please read the terms and conditions before placing an order.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    try {
      OrderTermsResponse result = apiInstance.getOrderTerms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getOrderTerms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderTermsResponse**](OrderTermsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved Status |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPublicKeys"></a>
# **getPublicKeys**
> GetPublicKeysResponse getPublicKeys(accountUcmId, projectIds)

Get Public Keys

Returns the SSH public keys associated with this organization. If you are a reseller, please pass the account number of you customer to get the public keys.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | This field is for resellers. Please pass the accountUcmId of your customer to get the public keys.
    String projectIds = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8,3da0a663-20d9-4b8f-8c5d-d5cf706840c9"; // String | If projectIds are different from default projectIds, must pass a projectIds parameter
    try {
      GetPublicKeysResponse result = apiInstance.getPublicKeys(accountUcmId, projectIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getPublicKeys");
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
| **accountUcmId** | **String**| This field is for resellers. Please pass the accountUcmId of your customer to get the public keys. | [optional] |
| **projectIds** | **String**| If projectIds are different from default projectIds, must pass a projectIds parameter | [optional] |

### Return type

[**GetPublicKeysResponse**](GetPublicKeysResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVendorTerms"></a>
# **getVendorTerms**
> VendorTermsResponse getVendorTerms(vendorPackage, licenseType)

Get Vendor Terms

Returns a link to a vendor&#39;s terms. The term \&quot;vendor\&quot; refers to the vendor of a virtual device on the Network Edge platform.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String vendorPackage = "VM02"; // String | The vendor package code.
    String licenseType = "Subscription"; // String | The type of license (e.g., Subscription, BYOL).
    try {
      VendorTermsResponse result = apiInstance.getVendorTerms(vendorPackage, licenseType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getVendorTerms");
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
| **vendorPackage** | **String**| The vendor package code. | [optional] [enum: VM02, VM03, NETWORK-ESSENTIALS] |
| **licenseType** | **String**| The type of license (e.g., Subscription, BYOL). | [optional] [enum: Subscription, BYOL] |

### Return type

[**VendorTermsResponse**](VendorTermsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the vendor&#39;s terms |  -  |
| **400** | Bad Request |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVirtualDeviceTypes"></a>
# **getVirtualDeviceTypes**
> GetDeviceTypesResponse getVirtualDeviceTypes(deviceTypeCode, category, offset, limit, projectId)

List Device Types

Returns device types (e.g., routers and firewalls) that can be launched on the NE platform.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    DeviceTypeCode deviceTypeCode = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | Device type code (e.g., C8000V)
    String category = "ROUTER"; // String | Category. One of FIREWALL, ROUTER or SD-WAN
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    String projectId = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectId is different from default projectId, must pass a projectId parameter
    try {
      GetDeviceTypesResponse result = apiInstance.getVirtualDeviceTypes(deviceTypeCode, category, offset, limit, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#getVirtualDeviceTypes");
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
| **deviceTypeCode** | [**DeviceTypeCode**](.md)| Device type code (e.g., C8000V) | [optional] [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |
| **category** | **String**| Category. One of FIREWALL, ROUTER or SD-WAN | [optional] |
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |
| **projectId** | **String**| If projectId is different from default projectId, must pass a projectId parameter | [optional] |

### Return type

[**GetDeviceTypesResponse**](GetDeviceTypesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="postPublicKey"></a>
# **postPublicKey**
> PublicKeyResponse postPublicKey(publicKeyRequest)

Create Public Key

Creates a public key. If you are a reseller, pass the account number of your customer to create a key-name and key-value pair.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    PublicKeyRequest publicKeyRequest = new PublicKeyRequest(); // PublicKeyRequest | keyName, keyValue, and keyType
    try {
      PublicKeyResponse result = apiInstance.postPublicKey(publicKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#postPublicKey");
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
| **publicKeyRequest** | [**PublicKeyRequest**](PublicKeyRequest.md)| keyName, keyValue, and keyType | |

### Return type

[**PublicKeyResponse**](PublicKeyResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created. The unique Id of the newly created key is in the location header of the response. |  * Location - URL of the created RMA request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Resource Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="retrievePrice"></a>
# **retrievePrice**
> CompositePriceResponse retrievePrice(accountNumber, metro, vendorPackage, licenseType, softwarePackage, throughput, throughputUnit, termLength, additionalBandwidth, virtualDeviceUuid, deviceManagementType, core, secondaryAccountNumber, secondaryMetro, secondaryAdditionalBandwidth, accountUcmId, orderingContact)

Calculate Price

Returns the price of a virtual device and license based on account number and other fields. Please note that the listed price does not include the price of any optional features added to the device, some of which are charged.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    Integer accountNumber = 123456; // Integer | Account number
    String metro = "SV"; // String | Metro
    String vendorPackage = "VM02"; // String | Vendor package
    String licenseType = "Subscription"; // String | License type
    String softwarePackage = "AX"; // String | Software package
    Integer throughput = 100; // Integer | Throughput
    String throughputUnit = "Mbps"; // String | Throughput unit
    String termLength = "12"; // String | Term length (in months)
    Integer additionalBandwidth = 100; // Integer | Additional bandwidth (in Mbps)
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Virtual device unique Id (only required if existing device is being modified)
    String deviceManagementType = "SELF-CONFIGURED"; // String | The device management type
    Integer core = 4; // Integer | The number of cores
    Integer secondaryAccountNumber = 123457; // Integer | The secondary account number (for HA)
    String secondaryMetro = "SV"; // String | Secondary metro (for HA)
    Integer secondaryAdditionalBandwidth = 100; // Integer | Secondary additional bandwidth (in Mbps for HA)
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | Account unique ID
    String orderingContact = "cust0001"; // String | Reseller customer username
    try {
      CompositePriceResponse result = apiInstance.retrievePrice(accountNumber, metro, vendorPackage, licenseType, softwarePackage, throughput, throughputUnit, termLength, additionalBandwidth, virtualDeviceUuid, deviceManagementType, core, secondaryAccountNumber, secondaryMetro, secondaryAdditionalBandwidth, accountUcmId, orderingContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#retrievePrice");
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
| **accountNumber** | **Integer**| Account number | [optional] |
| **metro** | **String**| Metro | [optional] |
| **vendorPackage** | **String**| Vendor package | [optional] [enum: VM02, VM03, NETWORK-ESSENTIALS] |
| **licenseType** | **String**| License type | [optional] [enum: Subscription, BYOL] |
| **softwarePackage** | **String**| Software package | [optional] |
| **throughput** | **Integer**| Throughput | [optional] |
| **throughputUnit** | **String**| Throughput unit | [optional] |
| **termLength** | **String**| Term length (in months) | [optional] |
| **additionalBandwidth** | **Integer**| Additional bandwidth (in Mbps) | [optional] |
| **virtualDeviceUuid** | **String**| Virtual device unique Id (only required if existing device is being modified) | [optional] |
| **deviceManagementType** | **String**| The device management type | [optional] [enum: SELF-CONFIGURED, EQUINIX-CONFIGURED] |
| **core** | **Integer**| The number of cores | [optional] |
| **secondaryAccountNumber** | **Integer**| The secondary account number (for HA) | [optional] |
| **secondaryMetro** | **String**| Secondary metro (for HA) | [optional] |
| **secondaryAdditionalBandwidth** | **Integer**| Secondary additional bandwidth (in Mbps for HA) | [optional] |
| **accountUcmId** | **String**| Account unique ID | [optional] |
| **orderingContact** | **String**| Reseller customer username | [optional] |

### Return type

[**CompositePriceResponse**](CompositePriceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateLicenseToken"></a>
# **updateLicenseToken**
> LicenseUploadResponse updateLicenseToken(uuid, request)

Update License Token/ID/Code

If you want to bring your own license (BYOL), you can use this API to post or update a license token after a virtual device is created.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device
    LicenseUpdateRequest request = new LicenseUpdateRequest(); // LicenseUpdateRequest | License token
    try {
      LicenseUploadResponse result = apiInstance.updateLicenseToken(uuid, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#updateLicenseToken");
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
| **uuid** | **String**| Unique Id of a virtual device | |
| **request** | [**LicenseUpdateRequest**](LicenseUpdateRequest.md)| License token | |

### Return type

[**LicenseUploadResponse**](LicenseUploadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="uploadFile"></a>
# **uploadFile**
> FileUploadResponse uploadFile(_file, metroCode, deviceTypeCode, processType, deviceManagementType, licenseType)

Upload File

Uploads a license or an initialization file. You can use this API to upload your bootstrap file generated from the Aviatrix controller portal. The response includes the unique ID of the uploaded file.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    File _file = new File("/path/to/file"); // File | A license or a cloud_init file.
    String metroCode = "metroCode_example"; // String | Two-letter metro code.
    DeviceTypeCode deviceTypeCode = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | 
    String processType = "LICENSE"; // String | Whether you are uploading a license or a cloud_init file. LICENSE or CLOUD_INIT
    String deviceManagementType = "SELF-CONFIGURED"; // String | Device management type, whether SELF-CONFIGURED or EQUINIX-CONFIGURED
    String licenseType = "BYOL"; // String | Type of license (BYOL-Bring Your Own License)
    try {
      FileUploadResponse result = apiInstance.uploadFile(_file, metroCode, deviceTypeCode, processType, deviceManagementType, licenseType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#uploadFile");
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
| **_file** | **File**| A license or a cloud_init file. | |
| **metroCode** | **String**| Two-letter metro code. | |
| **deviceTypeCode** | [**DeviceTypeCode**](DeviceTypeCode.md)|  | [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |
| **processType** | **String**| Whether you are uploading a license or a cloud_init file. LICENSE or CLOUD_INIT | [enum: LICENSE, CLOUD_INIT] |
| **deviceManagementType** | **String**| Device management type, whether SELF-CONFIGURED or EQUINIX-CONFIGURED | [optional] [enum: SELF-CONFIGURED, EQUINIX-CONFIGURED] |
| **licenseType** | **String**| Type of license (BYOL-Bring Your Own License) | [optional] [enum: BYOL] |

### Return type

[**FileUploadResponse**](FileUploadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="uploadLicense"></a>
# **uploadLicense**
> LicenseUploadResponse uploadLicense(metroCode, deviceTypeCode, licenseType, _file, projectId)

Upload License File

In case you want to bring your own license (BYOL), you can use this API to post a license file before creating a virtual device.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String metroCode = "SV"; // String | Two-letter metro code where the device will be created.
    DeviceTypeCode deviceTypeCode = DeviceTypeCode.fromValue("C8000V"); // DeviceTypeCode | Device type code (e.g., C8000V).
    String licenseType = "BYOL"; // String | Type of license (e.g., BYOL).
    File _file = new File("/path/to/file"); // File | License file
    String projectId = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectId is different from default projectId, must pass a projectId parameter
    try {
      LicenseUploadResponse result = apiInstance.uploadLicense(metroCode, deviceTypeCode, licenseType, _file, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#uploadLicense");
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
| **metroCode** | **String**| Two-letter metro code where the device will be created. | |
| **deviceTypeCode** | [**DeviceTypeCode**](.md)| Device type code (e.g., C8000V). | [enum: C8000V, C8000V-SDWAN, PA-VM, ASAV, CGUARD, FG-VM, MERAKI-VMX, PRISMA-SDWAN, INFOBLOX, AVIATRIX_EDGE, VSRX, ARISTA-ROUTER, EDGECONNECT-SDWAN, VERSA_SDWAN, NGINX, BLUECAT, VYOS-ROUTER, FG-SDWAN, BLUECAT-EDGE-SERVICE-POINT, F5XC, 6WIND-VSR, VSRX-SDWAN, FORTIGATE_VM] |
| **licenseType** | **String**| Type of license (e.g., BYOL). | [enum: BYOL] |
| **_file** | **File**| License file | |
| **projectId** | **String**| If projectId is different from default projectId, must pass a projectId parameter | [optional] |

### Return type

[**LicenseUploadResponse**](LicenseUploadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="uploadLicenseForDevice"></a>
# **uploadLicenseForDevice**
> LicenseUploadResponse uploadLicenseForDevice(uuid, _file, projectId)

Upload License for a Virtual Device

In case you want to bring your own license and have already created a virtual device, use this API to post a license file. You can also use this API to renew a license that is about to expire.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AvailabilityAndMetrosApi apiInstance = new AvailabilityAndMetrosApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device
    File _file = new File("/path/to/file"); // File | License file
    String projectId = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectId is different from default projectId, must pass a projectId parameter
    try {
      LicenseUploadResponse result = apiInstance.uploadLicenseForDevice(uuid, _file, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityAndMetrosApi#uploadLicenseForDevice");
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
| **uuid** | **String**| Unique Id of a virtual device | |
| **_file** | **File**| License file | |
| **projectId** | **String**| If projectId is different from default projectId, must pass a projectId parameter | [optional] |

### Return type

[**LicenseUploadResponse**](LicenseUploadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

