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
import com.equinix.sdk.fabricv4.model.AddOperation;
import com.equinix.sdk.fabricv4.model.OpEnum;
import com.equinix.sdk.fabricv4.model.RemoveOperation;
import com.equinix.sdk.fabricv4.model.ReplaceOperation;
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
public class JsonPatchOperation extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JsonPatchOperation.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JsonPatchOperation.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JsonPatchOperation' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddOperation> adapterAddOperation = gson.getDelegateAdapter(this, TypeToken.get(AddOperation.class));
            final TypeAdapter<RemoveOperation> adapterRemoveOperation = gson.getDelegateAdapter(this, TypeToken.get(RemoveOperation.class));
            final TypeAdapter<ReplaceOperation> adapterReplaceOperation = gson.getDelegateAdapter(this, TypeToken.get(ReplaceOperation.class));

            return (TypeAdapter<T>) new TypeAdapter<JsonPatchOperation>() {
                @Override
                public void write(JsonWriter out, JsonPatchOperation value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddOperation`
                    if (value.getActualInstance() instanceof AddOperation) {
                        JsonElement element = adapterAddOperation.toJsonTree((AddOperation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RemoveOperation`
                    if (value.getActualInstance() instanceof RemoveOperation) {
                        JsonElement element = adapterRemoveOperation.toJsonTree((RemoveOperation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ReplaceOperation`
                    if (value.getActualInstance() instanceof ReplaceOperation) {
                        JsonElement element = adapterReplaceOperation.toJsonTree((ReplaceOperation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddOperation, RemoveOperation, ReplaceOperation");
                }

                @Override
                public JsonPatchOperation read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AddOperation.validateJsonElement(jsonElement);
                        actualAdapter = adapterAddOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AddOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AddOperation'", e);
                    }
                    // deserialize RemoveOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RemoveOperation.validateJsonElement(jsonElement);
                        actualAdapter = adapterRemoveOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RemoveOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RemoveOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RemoveOperation'", e);
                    }
                    // deserialize ReplaceOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ReplaceOperation.validateJsonElement(jsonElement);
                        actualAdapter = adapterReplaceOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ReplaceOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ReplaceOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ReplaceOperation'", e);
                    }

                    if (match == 1) {
                        JsonPatchOperation ret = new JsonPatchOperation();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for JsonPatchOperation: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public JsonPatchOperation() {
        super("oneOf", Boolean.FALSE);
    }

    public JsonPatchOperation(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddOperation", AddOperation.class);
        schemas.put("RemoveOperation", RemoveOperation.class);
        schemas.put("ReplaceOperation", ReplaceOperation.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return JsonPatchOperation.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddOperation, RemoveOperation, ReplaceOperation
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddOperation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RemoveOperation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ReplaceOperation) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddOperation, RemoveOperation, ReplaceOperation");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddOperation, RemoveOperation, ReplaceOperation
     *
     * @return The actual instance (AddOperation, RemoveOperation, ReplaceOperation)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddOperation`. If the actual instance is not `AddOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddOperation`
     * @throws ClassCastException if the instance is not `AddOperation`
     */
    public AddOperation getAddOperation() throws ClassCastException {
        return (AddOperation)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RemoveOperation`. If the actual instance is not `RemoveOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RemoveOperation`
     * @throws ClassCastException if the instance is not `RemoveOperation`
     */
    public RemoveOperation getRemoveOperation() throws ClassCastException {
        return (RemoveOperation)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReplaceOperation`. If the actual instance is not `ReplaceOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReplaceOperation`
     * @throws ClassCastException if the instance is not `ReplaceOperation`
     */
    public ReplaceOperation getReplaceOperation() throws ClassCastException {
        return (ReplaceOperation)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to JsonPatchOperation
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AddOperation
        try {
            AddOperation.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AddOperation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RemoveOperation
        try {
            RemoveOperation.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RemoveOperation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ReplaceOperation
        try {
            ReplaceOperation.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ReplaceOperation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for JsonPatchOperation with oneOf schemas: AddOperation, RemoveOperation, ReplaceOperation. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of JsonPatchOperation given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of JsonPatchOperation
     * @throws IOException if the JSON string is invalid with respect to JsonPatchOperation
     */
    public static JsonPatchOperation fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, JsonPatchOperation.class);
    }

    /**
     * Convert an instance of JsonPatchOperation to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

