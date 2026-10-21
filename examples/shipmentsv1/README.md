# shipmentsv1 examples

Examples for the Equinix Shipments service. See [examples/README.md](../README.md) for the
environment variables and how to run them. They are part of bringing the APIs of older standalone
sample clients into the maintained, spec-generated SDK; the clients are not expected to match those
samples one to one.

The order operations create real shipment orders, so their examples build the request but only send
it when `EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. Replace the placeholder values (IBX, cage,
account number, users) first; `ListShipmentLocations` shows the ones your account can use.

| Example | Shows | Replaces |
| --- | --- | --- |
| `ListShipmentLocations` | read-only listing of IBX sites, cages and accounts available for shipments | shipment locations call in the earlier sample's `ShipmentExample` |
| `HandleShipmentErrors` | catching `ApiException`, reading status, headers and body, parsing the error array into `GenericErrorType` | none |
| `SubmitInboundShipment` | building an inbound shipment order; creates an order, guarded | inbound shipment call in `ShipmentExample` |
| `SubmitOutboundShipment` | building an outbound shipment order; creates an order, guarded | outbound shipment call in `ShipmentExample` |
| `SubmitPendingStorageOrder` | requesting delivery of items in pending storage; creates orders, guarded | none |

No operation in this service pages its results, so there is no pagination example.

The Authorization header is an ordinary parameter of each operation in this API, so the examples
pass `"Bearer " + token` explicitly rather than configuring an authentication on the client.
