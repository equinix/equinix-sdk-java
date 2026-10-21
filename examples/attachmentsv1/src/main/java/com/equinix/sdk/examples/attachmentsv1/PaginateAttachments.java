package com.equinix.sdk.examples.attachmentsv1;

import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;
import com.equinix.sdk.attachmentsv1.model.Attachment;
import com.equinix.sdk.attachmentsv1.model.Records;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Walks every page of attachments using the offset and limit parameters until the service reports
 * no further page.
 *
 * <p>Read-only: creates, modifies and deletes nothing.
 */
public class PaginateAttachments {
    // the service accepts up to 100 records per page
    private static final int PAGE_SIZE = 50;
    // guard against a service that keeps returning data forever
    private static final int MAX_PAGES = 1000;

    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AttachmentsApi api = new AttachmentsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        int offset = 0;
        int count = 0;
        for (int page = 1; page <= MAX_PAGES; page++) {
            Records records = api.getAttachments(authorization, offset, PAGE_SIZE, null);
            for (Attachment attachment : records.getData()) {
                count++;
                System.out.println(attachment.getAttachmentId() + "  " + attachment.getAttachmentName());
            }
            System.out.println("-- page " + page + ": " + records.getData().size() + " records");

            // stop on an empty page, or when there is no next link
            boolean hasNext = records.getLinks() != null && records.getLinks().getNext() != null;
            if (records.getData().isEmpty() || !hasNext) {
                break;
            }
            offset += records.getData().size();
        }
        System.out.println("listed " + count + " attachments");
    }
}
