# Examples

Runnable examples for the services in this SDK. Each service has its own module under
`examples/<service>`, compiled together with the rest of the reactor so the examples stay in step
with the generated clients. Shared environment handling lives in `examples/common`.

## Configuration

Examples read their configuration from the environment, using the same variable names as the
[Equinix Terraform provider](https://registry.terraform.io/providers/equinix/equinix/latest/docs):

| Variable | Purpose |
| --- | --- |
| `EQUINIX_API_ENDPOINT` | API base URL (default `https://api.equinix.com`) |
| `EQUINIX_API_TOKEN` | Bearer token; used as-is when set |
| `EQUINIX_API_CLIENTID`, `EQUINIX_API_CLIENTSECRET` | Exchanged for a token when `EQUINIX_API_TOKEN` is not set |

## Running

```sh
mvn -q package -pl examples/<service> -am
java -cp "examples/<service>/target/classes:examples/<service>/target/lib/*" \
  com.equinix.sdk.examples.<service>.<ExampleClass>
```

Examples that create or delete resources say so in their header comment; read it before running.

## Adding a service

`script/onboard_service.sh <service> <spec-url>` creates `examples/<service>` along with the rest of
the service scaffolding.
