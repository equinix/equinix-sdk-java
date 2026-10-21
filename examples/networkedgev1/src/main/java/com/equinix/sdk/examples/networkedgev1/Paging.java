package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.model.PaginationResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Walks the offset/limit paging that every paged Network Edge list operation uses. Each response
 * carries a {@link PaginationResponse} with the offset and limit that were applied and the total
 * number of results.
 */
final class Paging {
    /** Page size sent as {@code limit}; the service default is 20. */
    static final int PAGE_SIZE = 50;

    /** Upper bound on requests, so a misbehaving service cannot keep a loop running forever. */
    private static final int MAX_PAGES = 1000;

    private Paging() {}

    /** One page of results, as returned by a list operation. */
    static final class Page<T> {
        final List<T> data;
        final PaginationResponse pagination;

        Page(List<T> data, PaginationResponse pagination) {
            this.data = data;
            this.pagination = pagination;
        }
    }

    /** Calls a list operation for one page. */
    interface Fetcher<T> {
        Page<T> fetch(int offset, int limit) throws ApiException;
    }

    /** Fetches pages until the service reports no more results and returns everything. */
    static <T> List<T> fetchAll(Fetcher<T> fetcher) throws ApiException {
        List<T> all = new ArrayList<>();
        int offset = 0;
        for (int page = 0; page < MAX_PAGES; page++) {
            Page<T> result = fetcher.fetch(offset, PAGE_SIZE);
            List<T> data = result.data == null ? new ArrayList<>() : result.data;
            all.addAll(data);
            offset += PAGE_SIZE;

            // stop on an empty page, or once the reported total has been reached
            Integer total = result.pagination == null ? null : result.pagination.getTotal();
            if (data.isEmpty() || (total != null && offset >= total)) {
                return all;
            }
        }
        throw new IllegalStateException("gave up after " + MAX_PAGES + " pages");
    }
}
