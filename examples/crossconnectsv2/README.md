# crossconnectsv2 examples

Examples for the Equinix Cross Connects v2 service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

The service only has operations that create or modify orders, so the three order examples below do
not send anything unless `EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. They build a realistic request
and print how to opt in otherwise. Clients here are not expected to match the earlier standalone
samples 1:1; the examples follow the maintained, spec-generated SDK.

| Example | Shows | Replaces (earlier sample operation) |
| --- | --- | --- |
| `OrderCrossConnect` | ordering a standard fiber cross connect between two patch panels (creates an order, guarded) | standard, intracustomer, extended and fiber cross connect orders |
| `RequestDeinstall` | ordering the removal of an existing cross connect by asset ID (guarded) | cross connect deinstall order |
| `UpdateOrderContacts` | adding a notification contact to an existing order (modifies an order, guarded) | none |
| `HandleCrossConnectErrors` | catching `ApiException`, reading status, headers and body, parsing `ErrorDetails`; sends an invalid token so nothing is created | none |

The service has no read operations, so there is no order retrieval example. It also has no list or
search operations, so there is no pagination example. The earlier sample's lookups (providers,
locations, types, connection services, patch panels) belong to other services and are not part of this
one.

`OrderCrossConnect` uses `EQUINIX_EXAMPLE_ALLOW_WRITES`; `RequestDeinstall` also reads
`EQUINIX_EXAMPLE_ASSET_ID` and `UpdateOrderContacts` reads `EQUINIX_EXAMPLE_ORDER_ID`.
