# attachmentsv1 examples

Examples for the Equinix Attachments service. See [examples/README.md](../README.md) for the
environment variables and how to run them. They bring the attachment operations of the older standalone
sample clients into the maintained, spec-generated SDK; the clients are not expected to match those
samples 1:1.

| Example | Shows | Replaces (sample class / operation) |
| --- | --- | --- |
| `ListAttachments` | first page of attachments, then metadata of one by ID (read-only) | `AttachmentExample`: get attachments, get attachment by ID |
| `PaginateAttachments` | walking every page with `offset` and `limit` (read-only) | `AttachmentExample`: get attachments |
| `DownloadAttachment` | downloading the file content to a temp file (read-only on Equinix) | `AttachmentExample`: get attachment file |
| `UploadAndDeleteAttachment` | multipart upload of a temp file, then delete; needs `EQUINIX_EXAMPLE_ALLOW_WRITES=true` | `AttachmentExample`: post attachment, delete attachment |
| `HandleAttachmentErrors` | catching `ApiException`, reading status, headers and body, parsing the service's error model | none |

Notes:

- The operations take the `Authorization` header as an explicit parameter; the examples pass
  `"Bearer " + token`.
- The generated `getAttachedFile` returns nothing, so `DownloadAttachment` uses the generated
  `getAttachedFileCall` to stream the response body to a file.
- The spec describes `offset` as a page number, while its examples show record offsets; the pagination
  example advances by the number of records received and stops when the service returns no next link.
