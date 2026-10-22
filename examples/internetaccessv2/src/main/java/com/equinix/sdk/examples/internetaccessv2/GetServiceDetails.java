package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.model.ServiceReadModel;
import java.io.IOException;
import java.util.UUID;

/**
 * Prints the details of one service, identified by EQUINIX_EXAMPLE_SERVICE_ID (a uuid from
 * ListServicesPaged). Read-only.
 */
public class GetServiceDetails {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        UUID serviceId = UUID.fromString(InternetAccessSupport.requireEnv("EQUINIX_EXAMPLE_SERVICE_ID"));

        ServiceReadModel service = InternetAccessSupport.serviceApi().getEquinixInternetAccessServiceDetails(serviceId);

        System.out.println("name:      " + service.getName());
        System.out.println("type:      " + service.getType());
        System.out.println("state:     " + service.getState());
        System.out.println("bandwidth: " + service.getBandwidth());
        System.out.println("href:      " + service.getHref());
    }
}
