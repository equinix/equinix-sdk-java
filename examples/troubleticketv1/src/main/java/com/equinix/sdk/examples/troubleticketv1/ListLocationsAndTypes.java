package com.equinix.sdk.examples.troubleticketv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;
import com.equinix.sdk.troubleticketv1.model.GetLocation200Response;
import com.equinix.sdk.troubleticketv1.model.GetTroubleTicketType200Response;
import com.equinix.sdk.troubleticketv1.model.Location;
import com.equinix.sdk.troubleticketv1.model.TroubleTicketType;

/**
 * Lists the IBX locations the caller may raise trouble tickets for, then the problem types (codes)
 * a ticket can use. These are the two lookups to make before building a ticket request.
 *
 * <p>Requires EQUINIX_API_TOKEN, or EQUINIX_API_CLIENTID and EQUINIX_API_CLIENTSECRET. Read-only: it
 * creates, modifies and deletes nothing.
 */
public class ListLocationsAndTypes {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        TroubleticketApi api = new TroubleticketApi(client);

        // this service takes the Authorization header as an ordinary parameter on every call
        String authorization = "Bearer " + ExampleEnv.token();

        // detail=true adds the cages, accounts and cabinets under each IBX
        GetLocation200Response locations = api.getLocation(authorization, true, null, null);
        for (Location location : locations.getLocations()) {
            System.out.println("IBX " + location.getIbx() + ": " + location.getCages().size() + " cage(s)");
        }

        // narrow the list with the optional category filter, or pass null for every category
        GetTroubleTicketType200Response types = api.getTroubleTicketType(authorization, null);
        for (TroubleTicketType type : types.getTroubleTicketTypes()) {
            System.out.println(type.getCode() + "  " + type.getCategory() + "  " + type.getDescription()
                    + " (severity " + type.getSeverity() + ")");
        }
    }
}
