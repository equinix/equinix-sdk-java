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

## Equinix Internet Access (EIA)

The Fabric v4 module supports **Equinix Internet Access (EIA)** services. The generated
clients live under `com.equinix.sdk.fabricv4` (`api` for clients, `model` for data classes).

Two API clients cover the EIA workflow:

- **`InternetAccessServicesApi`** — manage EIA services: create, get, search,
  patch (e.g. update bandwidth) and delete.
- **`IpBlocksApi`** — manage the IP blocks an EIA service routes: submit, search,
  get, patch and delete.

Supported routing protocols: `DIRECT`, `STATIC`, and `BGP`
(`InternetAccessRoutingProtocolType`). Service state is reported via
`InternetAccessServiceState` (`PROVISIONING`, `PROVISIONED`, `FAILED`,
`DEPROVISIONING`, `DEPROVISIONED`).

### Example: create an EIA service

```java
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.HttpBearerAuth;
import com.equinix.sdk.fabricv4.api.InternetAccessServicesApi;
import com.equinix.sdk.fabricv4.model.*;
import java.util.UUID;

import static java.util.Collections.singletonList;

public class EiaExample {
  public static void main(String[] args) throws ApiException {
    ApiClient client = Configuration.getDefaultApiClient();
    client.setBasePath("https://api.equinix.com");
    ((HttpBearerAuth) client.getAuthentication("BearerAuth"))
        .setBearerToken("<GetBearerTokenFromDeveloperPortal>");

    InternetAccessServicesApi eiaApi = new InternetAccessServicesApi(client);

    // DIRECT routing: reference an existing IA_VC connection and a customer IPv4 block,
    // and supply the Equinix peer IP from that block.
    InternetAccessRoutingProtocolDirectRequest routing =
        new InternetAccessRoutingProtocolDirectRequest()
            .addConnectionsItem(new InternetAccessConnectionDirectRequest()
                .uuid(UUID.fromString("<connectionUuid>"))
                .peeringIpv4(new InternetAccessPeeringIpv4Request().equinixPeerIp("67.223.23.5")));
    routing.type(InternetAccessRoutingProtocolType.DIRECT);
    routing.addCustomerRoutesItem(new InternetAccessCustomerRouteRequest()
        .ipBlock(new InternetAccessIpBlockRequest().uuid(UUID.fromString("<ipBlockUuid>"))));

    InternetAccessPostRequest request = new InternetAccessPostRequest()
        .type(InternetAccessServiceType.SINGLE_IA)
        .name("my-eia-service")
        .bandwidth(50)
        .routingProtocol(routing)
        .billing(new InternetAccessPostRequestBilling().type(InternetAccessBillingType.FIXED))
        .project(new Project().projectId("<projectId>"))
        .account(new InternetAccessAccount().accountNumber("<accountNumber>"));

    InternetAccessService service = eiaApi.createEiaService(request);
    System.out.println("Created EIA service: " + service.getUuid() + " state=" + service.getState());

    // Update bandwidth
    eiaApi.patchEiaService(service.getUuid(), singletonList(new InternetAccessPatchOperationUpdate()
        .op(InternetAccessPatchOperationUpdateAllowedOp.REPLACE)
        .path("/bandwidth")
        .value(100)));

    // Delete when no longer needed
    eiaApi.deleteEiaService(service.getUuid());
  }
}
```
