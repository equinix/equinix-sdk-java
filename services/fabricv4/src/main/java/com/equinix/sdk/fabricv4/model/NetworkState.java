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
 * Network status
 */
@JsonAdapter(NetworkState.Adapter.class)
public enum NetworkState {
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  DELETED("DELETED");

  private String value;

  NetworkState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkState fromValue(String value) {
    for (NetworkState b : NetworkState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkState> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    NetworkState.fromValue(value);
  }
}

