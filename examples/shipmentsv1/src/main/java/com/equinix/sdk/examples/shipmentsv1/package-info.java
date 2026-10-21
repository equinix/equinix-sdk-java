/**
 * Examples for the Equinix Shipments service (shipmentsv1).
 *
 * <p>The service has no list or search operations that page their results, so there is no
 * pagination example. {@code getLocation} returns every location the caller can access in a single
 * response.
 *
 * <p>The three order operations (inbound, outbound and pending storage) create real shipment
 * orders. Their examples build a realistic request but only send it when
 * {@code EQUINIX_EXAMPLE_ALLOW_WRITES=true} is set.
 */
package com.equinix.sdk.examples.shipmentsv1;
