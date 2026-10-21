package com.equinix.sdk.examples.workvisitv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.workvisitv1.ApiClient;
import com.equinix.sdk.workvisitv1.ApiException;
import com.equinix.sdk.workvisitv1.Configuration;
import com.equinix.sdk.workvisitv1.api.WorkvisitApi;
import com.equinix.sdk.workvisitv1.model.ContactInfo;
import com.equinix.sdk.workvisitv1.model.IbxLocation;
import com.equinix.sdk.workvisitv1.model.IbxLocationCagesInner;
import com.equinix.sdk.workvisitv1.model.OrderItemResponse;
import com.equinix.sdk.workvisitv1.model.ServiceDetail;
import com.equinix.sdk.workvisitv1.model.ServiceDetailSchedule;
import com.equinix.sdk.workvisitv1.model.Visitor;
import com.equinix.sdk.workvisitv1.model.WorkVisitRequest;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Schedules a work visit: one visitor, ordering and notification contacts, one cage, starting
 * tomorrow for eight hours.
 *
 * <p>CREATES A REAL ORDER. It refuses to send anything unless EQUINIX_EXAMPLE_ALLOW_WRITES=true is
 * set. Replace the placeholder values below with an IBX, cage and account number from
 * {@link ListWorkVisitLocations}, and with real portal usernames, before enabling it.
 */
public class ScheduleWorkVisit {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.out.println("this example creates a work visit order; set EQUINIX_EXAMPLE_ALLOW_WRITES=true to run it");
            return;
        }

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        WorkvisitApi api = new WorkvisitApi(client);

        // for ordering and notification contacts only the user name and type are used
        ContactInfo ordering = new ContactInfo()
                .contactType(ContactInfo.ContactTypeEnum.ORDERING)
                .userName("<ordering_username>");
        ContactInfo notification = new ContactInfo()
                .contactType(ContactInfo.ContactTypeEnum.NOTIFICATION)
                .userName("<notification_username>");

        IbxLocation location = new IbxLocation()
                .ibx("<ibx>")
                .addCagesItem(new IbxLocationCagesInner()
                        .cage("<cage>")
                        .accountNumber("<account_number>"));

        // a visitor without a portal account is described by name and company
        Visitor visitor = new Visitor()
                .firstName("<visitor_firstname>")
                .lastName("<visitor_lastname>")
                .company("<visitor_company>");

        // a work visit can last at most two weeks, and cannot start in the past
        OffsetDateTime start = OffsetDateTime.now().plusDays(1);
        ServiceDetail details = new ServiceDetail()
                .schedule(new ServiceDetailSchedule().startDateTime(start).endDateTime(start.plusHours(8)))
                .visitors(List.of(visitor))
                .openCabinet(false);

        WorkVisitRequest request = new WorkVisitRequest()
                .contacts(List.of(ordering, notification))
                .ibxLocation(location)
                .serviceDetails(details);

        OrderItemResponse response = api.workVisitOrder("Bearer " + ExampleEnv.token(), request);
        System.out.println(response);
    }
}
