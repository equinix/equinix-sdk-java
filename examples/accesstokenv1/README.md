# accesstokenv1 examples

Examples for the Equinix API Authentication service. See [examples/README.md](../README.md) for the
environment variables and how to run them.

| Example | Shows |
| --- | --- |
| `GetAccessToken` | client_credentials token request, then renewal with the refresh token |
| `HandleTokenErrors` | catching `ApiException`, reading status, headers and body, parsing the service's error model |

The service has no list or search operations, so there is no pagination example.
