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
 * Type of change
 */
@JsonAdapter(NetworkChangeType.Adapter.class)
public enum NetworkChangeType {
  
  CREATION("NETWORK_CREATION"),
  
  UPDATE("NETWORK_UPDATE"),
  
  DELETION("NETWORK_DELETION");

  private String value;

  NetworkChangeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkChangeType fromValue(String value) {
    for (NetworkChangeType b : NetworkChangeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkChangeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkChangeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkChangeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkChangeType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    NetworkChangeType.fromValue(value);
  }
}

