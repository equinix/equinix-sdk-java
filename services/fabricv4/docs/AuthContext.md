

# AuthContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authtype** | [**AuthtypeEnum**](#AuthtypeEnum) | Cloud Event auth type |  [optional] |
|**authid** | [**AuthidEnum**](#AuthidEnum) | Cloud Event auth identifier |  [optional] |
|**name** | **String** | Cloud Event username |  [optional] |
|**email** | **String** | Cloud Event email |  [optional] |



## Enum: AuthtypeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;system&quot; |
| USER | &quot;user&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AuthidEnum

| Name | Value |
|---- | -----|
| EQUINIX | &quot;equinix&quot; |
| USERID | &quot;userId&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



