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
import com.equinix.sdk.fabricv4.model.AWSProvider;
import com.equinix.sdk.fabricv4.model.FabricProvider;
import com.equinix.sdk.fabricv4.model.GCPProvider;
import com.equinix.sdk.fabricv4.model.GCPProviderResource;
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
public class OrchestratorProviders extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OrchestratorProviders.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrchestratorProviders.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrchestratorProviders' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FabricProvider> adapterFabricProvider = gson.getDelegateAdapter(this, TypeToken.get(FabricProvider.class));
            final TypeAdapter<AWSProvider> adapterAWSProvider = gson.getDelegateAdapter(this, TypeToken.get(AWSProvider.class));
            final TypeAdapter<GCPProvider> adapterGCPProvider = gson.getDelegateAdapter(this, TypeToken.get(GCPProvider.class));

            return (TypeAdapter<T>) new TypeAdapter<OrchestratorProviders>() {
                @Override
                public void write(JsonWriter out, OrchestratorProviders value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FabricProvider`
                    if (value.getActualInstance() instanceof FabricProvider) {
                        JsonElement element = adapterFabricProvider.toJsonTree((FabricProvider)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AWSProvider`
                    if (value.getActualInstance() instanceof AWSProvider) {
                        JsonElement element = adapterAWSProvider.toJsonTree((AWSProvider)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GCPProvider`
                    if (value.getActualInstance() instanceof GCPProvider) {
                        JsonElement element = adapterGCPProvider.toJsonTree((GCPProvider)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AWSProvider, FabricProvider, GCPProvider");
                }

                @Override
                public OrchestratorProviders read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FabricProvider
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FabricProvider.validateJsonElement(jsonElement);
                        actualAdapter = adapterFabricProvider;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FabricProvider'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FabricProvider failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FabricProvider'", e);
                    }
                    // deserialize AWSProvider
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AWSProvider.validateJsonElement(jsonElement);
                        actualAdapter = adapterAWSProvider;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AWSProvider'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AWSProvider failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AWSProvider'", e);
                    }
                    // deserialize GCPProvider
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GCPProvider.validateJsonElement(jsonElement);
                        actualAdapter = adapterGCPProvider;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GCPProvider'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GCPProvider failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GCPProvider'", e);
                    }

                    if (match == 1) {
                        OrchestratorProviders ret = new OrchestratorProviders();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for OrchestratorProviders: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public OrchestratorProviders() {
        super("oneOf", Boolean.FALSE);
    }

    public OrchestratorProviders(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FabricProvider", FabricProvider.class);
        schemas.put("AWSProvider", AWSProvider.class);
        schemas.put("GCPProvider", GCPProvider.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return OrchestratorProviders.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AWSProvider, FabricProvider, GCPProvider
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FabricProvider) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AWSProvider) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GCPProvider) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AWSProvider, FabricProvider, GCPProvider");
    }

    /**
     * Get the actual instance, which can be the following:
     * AWSProvider, FabricProvider, GCPProvider
     *
     * @return The actual instance (AWSProvider, FabricProvider, GCPProvider)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FabricProvider`. If the actual instance is not `FabricProvider`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FabricProvider`
     * @throws ClassCastException if the instance is not `FabricProvider`
     */
    public FabricProvider getFabricProvider() throws ClassCastException {
        return (FabricProvider)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AWSProvider`. If the actual instance is not `AWSProvider`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AWSProvider`
     * @throws ClassCastException if the instance is not `AWSProvider`
     */
    public AWSProvider getAWSProvider() throws ClassCastException {
        return (AWSProvider)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GCPProvider`. If the actual instance is not `GCPProvider`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GCPProvider`
     * @throws ClassCastException if the instance is not `GCPProvider`
     */
    public GCPProvider getGCPProvider() throws ClassCastException {
        return (GCPProvider)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to OrchestratorProviders
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FabricProvider
        try {
            FabricProvider.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FabricProvider failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AWSProvider
        try {
            AWSProvider.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AWSProvider failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GCPProvider
        try {
            GCPProvider.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GCPProvider failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for OrchestratorProviders with oneOf schemas: AWSProvider, FabricProvider, GCPProvider. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of OrchestratorProviders given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrchestratorProviders
     * @throws IOException if the JSON string is invalid with respect to OrchestratorProviders
     */
    public static OrchestratorProviders fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrchestratorProviders.class);
    }

    /**
     * Convert an instance of OrchestratorProviders to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

