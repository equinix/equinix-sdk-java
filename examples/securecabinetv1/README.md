# securecabinetv1 examples

Examples for the Equinix Secure Cabinet service. See [examples/README.md](../README.md) for the
environment variables and how to run them. They bring the API surface of the Go
`check_availability` sample into the maintained, spec-generated SDK; the generated client's shape
wins, so the examples are not expected to match it one for one.

| Example | Shows | Replaces |
| --- | --- | --- |
| `CheckAvailability` | read-only: IBX locations where cabinets can be ordered, with power, size, PDU and Fabric port options | Go `check_availability` |
| `HandleSecureCabinetErrors` | catching `ApiException`, reading status, headers and body, parsing the array-of-errors body with a fallback for other bodies | the sample's error printing |
| `PlaceSecureCabinetOrder` | orders one cabinet using limits read from the availability call, with an idempotency key | none |

`SecureCabinetSupport` holds the shared client setup. `EQUINIX_EXAMPLE_ACCOUNT` is the billing
account number used by the availability and order examples.

## Orders do not run by default

`PlaceSecureCabinetOrder` creates a real order with a multi-year contract. It exits with a message
unless `EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. It also needs `EQUINIX_EXAMPLE_IBX` and the
technical contact in `EQUINIX_EXAMPLE_CONTACT_FIRST_NAME`, `EQUINIX_EXAMPLE_CONTACT_LAST_NAME` and
`EQUINIX_EXAMPLE_CONTACT_EMAIL`; `EQUINIX_EXAMPLE_PO_NUMBER` is optional.

## Pagination

None of the service's operations page their results, so there is no pagination example.

## Notes

- The spec declares a bearer security scheme, so the token is set once on the client with
  `setBearerToken`.
- Error bodies are JSON arrays of error objects, not a single object.
