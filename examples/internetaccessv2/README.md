# internetaccessv2 examples

Examples for the Equinix Internet Access v2 service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

| Example | Shows |
| --- | --- |
| `ListIbxs` | read-only: IBX locations where Internet Access can be ordered |
| `ListServicesPaged` | read-only: paging through all services with offset and limit |
| `GetServiceDetails` | read-only: details of one service (`EQUINIX_EXAMPLE_SERVICE_ID`) |
| `HandleInternetAccessErrors` | catching `ApiException`, reading status, headers and body, parsing the error list with a fallback for other bodies |
| `CreateService` | creates a service on a connection (`EQUINIX_EXAMPLE_CONNECTION_ID`) |
| `UpdateServiceBandwidth` | replaces `/bandwidth` on a service, sent as a dry run |
| `DeleteService` | deletes a service, sent as a dry run |

`InternetAccessSupport` holds the shared client setup and the environment variables the examples
read, documented in its Javadoc.

## Writes do not run by default

`CreateService`, `UpdateServiceBandwidth` and `DeleteService` exit with a message unless
`EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. The update and delete examples additionally send
`dryRun=true`, so the service only validates the request. The other examples only read.

## Pagination

`getIbxs` and `getEquinixInternetAccessServices` page with `offset` and `limit`, and the response
carries a `pagination` block with the total. `ListServicesPaged` shows the loop.

## Notes

- The token is set on the client as a bearer token, as the spec declares a bearer security scheme.
- The spec's error response is a list of errors, so the error example parses an `Error[]`.
- `CreateService` leaves out the optional `order` section (contacts, purchase order) that a real
  order may need.
