

# Oauth2TokenResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | the OAuth2 Bearer token required to access Equinix API&#39;s |  |
|**tokenTimeout** | **String** | The max validity in seconds for this access_token |  |
|**userName** | **String** | The Equinix user account to which this token is associated with |  |
|**tokenType** | **String** | The type of access_token returned in this response |  |
|**refreshToken** | **String** | The OAuth2 refresh token which could be used to retrieve a new access_token without user credentials. The refresh_token has a max validity of 60 days after which a new Access Token request must be made. Refresh token is Not returned for \&quot;client_credentials\&quot; grant type |  [optional] |
|**refreshTokenTimeout** | **String** | The max validity in seconds for the refresh_token. This field is not retruned for the \&quot;client_credentials\&quot; grant type |  [optional] |



