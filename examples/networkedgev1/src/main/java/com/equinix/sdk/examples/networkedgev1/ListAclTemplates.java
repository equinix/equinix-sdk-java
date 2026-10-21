package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;
import com.equinix.sdk.networkedgev1.model.DeviceACLDetailsResponse;
import com.equinix.sdk.networkedgev1.model.GetACLTemplateResponse;
import java.util.List;

/**
 * Lists your ACL templates, walking all pages of the result.
 *
 * <p>Read-only: it creates, modifies and deletes nothing.
 */
public class ListAclTemplates {
    public static void main(String[] args) throws ApiException {
        ApiClient client = NetworkEdgeClient.create();
        AclTemplateApi api = new AclTemplateApi(client);

        List<DeviceACLDetailsResponse> templates = Paging.fetchAll((offset, limit) -> {
            GetACLTemplateResponse page = api.getDeviceACLTemplate(offset, limit, null, null);
            return new Paging.Page<>(page.getData(), page.getPagination());
        });

        for (DeviceACLDetailsResponse template : templates) {
            int rules = template.getInboundRules() == null ? 0 : template.getInboundRules().size();
            System.out.println(template.getUuid() + "  " + template.getStatus() + "  " + template.getName()
                    + "  (" + rules + " inbound rules)");
        }
        System.out.println(templates.size() + " ACL templates");
    }
}
