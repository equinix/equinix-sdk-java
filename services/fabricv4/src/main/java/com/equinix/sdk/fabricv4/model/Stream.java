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
import com.equinix.sdk.fabricv4.model.Project;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Stream object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class Stream {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  @javax.annotation.Nullable
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  /**
   * Stream provision state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROVISIONING("PROVISIONING"),
    
    PROVISIONED("PROVISIONED"),
    
    REPROVISIONING("REPROVISIONING"),
    
    DEPROVISIONING("DEPROVISIONING"),
    
    DEPROVISIONED("DEPROVISIONED"),
    
    FAILED("FAILED");

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
  @javax.annotation.Nullable
  private StateEnum state;

  public static final String SERIALIZED_NAME_ASSETS_COUNT = "assetsCount";
  @SerializedName(SERIALIZED_NAME_ASSETS_COUNT)
  @javax.annotation.Nullable
  private Integer assetsCount;

  public static final String SERIALIZED_NAME_STREAM_SUBSCRIPTIONS_COUNT = "streamSubscriptionsCount";
  @SerializedName(SERIALIZED_NAME_STREAM_SUBSCRIPTIONS_COUNT)
  @javax.annotation.Nullable
  private Integer streamSubscriptionsCount;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  @javax.annotation.Nullable
  private Changelog changeLog;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TELEMETRY_STREAM("TELEMETRY_STREAM");

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

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  @javax.annotation.Nullable
  private Project project;

  public Stream() {
  }

  public Stream(
     URI href
  ) {
    this();
    this.href = href;
  }

  /**
   * Stream URI
   * @return href
   */
  @javax.annotation.Nullable
  public URI getHref() {
    return href;
  }



  public Stream uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Equinix-assigned access point identifier
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public Stream state(@javax.annotation.Nullable StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Stream provision state
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable StateEnum state) {
    this.state = state;
  }


  public Stream assetsCount(@javax.annotation.Nullable Integer assetsCount) {
    this.assetsCount = assetsCount;
    return this;
  }

  /**
   * Stream assets count
   * @return assetsCount
   */
  @javax.annotation.Nullable
  public Integer getAssetsCount() {
    return assetsCount;
  }

  public void setAssetsCount(@javax.annotation.Nullable Integer assetsCount) {
    this.assetsCount = assetsCount;
  }


  public Stream streamSubscriptionsCount(@javax.annotation.Nullable Integer streamSubscriptionsCount) {
    this.streamSubscriptionsCount = streamSubscriptionsCount;
    return this;
  }

  /**
   * Stream subscriptions count
   * @return streamSubscriptionsCount
   */
  @javax.annotation.Nullable
  public Integer getStreamSubscriptionsCount() {
    return streamSubscriptionsCount;
  }

  public void setStreamSubscriptionsCount(@javax.annotation.Nullable Integer streamSubscriptionsCount) {
    this.streamSubscriptionsCount = streamSubscriptionsCount;
  }


  public Stream changeLog(@javax.annotation.Nullable Changelog changeLog) {
    this.changeLog = changeLog;
    return this;
  }

  /**
   * Get changeLog
   * @return changeLog
   */
  @javax.annotation.Nullable
  public Changelog getChangeLog() {
    return changeLog;
  }

  public void setChangeLog(@javax.annotation.Nullable Changelog changeLog) {
    this.changeLog = changeLog;
  }


  public Stream type(@javax.annotation.Nullable TypeEnum type) {
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


  public Stream name(@javax.annotation.Nullable String name) {
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


  public Stream description(@javax.annotation.Nullable String description) {
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


  public Stream project(@javax.annotation.Nullable Project project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   */
  @javax.annotation.Nullable
  public Project getProject() {
    return project;
  }

  public void setProject(@javax.annotation.Nullable Project project) {
    this.project = project;
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
   * @return the Stream instance itself
   */
  public Stream putAdditionalProperty(String key, Object value) {
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
    Stream stream = (Stream) o;
    return Objects.equals(this.href, stream.href) &&
        Objects.equals(this.uuid, stream.uuid) &&
        Objects.equals(this.state, stream.state) &&
        Objects.equals(this.assetsCount, stream.assetsCount) &&
        Objects.equals(this.streamSubscriptionsCount, stream.streamSubscriptionsCount) &&
        Objects.equals(this.changeLog, stream.changeLog) &&
        Objects.equals(this.type, stream.type) &&
        Objects.equals(this.name, stream.name) &&
        Objects.equals(this.description, stream.description) &&
        Objects.equals(this.project, stream.project)&&
        Objects.equals(this.additionalProperties, stream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, state, assetsCount, streamSubscriptionsCount, changeLog, type, name, description, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    assetsCount: ").append(toIndentedString(assetsCount)).append("\n");
    sb.append("    streamSubscriptionsCount: ").append(toIndentedString(streamSubscriptionsCount)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Stream
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Stream.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Stream is not found in the empty JSON string", Stream.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        Changelog.validateJsonElement(jsonObj.get("changeLog"));
      }
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
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonElement(jsonObj.get("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Stream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Stream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Stream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Stream.class));

       return (TypeAdapter<T>) new TypeAdapter<Stream>() {
           @Override
           public void write(JsonWriter out, Stream value) throws IOException {
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
           public Stream read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Stream instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Stream given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Stream
   * @throws IOException if the JSON string is invalid with respect to Stream
   */
  public static Stream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Stream.class);
  }

  /**
   * Convert an instance of Stream to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

