package com.equinix.sdk.examples.networkedgev1;

import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;
import com.equinix.sdk.networkedgev1.model.ACLTemplateDetailsResponse;
import com.equinix.sdk.networkedgev1.model.DeviceACLTemplateRequest;
import com.equinix.sdk.networkedgev1.model.InboundRules;
import com.equinix.sdk.networkedgev1.model.VirtualDeviceCreateResponse;

/**
 * Creates an ACL template with two inbound rules, reads it back, renames it, then deletes it.
 *
 * <p>CREATES, MODIFIES AND DELETES a resource, but only the template this example creates. ACL
 * templates are not billable. It only runs when EQUINIX_EXAMPLE_ALLOW_WRITES=true is set. If a step
 * fails after the template was created, the template is left in place; delete it by the UUID printed
 * on the first line.
 */
public class AclTemplateLifecycle {
    public static void main(String[] args) throws ApiException {
        Writes.requireOptIn("creates, renames and deletes an ACL template");
        ApiClient client = NetworkEdgeClient.create();
        AclTemplateApi api = new AclTemplateApi(client);

        DeviceACLTemplateRequest request = new DeviceACLTemplateRequest()
                .name("sdk-example-acl")
                .description("Created by the SDK examples")
                .addInboundRulesItem(new InboundRules()
                        .seqNo(1)
                        .subnet("192.0.2.10/32")
                        .protocol("IP")
                        .srcPort("any")
                        .dstPort("any")
                        .description("allow the management host"))
                .addInboundRulesItem(new InboundRules()
                        .seqNo(2)
                        .subnet("198.51.100.0/24")
                        .protocol("UDP")
                        .srcPort("any")
                        .dstPort("53,1045,2041"));

        VirtualDeviceCreateResponse created = api.createDeviceACLTemplate(request, null);
        String uuid = created.getUuid();
        System.out.println("created ACL template " + uuid);

        ACLTemplateDetailsResponse template = api.getDeviceTemplateByUuid(uuid);
        System.out.println("read back: " + template.getName() + " with " + template.getInboundRules().size() + " rules");

        api.updateDeviceACLTemplateByUuid(uuid, request.name("sdk-example-acl-renamed"), null);
        System.out.println("renamed to " + api.getDeviceTemplateByUuid(uuid).getName());

        api.deleteDeviceACLByUuid(uuid, null);
        System.out.println("deleted ACL template " + uuid);
    }
}
