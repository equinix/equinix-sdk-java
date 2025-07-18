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
import com.equinix.sdk.fabricv4.model.PortSearchFieldName;
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
 * PortExpression
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class PortExpression {
  public static final String SERIALIZED_NAME_AND = "and";
  @SerializedName(SERIALIZED_NAME_AND)
  @javax.annotation.Nullable
  private List<PortExpression> and = new ArrayList<>();

  public static final String SERIALIZED_NAME_OR = "or";
  @SerializedName(SERIALIZED_NAME_OR)
  @javax.annotation.Nullable
  private List<PortExpression> or = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  @javax.annotation.Nullable
  private PortSearchFieldName property;

  /**
   * Gets or Sets operator
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQUAL("=");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  @javax.annotation.Nullable
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<String> values = new ArrayList<>();

  public PortExpression() {
  }

  public PortExpression and(@javax.annotation.Nullable List<PortExpression> and) {
    this.and = and;
    return this;
  }

  public PortExpression addAndItem(PortExpression andItem) {
    if (this.and == null) {
      this.and = new ArrayList<>();
    }
    this.and.add(andItem);
    return this;
  }

  /**
   * Get and
   * @return and
   */
  @javax.annotation.Nullable
  public List<PortExpression> getAnd() {
    return and;
  }

  public void setAnd(@javax.annotation.Nullable List<PortExpression> and) {
    this.and = and;
  }


  public PortExpression or(@javax.annotation.Nullable List<PortExpression> or) {
    this.or = or;
    return this;
  }

  public PortExpression addOrItem(PortExpression orItem) {
    if (this.or == null) {
      this.or = new ArrayList<>();
    }
    this.or.add(orItem);
    return this;
  }

  /**
   * Get or
   * @return or
   */
  @javax.annotation.Nullable
  public List<PortExpression> getOr() {
    return or;
  }

  public void setOr(@javax.annotation.Nullable List<PortExpression> or) {
    this.or = or;
  }


  public PortExpression property(@javax.annotation.Nullable PortSearchFieldName property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   */
  @javax.annotation.Nullable
  public PortSearchFieldName getProperty() {
    return property;
  }

  public void setProperty(@javax.annotation.Nullable PortSearchFieldName property) {
    this.property = property;
  }


  public PortExpression operator(@javax.annotation.Nullable OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   */
  @javax.annotation.Nullable
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(@javax.annotation.Nullable OperatorEnum operator) {
    this.operator = operator;
  }


  public PortExpression values(@javax.annotation.Nullable List<String> values) {
    this.values = values;
    return this;
  }

  public PortExpression addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable List<String> values) {
    this.values = values;
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
   * @return the PortExpression instance itself
   */
  public PortExpression putAdditionalProperty(String key, Object value) {
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
    PortExpression portExpression = (PortExpression) o;
    return Objects.equals(this.and, portExpression.and) &&
        Objects.equals(this.or, portExpression.or) &&
        Objects.equals(this.property, portExpression.property) &&
        Objects.equals(this.operator, portExpression.operator) &&
        Objects.equals(this.values, portExpression.values)&&
        Objects.equals(this.additionalProperties, portExpression.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, or, property, operator, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortExpression {\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("and");
    openapiFields.add("or");
    openapiFields.add("property");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PortExpression
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PortExpression.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortExpression is not found in the empty JSON string", PortExpression.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("and") != null && !jsonObj.get("and").isJsonNull()) {
        JsonArray jsonArrayand = jsonObj.getAsJsonArray("and");
        if (jsonArrayand != null) {
          // ensure the json data is an array
          if (!jsonObj.get("and").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `and` to be an array in the JSON string but got `%s`", jsonObj.get("and").toString()));
          }

          // validate the optional field `and` (array)
          for (int i = 0; i < jsonArrayand.size(); i++) {
            PortExpression.validateJsonElement(jsonArrayand.get(i));
          };
        }
      }
      if (jsonObj.get("or") != null && !jsonObj.get("or").isJsonNull()) {
        JsonArray jsonArrayor = jsonObj.getAsJsonArray("or");
        if (jsonArrayor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("or").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `or` to be an array in the JSON string but got `%s`", jsonObj.get("or").toString()));
          }

          // validate the optional field `or` (array)
          for (int i = 0; i < jsonArrayor.size(); i++) {
            PortExpression.validateJsonElement(jsonArrayor.get(i));
          };
        }
      }
      // validate the optional field `property`
      if (jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) {
        PortSearchFieldName.validateJsonElement(jsonObj.get("property"));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `operator`
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) {
        OperatorEnum.validateJsonElement(jsonObj.get("operator"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortExpression.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortExpression' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortExpression> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortExpression.class));

       return (TypeAdapter<T>) new TypeAdapter<PortExpression>() {
           @Override
           public void write(JsonWriter out, PortExpression value) throws IOException {
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
           public PortExpression read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PortExpression instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of PortExpression given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PortExpression
   * @throws IOException if the JSON string is invalid with respect to PortExpression
   */
  public static PortExpression fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortExpression.class);
  }

  /**
   * Convert an instance of PortExpression to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

