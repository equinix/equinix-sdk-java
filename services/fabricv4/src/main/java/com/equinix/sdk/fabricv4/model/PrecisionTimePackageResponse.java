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
import com.equinix.sdk.fabricv4.model.Changelog;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

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
 * EPT Service Package Information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrecisionTimePackageResponse {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TIME_SERVICE_PACKAGE("TIME_SERVICE_PACKAGE");

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

  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    NTP_STANDARD("NTP_STANDARD"),
    
    NTP_ENTERPRISE("NTP_ENTERPRISE"),
    
    PTP_STANDARD("PTP_STANDARD"),
    
    PTP_ENTERPRISE("PTP_ENTERPRISE");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_CLIENTS_PER_SECOND_MAX = "clientsPerSecondMax";
  @SerializedName(SERIALIZED_NAME_CLIENTS_PER_SECOND_MAX)
  private Integer clientsPerSecondMax;

  public static final String SERIALIZED_NAME_REDUNDANCY_SUPPORTED = "redundancySupported";
  @SerializedName(SERIALIZED_NAME_REDUNDANCY_SUPPORTED)
  private Boolean redundancySupported;

  public static final String SERIALIZED_NAME_MULTI_SUBNET_SUPPORTED = "multiSubnetSupported";
  @SerializedName(SERIALIZED_NAME_MULTI_SUBNET_SUPPORTED)
  private Boolean multiSubnetSupported;

  public static final String SERIALIZED_NAME_ACCURACY_SLA_UNIT = "accuracySlaUnit";
  @SerializedName(SERIALIZED_NAME_ACCURACY_SLA_UNIT)
  private String accuracySlaUnit;

  public static final String SERIALIZED_NAME_ACCURACY_SLA = "accuracySla";
  @SerializedName(SERIALIZED_NAME_ACCURACY_SLA)
  private Integer accuracySla;

  public static final String SERIALIZED_NAME_ACCURACY_SLA_MIN = "accuracySlaMin";
  @SerializedName(SERIALIZED_NAME_ACCURACY_SLA_MIN)
  private Integer accuracySlaMin;

  public static final String SERIALIZED_NAME_ACCURACY_SLA_MAX = "accuracySlaMax";
  @SerializedName(SERIALIZED_NAME_ACCURACY_SLA_MAX)
  private Integer accuracySlaMax;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  public PrecisionTimePackageResponse() {
  }

  public PrecisionTimePackageResponse href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public PrecisionTimePackageResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PrecisionTimePackageResponse code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public PrecisionTimePackageResponse bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Connection bandwidth in Mbps.
   * @return bandwidth
  **/
  @javax.annotation.Nonnull

  public Integer getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public PrecisionTimePackageResponse clientsPerSecondMax(Integer clientsPerSecondMax) {
    
    this.clientsPerSecondMax = clientsPerSecondMax;
    return this;
  }

   /**
   * Max. number of clients that can be synchronized per second at a packet rate of 1 per second.
   * minimum: 0
   * @return clientsPerSecondMax
  **/
  @javax.annotation.Nullable

  public Integer getClientsPerSecondMax() {
    return clientsPerSecondMax;
  }


  public void setClientsPerSecondMax(Integer clientsPerSecondMax) {
    this.clientsPerSecondMax = clientsPerSecondMax;
  }


  public PrecisionTimePackageResponse redundancySupported(Boolean redundancySupported) {
    
    this.redundancySupported = redundancySupported;
    return this;
  }

   /**
   * Is Redundant virtual connection supported for the package code.
   * @return redundancySupported
  **/
  @javax.annotation.Nullable

  public Boolean getRedundancySupported() {
    return redundancySupported;
  }


  public void setRedundancySupported(Boolean redundancySupported) {
    this.redundancySupported = redundancySupported;
  }


  public PrecisionTimePackageResponse multiSubnetSupported(Boolean multiSubnetSupported) {
    
    this.multiSubnetSupported = multiSubnetSupported;
    return this;
  }

   /**
   * Is Multiple subnet supported for the package code.
   * @return multiSubnetSupported
  **/
  @javax.annotation.Nullable

  public Boolean getMultiSubnetSupported() {
    return multiSubnetSupported;
  }


  public void setMultiSubnetSupported(Boolean multiSubnetSupported) {
    this.multiSubnetSupported = multiSubnetSupported;
  }


  public PrecisionTimePackageResponse accuracySlaUnit(String accuracySlaUnit) {
    
    this.accuracySlaUnit = accuracySlaUnit;
    return this;
  }

   /**
   * Accuracy SLA unit.
   * @return accuracySlaUnit
  **/
  @javax.annotation.Nullable

  public String getAccuracySlaUnit() {
    return accuracySlaUnit;
  }


  public void setAccuracySlaUnit(String accuracySlaUnit) {
    this.accuracySlaUnit = accuracySlaUnit;
  }


  public PrecisionTimePackageResponse accuracySla(Integer accuracySla) {
    
    this.accuracySla = accuracySla;
    return this;
  }

   /**
   * Accuracy SLA for the package code, -1 value denotes the accuracySla is not published.
   * @return accuracySla
  **/
  @javax.annotation.Nullable

  public Integer getAccuracySla() {
    return accuracySla;
  }


  public void setAccuracySla(Integer accuracySla) {
    this.accuracySla = accuracySla;
  }


  public PrecisionTimePackageResponse accuracySlaMin(Integer accuracySlaMin) {
    
    this.accuracySlaMin = accuracySlaMin;
    return this;
  }

   /**
   * Typical minimum Accuracy for the package code.
   * minimum: 1
   * @return accuracySlaMin
  **/
  @javax.annotation.Nullable

  public Integer getAccuracySlaMin() {
    return accuracySlaMin;
  }


  public void setAccuracySlaMin(Integer accuracySlaMin) {
    this.accuracySlaMin = accuracySlaMin;
  }


  public PrecisionTimePackageResponse accuracySlaMax(Integer accuracySlaMax) {
    
    this.accuracySlaMax = accuracySlaMax;
    return this;
  }

   /**
   * Typical maximum Accuracy for the package code.
   * minimum: 1
   * @return accuracySlaMax
  **/
  @javax.annotation.Nullable

  public Integer getAccuracySlaMax() {
    return accuracySlaMax;
  }


  public void setAccuracySlaMax(Integer accuracySlaMax) {
    this.accuracySlaMax = accuracySlaMax;
  }


  public PrecisionTimePackageResponse changelog(Changelog changelog) {
    
    this.changelog = changelog;
    return this;
  }

   /**
   * Get changelog
   * @return changelog
  **/
  @javax.annotation.Nullable

  public Changelog getChangelog() {
    return changelog;
  }


  public void setChangelog(Changelog changelog) {
    this.changelog = changelog;
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
   * @return the PrecisionTimePackageResponse instance itself
   */
  public PrecisionTimePackageResponse putAdditionalProperty(String key, Object value) {
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
    PrecisionTimePackageResponse precisionTimePackageResponse = (PrecisionTimePackageResponse) o;
    return Objects.equals(this.href, precisionTimePackageResponse.href) &&
        Objects.equals(this.type, precisionTimePackageResponse.type) &&
        Objects.equals(this.code, precisionTimePackageResponse.code) &&
        Objects.equals(this.bandwidth, precisionTimePackageResponse.bandwidth) &&
        Objects.equals(this.clientsPerSecondMax, precisionTimePackageResponse.clientsPerSecondMax) &&
        Objects.equals(this.redundancySupported, precisionTimePackageResponse.redundancySupported) &&
        Objects.equals(this.multiSubnetSupported, precisionTimePackageResponse.multiSubnetSupported) &&
        Objects.equals(this.accuracySlaUnit, precisionTimePackageResponse.accuracySlaUnit) &&
        Objects.equals(this.accuracySla, precisionTimePackageResponse.accuracySla) &&
        Objects.equals(this.accuracySlaMin, precisionTimePackageResponse.accuracySlaMin) &&
        Objects.equals(this.accuracySlaMax, precisionTimePackageResponse.accuracySlaMax) &&
        Objects.equals(this.changelog, precisionTimePackageResponse.changelog)&&
        Objects.equals(this.additionalProperties, precisionTimePackageResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, code, bandwidth, clientsPerSecondMax, redundancySupported, multiSubnetSupported, accuracySlaUnit, accuracySla, accuracySlaMin, accuracySlaMax, changelog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecisionTimePackageResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    clientsPerSecondMax: ").append(toIndentedString(clientsPerSecondMax)).append("\n");
    sb.append("    redundancySupported: ").append(toIndentedString(redundancySupported)).append("\n");
    sb.append("    multiSubnetSupported: ").append(toIndentedString(multiSubnetSupported)).append("\n");
    sb.append("    accuracySlaUnit: ").append(toIndentedString(accuracySlaUnit)).append("\n");
    sb.append("    accuracySla: ").append(toIndentedString(accuracySla)).append("\n");
    sb.append("    accuracySlaMin: ").append(toIndentedString(accuracySlaMin)).append("\n");
    sb.append("    accuracySlaMax: ").append(toIndentedString(accuracySlaMax)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("code");
    openapiFields.add("bandwidth");
    openapiFields.add("clientsPerSecondMax");
    openapiFields.add("redundancySupported");
    openapiFields.add("multiSubnetSupported");
    openapiFields.add("accuracySlaUnit");
    openapiFields.add("accuracySla");
    openapiFields.add("accuracySlaMin");
    openapiFields.add("accuracySlaMax");
    openapiFields.add("changelog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("bandwidth");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrecisionTimePackageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrecisionTimePackageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecisionTimePackageResponse is not found in the empty JSON string", PrecisionTimePackageResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrecisionTimePackageResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("accuracySlaUnit") != null && !jsonObj.get("accuracySlaUnit").isJsonNull()) && !jsonObj.get("accuracySlaUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accuracySlaUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accuracySlaUnit").toString()));
      }
      // validate the optional field `changelog`
      if (jsonObj.get("changelog") != null && !jsonObj.get("changelog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changelog"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecisionTimePackageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecisionTimePackageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecisionTimePackageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecisionTimePackageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecisionTimePackageResponse>() {
           @Override
           public void write(JsonWriter out, PrecisionTimePackageResponse value) throws IOException {
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
           public PrecisionTimePackageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PrecisionTimePackageResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PrecisionTimePackageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrecisionTimePackageResponse
  * @throws IOException if the JSON string is invalid with respect to PrecisionTimePackageResponse
  */
  public static PrecisionTimePackageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecisionTimePackageResponse.class);
  }

 /**
  * Convert an instance of PrecisionTimePackageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

