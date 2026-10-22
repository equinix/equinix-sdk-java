package com.equinix.sdk.examples.internetaccessv2;

import com.equinix.sdk.internetaccessv2.ApiException;
import com.equinix.sdk.internetaccessv2.model.ConnectionType;
import com.equinix.sdk.internetaccessv2.model.Ibx;
import com.equinix.sdk.internetaccessv2.model.IbxPage;
import java.io.IOException;

/**
 * Lists the IBX locations where Internet Access can be ordered for a dedicated connection (IA_C).
 * Read-only. Prints only the first page; see ListServicesPaged for walking every page.
 */
public class ListIbxs {
    public static void main(String[] args) throws ApiException, IOException, InterruptedException {
        IbxPage page = InternetAccessSupport.availabilityApi().getIbxs(ConnectionType.IA_C, 0, 20, null, null);

        for (Ibx ibx : page.getData()) {
            System.out.println(ibx.getIbxCode() + "  " + ibx.getMetroCode() + "  " + ibx.getCountryName() + "  "
                    + ibx.getRegion());
        }
        System.out.println("showing " + page.getData().size() + " of " + page.getPagination().getTotal());
    }
}
