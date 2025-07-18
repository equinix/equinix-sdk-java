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
import com.equinix.sdk.fabricv4.model.SearchDirectConnect;
import com.equinix.sdk.fabricv4.model.Subnet;
import com.equinix.sdk.fabricv4.model.VPC;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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
public class ProvidersSearchResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProvidersSearchResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ProvidersSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ProvidersSearchResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VPC> adapterVPC = gson.getDelegateAdapter(this, TypeToken.get(VPC.class));
            final TypeAdapter<Subnet> adapterSubnet = gson.getDelegateAdapter(this, TypeToken.get(Subnet.class));
            final TypeAdapter<SearchDirectConnect> adapterSearchDirectConnect = gson.getDelegateAdapter(this, TypeToken.get(SearchDirectConnect.class));

            return (TypeAdapter<T>) new TypeAdapter<ProvidersSearchResponse>() {
                @Override
                public void write(JsonWriter out, ProvidersSearchResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `VPC`
                    if (value.getActualInstance() instanceof VPC) {
                        JsonElement element = adapterVPC.toJsonTree((VPC)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Subnet`
                    if (value.getActualInstance() instanceof Subnet) {
                        JsonElement element = adapterSubnet.toJsonTree((Subnet)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `SearchDirectConnect`
                    if (value.getActualInstance() instanceof SearchDirectConnect) {
                        JsonElement element = adapterSearchDirectConnect.toJsonTree((SearchDirectConnect)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SearchDirectConnect, Subnet, VPC");
                }

                @Override
                public ProvidersSearchResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize VPC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VPC.validateJsonElement(jsonElement);
                        actualAdapter = adapterVPC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'VPC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for VPC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'VPC'", e);
                    }
                    // deserialize Subnet
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Subnet.validateJsonElement(jsonElement);
                        actualAdapter = adapterSubnet;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Subnet'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Subnet failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Subnet'", e);
                    }
                    // deserialize SearchDirectConnect
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SearchDirectConnect.validateJsonElement(jsonElement);
                        actualAdapter = adapterSearchDirectConnect;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SearchDirectConnect'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SearchDirectConnect failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SearchDirectConnect'", e);
                    }

                    if (match == 1) {
                        ProvidersSearchResponse ret = new ProvidersSearchResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ProvidersSearchResponse: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ProvidersSearchResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public ProvidersSearchResponse(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("VPC", VPC.class);
        schemas.put("Subnet", Subnet.class);
        schemas.put("SearchDirectConnect", SearchDirectConnect.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ProvidersSearchResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SearchDirectConnect, Subnet, VPC
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof VPC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Subnet) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SearchDirectConnect) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SearchDirectConnect, Subnet, VPC");
    }

    /**
     * Get the actual instance, which can be the following:
     * SearchDirectConnect, Subnet, VPC
     *
     * @return The actual instance (SearchDirectConnect, Subnet, VPC)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `VPC`. If the actual instance is not `VPC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VPC`
     * @throws ClassCastException if the instance is not `VPC`
     */
    public VPC getVPC() throws ClassCastException {
        return (VPC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Subnet`. If the actual instance is not `Subnet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Subnet`
     * @throws ClassCastException if the instance is not `Subnet`
     */
    public Subnet getSubnet() throws ClassCastException {
        return (Subnet)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SearchDirectConnect`. If the actual instance is not `SearchDirectConnect`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SearchDirectConnect`
     * @throws ClassCastException if the instance is not `SearchDirectConnect`
     */
    public SearchDirectConnect getSearchDirectConnect() throws ClassCastException {
        return (SearchDirectConnect)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ProvidersSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with VPC
        try {
            VPC.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for VPC failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Subnet
        try {
            Subnet.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Subnet failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SearchDirectConnect
        try {
            SearchDirectConnect.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SearchDirectConnect failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ProvidersSearchResponse with oneOf schemas: SearchDirectConnect, Subnet, VPC. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ProvidersSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ProvidersSearchResponse
     * @throws IOException if the JSON string is invalid with respect to ProvidersSearchResponse
     */
    public static ProvidersSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ProvidersSearchResponse.class);
    }

    /**
     * Convert an instance of ProvidersSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

