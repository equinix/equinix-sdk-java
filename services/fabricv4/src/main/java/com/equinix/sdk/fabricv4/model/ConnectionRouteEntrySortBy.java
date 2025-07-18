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
 * Possible field names to use on sorting
 */
@JsonAdapter(ConnectionRouteEntrySortBy.Adapter.class)
public enum ConnectionRouteEntrySortBy {
  
  CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
  
  CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime"),
  
  MED("/med"),
  
  CONNECTION_NAME("/connection/name"),
  
  TYPE("/type"),
  
  PREFIX("/prefix"),
  
  NEXTHOP("/nextHop");

  private String value;

  ConnectionRouteEntrySortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConnectionRouteEntrySortBy fromValue(String value) {
    for (ConnectionRouteEntrySortBy b : ConnectionRouteEntrySortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ConnectionRouteEntrySortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConnectionRouteEntrySortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConnectionRouteEntrySortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConnectionRouteEntrySortBy.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ConnectionRouteEntrySortBy.fromValue(value);
  }
}

