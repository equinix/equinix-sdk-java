

# VendorConfigDetailsNode1

Vendor configuration for node 1

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostname** | **String** | The host name. Only a-z, A-Z, 0-9, and hyphen(-) are allowed. It should start with a letter and end with a letter or digit. The length should be between 2-30 characters. Exceptions - FTDv 2-14; Aruba 2-24. |  [optional] |
|**rootPassword** | **String** | Root password for the device. |  [optional] |
|**adminPassword** | **String** | The administrative password of the device. You can use it to log in to the console. This field is not available for all device types. |  [optional] |
|**panoramaIpAddress** | **String** | IP address of the Panorama controller. Provide this value to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access |  [optional] |
|**panoramaAuthKey** | **String** | This key supports secure onboarding of the Palo Alto firewall devices. Provide this value to have Panorama integration. Relevant for Palo Alto Self-Configured devices with Internet Access. |  [optional] |



