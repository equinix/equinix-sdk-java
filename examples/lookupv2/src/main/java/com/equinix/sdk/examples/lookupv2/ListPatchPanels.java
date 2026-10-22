package com.equinix.sdk.examples.lookupv2;

import com.equinix.sdk.lookupv2.ApiException;
import com.equinix.sdk.lookupv2.api.LookupApi;
import com.equinix.sdk.lookupv2.model.PatchPanelDetails;
import com.equinix.sdk.lookupv2.model.PatchPanelResponse;
import java.io.IOException;
import java.util.List;

/**
 * Lists the patch panels in a cabinet and prints the details of the first one: its available ports
 * and the connection services it offers.
 *
 * <p>Needs {@code EQUINIX_EXAMPLE_CABINET_ID}, a cabinet ID as printed by {@link ListLocations}.
 * Read-only: it creates, modifies and deletes nothing.
 */
public class ListPatchPanels {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        String cabinetId = System.getenv("EQUINIX_EXAMPLE_CABINET_ID");
        if (cabinetId == null || cabinetId.isEmpty()) {
            System.err.println("Set EQUINIX_EXAMPLE_CABINET_ID to a cabinet ID printed by ListLocations.");
            System.exit(1);
        }
        LookupApi api = LookupSupport.api();

        List<PatchPanelResponse> panels = api.retrieveAllPatchPanels(cabinetId, null, null, null);
        panels.forEach(panel -> System.out.println(panel.getPatchPanelId() + " ports available "
                + panel.getAvailablePortCount() + " provisioning " + panel.getProvisioningType()));
        if (panels.isEmpty()) {
            return;
        }

        PatchPanelDetails details = api.retrievePatchPanelDetails(panels.get(0).getPatchPanelId(), null, null, null);
        System.out.println("patch panel " + details.getPatchPanelId() + " in " + details.getIbx()
                + " cage " + details.getCageId() + " cabinet " + details.getCabinetId());
        System.out.println("  available ports: " + details.getAvailablePorts());
        details.getConnectionServices().forEach(service ->
                System.out.println("  connection service " + service.getName() + " media types "
                        + service.getMediaTypes().size()));
    }
}
