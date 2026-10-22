package com.equinix.sdk.examples.orderhistoryv1;

import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.model.Filters;
import com.equinix.sdk.orderhistoryv1.model.OrderHistoryResponse;
import com.equinix.sdk.orderhistoryv1.model.Orderhistoryapirequest;
import java.io.IOException;

/**
 * Searches the order history of the last 30 days and prints the first page of orders.
 *
 * <p>Read-only: the search is a POST because the filters travel in the request body, but it creates
 * and modifies nothing.
 */
public class SearchOrders {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        Orderhistoryapirequest request =
                new Orderhistoryapirequest().filters(new Filters().dateRange(Filters.DateRangeEnum._30_DAYS));

        OrderHistoryResponse response =
                OrderHistorySupport.api().pOSTOrdersHistory(OrderHistorySupport.authorization(), request);

        System.out.println("orders on this page: " + response.getContent().size());
        response.getContent().forEach(order -> System.out.println("  " + order.getOrderNumber() + " "
                + order.getOrderStatus() + " created " + order.getCreatedAt() + " ibx " + order.getIbx()));
    }
}
