/*
 * Equinix Fabric API v4
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.sdk.fabricv4.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * VPN Tunnel lifecycle state
 */
@JsonAdapter(VpnTunnelState.Adapter.class)
public enum VpnTunnelState {
  
  PROVISIONING("PROVISIONING"),
  
  PROVISIONED("PROVISIONED"),
  
  DEPROVISIONING("DEPROVISIONING"),
  
  DEPROVISIONED("DEPROVISIONED"),
  
  REPROVISIONING("REPROVISIONING"),
  
  PROVISIONING_FAILED("PROVISIONING_FAILED"),
  
  DEPROVISIONING_FAILED("DEPROVISIONING_FAILED");

  private String value;

  VpnTunnelState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VpnTunnelState fromValue(String value) {
    for (VpnTunnelState b : VpnTunnelState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VpnTunnelState> {
    @Override
    public void write(final JsonWriter jsonWriter, final VpnTunnelState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VpnTunnelState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VpnTunnelState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    VpnTunnelState.fromValue(value);
  }
}

