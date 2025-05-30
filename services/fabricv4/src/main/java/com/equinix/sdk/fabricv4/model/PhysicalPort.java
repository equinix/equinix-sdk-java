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
import com.equinix.sdk.fabricv4.model.PhysicalPortSettings;
import com.equinix.sdk.fabricv4.model.PhysicalPortType;
import com.equinix.sdk.fabricv4.model.PortAdditionalInfo;
import com.equinix.sdk.fabricv4.model.PortDemarcationPoint;
import com.equinix.sdk.fabricv4.model.PortInterface;
import com.equinix.sdk.fabricv4.model.PortLoa;
import com.equinix.sdk.fabricv4.model.PortNotification;
import com.equinix.sdk.fabricv4.model.PortOperation;
import com.equinix.sdk.fabricv4.model.PortOrder;
import com.equinix.sdk.fabricv4.model.PortState;
import com.equinix.sdk.fabricv4.model.PortTether;
import com.equinix.sdk.fabricv4.model.SimplifiedAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.sdk.fabricv4.JSON;

/**
 * Physical Port specification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhysicalPort {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PhysicalPortType type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private PortState state;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_INTERFACE_SPEED = "interfaceSpeed";
  @SerializedName(SERIALIZED_NAME_INTERFACE_SPEED)
  private Integer interfaceSpeed;

  public static final String SERIALIZED_NAME_INTERFACE_TYPE = "interfaceType";
  @SerializedName(SERIALIZED_NAME_INTERFACE_TYPE)
  private String interfaceType;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_TETHER = "tether";
  @SerializedName(SERIALIZED_NAME_TETHER)
  private PortTether tether;

  public static final String SERIALIZED_NAME_DEMARCATION_POINT = "demarcationPoint";
  @SerializedName(SERIALIZED_NAME_DEMARCATION_POINT)
  private PortDemarcationPoint demarcationPoint;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private PhysicalPortSettings settings;

  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private PortInterface _interface;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<PortNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private List<PortAdditionalInfo> additionalInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private PortOrder order;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private PortOperation operation;

  public static final String SERIALIZED_NAME_LOAS = "loas";
  @SerializedName(SERIALIZED_NAME_LOAS)
  private List<PortLoa> loas = new ArrayList<>();

  public PhysicalPort() {
  }

  
  public PhysicalPort(
     URI href
  ) {
    this();
    this.href = href;
  }

   /**
   * Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context.
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public PhysicalPort type(PhysicalPortType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public PhysicalPortType getType() {
    return type;
  }


  public void setType(PhysicalPortType type) {
    this.type = type;
  }


  public PhysicalPort id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Equinix assigned response attribute for Physical Port Id
   * @return id
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PhysicalPort state(PortState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public PortState getState() {
    return state;
  }


  public void setState(PortState state) {
    this.state = state;
  }


  public PhysicalPort account(SimplifiedAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public SimplifiedAccount getAccount() {
    return account;
  }


  public void setAccount(SimplifiedAccount account) {
    this.account = account;
  }


  public PhysicalPort interfaceSpeed(Integer interfaceSpeed) {
    
    this.interfaceSpeed = interfaceSpeed;
    return this;
  }

   /**
   * Physical Port Speed in Mbps
   * minimum: 0
   * @return interfaceSpeed
  **/
  @javax.annotation.Nullable

  public Integer getInterfaceSpeed() {
    return interfaceSpeed;
  }


  public void setInterfaceSpeed(Integer interfaceSpeed) {
    this.interfaceSpeed = interfaceSpeed;
  }


  public PhysicalPort interfaceType(String interfaceType) {
    
    this.interfaceType = interfaceType;
    return this;
  }

   /**
   * Physical Port Interface Type
   * @return interfaceType
  **/
  @javax.annotation.Nullable

  public String getInterfaceType() {
    return interfaceType;
  }


  public void setInterfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
  }


  public PhysicalPort uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix assigned response attribute for physical port identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public PhysicalPort tether(PortTether tether) {
    
    this.tether = tether;
    return this;
  }

   /**
   * Get tether
   * @return tether
  **/
  @javax.annotation.Nullable

  public PortTether getTether() {
    return tether;
  }


  public void setTether(PortTether tether) {
    this.tether = tether;
  }


  public PhysicalPort demarcationPoint(PortDemarcationPoint demarcationPoint) {
    
    this.demarcationPoint = demarcationPoint;
    return this;
  }

   /**
   * Get demarcationPoint
   * @return demarcationPoint
  **/
  @javax.annotation.Nullable

  public PortDemarcationPoint getDemarcationPoint() {
    return demarcationPoint;
  }


  public void setDemarcationPoint(PortDemarcationPoint demarcationPoint) {
    this.demarcationPoint = demarcationPoint;
  }


  public PhysicalPort settings(PhysicalPortSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public PhysicalPortSettings getSettings() {
    return settings;
  }


  public void setSettings(PhysicalPortSettings settings) {
    this.settings = settings;
  }


  public PhysicalPort _interface(PortInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable

  public PortInterface getInterface() {
    return _interface;
  }


  public void setInterface(PortInterface _interface) {
    this._interface = _interface;
  }


  public PhysicalPort notifications(List<PortNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public PhysicalPort addNotificationsItem(PortNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Notification preferences
   * @return notifications
  **/
  @javax.annotation.Nullable

  public List<PortNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<PortNotification> notifications) {
    this.notifications = notifications;
  }


  public PhysicalPort additionalInfo(List<PortAdditionalInfo> additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  public PhysicalPort addAdditionalInfoItem(PortAdditionalInfo additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

   /**
   * Physical Port additional information
   * @return additionalInfo
  **/
  @javax.annotation.Nullable

  public List<PortAdditionalInfo> getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(List<PortAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public PhysicalPort order(PortOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable

  public PortOrder getOrder() {
    return order;
  }


  public void setOrder(PortOrder order) {
    this.order = order;
  }


  public PhysicalPort operation(PortOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable

  public PortOperation getOperation() {
    return operation;
  }


  public void setOperation(PortOperation operation) {
    this.operation = operation;
  }


  public PhysicalPort loas(List<PortLoa> loas) {
    
    this.loas = loas;
    return this;
  }

  public PhysicalPort addLoasItem(PortLoa loasItem) {
    if (this.loas == null) {
      this.loas = new ArrayList<>();
    }
    this.loas.add(loasItem);
    return this;
  }

   /**
   * Port Loas
   * @return loas
  **/
  @javax.annotation.Nullable

  public List<PortLoa> getLoas() {
    return loas;
  }


  public void setLoas(List<PortLoa> loas) {
    this.loas = loas;
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
   * @return the PhysicalPort instance itself
   */
  public PhysicalPort putAdditionalProperty(String key, Object value) {
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
    PhysicalPort physicalPort = (PhysicalPort) o;
    return Objects.equals(this.href, physicalPort.href) &&
        Objects.equals(this.type, physicalPort.type) &&
        Objects.equals(this.id, physicalPort.id) &&
        Objects.equals(this.state, physicalPort.state) &&
        Objects.equals(this.account, physicalPort.account) &&
        Objects.equals(this.interfaceSpeed, physicalPort.interfaceSpeed) &&
        Objects.equals(this.interfaceType, physicalPort.interfaceType) &&
        Objects.equals(this.uuid, physicalPort.uuid) &&
        Objects.equals(this.tether, physicalPort.tether) &&
        Objects.equals(this.demarcationPoint, physicalPort.demarcationPoint) &&
        Objects.equals(this.settings, physicalPort.settings) &&
        Objects.equals(this._interface, physicalPort._interface) &&
        Objects.equals(this.notifications, physicalPort.notifications) &&
        Objects.equals(this.additionalInfo, physicalPort.additionalInfo) &&
        Objects.equals(this.order, physicalPort.order) &&
        Objects.equals(this.operation, physicalPort.operation) &&
        Objects.equals(this.loas, physicalPort.loas)&&
        Objects.equals(this.additionalProperties, physicalPort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, id, state, account, interfaceSpeed, interfaceType, uuid, tether, demarcationPoint, settings, _interface, notifications, additionalInfo, order, operation, loas, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalPort {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    interfaceSpeed: ").append(toIndentedString(interfaceSpeed)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    tether: ").append(toIndentedString(tether)).append("\n");
    sb.append("    demarcationPoint: ").append(toIndentedString(demarcationPoint)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    loas: ").append(toIndentedString(loas)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("state");
    openapiFields.add("account");
    openapiFields.add("interfaceSpeed");
    openapiFields.add("interfaceType");
    openapiFields.add("uuid");
    openapiFields.add("tether");
    openapiFields.add("demarcationPoint");
    openapiFields.add("settings");
    openapiFields.add("interface");
    openapiFields.add("notifications");
    openapiFields.add("additionalInfo");
    openapiFields.add("order");
    openapiFields.add("operation");
    openapiFields.add("loas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhysicalPort
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhysicalPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhysicalPort is not found in the empty JSON string", PhysicalPort.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      if ((jsonObj.get("interfaceType") != null && !jsonObj.get("interfaceType").isJsonNull()) && !jsonObj.get("interfaceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interfaceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interfaceType").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `tether`
      if (jsonObj.get("tether") != null && !jsonObj.get("tether").isJsonNull()) {
        PortTether.validateJsonObject(jsonObj.getAsJsonObject("tether"));
      }
      // validate the optional field `demarcationPoint`
      if (jsonObj.get("demarcationPoint") != null && !jsonObj.get("demarcationPoint").isJsonNull()) {
        PortDemarcationPoint.validateJsonObject(jsonObj.getAsJsonObject("demarcationPoint"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        PhysicalPortSettings.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      // validate the optional field `interface`
      if (jsonObj.get("interface") != null && !jsonObj.get("interface").isJsonNull()) {
        PortInterface.validateJsonObject(jsonObj.getAsJsonObject("interface"));
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
            PortNotification.validateJsonObject(jsonArraynotifications.get(i).getAsJsonObject());
          };
        }
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
            PortAdditionalInfo.validateJsonObject(jsonArrayadditionalInfo.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        PortOrder.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        PortOperation.validateJsonObject(jsonObj.getAsJsonObject("operation"));
      }
      if (jsonObj.get("loas") != null && !jsonObj.get("loas").isJsonNull()) {
        JsonArray jsonArrayloas = jsonObj.getAsJsonArray("loas");
        if (jsonArrayloas != null) {
          // ensure the json data is an array
          if (!jsonObj.get("loas").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `loas` to be an array in the JSON string but got `%s`", jsonObj.get("loas").toString()));
          }

          // validate the optional field `loas` (array)
          for (int i = 0; i < jsonArrayloas.size(); i++) {
            PortLoa.validateJsonObject(jsonArrayloas.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhysicalPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhysicalPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhysicalPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhysicalPort.class));

       return (TypeAdapter<T>) new TypeAdapter<PhysicalPort>() {
           @Override
           public void write(JsonWriter out, PhysicalPort value) throws IOException {
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
           public PhysicalPort read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PhysicalPort instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PhysicalPort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhysicalPort
  * @throws IOException if the JSON string is invalid with respect to PhysicalPort
  */
  public static PhysicalPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhysicalPort.class);
  }

 /**
  * Convert an instance of PhysicalPort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

