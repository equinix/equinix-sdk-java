package com.equinix.sdk.examples.attachmentsv1;

import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;
import com.equinix.sdk.attachmentsv1.model.Attachment;
import com.equinix.sdk.attachmentsv1.model.Status;
import com.equinix.sdk.examples.ExampleEnv;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Uploads a small temporary file as an attachment with the PO_DOCUMENT purpose, reads its metadata
 * back, then deletes it again.
 *
 * <p>Creates and deletes an attachment in your account, so it does nothing unless
 * EQUINIX_EXAMPLE_ALLOW_WRITES=true is set.
 */
public class UploadAndDeleteAttachment {
    public static void main(String[] args) throws Exception {
        if (!"true".equals(System.getenv("EQUINIX_EXAMPLE_ALLOW_WRITES"))) {
            System.out.println("This example uploads and deletes an attachment. "
                    + "Set EQUINIX_EXAMPLE_ALLOW_WRITES=true to run it.");
            return;
        }

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AttachmentsApi api = new AttachmentsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        Path file = Files.createTempFile("sdk-example-", ".txt");
        try {
            Files.writeString(file, "example attachment content\n", StandardCharsets.UTF_8);

            Attachment uploaded = api.createAttachment(authorization, file.toFile(), "PO_DOCUMENT");
            System.out.println("uploaded " + uploaded.getAttachmentName() + " as " + uploaded.getAttachmentId());

            Attachment fetched = api.getAttachment(uploaded.getAttachmentId(), authorization);
            System.out.println("size: " + fetched.getAttachmentSize() + " bytes");

            Status status = api.deleteAttachment(uploaded.getAttachmentId(), authorization);
            System.out.println("deleted: " + status.getStatus());
        } finally {
            Files.deleteIfExists(file);
        }
    }
}
