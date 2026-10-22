package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.api.EiaServiceApi;
import com.equinix.sdk.internetaccessv2.model.SearchResponse;
import com.equinix.sdk.internetaccessv2.model.ServiceReadModel;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Pages through every Internet Access service in the account. Read-only.
 *
 * <p>The search operation takes {@code offset} and {@code limit}; the response's pagination block
 * reports the total, so the loop advances the offset until it has seen them all.
 */
public class ListServicesPaged {
    private static final int PAGE_SIZE = 20;

    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        EiaServiceApi api = InternetAccessSupport.serviceApi();

        long offset = 0;
        long total;
        do {
            SearchResponse page = api.getEquinixInternetAccessServices(
                    BigDecimal.valueOf(offset), BigDecimal.valueOf(PAGE_SIZE), null, null);
            total = page.getPagination().getTotal();

            for (ServiceReadModel service : page.getData()) {
                System.out.println(service.getUuid() + "  " + service.getName() + "  " + service.getState());
            }
            if (page.getData().isEmpty()) {
                break;
            }
            offset += page.getData().size();
        } while (offset < total);

        System.out.println(offset + " of " + total + " services listed");
    }
}
