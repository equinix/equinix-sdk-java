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
import com.equinix.sdk.fabricv4.model.PortOrderSignatureDelegate;
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
 * Port signature Type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class PortOrderSignature {
  /**
   * Port signature Type
   */
  @JsonAdapter(SignatoryEnum.Adapter.class)
  public enum SignatoryEnum {
    DELEGATE("DELEGATE"),
    
    SELF("SELF"),
    
    ACCOUNT_SUPPORT("ACCOUNT_SUPPORT");

    private String value;

    SignatoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatoryEnum fromValue(String value) {
      for (SignatoryEnum b : SignatoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SignatoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignatoryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SignatoryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIGNATORY = "signatory";
  @SerializedName(SERIALIZED_NAME_SIGNATORY)
  @javax.annotation.Nullable
  private SignatoryEnum signatory;

  public static final String SERIALIZED_NAME_DELEGATE = "delegate";
  @SerializedName(SERIALIZED_NAME_DELEGATE)
  @javax.annotation.Nullable
  private PortOrderSignatureDelegate delegate;

  public PortOrderSignature() {
  }

  public PortOrderSignature signatory(@javax.annotation.Nullable SignatoryEnum signatory) {
    this.signatory = signatory;
    return this;
  }

  /**
   * Port signature Type
   * @return signatory
   */
  @javax.annotation.Nullable
  public SignatoryEnum getSignatory() {
    return signatory;
  }

  public void setSignatory(@javax.annotation.Nullable SignatoryEnum signatory) {
    this.signatory = signatory;
  }


  public PortOrderSignature delegate(@javax.annotation.Nullable PortOrderSignatureDelegate delegate) {
    this.delegate = delegate;
    return this;
  }

  /**
   * Get delegate
   * @return delegate
   */
  @javax.annotation.Nullable
  public PortOrderSignatureDelegate getDelegate() {
    return delegate;
  }

  public void setDelegate(@javax.annotation.Nullable PortOrderSignatureDelegate delegate) {
    this.delegate = delegate;
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
   * @return the PortOrderSignature instance itself
   */
  public PortOrderSignature putAdditionalProperty(String key, Object value) {
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
    PortOrderSignature portOrderSignature = (PortOrderSignature) o;
    return Objects.equals(this.signatory, portOrderSignature.signatory) &&
        Objects.equals(this.delegate, portOrderSignature.delegate)&&
        Objects.equals(this.additionalProperties, portOrderSignature.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatory, delegate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortOrderSignature {\n");
    sb.append("    signatory: ").append(toIndentedString(signatory)).append("\n");
    sb.append("    delegate: ").append(toIndentedString(delegate)).append("\n");
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
    openapiFields.add("signatory");
    openapiFields.add("delegate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PortOrderSignature
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PortOrderSignature.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortOrderSignature is not found in the empty JSON string", PortOrderSignature.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signatory") != null && !jsonObj.get("signatory").isJsonNull()) && !jsonObj.get("signatory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatory").toString()));
      }
      // validate the optional field `signatory`
      if (jsonObj.get("signatory") != null && !jsonObj.get("signatory").isJsonNull()) {
        SignatoryEnum.validateJsonElement(jsonObj.get("signatory"));
      }
      // validate the optional field `delegate`
      if (jsonObj.get("delegate") != null && !jsonObj.get("delegate").isJsonNull()) {
        PortOrderSignatureDelegate.validateJsonElement(jsonObj.get("delegate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortOrderSignature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortOrderSignature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortOrderSignature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortOrderSignature.class));

       return (TypeAdapter<T>) new TypeAdapter<PortOrderSignature>() {
           @Override
           public void write(JsonWriter out, PortOrderSignature value) throws IOException {
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
           public PortOrderSignature read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PortOrderSignature instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of PortOrderSignature given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PortOrderSignature
   * @throws IOException if the JSON string is invalid with respect to PortOrderSignature
   */
  public static PortOrderSignature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortOrderSignature.class);
  }

  /**
   * Convert an instance of PortOrderSignature to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

