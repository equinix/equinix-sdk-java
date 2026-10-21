package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.AvailabilityAndMetrosApi;
import com.equinix.sdk.networkedgev1.model.GetDeviceTypesResponse;
import com.equinix.sdk.networkedgev1.model.SoftwarePackage;
import com.equinix.sdk.networkedgev1.model.VersionDetails;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceType;
import java.util.List;

/**
 * Lists the device types that can be ordered, with their software packages and versions, walking all
 * pages of the result. Pass a category (ROUTER, FIREWALL or SDWAN) as the first argument to filter.
 * The type code, package code and version printed here are the values a create-device request needs.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListDeviceTypes {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        AvailabilityAndMetrosApi api = new AvailabilityAndMetrosApi(client);
        String category = args.length > 0 ? args[0] : null;

        List<VirtualDeviceType> types = Paging.fetchAll((offset, limit) -> {
            GetDeviceTypesResponse page = api.getVirtualDeviceTypes(null, category, offset, limit, null);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (VirtualDeviceType type : types) {
            System.out.println(type.getDeviceTypeCode() + "  " + type.getCategory() + "  " + type.getName());
            if (type.getSoftwarePackages() == null) {
                continue;
            }
            for (SoftwarePackage pkg : type.getSoftwarePackages()) {
                System.out.println("    package " + pkg.getPackageCode() + " (" + pkg.getLicenseType() + ")");
                if (pkg.getVersionDetails() == null) {
                    continue;
                }
                for (VersionDetails version : pkg.getVersionDetails()) {
                    System.out.println("        version " + version.getVersion() + "  " + version.getStatus());
                }
            }
        }
        System.out.println(types.size() + " device types");
    }
}
