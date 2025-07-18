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
import com.equinix.sdk.fabricv4.model.CloudRouterActionsSearchExpression;
import com.equinix.sdk.fabricv4.model.CloudRouterActionsSearchOrFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.equinix.sdk.fabricv4.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CloudRouterActionsSearchFilter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CloudRouterActionsSearchFilter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CloudRouterActionsSearchFilter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CloudRouterActionsSearchFilter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CloudRouterActionsSearchExpression> adapterCloudRouterActionsSearchExpression = gson.getDelegateAdapter(this, TypeToken.get(CloudRouterActionsSearchExpression.class));
            final TypeAdapter<CloudRouterActionsSearchOrFilter> adapterCloudRouterActionsSearchOrFilter = gson.getDelegateAdapter(this, TypeToken.get(CloudRouterActionsSearchOrFilter.class));

            return (TypeAdapter<T>) new TypeAdapter<CloudRouterActionsSearchFilter>() {
                @Override
                public void write(JsonWriter out, CloudRouterActionsSearchFilter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CloudRouterActionsSearchExpression`
                    if (value.getActualInstance() instanceof CloudRouterActionsSearchExpression) {
                        JsonElement element = adapterCloudRouterActionsSearchExpression.toJsonTree((CloudRouterActionsSearchExpression)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CloudRouterActionsSearchOrFilter`
                    if (value.getActualInstance() instanceof CloudRouterActionsSearchOrFilter) {
                        JsonElement element = adapterCloudRouterActionsSearchOrFilter.toJsonTree((CloudRouterActionsSearchOrFilter)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter");
                }

                @Override
                public CloudRouterActionsSearchFilter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CloudRouterActionsSearchExpression
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CloudRouterActionsSearchExpression.validateJsonElement(jsonElement);
                        actualAdapter = adapterCloudRouterActionsSearchExpression;
                        CloudRouterActionsSearchFilter ret = new CloudRouterActionsSearchFilter();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CloudRouterActionsSearchExpression failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CloudRouterActionsSearchExpression'", e);
                    }
                    // deserialize CloudRouterActionsSearchOrFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CloudRouterActionsSearchOrFilter.validateJsonElement(jsonElement);
                        actualAdapter = adapterCloudRouterActionsSearchOrFilter;
                        CloudRouterActionsSearchFilter ret = new CloudRouterActionsSearchFilter();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CloudRouterActionsSearchOrFilter failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CloudRouterActionsSearchOrFilter'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CloudRouterActionsSearchFilter: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CloudRouterActionsSearchFilter() {
        super("anyOf", Boolean.FALSE);
    }

    public CloudRouterActionsSearchFilter(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CloudRouterActionsSearchExpression", CloudRouterActionsSearchExpression.class);
        schemas.put("CloudRouterActionsSearchOrFilter", CloudRouterActionsSearchOrFilter.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CloudRouterActionsSearchFilter.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CloudRouterActionsSearchExpression) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CloudRouterActionsSearchOrFilter) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter");
    }

    /**
     * Get the actual instance, which can be the following:
     * CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter
     *
     * @return The actual instance (CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudRouterActionsSearchExpression`. If the actual instance is not `CloudRouterActionsSearchExpression`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudRouterActionsSearchExpression`
     * @throws ClassCastException if the instance is not `CloudRouterActionsSearchExpression`
     */
    public CloudRouterActionsSearchExpression getCloudRouterActionsSearchExpression() throws ClassCastException {
        return (CloudRouterActionsSearchExpression)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudRouterActionsSearchOrFilter`. If the actual instance is not `CloudRouterActionsSearchOrFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudRouterActionsSearchOrFilter`
     * @throws ClassCastException if the instance is not `CloudRouterActionsSearchOrFilter`
     */
    public CloudRouterActionsSearchOrFilter getCloudRouterActionsSearchOrFilter() throws ClassCastException {
        return (CloudRouterActionsSearchOrFilter)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CloudRouterActionsSearchFilter
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CloudRouterActionsSearchExpression
        try {
            CloudRouterActionsSearchExpression.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CloudRouterActionsSearchExpression failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CloudRouterActionsSearchOrFilter
        try {
            CloudRouterActionsSearchOrFilter.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CloudRouterActionsSearchOrFilter failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for CloudRouterActionsSearchFilter with anyOf schemas: CloudRouterActionsSearchExpression, CloudRouterActionsSearchOrFilter. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CloudRouterActionsSearchFilter given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CloudRouterActionsSearchFilter
     * @throws IOException if the JSON string is invalid with respect to CloudRouterActionsSearchFilter
     */
    public static CloudRouterActionsSearchFilter fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CloudRouterActionsSearchFilter.class);
    }

    /**
     * Convert an instance of CloudRouterActionsSearchFilter to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

