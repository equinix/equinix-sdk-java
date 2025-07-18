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
import com.equinix.sdk.fabricv4.model.TopologyProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Provides the GCP permission configuration for the orchestrator. This permission is used to manage the GCP resources and their access control. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class GCPPermission {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PERMISSION("PERMISSION");

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

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nonnull
  private String projectId;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  @javax.annotation.Nonnull
  private String providerId;

  public static final String SERIALIZED_NAME_POOL_ID = "poolId";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  @javax.annotation.Nonnull
  private String poolId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_PROPERTIES = "deploymentProperties";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROPERTIES)
  @javax.annotation.Nonnull
  private TopologyProperties deploymentProperties;

  public GCPPermission() {
  }

  public GCPPermission type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public GCPPermission projectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nonnull
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
  }


  public GCPPermission providerId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Get providerId
   * @return providerId
   */
  @javax.annotation.Nonnull
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
  }


  public GCPPermission poolId(@javax.annotation.Nonnull String poolId) {
    this.poolId = poolId;
    return this;
  }

  /**
   * Get poolId
   * @return poolId
   */
  @javax.annotation.Nonnull
  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(@javax.annotation.Nonnull String poolId) {
    this.poolId = poolId;
  }


  public GCPPermission deploymentProperties(@javax.annotation.Nonnull TopologyProperties deploymentProperties) {
    this.deploymentProperties = deploymentProperties;
    return this;
  }

  /**
   * Get deploymentProperties
   * @return deploymentProperties
   */
  @javax.annotation.Nonnull
  public TopologyProperties getDeploymentProperties() {
    return deploymentProperties;
  }

  public void setDeploymentProperties(@javax.annotation.Nonnull TopologyProperties deploymentProperties) {
    this.deploymentProperties = deploymentProperties;
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
   * @return the GCPPermission instance itself
   */
  public GCPPermission putAdditionalProperty(String key, Object value) {
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
    GCPPermission gcPPermission = (GCPPermission) o;
    return Objects.equals(this.type, gcPPermission.type) &&
        Objects.equals(this.projectId, gcPPermission.projectId) &&
        Objects.equals(this.providerId, gcPPermission.providerId) &&
        Objects.equals(this.poolId, gcPPermission.poolId) &&
        Objects.equals(this.deploymentProperties, gcPPermission.deploymentProperties)&&
        Objects.equals(this.additionalProperties, gcPPermission.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, projectId, providerId, poolId, deploymentProperties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPPermission {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    deploymentProperties: ").append(toIndentedString(deploymentProperties)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("providerId");
    openapiFields.add("poolId");
    openapiFields.add("deploymentProperties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("providerId");
    openapiRequiredFields.add("poolId");
    openapiRequiredFields.add("deploymentProperties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GCPPermission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GCPPermission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GCPPermission is not found in the empty JSON string", GCPPermission.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GCPPermission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("providerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerId").toString()));
      }
      if (!jsonObj.get("poolId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poolId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poolId").toString()));
      }
      // validate the required field `deploymentProperties`
      TopologyProperties.validateJsonElement(jsonObj.get("deploymentProperties"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GCPPermission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GCPPermission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GCPPermission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GCPPermission.class));

       return (TypeAdapter<T>) new TypeAdapter<GCPPermission>() {
           @Override
           public void write(JsonWriter out, GCPPermission value) throws IOException {
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
           public GCPPermission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GCPPermission instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of GCPPermission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GCPPermission
   * @throws IOException if the JSON string is invalid with respect to GCPPermission
   */
  public static GCPPermission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GCPPermission.class);
  }

  /**
   * Convert an instance of GCPPermission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

