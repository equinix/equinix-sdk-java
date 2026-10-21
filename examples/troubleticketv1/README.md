# troubleticketv1 examples

Examples for the Equinix Trouble Ticket service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

| Example | Shows | Replaces (earlier standalone sample) |
| --- | --- | --- |
| `ListLocationsAndTypes` | read-only lookups of permitted IBX locations (with cages, accounts, cabinets) and of trouble ticket types | `TroubleTicketExample`: types and locations calls |
| `HandleTicketErrors` | catching `ApiException`, reading status, headers and body, parsing the service's error model with a fallback for other bodies | none (new) |
| `PlaceTroubleTicket` | building a full ticket request (IBX/cage/cabinet, problem code, ordering, notification and technical contacts) and submitting it; creates a real ticket, so it only sends when `EQUINIX_EXAMPLE_ALLOW_WRITES=true` | `TroubleTicketExample`: place order call |

The service's operations do not page their results, so there is no pagination example.

Notes:

- The service takes the `Authorization` header as an ordinary parameter of each call rather than as a
  configured security scheme, so the examples pass `"Bearer " + token` to every call.
- The examples are not meant to match the earlier standalone samples one for one; they follow the
  shape of the generated client.
