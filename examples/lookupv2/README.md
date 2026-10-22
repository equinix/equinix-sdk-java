# lookupv2 examples

Examples for the Equinix Lookup service, which lists the locations, cages, cabinets, providers,
connection services and patch panels the caller can use when ordering cross connects. See
[examples/README.md](../README.md) for the environment variables and how to run them.

| Example | Shows |
| --- | --- |
| `ListLocations` | read-only: IBX locations with their accounts, cages and cabinets for a permission code |
| `ListPatchPanels` | read-only: patch panels in a cabinet (`EQUINIX_EXAMPLE_CABINET_ID`), then the details of the first one |
| `HandleLookupErrors` | catching `ApiException`, reading status, headers and body, parsing the error array with a fallback to the raw body |

`LookupSupport` holds the shared client setup. The token is set once on the client with
`setBearerToken`, since the spec declares a bearer security scheme.

## Writes

Every operation is a `GET`, so there are no write examples and `EQUINIX_EXAMPLE_ALLOW_WRITES` has
no effect here.

## Pagination

None of the service's operations page their results, so there is no pagination example.

## Operations without an example

`retrieveListOfProviders` (cage ID and account number) and `retrieveListOfConnectionServices` (IBX)
follow the same pattern as the examples above: call the method on `LookupApi` with the values
`ListLocations` prints.

## Notes

- The spec declares `additionalInfo` in the error model as an object, while the service's documented
  error bodies contain a list, so parsing can fail and the raw body is printed.
