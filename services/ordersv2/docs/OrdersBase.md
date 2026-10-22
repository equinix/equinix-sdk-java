

# OrdersBase

Orders Base is the properties or attributes which common for every order details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Unique identifier of the order. |  [optional] |
|**accountName** | **String** | Customer account name |  [optional] |
|**accountNumber** | **String** | Customer account number |  [optional] |
|**quoteRequestType** | [**QuoteRequestTypeEnum**](#QuoteRequestTypeEnum) | The request type of the quote |  [optional] |
|**contacts** | [**List&lt;Contacts&gt;**](Contacts.md) | The related party associated with the ticket. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the order or service |  [optional] |
|**createdDateTime** | **OffsetDateTime** | The order created date and time in UTC timezone. |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | The order updated date and time in UTC timezone. |  [optional] |
|**closedDateTime** | **OffsetDateTime** | The order closed date and time in UTC timezone. |  [optional] |
|**estimatedCompletionDateTime** | **OffsetDateTime** | The estimated completion date and time in UTC timezone |  [optional] |
|**currencyCode** | **CurrencyCode** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Type of channel used to place the order |  [optional] |
|**subChannel** | [**SubChannelEnum**](#SubChannelEnum) | Type of sub-channel used to place the order |  [optional] |
|**notes** | [**List&lt;Note&gt;**](Note.md) | The notes that are associated to the orders. |  [optional] |
|**additionalInfo** | [**List&lt;ProductAdditionalInfoInner&gt;**](ProductAdditionalInfoInner.md) | This section is reserved to display product specific information |  [optional] |
|**customerReferenceId** | **String** | Customer Reference Number / External Reference Number |  [optional] |
|**cancellable** | **Boolean** | When &#x60;true&#x60;, order can be cancelled. |  [optional] |
|**modifiable** | **Boolean** | When &#x60;true&#x60;, order can be modified. |  [optional] |



## Enum: QuoteRequestTypeEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| AMENDMENT | &quot;AMENDMENT&quot; |
| PAPERWORK | &quot;PAPERWORK&quot; |
| REPLACEMENT_RENEWAL | &quot;REPLACEMENT_RENEWAL&quot; |
| TERMINATION | &quot;TERMINATION&quot; |
| MIGRATION | &quot;MIGRATION&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;RECEIVED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| ON_HOLD | &quot;ON_HOLD&quot; |
| CLOSED | &quot;CLOSED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| PORTAL | &quot;PORTAL&quot; |
| MOBILE | &quot;MOBILE&quot; |
| OFFLINE | &quot;OFFLINE&quot; |



## Enum: SubChannelEnum

| Name | Value |
|---- | -----|
| ECP | &quot;ECP&quot; |
| ECX | &quot;ECX&quot; |
| IX | &quot;IX&quot; |
| NE | &quot;NE&quot; |
| EMG | &quot;EMG&quot; |
| QUOTE | &quot;QUOTE&quot; |



