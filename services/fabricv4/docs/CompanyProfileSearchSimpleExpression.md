

# CompanyProfileSearchSimpleExpression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **CompanyProfileSearchFieldName** | Searchable field name. Properties are grouped by their supported operators: String properties (support all operators):  * &#x60;/name&#x60; - Company profile name  * &#x60;/uuid&#x60; - Company profile UUID  * &#x60;/tags/name&#x60; - Tag name  * &#x60;/tags/uuid&#x60; - Tag UUID  * &#x60;/tags/displayName&#x60; - Tag display name  Discrete value properties (only support &#x60;&#x3D;&#x60;, &#x60;!&#x3D;&#x60;, &#x60;IN&#x60;, &#x60;NOT IN&#x60;):  * &#x60;/state&#x60; - Company profile state (&#x60;PENDING&#x60;, &#x60;PROVISIONED&#x60;, &#x60;DEPROVISIONED&#x60;, &#x60;REJECTED&#x60;)  * &#x60;/metros/metroCode&#x60; - Metro code (e.g. &#x60;SV&#x60;, &#x60;NY&#x60;, &#x60;DC&#x60;)  * &#x60;/change/status&#x60; - Change status (&#x60;PENDING&#x60;, &#x60;COMPLETED&#x60;, &#x60;REJECTED&#x60;) — seller and admin users only  |  |
|**operator** | **OperatorEnum** | Comparison operator. &#x60;LIKE&#x60;, &#x60;NOT LIKE&#x60;, &#x60;ILIKE&#x60;, and &#x60;NOT ILIKE&#x60; require exactly one value. All other operators accept one or more values.  * &#x60;&#x3D;&#x60; - equal; equivalent to &#x60;IN&#x60; when multiple values are provided  * &#x60;!&#x3D;&#x60; - not equal; equivalent to &#x60;NOT IN&#x60; when multiple values are provided  * &#x60;LIKE&#x60; - case-sensitive partial match (single value)  * &#x60;NOT LIKE&#x60; - case-sensitive partial non-match (single value)  * &#x60;ILIKE&#x60; - case-insensitive partial match (single value)  * &#x60;NOT ILIKE&#x60; - case-insensitive partial non-match (single value)  * &#x60;IN&#x60; - matches any of the provided values  * &#x60;NOT IN&#x60; - does not match any of the provided values  |  |
|**values** | **List&lt;String&gt;** |  |  |



