# Equinix Java SDK

This is the official Java SDK for Equinix services.  This SDK is currently provided with a major version of `v0`. We aim to avoid breaking changes to this library, but they will certainly happen as we work towards a stable `v1` library.

Each Equinix service supported by this SDK is maintained as a separate submodule that is generated from the OpenAPI specification for that service.  If any Equinix service is not supported by this SDK and you would like to see it added, please [submit a change request](CONTRIBUTING.md)


## Requirements

Java 11 or higher

## Installation

Maven - add dependency to your `pom.xml`:

```xml
        <dependency>
            <groupId>com.equinix</groupId>
            <artifactId>equinix-sdk-java</artifactId>
            <version>${version}</version>
        </dependency>
```

## Usage
```
mvn clean package
```

Create a sample file with the following code:
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.v4.model.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("<GetBearerTokenFromDeveloperPortal>");

    PortsApi apiInstance = new PortsApi(defaultClient);
    try {
      Port result = apiInstance.getPortByUuid(UUID.fromString("<RetrievePortUUIDFromFabricPortal>"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
