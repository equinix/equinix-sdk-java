

# RMAVendorConfig

RMA vendor configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**siteId** | **String** | Physical location within the Viptela overlay network, such as a branch office, or a campus (relevant only for Cisco SD-WANs) |  [optional] |
|**systemIpAddress** | **String** | IP assigned to the router and vSmart controller (relevant only for Cisco SD-WANs) |  [optional] |
|**licenseKey** | **String** | License key. Mandatory for some devices. |  [optional] |
|**licenseSecret** | **String** | License secret (Secret key). Mandatory for some devices. |  [optional] |
|**controller1** | **String** | For Fortinet devices, this is the System IP address. |  [optional] |
|**adminPassword** | **String** | The administrative password of the device. You can use it to log in to the console. This field is not available for all device types. Should be at least 6 characters long and must include an uppercase letter and a number. This field may be required for some vendors. |  [optional] |
|**activationKey** | **String** | Available on VMware Orchestration Portal |  [optional] |
|**provisioningKey** | **String** | Mandatory for Zscaler devices |  [optional] |
|**panoramaIpAddress** | **String** | IP address of the Panorama controller. Provide this value to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access |  [optional] |
|**panoramaAuthKey** | **String** | This key supports secure onboarding of the Palo Alto firewall devices. Provide this value to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access. |  [optional] |



