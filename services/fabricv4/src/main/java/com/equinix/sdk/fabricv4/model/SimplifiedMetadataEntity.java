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
import com.equinix.sdk.fabricv4.model.SimplifiedLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Arrays;
import java.util.UUID;

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
 * Configuration details for port used at the access point.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SimplifiedMetadataEntity {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  @javax.annotation.Nullable
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_CVP_ID = "cvpId";
  @SerializedName(SERIALIZED_NAME_CVP_ID)
  @javax.annotation.Nullable
  private Integer cvpId;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  @javax.annotation.Nullable
  private BigDecimal bandwidth;

  public static final String SERIALIZED_NAME_PORT_NAME = "portName";
  @SerializedName(SERIALIZED_NAME_PORT_NAME)
  @javax.annotation.Nullable
  private String portName;

  public static final String SERIALIZED_NAME_ENCAPSULATION_PROTOCOL_TYPE = "encapsulationProtocolType";
  @SerializedName(SERIALIZED_NAME_ENCAPSULATION_PROTOCOL_TYPE)
  @javax.annotation.Nullable
  private String encapsulationProtocolType;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  @javax.annotation.Nullable
  private String accountName;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @javax.annotation.Nullable
  private String priority;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  @javax.annotation.Nullable
  private SimplifiedLocation location;

  public SimplifiedMetadataEntity() {
  }

  public SimplifiedMetadataEntity href(@javax.annotation.Nullable URI href) {
    this.href = href;
    return this;
  }

  /**
   * url to entity
   * @return href
   */
  @javax.annotation.Nullable
  public URI getHref() {
    return href;
  }

  public void setHref(@javax.annotation.Nullable URI href) {
    this.href = href;
  }


  public SimplifiedMetadataEntity uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Equinix assigned Identifier
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public SimplifiedMetadataEntity type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of Port
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public SimplifiedMetadataEntity cvpId(@javax.annotation.Nullable Integer cvpId) {
    this.cvpId = cvpId;
    return this;
  }

  /**
   * Customer virtual port Id
   * @return cvpId
   */
  @javax.annotation.Nullable
  public Integer getCvpId() {
    return cvpId;
  }

  public void setCvpId(@javax.annotation.Nullable Integer cvpId) {
    this.cvpId = cvpId;
  }


  public SimplifiedMetadataEntity bandwidth(@javax.annotation.Nullable BigDecimal bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * Port Bandwidth
   * @return bandwidth
   */
  @javax.annotation.Nullable
  public BigDecimal getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(@javax.annotation.Nullable BigDecimal bandwidth) {
    this.bandwidth = bandwidth;
  }


  public SimplifiedMetadataEntity portName(@javax.annotation.Nullable String portName) {
    this.portName = portName;
    return this;
  }

  /**
   * Port Name
   * @return portName
   */
  @javax.annotation.Nullable
  public String getPortName() {
    return portName;
  }

  public void setPortName(@javax.annotation.Nullable String portName) {
    this.portName = portName;
  }


  public SimplifiedMetadataEntity encapsulationProtocolType(@javax.annotation.Nullable String encapsulationProtocolType) {
    this.encapsulationProtocolType = encapsulationProtocolType;
    return this;
  }

  /**
   * Port Encapsulation
   * @return encapsulationProtocolType
   */
  @javax.annotation.Nullable
  public String getEncapsulationProtocolType() {
    return encapsulationProtocolType;
  }

  public void setEncapsulationProtocolType(@javax.annotation.Nullable String encapsulationProtocolType) {
    this.encapsulationProtocolType = encapsulationProtocolType;
  }


  public SimplifiedMetadataEntity accountName(@javax.annotation.Nullable String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Account Name
   * @return accountName
   */
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(@javax.annotation.Nullable String accountName) {
    this.accountName = accountName;
  }


  public SimplifiedMetadataEntity priority(@javax.annotation.Nullable String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Port Priority
   * @return priority
   */
  @javax.annotation.Nullable
  public String getPriority() {
    return priority;
  }

  public void setPriority(@javax.annotation.Nullable String priority) {
    this.priority = priority;
  }


  public SimplifiedMetadataEntity location(@javax.annotation.Nullable SimplifiedLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public SimplifiedLocation getLocation() {
    return location;
  }

  public void setLocation(@javax.annotation.Nullable SimplifiedLocation location) {
    this.location = location;
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
   * @return the SimplifiedMetadataEntity instance itself
   */
  public SimplifiedMetadataEntity putAdditionalProperty(String key, Object value) {
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
    SimplifiedMetadataEntity simplifiedMetadataEntity = (SimplifiedMetadataEntity) o;
    return Objects.equals(this.href, simplifiedMetadataEntity.href) &&
        Objects.equals(this.uuid, simplifiedMetadataEntity.uuid) &&
        Objects.equals(this.type, simplifiedMetadataEntity.type) &&
        Objects.equals(this.cvpId, simplifiedMetadataEntity.cvpId) &&
        Objects.equals(this.bandwidth, simplifiedMetadataEntity.bandwidth) &&
        Objects.equals(this.portName, simplifiedMetadataEntity.portName) &&
        Objects.equals(this.encapsulationProtocolType, simplifiedMetadataEntity.encapsulationProtocolType) &&
        Objects.equals(this.accountName, simplifiedMetadataEntity.accountName) &&
        Objects.equals(this.priority, simplifiedMetadataEntity.priority) &&
        Objects.equals(this.location, simplifiedMetadataEntity.location)&&
        Objects.equals(this.additionalProperties, simplifiedMetadataEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, type, cvpId, bandwidth, portName, encapsulationProtocolType, accountName, priority, location, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedMetadataEntity {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cvpId: ").append(toIndentedString(cvpId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    encapsulationProtocolType: ").append(toIndentedString(encapsulationProtocolType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("uuid");
    openapiFields.add("type");
    openapiFields.add("cvpId");
    openapiFields.add("bandwidth");
    openapiFields.add("portName");
    openapiFields.add("encapsulationProtocolType");
    openapiFields.add("accountName");
    openapiFields.add("priority");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimplifiedMetadataEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplifiedMetadataEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedMetadataEntity is not found in the empty JSON string", SimplifiedMetadataEntity.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("portName") != null && !jsonObj.get("portName").isJsonNull()) && !jsonObj.get("portName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portName").toString()));
      }
      if ((jsonObj.get("encapsulationProtocolType") != null && !jsonObj.get("encapsulationProtocolType").isJsonNull()) && !jsonObj.get("encapsulationProtocolType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encapsulationProtocolType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encapsulationProtocolType").toString()));
      }
      if ((jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonNull()) && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      if ((jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) && !jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocation.validateJsonElement(jsonObj.get("location"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedMetadataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedMetadataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedMetadataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedMetadataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedMetadataEntity>() {
           @Override
           public void write(JsonWriter out, SimplifiedMetadataEntity value) throws IOException {
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
           public SimplifiedMetadataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SimplifiedMetadataEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SimplifiedMetadataEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimplifiedMetadataEntity
   * @throws IOException if the JSON string is invalid with respect to SimplifiedMetadataEntity
   */
  public static SimplifiedMetadataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedMetadataEntity.class);
  }

  /**
   * Convert an instance of SimplifiedMetadataEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

