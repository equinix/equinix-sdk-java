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
import com.equinix.sdk.fabricv4.model.ResourceSelector;
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
 * Create Stream Alert Rules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AlertRulePostRequest {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    METRIC_ALERT("METRIC_ALERT");

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
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  @javax.annotation.Nullable
  private Boolean enabled = true;

  /**
   * Stream alert rule metric name
   */
  @JsonAdapter(MetricNameEnum.Adapter.class)
  public enum MetricNameEnum {
    CONNECTION_BANDWIDTH_TX_USAGE("equinix.fabric.connection.bandwidth_tx.usage"),
    
    CONNECTION_BANDWIDTH_RX_USAGE("equinix.fabric.connection.bandwidth_rx.usage"),
    
    PORT_BANDWIDTH_TX_USAGE("equinix.fabric.port.bandwidth_tx.usage"),
    
    PORT_BANDWIDTH_RX_USAGE("equinix.fabric.port.bandwidth_rx.usage"),
    
    PORT_PACKETS_ERRED_TX_COUNT("equinix.fabric.port.packets_erred_tx.count"),
    
    PORT_PACKETS_ERRED_RX_COUNT("equinix.fabric.port.packets_erred_rx.count"),
    
    PORT_PACKETS_DROPPED_TX_COUNT("equinix.fabric.port.packets_dropped_tx.count"),
    
    PORT_PACKETS_DROPPED_RX_COUNT("equinix.fabric.port.packets_dropped_rx.count"),
    
    METRO_SOURCE_METRO_CODE___DESTINATION_METRO_CODE_LATENCY("equinix.fabric.metro.<source_metro_code>_<destination_metro_code>.latency");

    private String value;

    MetricNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetricNameEnum fromValue(String value) {
      for (MetricNameEnum b : MetricNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetricNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetricNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetricNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetricNameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MetricNameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  @javax.annotation.Nullable
  private MetricNameEnum metricName;

  public static final String SERIALIZED_NAME_RESOURCE_SELECTOR = "resourceSelector";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SELECTOR)
  @javax.annotation.Nullable
  private ResourceSelector resourceSelector;

  public static final String SERIALIZED_NAME_WINDOW_SIZE = "windowSize";
  @SerializedName(SERIALIZED_NAME_WINDOW_SIZE)
  @javax.annotation.Nullable
  private String windowSize;

  /**
   * Stream alert rule metric operand
   */
  @JsonAdapter(OperandEnum.Adapter.class)
  public enum OperandEnum {
    ABOVE("ABOVE"),
    
    BELOW("BELOW");

    private String value;

    OperandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperandEnum fromValue(String value) {
      for (OperandEnum b : OperandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperandEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperandEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERAND = "operand";
  @SerializedName(SERIALIZED_NAME_OPERAND)
  @javax.annotation.Nullable
  private OperandEnum operand;

  public static final String SERIALIZED_NAME_WARNING_THRESHOLD = "warningThreshold";
  @SerializedName(SERIALIZED_NAME_WARNING_THRESHOLD)
  @javax.annotation.Nullable
  private String warningThreshold;

  public static final String SERIALIZED_NAME_CRITICAL_THRESHOLD = "criticalThreshold";
  @SerializedName(SERIALIZED_NAME_CRITICAL_THRESHOLD)
  @javax.annotation.Nullable
  private String criticalThreshold;

  public AlertRulePostRequest() {
  }

  public AlertRulePostRequest type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public AlertRulePostRequest name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer-provided stream name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public AlertRulePostRequest description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Customer-provided stream description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public AlertRulePostRequest enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Stream alert rule enabled status
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public AlertRulePostRequest metricName(@javax.annotation.Nullable MetricNameEnum metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Stream alert rule metric name
   * @return metricName
   */
  @javax.annotation.Nullable
  public MetricNameEnum getMetricName() {
    return metricName;
  }

  public void setMetricName(@javax.annotation.Nullable MetricNameEnum metricName) {
    this.metricName = metricName;
  }


  public AlertRulePostRequest resourceSelector(@javax.annotation.Nullable ResourceSelector resourceSelector) {
    this.resourceSelector = resourceSelector;
    return this;
  }

  /**
   * Get resourceSelector
   * @return resourceSelector
   */
  @javax.annotation.Nullable
  public ResourceSelector getResourceSelector() {
    return resourceSelector;
  }

  public void setResourceSelector(@javax.annotation.Nullable ResourceSelector resourceSelector) {
    this.resourceSelector = resourceSelector;
  }


  public AlertRulePostRequest windowSize(@javax.annotation.Nullable String windowSize) {
    this.windowSize = windowSize;
    return this;
  }

  /**
   * Stream alert rule metric window size
   * @return windowSize
   */
  @javax.annotation.Nullable
  public String getWindowSize() {
    return windowSize;
  }

  public void setWindowSize(@javax.annotation.Nullable String windowSize) {
    this.windowSize = windowSize;
  }


  public AlertRulePostRequest operand(@javax.annotation.Nullable OperandEnum operand) {
    this.operand = operand;
    return this;
  }

  /**
   * Stream alert rule metric operand
   * @return operand
   */
  @javax.annotation.Nullable
  public OperandEnum getOperand() {
    return operand;
  }

  public void setOperand(@javax.annotation.Nullable OperandEnum operand) {
    this.operand = operand;
  }


  public AlertRulePostRequest warningThreshold(@javax.annotation.Nullable String warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  /**
   * Stream alert rule metric warning threshold
   * @return warningThreshold
   */
  @javax.annotation.Nullable
  public String getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(@javax.annotation.Nullable String warningThreshold) {
    this.warningThreshold = warningThreshold;
  }


  public AlertRulePostRequest criticalThreshold(@javax.annotation.Nullable String criticalThreshold) {
    this.criticalThreshold = criticalThreshold;
    return this;
  }

  /**
   * Stream alert rule metric critical threshold
   * @return criticalThreshold
   */
  @javax.annotation.Nullable
  public String getCriticalThreshold() {
    return criticalThreshold;
  }

  public void setCriticalThreshold(@javax.annotation.Nullable String criticalThreshold) {
    this.criticalThreshold = criticalThreshold;
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
   * @return the AlertRulePostRequest instance itself
   */
  public AlertRulePostRequest putAdditionalProperty(String key, Object value) {
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
    AlertRulePostRequest alertRulePostRequest = (AlertRulePostRequest) o;
    return Objects.equals(this.type, alertRulePostRequest.type) &&
        Objects.equals(this.name, alertRulePostRequest.name) &&
        Objects.equals(this.description, alertRulePostRequest.description) &&
        Objects.equals(this.enabled, alertRulePostRequest.enabled) &&
        Objects.equals(this.metricName, alertRulePostRequest.metricName) &&
        Objects.equals(this.resourceSelector, alertRulePostRequest.resourceSelector) &&
        Objects.equals(this.windowSize, alertRulePostRequest.windowSize) &&
        Objects.equals(this.operand, alertRulePostRequest.operand) &&
        Objects.equals(this.warningThreshold, alertRulePostRequest.warningThreshold) &&
        Objects.equals(this.criticalThreshold, alertRulePostRequest.criticalThreshold)&&
        Objects.equals(this.additionalProperties, alertRulePostRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, enabled, metricName, resourceSelector, windowSize, operand, warningThreshold, criticalThreshold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRulePostRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    resourceSelector: ").append(toIndentedString(resourceSelector)).append("\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    criticalThreshold: ").append(toIndentedString(criticalThreshold)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("metricName");
    openapiFields.add("resourceSelector");
    openapiFields.add("windowSize");
    openapiFields.add("operand");
    openapiFields.add("warningThreshold");
    openapiFields.add("criticalThreshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AlertRulePostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AlertRulePostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlertRulePostRequest is not found in the empty JSON string", AlertRulePostRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("metricName") != null && !jsonObj.get("metricName").isJsonNull()) && !jsonObj.get("metricName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricName").toString()));
      }
      // validate the optional field `metricName`
      if (jsonObj.get("metricName") != null && !jsonObj.get("metricName").isJsonNull()) {
        MetricNameEnum.validateJsonElement(jsonObj.get("metricName"));
      }
      // validate the optional field `resourceSelector`
      if (jsonObj.get("resourceSelector") != null && !jsonObj.get("resourceSelector").isJsonNull()) {
        ResourceSelector.validateJsonElement(jsonObj.get("resourceSelector"));
      }
      if ((jsonObj.get("windowSize") != null && !jsonObj.get("windowSize").isJsonNull()) && !jsonObj.get("windowSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `windowSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("windowSize").toString()));
      }
      if ((jsonObj.get("operand") != null && !jsonObj.get("operand").isJsonNull()) && !jsonObj.get("operand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operand").toString()));
      }
      // validate the optional field `operand`
      if (jsonObj.get("operand") != null && !jsonObj.get("operand").isJsonNull()) {
        OperandEnum.validateJsonElement(jsonObj.get("operand"));
      }
      if ((jsonObj.get("warningThreshold") != null && !jsonObj.get("warningThreshold").isJsonNull()) && !jsonObj.get("warningThreshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningThreshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warningThreshold").toString()));
      }
      if ((jsonObj.get("criticalThreshold") != null && !jsonObj.get("criticalThreshold").isJsonNull()) && !jsonObj.get("criticalThreshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `criticalThreshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("criticalThreshold").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlertRulePostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlertRulePostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlertRulePostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlertRulePostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlertRulePostRequest>() {
           @Override
           public void write(JsonWriter out, AlertRulePostRequest value) throws IOException {
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
           public AlertRulePostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AlertRulePostRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AlertRulePostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AlertRulePostRequest
   * @throws IOException if the JSON string is invalid with respect to AlertRulePostRequest
   */
  public static AlertRulePostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlertRulePostRequest.class);
  }

  /**
   * Convert an instance of AlertRulePostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

