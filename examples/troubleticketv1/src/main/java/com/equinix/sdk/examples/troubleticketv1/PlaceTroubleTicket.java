package com.equinix.sdk.examples.troubleticketv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;
import com.equinix.sdk.troubleticketv1.model.ContactInfo;
import com.equinix.sdk.troubleticketv1.model.IbxLocation;
import com.equinix.sdk.troubleticketv1.model.IbxLocationCagesInner;
import com.equinix.sdk.troubleticketv1.model.TroubleTicketOrderRequest;
import com.equinix.sdk.troubleticketv1.model.TroubleTicketOrderRequestServiceDetails;
import com.equinix.sdk.troubleticketv1.model.TroubleTicketResponse;
import java.time.OffsetDateTime;

/**
 * Builds a trouble ticket request and submits it.
 *
 * <p>CREATES A REAL SUPPORT TICKET: the trouble ticket service is a production system and a ticket
 * is worked by Equinix staff. For that reason the order is only sent when
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true; otherwise the example prints what it would send and exits. Fill
 * in the placeholder IBX, cage, account, cabinet and user names first, taking valid values from
 * {@link ListLocationsAndTypes}.
 *
 * <p>Requires EQUINIX_API_TOKEN, or EQUINIX_API_CLIENTID and EQUINIX_API_CLIENTSECRET.
 */
public class PlaceTroubleTicket {
    public static void main(String[] args) throws Exception {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.out.println("This example creates a real trouble ticket, so it does not send one by default.");
            System.out.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true (and replace the placeholder values) to run it.");
            return;
        }

        // Replace these with values returned by the locations lookup for your account.
        TroubleTicketOrderRequest request = new TroubleTicketOrderRequest()
                .customerReferenceNumber("TEST-SDK-EXAMPLE")
                .ibxLocation(new IbxLocation()
                        .ibx("CH1")
                        .addCagesItem(new IbxLocationCagesInner()
                                .cage("CH1:05:000750")
                                .accountNumber("12345")
                                .addCabinetsItem("CH1:05:000750:01")))
                // the incident time must not be in the future
                .serviceDetails(new TroubleTicketOrderRequestServiceDetails()
                        .incidentDateTime(OffsetDateTime.now().minusHours(1))
                        .problemCode(TroubleTicketOrderRequestServiceDetails.ProblemCodeEnum.NET01)
                        .callFromCage(false)
                        .additionalDetails("TEST: example request from the SDK examples, please disregard"))
                // an ordering and a notification contact are mandatory; a technical contact is optional
                .addContactsItem(new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.ORDERING)
                        .userName("your-portal-username"))
                .addContactsItem(new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.NOTIFICATION)
                        .userName("your-portal-username"))
                .addContactsItem(new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.TECHNICAL)
                        .userName("your-portal-username")
                        .name("Your Name")
                        .email("you@example.com")
                        .workPhoneCountryCode("+1")
                        .workPhone("111-111-1111")
                        .workPhonePrefToCall(ContactInfo.WorkPhonePrefToCallEnum.ANYTIME));

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        TroubleticketApi api = new TroubleticketApi(client);

        try {
            TroubleTicketResponse response = api.placeTroubleTicketOrder("Bearer " + ExampleEnv.token(), request);
            System.out.println("created trouble ticket order " + response.getOrderNumber());
        } catch (ApiException e) {
            System.out.println("request rejected, HTTP " + e.getCode() + ": " + e.getResponseBody());
        }
    }
}
