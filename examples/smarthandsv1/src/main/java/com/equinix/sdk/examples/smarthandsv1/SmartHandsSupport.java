package com.equinix.sdk.examples.smarthandsv1;

import com.equinix.sdk.examples.ExampleEnv;
import com.equinix.sdk.smarthandsv1.ApiClient;
import com.equinix.sdk.smarthandsv1.Configuration;
import com.equinix.sdk.smarthandsv1.api.SmarthandsApi;
import com.equinix.sdk.smarthandsv1.model.ContactInfo;
import com.equinix.sdk.smarthandsv1.model.IbxLocation;
import com.equinix.sdk.smarthandsv1.model.IbxLocationCagesInner;
import com.equinix.sdk.smarthandsv1.model.PurchaseOrder;
import com.equinix.sdk.smarthandsv1.model.ScheduleInfo;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Shared setup and request-building helpers for the Smart Hands examples.
 *
 * <p>The Smart Hands API takes its bearer token as an {@code Authorization} header parameter on every
 * call rather than through a configured security scheme, so {@link #authorization()} returns the full
 * header value to pass to each operation.
 *
 * <p>Order examples build the sections every order shares (location, contacts, schedule, purchase
 * order) here. The values come from {@code EQUINIX_EXAMPLE_*} environment variables:
 *
 * <ul>
 *   <li>{@code EQUINIX_EXAMPLE_IBX}, {@code EQUINIX_EXAMPLE_CAGE}, {@code EQUINIX_EXAMPLE_ACCOUNT},
 *       {@code EQUINIX_EXAMPLE_CABINET} - where the work happens; use values returned by
 *       ListLocationsAndTypes
 *   <li>{@code EQUINIX_EXAMPLE_USERNAME} - the ordering and notification contact
 *   <li>{@code EQUINIX_EXAMPLE_CONTACT_NAME}, {@code EQUINIX_EXAMPLE_CONTACT_EMAIL}, {@code
 *       EQUINIX_EXAMPLE_PHONE_COUNTRY_CODE}, {@code EQUINIX_EXAMPLE_PHONE} - the technical contact
 *   <li>{@code EQUINIX_EXAMPLE_PO_NUMBER} - optional existing purchase order; the order is marked
 *       purchase order exempted when unset
 * </ul>
 */
final class SmartHandsSupport {
    private SmartHandsSupport() {}

    static SmarthandsApi api() {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        return new SmarthandsApi(client);
    }

    /** The value for the {@code Authorization} header parameter. */
    static String authorization() throws IOException, InterruptedException {
        return "Bearer " + ExampleEnv.token();
    }

    /**
     * Stops the example unless the caller has explicitly allowed it to create orders. Orders trigger
     * work by technicians and may be billed.
     */
    static void requireWritesAllowed(String example) {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.err.println(example + " places a real Smart Hands order, so it does not run by default.");
            System.err.println("Set EQUINIX_EXAMPLE_ALLOW_WRITES=true to send it.");
            System.exit(1);
        }
    }

    static String env(String name) {
        String value = System.getenv(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException("set " + name + " (see SmartHandsSupport for the variables orders need)");
        }
        return value;
    }

    static IbxLocation ibxLocation() {
        return new IbxLocation()
                .ibx(env("EQUINIX_EXAMPLE_IBX"))
                .addCagesItem(new IbxLocationCagesInner()
                        .cage(env("EQUINIX_EXAMPLE_CAGE"))
                        .accountNumber(env("EQUINIX_EXAMPLE_ACCOUNT"))
                        .addCabinetsItem(env("EQUINIX_EXAMPLE_CABINET")));
    }

    static List<ContactInfo> contacts() {
        return List.of(
                new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.ORDERING)
                        .userName(env("EQUINIX_EXAMPLE_USERNAME")),
                new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.TECHNICAL)
                        .name(env("EQUINIX_EXAMPLE_CONTACT_NAME"))
                        .email(env("EQUINIX_EXAMPLE_CONTACT_EMAIL"))
                        .workPhoneCountryCode(env("EQUINIX_EXAMPLE_PHONE_COUNTRY_CODE"))
                        .workPhone(env("EQUINIX_EXAMPLE_PHONE"))
                        .workPhonePrefToCall(ContactInfo.WorkPhonePrefToCallEnum.ANYTIME),
                new ContactInfo()
                        .contactType(ContactInfo.ContactTypeEnum.NOTIFICATION)
                        .userName(env("EQUINIX_EXAMPLE_USERNAME")));
    }

    /** A standard-priority schedule starting in two days and allowing a day for completion. */
    static ScheduleInfo schedule() {
        OffsetDateTime start = OffsetDateTime.now().plusDays(2);
        return new ScheduleInfo()
                .scheduleType(ScheduleInfo.ScheduleTypeEnum.STANDARD)
                .requestedStartDate(start)
                .requestedCompletionDate(start.plusDays(1));
    }

    static PurchaseOrder purchaseOrder() {
        String number = System.getenv("EQUINIX_EXAMPLE_PO_NUMBER");
        if (number == null || number.isEmpty()) {
            return new PurchaseOrder().purchaseOrderType(PurchaseOrder.PurchaseOrderTypeEnum.EXEMPTED);
        }
        return new PurchaseOrder().purchaseOrderType(PurchaseOrder.PurchaseOrderTypeEnum.EXISTING).number(number);
    }
}
