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
import com.equinix.sdk.fabricv4.model.Change;
import com.equinix.sdk.fabricv4.model.Changelog;
import com.equinix.sdk.fabricv4.model.ConnectionDirection;
import com.equinix.sdk.fabricv4.model.ConnectionOperation;
import com.equinix.sdk.fabricv4.model.ConnectionRedundancy;
import com.equinix.sdk.fabricv4.model.ConnectionSide;
import com.equinix.sdk.fabricv4.model.ConnectionSideAdditionalInfo;
import com.equinix.sdk.fabricv4.model.ConnectionState;
import com.equinix.sdk.fabricv4.model.ConnectionType;
import com.equinix.sdk.fabricv4.model.GeoScopeType;
import com.equinix.sdk.fabricv4.model.MarketplaceSubscription;
import com.equinix.sdk.fabricv4.model.Order;
import com.equinix.sdk.fabricv4.model.Project;
import com.equinix.sdk.fabricv4.model.SimplifiedAccount;
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
 * Connection specification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class Connection {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  @javax.annotation.Nullable
  private URI href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private ConnectionType type;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private ConnectionState state;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  @javax.annotation.Nullable
  private Change change;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  @javax.annotation.Nullable
  private ConnectionOperation operation;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private Order order;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  @javax.annotation.Nullable
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  @javax.annotation.Nullable
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  @javax.annotation.Nullable
  private Changelog changeLog;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  @javax.annotation.Nonnull
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_GEO_SCOPE = "geoScope";
  @SerializedName(SERIALIZED_NAME_GEO_SCOPE)
  @javax.annotation.Nullable
  private GeoScopeType geoScope;

  public static final String SERIALIZED_NAME_REDUNDANCY = "redundancy";
  @SerializedName(SERIALIZED_NAME_REDUNDANCY)
  @javax.annotation.Nullable
  private ConnectionRedundancy redundancy;

  public static final String SERIALIZED_NAME_IS_REMOTE = "isRemote";
  @SerializedName(SERIALIZED_NAME_IS_REMOTE)
  @javax.annotation.Nullable
  private Boolean isRemote;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  @javax.annotation.Nullable
  private ConnectionDirection direction;

  public static final String SERIALIZED_NAME_A_SIDE = "aSide";
  @SerializedName(SERIALIZED_NAME_A_SIDE)
  @javax.annotation.Nonnull
  private ConnectionSide aSide;

  public static final String SERIALIZED_NAME_Z_SIDE = "zSide";
  @SerializedName(SERIALIZED_NAME_Z_SIDE)
  @javax.annotation.Nonnull
  private ConnectionSide zSide;

  public static final String SERIALIZED_NAME_MARKETPLACE_SUBSCRIPTION = "marketplaceSubscription";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_SUBSCRIPTION)
  @javax.annotation.Nullable
  private MarketplaceSubscription marketplaceSubscription;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  @javax.annotation.Nullable
  private List<ConnectionSideAdditionalInfo> additionalInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  @javax.annotation.Nullable
  private Project project;

  public Connection() {
  }

  public Connection(
     URI href
  ) {
    this();
    this.href = href;
  }

  /**
   * Connection URI
   * @return href
   */
  @javax.annotation.Nullable
  public URI getHref() {
    return href;
  }



  public Connection type(@javax.annotation.Nonnull ConnectionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public ConnectionType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull ConnectionType type) {
    this.type = type;
  }


  public Connection uuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Equinix-assigned connection identifier
   * @return uuid
   */
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
  }


  public Connection name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer-provided connection name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Connection description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Customer-provided connection description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public Connection state(@javax.annotation.Nullable ConnectionState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public ConnectionState getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable ConnectionState state) {
    this.state = state;
  }


  public Connection change(@javax.annotation.Nullable Change change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @javax.annotation.Nullable
  public Change getChange() {
    return change;
  }

  public void setChange(@javax.annotation.Nullable Change change) {
    this.change = change;
  }


  public Connection operation(@javax.annotation.Nullable ConnectionOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable
  public ConnectionOperation getOperation() {
    return operation;
  }

  public void setOperation(@javax.annotation.Nullable ConnectionOperation operation) {
    this.operation = operation;
  }


  public Connection order(@javax.annotation.Nullable Order order) {
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


  public Connection notifications(@javax.annotation.Nullable List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Connection addNotificationsItem(SimplifiedNotification notificationsItem) {
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


  public Connection account(@javax.annotation.Nullable SimplifiedAccount account) {
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


  public Connection changeLog(@javax.annotation.Nullable Changelog changeLog) {
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


  public Connection bandwidth(@javax.annotation.Nonnull Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * Connection bandwidth in Mbps
   * minimum: 0
   * maximum: 10000
   * @return bandwidth
   */
  @javax.annotation.Nonnull
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(@javax.annotation.Nonnull Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public Connection geoScope(@javax.annotation.Nullable GeoScopeType geoScope) {
    this.geoScope = geoScope;
    return this;
  }

  /**
   * Get geoScope
   * @return geoScope
   */
  @javax.annotation.Nullable
  public GeoScopeType getGeoScope() {
    return geoScope;
  }

  public void setGeoScope(@javax.annotation.Nullable GeoScopeType geoScope) {
    this.geoScope = geoScope;
  }


  public Connection redundancy(@javax.annotation.Nullable ConnectionRedundancy redundancy) {
    this.redundancy = redundancy;
    return this;
  }

  /**
   * Get redundancy
   * @return redundancy
   */
  @javax.annotation.Nullable
  public ConnectionRedundancy getRedundancy() {
    return redundancy;
  }

  public void setRedundancy(@javax.annotation.Nullable ConnectionRedundancy redundancy) {
    this.redundancy = redundancy;
  }


  public Connection isRemote(@javax.annotation.Nullable Boolean isRemote) {
    this.isRemote = isRemote;
    return this;
  }

  /**
   * Connection property derived from access point locations
   * @return isRemote
   */
  @javax.annotation.Nullable
  public Boolean getIsRemote() {
    return isRemote;
  }

  public void setIsRemote(@javax.annotation.Nullable Boolean isRemote) {
    this.isRemote = isRemote;
  }


  public Connection direction(@javax.annotation.Nullable ConnectionDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nullable
  public ConnectionDirection getDirection() {
    return direction;
  }

  public void setDirection(@javax.annotation.Nullable ConnectionDirection direction) {
    this.direction = direction;
  }


  public Connection aSide(@javax.annotation.Nonnull ConnectionSide aSide) {
    this.aSide = aSide;
    return this;
  }

  /**
   * Get aSide
   * @return aSide
   */
  @javax.annotation.Nonnull
  public ConnectionSide getaSide() {
    return aSide;
  }

  public void setaSide(@javax.annotation.Nonnull ConnectionSide aSide) {
    this.aSide = aSide;
  }


  public Connection zSide(@javax.annotation.Nonnull ConnectionSide zSide) {
    this.zSide = zSide;
    return this;
  }

  /**
   * Get zSide
   * @return zSide
   */
  @javax.annotation.Nonnull
  public ConnectionSide getzSide() {
    return zSide;
  }

  public void setzSide(@javax.annotation.Nonnull ConnectionSide zSide) {
    this.zSide = zSide;
  }


  public Connection marketplaceSubscription(@javax.annotation.Nullable MarketplaceSubscription marketplaceSubscription) {
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


  public Connection additionalInfo(@javax.annotation.Nullable List<ConnectionSideAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public Connection addAdditionalInfoItem(ConnectionSideAdditionalInfo additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  /**
   * Connection additional information
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  public List<ConnectionSideAdditionalInfo> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(@javax.annotation.Nullable List<ConnectionSideAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public Connection project(@javax.annotation.Nullable Project project) {
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
   * @return the Connection instance itself
   */
  public Connection putAdditionalProperty(String key, Object value) {
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
    Connection connection = (Connection) o;
    return Objects.equals(this.href, connection.href) &&
        Objects.equals(this.type, connection.type) &&
        Objects.equals(this.uuid, connection.uuid) &&
        Objects.equals(this.name, connection.name) &&
        Objects.equals(this.description, connection.description) &&
        Objects.equals(this.state, connection.state) &&
        Objects.equals(this.change, connection.change) &&
        Objects.equals(this.operation, connection.operation) &&
        Objects.equals(this.order, connection.order) &&
        Objects.equals(this.notifications, connection.notifications) &&
        Objects.equals(this.account, connection.account) &&
        Objects.equals(this.changeLog, connection.changeLog) &&
        Objects.equals(this.bandwidth, connection.bandwidth) &&
        Objects.equals(this.geoScope, connection.geoScope) &&
        Objects.equals(this.redundancy, connection.redundancy) &&
        Objects.equals(this.isRemote, connection.isRemote) &&
        Objects.equals(this.direction, connection.direction) &&
        Objects.equals(this.aSide, connection.aSide) &&
        Objects.equals(this.zSide, connection.zSide) &&
        Objects.equals(this.marketplaceSubscription, connection.marketplaceSubscription) &&
        Objects.equals(this.additionalInfo, connection.additionalInfo) &&
        Objects.equals(this.project, connection.project)&&
        Objects.equals(this.additionalProperties, connection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, uuid, name, description, state, change, operation, order, notifications, account, changeLog, bandwidth, geoScope, redundancy, isRemote, direction, aSide, zSide, marketplaceSubscription, additionalInfo, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    geoScope: ").append(toIndentedString(geoScope)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    isRemote: ").append(toIndentedString(isRemote)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    aSide: ").append(toIndentedString(aSide)).append("\n");
    sb.append("    zSide: ").append(toIndentedString(zSide)).append("\n");
    sb.append("    marketplaceSubscription: ").append(toIndentedString(marketplaceSubscription)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("state");
    openapiFields.add("change");
    openapiFields.add("operation");
    openapiFields.add("order");
    openapiFields.add("notifications");
    openapiFields.add("account");
    openapiFields.add("changeLog");
    openapiFields.add("bandwidth");
    openapiFields.add("geoScope");
    openapiFields.add("redundancy");
    openapiFields.add("isRemote");
    openapiFields.add("direction");
    openapiFields.add("aSide");
    openapiFields.add("zSide");
    openapiFields.add("marketplaceSubscription");
    openapiFields.add("additionalInfo");
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("bandwidth");
    openapiRequiredFields.add("aSide");
    openapiRequiredFields.add("zSide");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Connection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connection is not found in the empty JSON string", Connection.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Connection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the required field `type`
      ConnectionType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        ConnectionState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        Change.validateJsonElement(jsonObj.get("change"));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        ConnectionOperation.validateJsonElement(jsonObj.get("operation"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonElement(jsonObj.get("order"));
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
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonElement(jsonObj.get("account"));
      }
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        Changelog.validateJsonElement(jsonObj.get("changeLog"));
      }
      // validate the optional field `geoScope`
      if (jsonObj.get("geoScope") != null && !jsonObj.get("geoScope").isJsonNull()) {
        GeoScopeType.validateJsonElement(jsonObj.get("geoScope"));
      }
      // validate the optional field `redundancy`
      if (jsonObj.get("redundancy") != null && !jsonObj.get("redundancy").isJsonNull()) {
        ConnectionRedundancy.validateJsonElement(jsonObj.get("redundancy"));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        ConnectionDirection.validateJsonElement(jsonObj.get("direction"));
      }
      // validate the required field `aSide`
      ConnectionSide.validateJsonElement(jsonObj.get("aSide"));
      // validate the required field `zSide`
      ConnectionSide.validateJsonElement(jsonObj.get("zSide"));
      // validate the optional field `marketplaceSubscription`
      if (jsonObj.get("marketplaceSubscription") != null && !jsonObj.get("marketplaceSubscription").isJsonNull()) {
        MarketplaceSubscription.validateJsonElement(jsonObj.get("marketplaceSubscription"));
      }
      if (jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) {
        JsonArray jsonArrayadditionalInfo = jsonObj.getAsJsonArray("additionalInfo");
        if (jsonArrayadditionalInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be an array in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
          }

          // validate the optional field `additionalInfo` (array)
          for (int i = 0; i < jsonArrayadditionalInfo.size(); i++) {
            ConnectionSideAdditionalInfo.validateJsonElement(jsonArrayadditionalInfo.get(i));
          };
        }
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
       if (!Connection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connection.class));

       return (TypeAdapter<T>) new TypeAdapter<Connection>() {
           @Override
           public void write(JsonWriter out, Connection value) throws IOException {
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
           public Connection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Connection instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Connection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Connection
   * @throws IOException if the JSON string is invalid with respect to Connection
   */
  public static Connection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connection.class);
  }

  /**
   * Convert an instance of Connection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

