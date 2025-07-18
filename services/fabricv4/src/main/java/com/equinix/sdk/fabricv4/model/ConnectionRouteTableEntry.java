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
import com.equinix.sdk.fabricv4.model.Changelog;
import com.equinix.sdk.fabricv4.model.ConnectionRouteTableEntryConnection;
import com.equinix.sdk.fabricv4.model.RouteTableEntryProtocolType;
import com.equinix.sdk.fabricv4.model.RouteTableEntryType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.equinix.sdk.fabricv4.JSON;

/**
 * Advertised and received route table entry object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ConnectionRouteTableEntry {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private RouteTableEntryType type;

  public static final String SERIALIZED_NAME_PROTOCOL_TYPE = "protocolType";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_TYPE)
  @javax.annotation.Nullable
  private RouteTableEntryProtocolType protocolType;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nonnull
  private StateEnum state;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  @javax.annotation.Nullable
  private String age;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  @javax.annotation.Nullable
  private String prefix;

  public static final String SERIALIZED_NAME_NEXT_HOP = "nextHop";
  @SerializedName(SERIALIZED_NAME_NEXT_HOP)
  @javax.annotation.Nullable
  private String nextHop;

  public static final String SERIALIZED_NAME_M_E_D = "MED";
  @SerializedName(SERIALIZED_NAME_M_E_D)
  @javax.annotation.Nullable
  private Integer MED;

  public static final String SERIALIZED_NAME_LOCAL_PREFERENCE = "localPreference";
  @SerializedName(SERIALIZED_NAME_LOCAL_PREFERENCE)
  @javax.annotation.Nullable
  private Integer localPreference;

  public static final String SERIALIZED_NAME_AS_PATH = "asPath";
  @SerializedName(SERIALIZED_NAME_AS_PATH)
  @javax.annotation.Nullable
  private List<String> asPath = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  @javax.annotation.Nullable
  private ConnectionRouteTableEntryConnection connection;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  @javax.annotation.Nonnull
  private Changelog changeLog;

  public ConnectionRouteTableEntry() {
  }

  public ConnectionRouteTableEntry type(@javax.annotation.Nonnull RouteTableEntryType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public RouteTableEntryType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull RouteTableEntryType type) {
    this.type = type;
  }


  public ConnectionRouteTableEntry protocolType(@javax.annotation.Nullable RouteTableEntryProtocolType protocolType) {
    this.protocolType = protocolType;
    return this;
  }

  /**
   * Get protocolType
   * @return protocolType
   */
  @javax.annotation.Nullable
  public RouteTableEntryProtocolType getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(@javax.annotation.Nullable RouteTableEntryProtocolType protocolType) {
    this.protocolType = protocolType;
  }


  public ConnectionRouteTableEntry state(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
  }


  public ConnectionRouteTableEntry age(@javax.annotation.Nullable String age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  @javax.annotation.Nullable
  public String getAge() {
    return age;
  }

  public void setAge(@javax.annotation.Nullable String age) {
    this.age = age;
  }


  public ConnectionRouteTableEntry prefix(@javax.annotation.Nullable String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(@javax.annotation.Nullable String prefix) {
    this.prefix = prefix;
  }


  public ConnectionRouteTableEntry nextHop(@javax.annotation.Nullable String nextHop) {
    this.nextHop = nextHop;
    return this;
  }

  /**
   * Get nextHop
   * @return nextHop
   */
  @javax.annotation.Nullable
  public String getNextHop() {
    return nextHop;
  }

  public void setNextHop(@javax.annotation.Nullable String nextHop) {
    this.nextHop = nextHop;
  }


  public ConnectionRouteTableEntry MED(@javax.annotation.Nullable Integer MED) {
    this.MED = MED;
    return this;
  }

  /**
   * Get MED
   * @return MED
   */
  @javax.annotation.Nullable
  public Integer getMED() {
    return MED;
  }

  public void setMED(@javax.annotation.Nullable Integer MED) {
    this.MED = MED;
  }


  public ConnectionRouteTableEntry localPreference(@javax.annotation.Nullable Integer localPreference) {
    this.localPreference = localPreference;
    return this;
  }

  /**
   * Get localPreference
   * @return localPreference
   */
  @javax.annotation.Nullable
  public Integer getLocalPreference() {
    return localPreference;
  }

  public void setLocalPreference(@javax.annotation.Nullable Integer localPreference) {
    this.localPreference = localPreference;
  }


  public ConnectionRouteTableEntry asPath(@javax.annotation.Nullable List<String> asPath) {
    this.asPath = asPath;
    return this;
  }

  public ConnectionRouteTableEntry addAsPathItem(String asPathItem) {
    if (this.asPath == null) {
      this.asPath = new ArrayList<>();
    }
    this.asPath.add(asPathItem);
    return this;
  }

  /**
   * Get asPath
   * @return asPath
   */
  @javax.annotation.Nullable
  public List<String> getAsPath() {
    return asPath;
  }

  public void setAsPath(@javax.annotation.Nullable List<String> asPath) {
    this.asPath = asPath;
  }


  public ConnectionRouteTableEntry connection(@javax.annotation.Nullable ConnectionRouteTableEntryConnection connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
   */
  @javax.annotation.Nullable
  public ConnectionRouteTableEntryConnection getConnection() {
    return connection;
  }

  public void setConnection(@javax.annotation.Nullable ConnectionRouteTableEntryConnection connection) {
    this.connection = connection;
  }


  public ConnectionRouteTableEntry changeLog(@javax.annotation.Nonnull Changelog changeLog) {
    this.changeLog = changeLog;
    return this;
  }

  /**
   * Get changeLog
   * @return changeLog
   */
  @javax.annotation.Nonnull
  public Changelog getChangeLog() {
    return changeLog;
  }

  public void setChangeLog(@javax.annotation.Nonnull Changelog changeLog) {
    this.changeLog = changeLog;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ConnectionRouteTableEntry instance itself
   */
  public ConnectionRouteTableEntry putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionRouteTableEntry connectionRouteTableEntry = (ConnectionRouteTableEntry) o;
    return Objects.equals(this.type, connectionRouteTableEntry.type) &&
        Objects.equals(this.protocolType, connectionRouteTableEntry.protocolType) &&
        Objects.equals(this.state, connectionRouteTableEntry.state) &&
        Objects.equals(this.age, connectionRouteTableEntry.age) &&
        Objects.equals(this.prefix, connectionRouteTableEntry.prefix) &&
        Objects.equals(this.nextHop, connectionRouteTableEntry.nextHop) &&
        Objects.equals(this.MED, connectionRouteTableEntry.MED) &&
        Objects.equals(this.localPreference, connectionRouteTableEntry.localPreference) &&
        Objects.equals(this.asPath, connectionRouteTableEntry.asPath) &&
        Objects.equals(this.connection, connectionRouteTableEntry.connection) &&
        Objects.equals(this.changeLog, connectionRouteTableEntry.changeLog)&&
        Objects.equals(this.additionalProperties, connectionRouteTableEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, protocolType, state, age, prefix, nextHop, MED, localPreference, asPath, connection, changeLog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionRouteTableEntry {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
    sb.append("    MED: ").append(toIndentedString(MED)).append("\n");
    sb.append("    localPreference: ").append(toIndentedString(localPreference)).append("\n");
    sb.append("    asPath: ").append(toIndentedString(asPath)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("protocolType");
    openapiFields.add("state");
    openapiFields.add("age");
    openapiFields.add("prefix");
    openapiFields.add("nextHop");
    openapiFields.add("MED");
    openapiFields.add("localPreference");
    openapiFields.add("asPath");
    openapiFields.add("connection");
    openapiFields.add("changeLog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("changeLog");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConnectionRouteTableEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConnectionRouteTableEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionRouteTableEntry is not found in the empty JSON string", ConnectionRouteTableEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectionRouteTableEntry.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      RouteTableEntryType.validateJsonElement(jsonObj.get("type"));
      // validate the optional field `protocolType`
      if (jsonObj.get("protocolType") != null && !jsonObj.get("protocolType").isJsonNull()) {
        RouteTableEntryProtocolType.validateJsonElement(jsonObj.get("protocolType"));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
      if ((jsonObj.get("age") != null && !jsonObj.get("age").isJsonNull()) && !jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("nextHop") != null && !jsonObj.get("nextHop").isJsonNull()) && !jsonObj.get("nextHop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextHop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextHop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("asPath") != null && !jsonObj.get("asPath").isJsonNull() && !jsonObj.get("asPath").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asPath` to be an array in the JSON string but got `%s`", jsonObj.get("asPath").toString()));
      }
      // validate the optional field `connection`
      if (jsonObj.get("connection") != null && !jsonObj.get("connection").isJsonNull()) {
        ConnectionRouteTableEntryConnection.validateJsonElement(jsonObj.get("connection"));
      }
      // validate the required field `changeLog`
      Changelog.validateJsonElement(jsonObj.get("changeLog"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionRouteTableEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionRouteTableEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionRouteTableEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionRouteTableEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionRouteTableEntry>() {
           @Override
           public void write(JsonWriter out, ConnectionRouteTableEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionRouteTableEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ConnectionRouteTableEntry instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConnectionRouteTableEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConnectionRouteTableEntry
   * @throws IOException if the JSON string is invalid with respect to ConnectionRouteTableEntry
   */
  public static ConnectionRouteTableEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionRouteTableEntry.class);
  }

  /**
   * Convert an instance of ConnectionRouteTableEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

