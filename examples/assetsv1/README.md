# assetsv1 examples

Examples for the Install Bases Asset API. See [examples/README.md](../README.md) for the environment
variables and how to run them. They bring the API's usage into the maintained, spec-generated SDK;
the clients are not expected to match earlier standalone samples one to one.

| Example | Shows | Replaces |
| --- | --- | --- |
| `SearchAssets` | searching assets with a filter, sort order and page size (`searchAssets`) | `AssetsExample` / `getSearchAsset` |
| `GetAsset` | fetching one asset and its product details by asset number (`getAssetById`) | `AssetsExample` / `getAssetDetails` |
| `PaginateAssets` | walking every page of a search with `offset` and `limit`, with a page cap | new |
| `HandleAssetErrors` | catching `ApiException`, reading status, headers and body, parsing the service's error model | new |

All operations in this API only read data, so no example needs `EQUINIX_EXAMPLE_ALLOW_WRITES`.

Notes:

- The spec declares `Authorization` as an ordinary header parameter rather than a security scheme, so
  each call takes `"Bearer " + token` as its first argument.
- Optional variables: `EQUINIX_EXAMPLE_IBX` (search filter, default `DA1`) and
  `EQUINIX_EXAMPLE_ASSET_ID` (asset to fetch).
