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
import java.util.Arrays;
import com.equinix.sdk.fabricv4.model.SimplifiedLinkProtocol;
import com.equinix.sdk.fabricv4.model.SimplifiedMetadataEntity;
import com.equinix.sdk.fabricv4.model.SimplifiedTokenNetwork;
import com.equinix.sdk.fabricv4.model.SimplifiedVirtualDevice;
import com.equinix.sdk.fabricv4.model.VirtualDeviceInterface;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.sdk.fabricv4.JSON;

/**
 * List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessPointSelector {
  /**
   * Type of Access point
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COLO("COLO"),
    
    VD("VD"),
    
    NETWORK("NETWORK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_HIDE_ASSET_INFO = "hideAssetInfo";
  @SerializedName(SERIALIZED_NAME_HIDE_ASSET_INFO)
  private Boolean hideAssetInfo;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private SimplifiedMetadataEntity port;

  public static final String SERIALIZED_NAME_LINK_PROTOCOL = "linkProtocol";
  @SerializedName(SERIALIZED_NAME_LINK_PROTOCOL)
  private SimplifiedLinkProtocol linkProtocol;

  public static final String SERIALIZED_NAME_VIRTUAL_DEVICE = "virtualDevice";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_DEVICE)
  private SimplifiedVirtualDevice virtualDevice;

  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private VirtualDeviceInterface _interface;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private SimplifiedTokenNetwork network;

  public AccessPointSelector() {
  }

  public AccessPointSelector type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of Access point
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AccessPointSelector hideAssetInfo(Boolean hideAssetInfo) {
    
    this.hideAssetInfo = hideAssetInfo;
    return this;
  }

   /**
   * Get hideAssetInfo
   * @return hideAssetInfo
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable

  public Boolean getHideAssetInfo() {
    return hideAssetInfo;
  }


  public void setHideAssetInfo(Boolean hideAssetInfo) {
    this.hideAssetInfo = hideAssetInfo;
  }


  public AccessPointSelector port(SimplifiedMetadataEntity port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable

  public SimplifiedMetadataEntity getPort() {
    return port;
  }


  public void setPort(SimplifiedMetadataEntity port) {
    this.port = port;
  }


  public AccessPointSelector linkProtocol(SimplifiedLinkProtocol linkProtocol) {
    
    this.linkProtocol = linkProtocol;
    return this;
  }

   /**
   * Get linkProtocol
   * @return linkProtocol
  **/
  @javax.annotation.Nullable

  public SimplifiedLinkProtocol getLinkProtocol() {
    return linkProtocol;
  }


  public void setLinkProtocol(SimplifiedLinkProtocol linkProtocol) {
    this.linkProtocol = linkProtocol;
  }


  public AccessPointSelector virtualDevice(SimplifiedVirtualDevice virtualDevice) {
    
    this.virtualDevice = virtualDevice;
    return this;
  }

   /**
   * Get virtualDevice
   * @return virtualDevice
  **/
  @javax.annotation.Nullable

  public SimplifiedVirtualDevice getVirtualDevice() {
    return virtualDevice;
  }


  public void setVirtualDevice(SimplifiedVirtualDevice virtualDevice) {
    this.virtualDevice = virtualDevice;
  }


  public AccessPointSelector _interface(VirtualDeviceInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable

  public VirtualDeviceInterface getInterface() {
    return _interface;
  }


  public void setInterface(VirtualDeviceInterface _interface) {
    this._interface = _interface;
  }


  public AccessPointSelector network(SimplifiedTokenNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable

  public SimplifiedTokenNetwork getNetwork() {
    return network;
  }


  public void setNetwork(SimplifiedTokenNetwork network) {
    this.network = network;
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
   * @return the AccessPointSelector instance itself
   */
  public AccessPointSelector putAdditionalProperty(String key, Object value) {
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
    AccessPointSelector accessPointSelector = (AccessPointSelector) o;
    return Objects.equals(this.type, accessPointSelector.type) &&
        Objects.equals(this.hideAssetInfo, accessPointSelector.hideAssetInfo) &&
        Objects.equals(this.port, accessPointSelector.port) &&
        Objects.equals(this.linkProtocol, accessPointSelector.linkProtocol) &&
        Objects.equals(this.virtualDevice, accessPointSelector.virtualDevice) &&
        Objects.equals(this._interface, accessPointSelector._interface) &&
        Objects.equals(this.network, accessPointSelector.network)&&
        Objects.equals(this.additionalProperties, accessPointSelector.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hideAssetInfo, port, linkProtocol, virtualDevice, _interface, network, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPointSelector {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hideAssetInfo: ").append(toIndentedString(hideAssetInfo)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    linkProtocol: ").append(toIndentedString(linkProtocol)).append("\n");
    sb.append("    virtualDevice: ").append(toIndentedString(virtualDevice)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
    openapiFields.add("hideAssetInfo");
    openapiFields.add("port");
    openapiFields.add("linkProtocol");
    openapiFields.add("virtualDevice");
    openapiFields.add("interface");
    openapiFields.add("network");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessPointSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessPointSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessPointSelector is not found in the empty JSON string", AccessPointSelector.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        SimplifiedMetadataEntity.validateJsonObject(jsonObj.getAsJsonObject("port"));
      }
      // validate the optional field `linkProtocol`
      if (jsonObj.get("linkProtocol") != null && !jsonObj.get("linkProtocol").isJsonNull()) {
        SimplifiedLinkProtocol.validateJsonObject(jsonObj.getAsJsonObject("linkProtocol"));
      }
      // validate the optional field `virtualDevice`
      if (jsonObj.get("virtualDevice") != null && !jsonObj.get("virtualDevice").isJsonNull()) {
        SimplifiedVirtualDevice.validateJsonObject(jsonObj.getAsJsonObject("virtualDevice"));
      }
      // validate the optional field `interface`
      if (jsonObj.get("interface") != null && !jsonObj.get("interface").isJsonNull()) {
        VirtualDeviceInterface.validateJsonObject(jsonObj.getAsJsonObject("interface"));
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        SimplifiedTokenNetwork.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessPointSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessPointSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessPointSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessPointSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessPointSelector>() {
           @Override
           public void write(JsonWriter out, AccessPointSelector value) throws IOException {
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessPointSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessPointSelector instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessPointSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessPointSelector
  * @throws IOException if the JSON string is invalid with respect to AccessPointSelector
  */
  public static AccessPointSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessPointSelector.class);
  }

 /**
  * Convert an instance of AccessPointSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

