# networkedgev1 examples

Examples for the Equinix Network Edge service (`/ne/v1`). They bring the capabilities of earlier
standalone sample clients into the maintained, spec-generated SDK; the clients here are not expected
to match those samples one to one. See [examples/README.md](../README.md) for the environment
variables and how to run them.

Examples that create, modify or delete anything refuse to run unless `EQUINIX_EXAMPLE_ALLOW_WRITES=true`
is set, and say what they do in their header comment. `CreateVirtualDevice` orders a billable device.
The examples were compiled but have not been run against a live endpoint.

| Example | Shows | Writes? | Derived from |
| --- | --- | --- | --- |
| `ListMetros` | paged list of metros, optional region filter | read-only | sample `MetrosExample` |
| `ListAccountsInMetro` | accounts usable for ordering in a metro | read-only | Terraform `equinix_network_account` data source |
| `ListDeviceTypes` | paged device types with software packages and versions | read-only | Terraform `equinix_network_device_type`, `_software` and `_platform` data sources |
| `ListVirtualDevices` | paged list of virtual devices | read-only | Terraform `equinix_network_device` data source |
| `ListAclTemplates` | paged list of ACL templates | read-only | Terraform `equinix_network_acl_template` |
| `ListDeviceLinkGroups` | paged list of device link groups | read-only | Terraform `equinix_network_device_link` |
| `ListDeviceBackups` | paged list of device backups, optional device filter | read-only | none |
| `ListDeviceHistory` | paged reload and resource-upgrade history of one device | read-only | none |
| `HandleNetworkEdgeErrors` | catching `ApiException`, reading status, headers and body, parsing `FieldErrorResponse`, non-JSON fallback | read-only | none |
| `CreateVirtualDevice` | ordering a self-configured C8000V (BYOL) and reading its status | creates a billable device | Terraform `equinix_network_device` (`c8000v_byol_with_bandwidth_tier.tf`), `create-device` how-to |
| `AclTemplateLifecycle` | create, read, update, delete an ACL template | creates, modifies, deletes | Terraform `equinix_network_acl_template` |
| `DeviceLinkGroupLifecycle` | create, read, delete a device link group between two devices | creates, deletes | Terraform `equinix_network_device_link` |
| `DeviceBackupLifecycle` | create, read, delete a device backup | creates, deletes | none |

Shared helpers: `NetworkEdgeClient` builds the configured `ApiClient` (bearer token on the
`BearerAuth` scheme), `Paging` walks the offset/limit paging of list operations with a page-size
and a page-count cap, and `Writes` implements the `EQUINIX_EXAMPLE_ALLOW_WRITES` guard.

Every paged list operation in the API has a pagination example: metros, device types, virtual devices,
ACL templates, device link groups, device backups, and the reload and upgrade history of a device.

## Not in this API

Some capabilities of the earlier sample clients belong to other Equinix APIs and are not part of
the Network Edge specification: buyer preferences, seller profiles, authorization key validation and
L2 connections (Fabric APIs), and access token requests (the authentication service, `accesstokenv1`).
The sample `createNonHACSRDevice` has no direct counterpart; device ordering is covered by
`CreateVirtualDevice`.

## API areas without an example

- Device lifecycle beyond create: update, delete, soft reboot, ping, additional bandwidth, interface
  statistics, and creating a device from a draft
- Redundant (HA) and cluster device orders
- SSH keys: list and create public keys
- Pricing, order summaries, agreements and vendor/order terms
- Licensing: license file upload, license tokens
- File upload and downloadable images
- Device RMA and backup restore (restore analysis, restore, update, download)
- ACL templates attached to an existing device
- Allowed interface profiles, downtime notifications
