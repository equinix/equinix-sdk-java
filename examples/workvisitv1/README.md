# workvisitv1 examples

Examples for the Equinix Work Visits service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

These examples are part of bringing standalone sample clients' APIs into the maintained,
spec-generated SDK. The generated client is not expected to match those samples 1:1; the examples
cover the same intent.

| Example | Shows | Replaces |
| --- | --- | --- |
| `ListWorkVisitLocations` | listing the IBXs, cages, accounts and cabinets where work visits can be ordered (read-only) | `WorkVisitExample`, locations call (`getWorkVisitLocation`) |
| `HandleWorkVisitErrors` | catching `ApiException`, reading status, headers and body, parsing `GenericError` with a fallback for non-JSON bodies (read-only) | none |
| `ScheduleWorkVisit` | building and sending a work visit order with contacts, cage and visitor; **creates a real order**, so it only sends when `EQUINIX_EXAMPLE_ALLOW_WRITES=true` | `WorkVisitExample`, order call (`getWorkVisitResponse`) |

The service's only list operation (locations) returns everything in one response and takes no
paging parameters, so there is no pagination example.

The operations take the token as an `Authorization` header parameter rather than a configured
security scheme, so the examples pass `"Bearer " + ExampleEnv.token()` on each call.
