package com.equinix.sdk.examples.attachmentsv1;

import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;
import com.equinix.sdk.attachmentsv1.model.Attachment;
import com.equinix.sdk.attachmentsv1.model.Records;
import com.equinix.sdk.examples.ExampleEnv;

/**
 * Lists the first page of attachments, then fetches the metadata of the first one by its ID.
 *
 * <p>Read-only: creates, modifies and deletes nothing. See {@link PaginateAttachments} to walk every
 * page.
 */
public class ListAttachments {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AttachmentsApi api = new AttachmentsApi(client);
        // the authorization header is an explicit parameter of every operation
        String authorization = "Bearer " + ExampleEnv.token();

        Records records = api.getAttachments(authorization, 0, 10, null);
        for (Attachment attachment : records.getData()) {
            System.out.println(attachment.getAttachmentId() + "  " + attachment.getAttachmentName()
                    + "  " + attachment.getAttachmentSize() + " bytes");
        }
        if (records.getPage() != null) {
            System.out.println("total attachments: " + records.getPage().getTotal());
        }

        if (!records.getData().isEmpty()) {
            Attachment first = api.getAttachment(records.getData().get(0).getAttachmentId(), authorization);
            System.out.println("created by " + first.getCreatedBy() + " on " + first.getCreatedDate());
        }
    }
}
