# smarthandsv1 examples

Examples for the Equinix Smart Hands service. See [examples/README.md](../README.md) for the
environment variables and how to run them. They bring the API surface of older standalone sample
clients into the maintained, spec-generated SDK; the generated client's shape wins, so the examples
are not expected to match those samples one for one.

| Example | Shows | Replaces |
| --- | --- | --- |
| `ListLocationsAndTypes` | read-only: order types and the IBX locations, cages and cabinets you can order for | `getSmartHandsList`, `getLocationResponse` |
| `HandleSmartHandsErrors` | catching `ApiException`, reading status, headers and body, parsing the error model with a fallback for other bodies | the sample's generic error printing |
| `PlacePatchCableInstallOrder` | places a patch cable installation order | `getSmartHandsPatchCableInstallResponse` |
| `PlaceCageEscortOrder` | places a cage escort order | `getCageEscortResponse` |
| `PlaceShipmentUnpackOrder` | places a shipment unpack order | `getShipmentUnpackResponse` |
| `PlaceOtherOrder` | places an order for work outside the catalogue | `getSmartHandsOtherResponse` |

`SmartHandsSupport` holds the shared client setup and the request sections every order has
(location, contacts, schedule, purchase order), read from `EQUINIX_EXAMPLE_*` variables documented
in its Javadoc.

## Orders do not run by default

The four `Place*Order` examples create real orders. Each exits with a message unless
`EQUINIX_EXAMPLE_ALLOW_WRITES=true` is set. The other examples only read.

## Pagination

None of the service's operations page their results, so there is no pagination example.

## Order types without an example

They follow the same pattern as the placed orders: build the request with the shared helpers from
`SmartHandsSupport`, add the type's `serviceDetails`, call the matching `handleSmartHand*Order` method.
They were left out to keep the set small, not because anything differs.

- `cableRequest`, `cageCleanup`, `equipmentInstall`, `locatePackage`, `moveJumperCable`,
  `patchCableRemoval`, `picturesDocument`, `runJumperCable`

## Notes

- The token is passed to each call as the `Authorization` header parameter (`Bearer <token>`); the
  spec defines no security scheme.
- Order operations return no body in the generated client, although the service documentation
  describes an order number in the response.
- The spec declares `errors` in the error model as a list of strings, while the service's documented
  error bodies contain objects, so parsing into the model can fail and the raw body is printed.
