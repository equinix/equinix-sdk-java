

# PublicKeyResponse

Details of a public key

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique Id of the keyName and keyValue combination |  [optional] |
|**keyName** | **String** | Key name |  [optional] |
|**keyValue** | **String** | Key value |  [optional] |
|**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) | Type of key, whether RSA or DSA |  [optional] |



## Enum: KeyTypeEnum

| Name | Value |
|---- | -----|
| RSA | &quot;RSA&quot; |
| DSA | &quot;DSA&quot; |



