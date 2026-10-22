# orderhistoryv1 examples

Examples for the Equinix Order History service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

| Example | Shows |
| --- | --- |
| `ListOrderLocations` | read-only: the IBX locations and cages whose order history you may view |
| `SearchOrders` | read-only: searching the last 30 days of orders with a date range filter |
| `PaginateOrders` | read-only: walking every page of a search using the page number, size and `totalPages` |
| `HandleOrderHistoryErrors` | catching `ApiException`, reading status, headers and body, parsing the error model with a fallback for other bodies |

`OrderHistorySupport` holds the shared client setup.

## Writes

The service has no operations that create or change anything (the search is a POST only because the
filters go in the body), so there are no write examples and `EQUINIX_EXAMPLE_ALLOW_WRITES` is not used.

## Notes

- The token is passed to each call as the `Authorization` header parameter (`Bearer <token>`); the
  spec defines no security scheme. The parameter is optional in the generated client.
- The spec declares `errors` in the error model as a list of strings, while the service's documented
  error bodies contain objects, so parsing into the model can fail and the raw body is printed.
