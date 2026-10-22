package com.equinix.sdk.examples.ordersv2;

import com.equinix.sdk.ordersv2.ApiException;
import com.equinix.sdk.ordersv2.model.NoteRequest;
import java.io.IOException;

/**
 * Adds a note to an existing order.
 *
 * <p><b>Changes a real order.</b> It does nothing unless EQUINIX_EXAMPLE_ALLOW_WRITES=true, and needs
 * {@code EQUINIX_EXAMPLE_ORDER_ID}. The service answers with an empty success response.
 */
public class AddNoteToOrder {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        OrdersSupport.requireWritesAllowed("AddNoteToOrder");

        NoteRequest note = new NoteRequest().text("Note added by the SDK example AddNoteToOrder.");
        OrdersSupport.api().addNotesToAnOrder(OrdersSupport.orderId(), note);
        System.out.println("note added");
    }
}
