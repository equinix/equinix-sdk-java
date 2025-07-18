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
 * Equinix assigned state.
 */
@JsonAdapter(ServiceProfileStateEnum.Adapter.class)
public enum ServiceProfileStateEnum {
  
  ACTIVE("ACTIVE"),
  
  PENDING_APPROVAL("PENDING_APPROVAL"),
  
  DELETED("DELETED"),
  
  REJECTED("REJECTED");

  private String value;

  ServiceProfileStateEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServiceProfileStateEnum fromValue(String value) {
    for (ServiceProfileStateEnum b : ServiceProfileStateEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ServiceProfileStateEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServiceProfileStateEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServiceProfileStateEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServiceProfileStateEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ServiceProfileStateEnum.fromValue(value);
  }
}

