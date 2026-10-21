

# VersionDetails

Software version details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cause** | [**VersionDetails**](VersionDetails.md) |  |  [optional] |
|**version** | **String** | Version. |  [optional] |
|**imageName** | **String** | Image name. |  [optional] |
|**versionDateTime** | **OffsetDateTime** | The date the software was released. |  [optional] |
|**retireDateTime** | **OffsetDateTime** | The date the software will no longer be available. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Version status. |  [optional] |
|**stableVersion** | **Boolean** | Whether this is a stable version. |  [optional] |
|**allowedUpgradableVersions** | **List&lt;String&gt;** | List of allowed upgradable versions. |  [optional] |
|**supportedLicenseTypes** | [**List&lt;SupportedLicenseTypesEnum&gt;**](#List&lt;SupportedLicenseTypesEnum&gt;) | Supported license types. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| RETIRED | &quot;RETIRED&quot; |



## Enum: List&lt;SupportedLicenseTypesEnum&gt;

| Name | Value |
|---- | -----|
| BYOL | &quot;BYOL&quot; |
| SUBSCRIPTION | &quot;Subscription&quot; |



