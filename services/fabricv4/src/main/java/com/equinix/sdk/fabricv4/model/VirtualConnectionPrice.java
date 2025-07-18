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
import com.equinix.sdk.fabricv4.model.VirtualConnectionPriceASide;
import com.equinix.sdk.fabricv4.model.VirtualConnectionPriceConnectionType;
import com.equinix.sdk.fabricv4.model.VirtualConnectionPriceZSide;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Virtual Connection Product configuration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VirtualConnectionPrice {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private VirtualConnectionPriceConnectionType type;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  @javax.annotation.Nullable
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_A_SIDE = "aSide";
  @SerializedName(SERIALIZED_NAME_A_SIDE)
  @javax.annotation.Nullable
  private VirtualConnectionPriceASide aSide;

  public static final String SERIALIZED_NAME_Z_SIDE = "zSide";
  @SerializedName(SERIALIZED_NAME_Z_SIDE)
  @javax.annotation.Nullable
  private VirtualConnectionPriceZSide zSide;

  public VirtualConnectionPrice() {
  }

  public VirtualConnectionPrice uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Either uuid or rest of attributes are required
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public VirtualConnectionPrice type(@javax.annotation.Nullable VirtualConnectionPriceConnectionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public VirtualConnectionPriceConnectionType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable VirtualConnectionPriceConnectionType type) {
    this.type = type;
  }


  public VirtualConnectionPrice bandwidth(@javax.annotation.Nullable Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * Get bandwidth
   * minimum: 0
   * @return bandwidth
   */
  @javax.annotation.Nullable
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(@javax.annotation.Nullable Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public VirtualConnectionPrice aSide(@javax.annotation.Nullable VirtualConnectionPriceASide aSide) {
    this.aSide = aSide;
    return this;
  }

  /**
   * Get aSide
   * @return aSide
   */
  @javax.annotation.Nullable
  public VirtualConnectionPriceASide getaSide() {
    return aSide;
  }

  public void setaSide(@javax.annotation.Nullable VirtualConnectionPriceASide aSide) {
    this.aSide = aSide;
  }


  public VirtualConnectionPrice zSide(@javax.annotation.Nullable VirtualConnectionPriceZSide zSide) {
    this.zSide = zSide;
    return this;
  }

  /**
   * Get zSide
   * @return zSide
   */
  @javax.annotation.Nullable
  public VirtualConnectionPriceZSide getzSide() {
    return zSide;
  }

  public void setzSide(@javax.annotation.Nullable VirtualConnectionPriceZSide zSide) {
    this.zSide = zSide;
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
   * @return the VirtualConnectionPrice instance itself
   */
  public VirtualConnectionPrice putAdditionalProperty(String key, Object value) {
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
    VirtualConnectionPrice virtualConnectionPrice = (VirtualConnectionPrice) o;
    return Objects.equals(this.uuid, virtualConnectionPrice.uuid) &&
        Objects.equals(this.type, virtualConnectionPrice.type) &&
        Objects.equals(this.bandwidth, virtualConnectionPrice.bandwidth) &&
        Objects.equals(this.aSide, virtualConnectionPrice.aSide) &&
        Objects.equals(this.zSide, virtualConnectionPrice.zSide)&&
        Objects.equals(this.additionalProperties, virtualConnectionPrice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, bandwidth, aSide, zSide, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualConnectionPrice {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    aSide: ").append(toIndentedString(aSide)).append("\n");
    sb.append("    zSide: ").append(toIndentedString(zSide)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("type");
    openapiFields.add("bandwidth");
    openapiFields.add("aSide");
    openapiFields.add("zSide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VirtualConnectionPrice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VirtualConnectionPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualConnectionPrice is not found in the empty JSON string", VirtualConnectionPrice.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        VirtualConnectionPriceConnectionType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `aSide`
      if (jsonObj.get("aSide") != null && !jsonObj.get("aSide").isJsonNull()) {
        VirtualConnectionPriceASide.validateJsonElement(jsonObj.get("aSide"));
      }
      // validate the optional field `zSide`
      if (jsonObj.get("zSide") != null && !jsonObj.get("zSide").isJsonNull()) {
        VirtualConnectionPriceZSide.validateJsonElement(jsonObj.get("zSide"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualConnectionPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualConnectionPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualConnectionPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualConnectionPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualConnectionPrice>() {
           @Override
           public void write(JsonWriter out, VirtualConnectionPrice value) throws IOException {
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
           public VirtualConnectionPrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VirtualConnectionPrice instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VirtualConnectionPrice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VirtualConnectionPrice
   * @throws IOException if the JSON string is invalid with respect to VirtualConnectionPrice
   */
  public static VirtualConnectionPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualConnectionPrice.class);
  }

  /**
   * Convert an instance of VirtualConnectionPrice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

