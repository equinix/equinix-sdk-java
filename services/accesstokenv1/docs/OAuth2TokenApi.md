# OAuth2TokenApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOAuth2AccessToken**](OAuth2TokenApi.md#getOAuth2AccessToken) | **POST** /oauth2/v1/token | Generate New Access Token |
| [**refreshOAuth2AccessToken**](OAuth2TokenApi.md#refreshOAuth2AccessToken) | **POST** /oauth2/v1/refreshaccesstoken | Renew Access Tokens |


<a id="getOAuth2AccessToken"></a>
# **getOAuth2AccessToken**
> Oauth2TokenResponse getOAuth2AccessToken(payload)

Generate New Access Token

This API handles authentication and authorization of the API developer. It returns an access_token which would be valid for 60 minutes. The user account will get locked after 5 successive invalid attempts. 

### Example
```java
// Import classes:
import com.equinix.sdk.accesstokenv1.ApiClient;
import com.equinix.sdk.accesstokenv1.ApiException;
import com.equinix.sdk.accesstokenv1.Configuration;
import com.equinix.sdk.accesstokenv1.models.*;
import com.equinix.sdk.accesstokenv1.api.OAuth2TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    OAuth2TokenApi apiInstance = new OAuth2TokenApi(defaultClient);
    Oauth2TokenRequest payload = new Oauth2TokenRequest(); // Oauth2TokenRequest | Request token json payload
    try {
      Oauth2TokenResponse result = apiInstance.getOAuth2AccessToken(payload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth2TokenApi#getOAuth2AccessToken");
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
| **payload** | [**Oauth2TokenRequest**](Oauth2TokenRequest.md)| Request token json payload | |

### Return type

[**Oauth2TokenResponse**](Oauth2TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Oauth2 token |  -  |
| **400** | Please enter a valid client id/client secret/username/password and try again. |  -  |

<a id="refreshOAuth2AccessToken"></a>
# **refreshOAuth2AccessToken**
> Oauth2TokenResponse refreshOAuth2AccessToken(payload)

Renew Access Tokens

Use this API to refresh an access token using its refresh token. A valid refresh token is needed to retrieve a new access_token. 

### Example
```java
// Import classes:
import com.equinix.sdk.accesstokenv1.ApiClient;
import com.equinix.sdk.accesstokenv1.ApiException;
import com.equinix.sdk.accesstokenv1.Configuration;
import com.equinix.sdk.accesstokenv1.models.*;
import com.equinix.sdk.accesstokenv1.api.OAuth2TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    OAuth2TokenApi apiInstance = new OAuth2TokenApi(defaultClient);
    Oauth2RefreshTokenRequest payload = new Oauth2RefreshTokenRequest(); // Oauth2RefreshTokenRequest | Refresh token json payload.
    try {
      Oauth2TokenResponse result = apiInstance.refreshOAuth2AccessToken(payload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth2TokenApi#refreshOAuth2AccessToken");
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
| **payload** | [**Oauth2RefreshTokenRequest**](Oauth2RefreshTokenRequest.md)| Refresh token json payload. | |

### Return type

[**Oauth2TokenResponse**](Oauth2TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful refresh Oauth2 token |  -  |
| **400** | Please enter valid client id/client secrent/refresh token and try again. |  -  |

