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
 * SimplifiedNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SimplifiedNotification {
  /**
   * Notification Type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NOTIFICATION("NOTIFICATION"),
    
    BANDWIDTH_ALERT("BANDWIDTH_ALERT"),
    
    CONNECTION_APPROVAL("CONNECTION_APPROVAL"),
    
    PROFILE_LIFECYCLE("PROFILE_LIFECYCLE"),
    
    ALL("ALL"),
    
    SALES_REP_NOTIFICATIONS("SALES_REP_NOTIFICATIONS");

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

  public static final String SERIALIZED_NAME_SEND_INTERVAL = "sendInterval";
  @SerializedName(SERIALIZED_NAME_SEND_INTERVAL)
  @javax.annotation.Nullable
  private String sendInterval;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  @javax.annotation.Nonnull
  private List<String> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGISTERED_USERS = "registeredUsers";
  @SerializedName(SERIALIZED_NAME_REGISTERED_USERS)
  @javax.annotation.Nullable
  private List<String> registeredUsers = new ArrayList<>();

  public SimplifiedNotification() {
  }

  public SimplifiedNotification type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Notification Type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public SimplifiedNotification sendInterval(@javax.annotation.Nullable String sendInterval) {
    this.sendInterval = sendInterval;
    return this;
  }

  /**
   * Get sendInterval
   * @return sendInterval
   */
  @javax.annotation.Nullable
  public String getSendInterval() {
    return sendInterval;
  }

  public void setSendInterval(@javax.annotation.Nullable String sendInterval) {
    this.sendInterval = sendInterval;
  }


  public SimplifiedNotification emails(@javax.annotation.Nonnull List<String> emails) {
    this.emails = emails;
    return this;
  }

  public SimplifiedNotification addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Array of contact emails
   * @return emails
   */
  @javax.annotation.Nonnull
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(@javax.annotation.Nonnull List<String> emails) {
    this.emails = emails;
  }


  public SimplifiedNotification registeredUsers(@javax.annotation.Nullable List<String> registeredUsers) {
    this.registeredUsers = registeredUsers;
    return this;
  }

  public SimplifiedNotification addRegisteredUsersItem(String registeredUsersItem) {
    if (this.registeredUsers == null) {
      this.registeredUsers = new ArrayList<>();
    }
    this.registeredUsers.add(registeredUsersItem);
    return this;
  }

  /**
   * Array of registered users
   * @return registeredUsers
   */
  @javax.annotation.Nullable
  public List<String> getRegisteredUsers() {
    return registeredUsers;
  }

  public void setRegisteredUsers(@javax.annotation.Nullable List<String> registeredUsers) {
    this.registeredUsers = registeredUsers;
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
   * @return the SimplifiedNotification instance itself
   */
  public SimplifiedNotification putAdditionalProperty(String key, Object value) {
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
    SimplifiedNotification simplifiedNotification = (SimplifiedNotification) o;
    return Objects.equals(this.type, simplifiedNotification.type) &&
        Objects.equals(this.sendInterval, simplifiedNotification.sendInterval) &&
        Objects.equals(this.emails, simplifiedNotification.emails) &&
        Objects.equals(this.registeredUsers, simplifiedNotification.registeredUsers)&&
        Objects.equals(this.additionalProperties, simplifiedNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sendInterval, emails, registeredUsers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedNotification {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    registeredUsers: ").append(toIndentedString(registeredUsers)).append("\n");
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
    openapiFields.add("sendInterval");
    openapiFields.add("emails");
    openapiFields.add("registeredUsers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("emails");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimplifiedNotification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplifiedNotification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedNotification is not found in the empty JSON string", SimplifiedNotification.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimplifiedNotification.openapiRequiredFields) {
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
      if ((jsonObj.get("sendInterval") != null && !jsonObj.get("sendInterval").isJsonNull()) && !jsonObj.get("sendInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sendInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sendInterval").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("emails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("registeredUsers") != null && !jsonObj.get("registeredUsers").isJsonNull() && !jsonObj.get("registeredUsers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `registeredUsers` to be an array in the JSON string but got `%s`", jsonObj.get("registeredUsers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedNotification>() {
           @Override
           public void write(JsonWriter out, SimplifiedNotification value) throws IOException {
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
           public SimplifiedNotification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SimplifiedNotification instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SimplifiedNotification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimplifiedNotification
   * @throws IOException if the JSON string is invalid with respect to SimplifiedNotification
   */
  public static SimplifiedNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedNotification.class);
  }

  /**
   * Convert an instance of SimplifiedNotification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

