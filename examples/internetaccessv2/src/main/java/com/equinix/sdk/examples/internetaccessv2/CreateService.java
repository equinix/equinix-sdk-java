package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.model.RoutingProtocolRequest;
import com.equinix.sdk.internetaccessv2.model.RoutingProtocolRequestDirect;
import com.equinix.sdk.internetaccessv2.model.ServiceCreateRequest;
import com.equinix.sdk.internetaccessv2.model.ServiceCreateResponse;
import com.equinix.sdk.internetaccessv2.model.ServiceType;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Creates an Internet Access service on an existing connection with a direct routing protocol.
 *
 * <p><b>Creates a real service.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and
 * needs EQUINIX_EXAMPLE_CONNECTION_ID. A real order may also need contacts and a purchase order in
 * the request's {@code order} section, which this example leaves out.
 */
public class CreateService {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        InternetAccessSupport.requireWritesAllowed("CreateService");
        UUID connectionId = UUID.fromString(InternetAccessSupport.requireEnv("EQUINIX_EXAMPLE_CONNECTION_ID"));

        RoutingProtocolRequestDirect direct = new RoutingProtocolRequestDirect().type("DIRECT");
        ServiceCreateRequest request = new ServiceCreateRequest()
                .name("sdk-example-CreateService")
                .type(ServiceType.SINGLE)
                .connections(List.of(connectionId))
                .routingProtocol(new RoutingProtocolRequest(direct));

        ServiceCreateResponse response = InternetAccessSupport.serviceApi().createEquinixInternetAccessv2(request);
        System.out.println("created: " + response);
    }
}
