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
import com.equinix.sdk.fabricv4.model.GCPCloudRouter;
import com.equinix.sdk.fabricv4.model.GCPPermission;
import com.equinix.sdk.fabricv4.model.TopologyProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;



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
public class GCPProviderResource extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GCPProviderResource.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GCPProviderResource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GCPProviderResource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GCPPermission> adapterGCPPermission = gson.getDelegateAdapter(this, TypeToken.get(GCPPermission.class));
            final TypeAdapter<GCPCloudRouter> adapterGCPCloudRouter = gson.getDelegateAdapter(this, TypeToken.get(GCPCloudRouter.class));

            return (TypeAdapter<T>) new TypeAdapter<GCPProviderResource>() {
                @Override
                public void write(JsonWriter out, GCPProviderResource value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GCPPermission`
                    if (value.getActualInstance() instanceof GCPPermission) {
                        JsonElement element = adapterGCPPermission.toJsonTree((GCPPermission)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GCPCloudRouter`
                    if (value.getActualInstance() instanceof GCPCloudRouter) {
                        JsonElement element = adapterGCPCloudRouter.toJsonTree((GCPCloudRouter)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GCPCloudRouter, GCPPermission");
                }

                @Override
                public GCPProviderResource read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GCPPermission
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GCPPermission.validateJsonElement(jsonElement);
                        actualAdapter = adapterGCPPermission;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GCPPermission'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GCPPermission failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GCPPermission'", e);
                    }
                    // deserialize GCPCloudRouter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GCPCloudRouter.validateJsonElement(jsonElement);
                        actualAdapter = adapterGCPCloudRouter;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GCPCloudRouter'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GCPCloudRouter failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GCPCloudRouter'", e);
                    }

                    if (match == 1) {
                        GCPProviderResource ret = new GCPProviderResource();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GCPProviderResource: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GCPProviderResource() {
        super("oneOf", Boolean.FALSE);
    }

    public GCPProviderResource(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GCPPermission", GCPPermission.class);
        schemas.put("GCPCloudRouter", GCPCloudRouter.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GCPProviderResource.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GCPCloudRouter, GCPPermission
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GCPPermission) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GCPCloudRouter) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GCPCloudRouter, GCPPermission");
    }

    /**
     * Get the actual instance, which can be the following:
     * GCPCloudRouter, GCPPermission
     *
     * @return The actual instance (GCPCloudRouter, GCPPermission)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GCPPermission`. If the actual instance is not `GCPPermission`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GCPPermission`
     * @throws ClassCastException if the instance is not `GCPPermission`
     */
    public GCPPermission getGCPPermission() throws ClassCastException {
        return (GCPPermission)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GCPCloudRouter`. If the actual instance is not `GCPCloudRouter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GCPCloudRouter`
     * @throws ClassCastException if the instance is not `GCPCloudRouter`
     */
    public GCPCloudRouter getGCPCloudRouter() throws ClassCastException {
        return (GCPCloudRouter)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GCPProviderResource
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with GCPPermission
        try {
            GCPPermission.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GCPPermission failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GCPCloudRouter
        try {
            GCPCloudRouter.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GCPCloudRouter failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GCPProviderResource with oneOf schemas: GCPCloudRouter, GCPPermission. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GCPProviderResource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GCPProviderResource
     * @throws IOException if the JSON string is invalid with respect to GCPProviderResource
     */
    public static GCPProviderResource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GCPProviderResource.class);
    }

    /**
     * Convert an instance of GCPProviderResource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

