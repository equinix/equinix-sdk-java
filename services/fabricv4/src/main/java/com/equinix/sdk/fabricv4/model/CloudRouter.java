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
import com.equinix.sdk.fabricv4.model.CloudRouterAccessPointState;
import com.equinix.sdk.fabricv4.model.CloudRouterChange;
import com.equinix.sdk.fabricv4.model.CloudRouterPostRequestPackage;
import com.equinix.sdk.fabricv4.model.MarketplaceSubscription;
import com.equinix.sdk.fabricv4.model.Order;
import com.equinix.sdk.fabricv4.model.Project;
import com.equinix.sdk.fabricv4.model.SimplifiedAccount;
import com.equinix.sdk.fabricv4.model.SimplifiedLocationWithoutIBX;
import com.equinix.sdk.fabricv4.model.SimplifiedNotification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Fabric Cloud Router object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CloudRouter {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  @javax.annotation.Nullable
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private CloudRouterAccessPointState state;

  public static final String SERIALIZED_NAME_EQUINIX_ASN = "equinixAsn";
  @SerializedName(SERIALIZED_NAME_EQUINIX_ASN)
  @javax.annotation.Nullable
  private Long equinixAsn;

  public static final String SERIALIZED_NAME_CONNECTIONS_COUNT = "connectionsCount";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS_COUNT)
  @javax.annotation.Nullable
  private Integer connectionsCount;

  public static final String SERIALIZED_NAME_MARKETPLACE_SUBSCRIPTION = "marketplaceSubscription";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_SUBSCRIPTION)
  @javax.annotation.Nullable
  private MarketplaceSubscription marketplaceSubscription;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  @javax.annotation.Nullable
  private Changelog changeLog;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  @javax.annotation.Nullable
  private CloudRouterChange change;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    XF_ROUTER("XF_ROUTER");

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

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  @javax.annotation.Nullable
  private SimplifiedLocationWithoutIBX location;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  @javax.annotation.Nullable
  private CloudRouterPostRequestPackage _package;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private Order order;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  @javax.annotation.Nullable
  private Project project;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  @javax.annotation.Nullable
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  @javax.annotation.Nullable
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public CloudRouter() {
  }

  public CloudRouter(
     URI href
  ) {
    this();
    this.href = href;
  }

  /**
   * Cloud Routers URI
   * @return href
   */
  @javax.annotation.Nullable
  public URI getHref() {
    return href;
  }



  public CloudRouter uuid(@javax.annotation.Nullable UUID uuid) {
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


  public CloudRouter name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer-provided Cloud Router name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CloudRouter state(@javax.annotation.Nullable CloudRouterAccessPointState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public CloudRouterAccessPointState getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable CloudRouterAccessPointState state) {
    this.state = state;
  }


  public CloudRouter equinixAsn(@javax.annotation.Nullable Long equinixAsn) {
    this.equinixAsn = equinixAsn;
    return this;
  }

  /**
   * Equinix ASN
   * @return equinixAsn
   */
  @javax.annotation.Nullable
  public Long getEquinixAsn() {
    return equinixAsn;
  }

  public void setEquinixAsn(@javax.annotation.Nullable Long equinixAsn) {
    this.equinixAsn = equinixAsn;
  }


  public CloudRouter connectionsCount(@javax.annotation.Nullable Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
    return this;
  }

  /**
   * Number of connections associated with this Access point
   * minimum: 0
   * @return connectionsCount
   */
  @javax.annotation.Nullable
  public Integer getConnectionsCount() {
    return connectionsCount;
  }

  public void setConnectionsCount(@javax.annotation.Nullable Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public CloudRouter marketplaceSubscription(@javax.annotation.Nullable MarketplaceSubscription marketplaceSubscription) {
    this.marketplaceSubscription = marketplaceSubscription;
    return this;
  }

  /**
   * Get marketplaceSubscription
   * @return marketplaceSubscription
   */
  @javax.annotation.Nullable
  public MarketplaceSubscription getMarketplaceSubscription() {
    return marketplaceSubscription;
  }

  public void setMarketplaceSubscription(@javax.annotation.Nullable MarketplaceSubscription marketplaceSubscription) {
    this.marketplaceSubscription = marketplaceSubscription;
  }


  public CloudRouter changeLog(@javax.annotation.Nullable Changelog changeLog) {
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


  public CloudRouter change(@javax.annotation.Nullable CloudRouterChange change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @javax.annotation.Nullable
  public CloudRouterChange getChange() {
    return change;
  }

  public void setChange(@javax.annotation.Nullable CloudRouterChange change) {
    this.change = change;
  }


  public CloudRouter type(@javax.annotation.Nullable TypeEnum type) {
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


  public CloudRouter location(@javax.annotation.Nullable SimplifiedLocationWithoutIBX location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public SimplifiedLocationWithoutIBX getLocation() {
    return location;
  }

  public void setLocation(@javax.annotation.Nullable SimplifiedLocationWithoutIBX location) {
    this.location = location;
  }


  public CloudRouter _package(@javax.annotation.Nullable CloudRouterPostRequestPackage _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   */
  @javax.annotation.Nullable
  public CloudRouterPostRequestPackage getPackage() {
    return _package;
  }

  public void setPackage(@javax.annotation.Nullable CloudRouterPostRequestPackage _package) {
    this._package = _package;
  }


  public CloudRouter order(@javax.annotation.Nullable Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  public Order getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nullable Order order) {
    this.order = order;
  }


  public CloudRouter project(@javax.annotation.Nullable Project project) {
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


  public CloudRouter account(@javax.annotation.Nullable SimplifiedAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public SimplifiedAccount getAccount() {
    return account;
  }

  public void setAccount(@javax.annotation.Nullable SimplifiedAccount account) {
    this.account = account;
  }


  public CloudRouter notifications(@javax.annotation.Nullable List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public CloudRouter addNotificationsItem(SimplifiedNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Preferences for notifications on connection configuration or status changes
   * @return notifications
   */
  @javax.annotation.Nullable
  public List<SimplifiedNotification> getNotifications() {
    return notifications;
  }

  public void setNotifications(@javax.annotation.Nullable List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
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
   * @return the CloudRouter instance itself
   */
  public CloudRouter putAdditionalProperty(String key, Object value) {
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
    CloudRouter cloudRouter = (CloudRouter) o;
    return Objects.equals(this.href, cloudRouter.href) &&
        Objects.equals(this.uuid, cloudRouter.uuid) &&
        Objects.equals(this.name, cloudRouter.name) &&
        Objects.equals(this.state, cloudRouter.state) &&
        Objects.equals(this.equinixAsn, cloudRouter.equinixAsn) &&
        Objects.equals(this.connectionsCount, cloudRouter.connectionsCount) &&
        Objects.equals(this.marketplaceSubscription, cloudRouter.marketplaceSubscription) &&
        Objects.equals(this.changeLog, cloudRouter.changeLog) &&
        Objects.equals(this.change, cloudRouter.change) &&
        Objects.equals(this.type, cloudRouter.type) &&
        Objects.equals(this.location, cloudRouter.location) &&
        Objects.equals(this._package, cloudRouter._package) &&
        Objects.equals(this.order, cloudRouter.order) &&
        Objects.equals(this.project, cloudRouter.project) &&
        Objects.equals(this.account, cloudRouter.account) &&
        Objects.equals(this.notifications, cloudRouter.notifications)&&
        Objects.equals(this.additionalProperties, cloudRouter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, name, state, equinixAsn, connectionsCount, marketplaceSubscription, changeLog, change, type, location, _package, order, project, account, notifications, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRouter {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    equinixAsn: ").append(toIndentedString(equinixAsn)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    marketplaceSubscription: ").append(toIndentedString(marketplaceSubscription)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("package");
    openapiFields.add("order");
    openapiFields.add("project");
    openapiFields.add("account");
    openapiFields.add("notifications");
    openapiFields.add("marketplaceSubscription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudRouter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudRouter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRouter is not found in the empty JSON string", CloudRouter.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        CloudRouterAccessPointState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `marketplaceSubscription`
      if (jsonObj.get("marketplaceSubscription") != null && !jsonObj.get("marketplaceSubscription").isJsonNull()) {
        MarketplaceSubscription.validateJsonElement(jsonObj.get("marketplaceSubscription"));
      }
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        Changelog.validateJsonElement(jsonObj.get("changeLog"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        CloudRouterChange.validateJsonElement(jsonObj.get("change"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocationWithoutIBX.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        CloudRouterPostRequestPackage.validateJsonElement(jsonObj.get("package"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonElement(jsonObj.get("project"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonElement(jsonObj.get("account"));
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            SimplifiedNotification.validateJsonElement(jsonArraynotifications.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRouter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRouter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRouter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRouter.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRouter>() {
           @Override
           public void write(JsonWriter out, CloudRouter value) throws IOException {
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
           public CloudRouter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CloudRouter instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CloudRouter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudRouter
   * @throws IOException if the JSON string is invalid with respect to CloudRouter
   */
  public static CloudRouter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRouter.class);
  }

  /**
   * Convert an instance of CloudRouter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

