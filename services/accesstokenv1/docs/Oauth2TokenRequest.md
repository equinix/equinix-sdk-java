

# Oauth2TokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userName** | **String** | Deprecated - The Equinix username used to access portals |  [optional] |
|**userPassword** | **String** | Deprecated - The Equinix user password used to access portals |  [optional] |
|**clientId** | **String** | API Consumer Key available under \&quot;My Apps\&quot; in developer portal |  |
|**clientSecret** | **String** | API Consumer secret available under \&quot;My Apps\&quot; in developer portal |  |
|**grantType** | **String** | The OAuth2 grant type used for authorization. Supported values are \&quot;password\&quot; &amp; \&quot;client_credentials\&quot;. user_name and password is not considered in case this value is \&quot;client_credentials\&quot;. If the grant_type is not passed, by default it would consider \&quot;password\&quot; type in which user_name and password is required. Note that the password grant type is deprecated. Recommended to use grant_type of &#39;client_credentials&#39; instead. |  [optional] |
|**passwordEncoding** | **String** | For enhanced security, you may encrypt the password value while requesting for an access_token. Currently only \&quot;md5-b64\&quot; hashing is supported. Any other value would treat password value as raw string |  [optional] |



