package com.equinix.sdk.examples.securecabinetv1;

import com.equinix.sdk.securecabinetv1.ApiException;
import com.equinix.sdk.securecabinetv1.api.AvailabilityApi;
import com.equinix.sdk.securecabinetv1.model.Dimension;
import com.equinix.sdk.securecabinetv1.model.Dimensions;
import com.equinix.sdk.securecabinetv1.model.ProductsAvailability;
import java.io.IOException;
import java.util.List;

/**
 * Lists the IBX data centers where Secure Cabinets can be ordered for a billing account, with the
 * power, size, PDU and Fabric port options at each. Set {@code EQUINIX_EXAMPLE_ACCOUNT} to the
 * billing account number.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class CheckAvailability {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        AvailabilityApi api = new AvailabilityApi(SecureCabinetSupport.client());

        List<ProductsAvailability> availability = api.getProductsAvailability(SecureCabinetSupport.account());
        System.out.println(availability.size() + " IBX locations with Secure Cabinet availability");
        for (ProductsAvailability ibx : availability) {
            System.out.println("IBX " + ibx.getIbx());
            System.out.println("  max cabinets per order: " + ibx.getMaximumNumberOfCabinetsToOrder());
            System.out.println("  draw per cabinet:       " + ibx.getMinimumDrawCapacityPerCabinet() + " to "
                    + ibx.getMaximumDrawCapacityPerCabinet() + " kVA");
            Dimensions size = ibx.getCabinetDimensions();
            System.out.println("  cabinet size (WxDxH):   " + format(size.getWidth()) + " x " + format(size.getDepth())
                    + " x " + format(size.getHeight()));
            // a missing PDU configuration or Fabric port speed means the option is not offered there
            System.out.println("  PDUs offered:           " + (ibx.getPduConfiguration() != null));
            System.out.println("  Fabric port offered:    " + (ibx.getFabricPortSpeed() != null));
        }
    }

    private static String format(Dimension dimension) {
        return dimension.getValue() + " " + dimension.getUnit();
    }
}
