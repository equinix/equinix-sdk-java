package com.equinix.sdk.examples.attachmentsv1;

import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;
import com.equinix.sdk.attachmentsv1.model.Attachment;
import com.equinix.sdk.attachmentsv1.model.Records;
import com.equinix.sdk.examples.ExampleEnv;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import okhttp3.Response;

/**
 * Downloads the content of an attachment to a temporary file. The attachment ID is the first
 * argument; without one, the first attachment in the list is used.
 *
 * <p>Read-only on Equinix: it only writes a file to the local temp directory.
 */
public class DownloadAttachment {
    public static void main(String[] args) throws Exception {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(ExampleEnv.endpoint());
        AttachmentsApi api = new AttachmentsApi(client);
        String authorization = "Bearer " + ExampleEnv.token();

        UUID attachmentId;
        if (args.length > 0) {
            attachmentId = UUID.fromString(args[0]);
        } else {
            Records records = api.getAttachments(authorization, 0, 1, null);
            if (records.getData().isEmpty()) {
                System.out.println("no attachments to download");
                return;
            }
            attachmentId = records.getData().get(0).getAttachmentId();
        }

        Attachment metadata = api.getAttachment(attachmentId, authorization);

        // getAttachedFile() is generated as returning void, so it would discard the bytes; build the
        // call instead and stream the response body to a file
        try (Response response = api.getAttachedFileCall(attachmentId, authorization, null).execute()) {
            if (!response.isSuccessful()) {
                throw new ApiException(response.code(), response.message(), response.headers().toMultimap(),
                        response.body() == null ? null : response.body().string());
            }
            Path target = Files.createTempFile("attachment-", "-" + metadata.getAttachmentName());
            Files.copy(response.body().byteStream(), target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("downloaded " + Files.size(target) + " bytes to " + target);
        }
    }
}
