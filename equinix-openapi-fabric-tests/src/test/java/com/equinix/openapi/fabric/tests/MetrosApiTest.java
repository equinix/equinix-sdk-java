package com.equinix.openapi.fabric.tests;

import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.model.Metro;
import com.equinix.sdk.fabricv4.model.MetroResponse;
import org.junit.Test;

import static com.equinix.openapi.fabric.tests.helpers.Apis.metrosApi;
import static org.junit.Assert.assertEquals;

/**
 * API tests for MetrosApi
 */
public class MetrosApiTest {
    private final String metroCode = "SV";

    @Test
    public void getMetroByCode() throws ApiException {
        Metro metro = metrosApi.getMetroByCode(metroCode);
        assertEquals(200, metrosApi.getApiClient().getStatusCode());
        assertEquals(metroCode, metro.getCode());
    }

    @Test
    public void getMetros() throws ApiException {
        MetroResponse metroResponse = metrosApi.getMetros(null, 1, 10);
        assertEquals(200, metrosApi.getApiClient().getStatusCode());
    }
}
