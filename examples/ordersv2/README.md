# ordersv2 examples

Examples for the Equinix Orders service. See [examples/README.md](../README.md) for the environment
variables and how to run them. The order examples read the order to use from
`EQUINIX_EXAMPLE_ORDER_ID`.

| Example | Shows |
| --- | --- |
| `GetOrderDetails` | read-only: one order with its line items, and its schedule negotiations |
| `HandleOrderErrors` | catching `ApiException`, reading status, headers and body, parsing the error model with a fallback for other bodies |
| `AddNoteToOrder` | adds a note to an order |
| `CancelOrder` | cancels an order |

`OrdersSupport` holds the shared client setup.

## Writes do not run by default

`AddNoteToOrder` and `CancelOrder` change a real order. Each exits with a message unless
`EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. The other examples only read.

## Pagination

The service looks orders up by id and has no list operation, so there is no pagination example.

## Notes

- The token is set on the client with `setBearerToken`, matching the spec's bearer security scheme.
- Operations for replying to a negotiation (`replyToAnOrderNegotiation`) follow the same pattern as
  the write examples and were left out to keep the set small.
- The spec's `productType`, price `type` and `billingStartDateTime` are generated as plain strings
  rather than enums or date-times, because the service returns values outside the documented lists
  and formats.
