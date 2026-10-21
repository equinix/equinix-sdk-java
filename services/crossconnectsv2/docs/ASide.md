

# ASide

A-Side source patch panel to establish connection to another customer. Connections Service , Media Type and Protocol Type is mandatory to establish new connection. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanel** | [**PatchPanel**](PatchPanel.md) |  |  |
|**connectionService** | **ConnectionServices** |  |  |
|**mediaType** | **MediaTypes** |  |  |
|**protocolType** | **ProtocolTypes** |  |  |
|**connectorType** | **ConnectorTypes** |  |  |
|**mediaConverterRequired** | **Boolean** | When &#x60;false&#x60;, Equinix will not proceed with cross connect installation that requires media conversion |  [optional] |
|**ifcCircuitCount** | **Integer** | Use this field to request an intra-facility cable IFC with this order. Note that there might be a delay in fulfilment of Cross Connect as it is pending intra facility cabling |  [optional] |
|**patchEquipment** | [**PatchEquipment**](PatchEquipment.md) |  |  [optional] |



