package com.equinix.sdk.examples.orderhistoryv1;

import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.model.Filters;
import com.equinix.sdk.orderhistoryv1.model.OrderHistoryResponse;
import com.equinix.sdk.orderhistoryv1.model.Orderhistoryapirequest;
import com.equinix.sdk.orderhistoryv1.model.PageRequestModel;
import java.io.IOException;

/**
 * Walks every page of the last year of orders. The search takes the page (zero based) and page size
 * in the request body and reports {@code totalPages} in the response.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class PaginateOrders {
    private static final int PAGE_SIZE = 20;

    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        var api = OrderHistorySupport.api();
        String authorization = OrderHistorySupport.authorization();

        int total = 0;
        int totalPages = 1;
        for (int page = 0; page < totalPages; page++) {
            Orderhistoryapirequest request = new Orderhistoryapirequest()
                    .filters(new Filters().dateRange(Filters.DateRangeEnum.YEAR))
                    .page(new PageRequestModel().number(page).size(PAGE_SIZE));

            OrderHistoryResponse response = api.pOSTOrdersHistory(authorization, request);
            if (response.getPage() != null && response.getPage().getTotalPages() != null) {
                totalPages = response.getPage().getTotalPages();
            }
            total += response.getContent().size();
            System.out.println("page " + page + " of " + totalPages + ": " + response.getContent().size() + " orders");
        }
        System.out.println("total orders: " + total);
    }
}
