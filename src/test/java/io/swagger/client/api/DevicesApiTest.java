/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import static io.swagger.client.helper.TestConfig.GREATER_THAN_FILTER;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateDeviceParams;
import io.swagger.client.model.DeviceFull;
import io.swagger.client.model.DevicesFull;
import io.swagger.client.model.FilterIdNameArray;
import io.swagger.client.model.ListDevicesFull;
import io.swagger.client.model.SortIdName;
/**
 * API tests for DevicesApi
 */
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    @Test
    public void createGetReplaceDeleteDevice() throws ApiException {

    	// Create
    	Integer accountId = 1315091;
        CreateDeviceParams data = new CreateDeviceParams();
        String name = "Geordi";
		data.setName(name);

		// TODO: [API Error] Create call: Unprocessable entity

		DeviceFull responseCreate = api.createAccountDevice(accountId, data);
        assertNotNull(responseCreate);
        assertEquals(name, responseCreate.getName());

        // Get After Create
        DeviceFull responseGetAfterCreate = api.getAccountDevice(accountId, responseCreate.getId());
        assertNotNull(responseGetAfterCreate);
        assertEquals(name, responseCreate.getName());

        // Replace
        data.setName(name + "2");
        DeviceFull responseReplace = api.replaceAccountDevice(accountId, responseCreate.getId(), data);
        assertNotNull(responseReplace);

        // Get After Replace
        DeviceFull responseGetAfterReplace = api.getAccountDevice(accountId, responseCreate.getId());
        assertNotNull(responseGetAfterReplace);
        assertEquals(name, responseGetAfterReplace.getName());
    }
    
    /**
     * Register a generic VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void createAccountDeviceTest() throws ApiException {
        Integer accountId = null;
        CreateDeviceParams data = null;
        DeviceFull response = api.createAccountDevice(accountId, data);

        assertNotNull(response);
    }
    
    /**
     * Show details of an individual VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void getAccountDeviceTest() throws ApiException {
        Integer accountId = 1315091;
        Integer deviceId = 142315;
        DeviceFull response = api.getAccountDevice(accountId, deviceId);
        
        assertNotNull(response);
    }
    
    /**
     * Get a list of VoIP devices associated with your account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountDevicesTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = TestConfig.createDefaultFilter();
        List<String> filtersName = TestConfig.createDefaultFilter();
        String sortId = "asc";
        String sortName = "asc";
        Integer limit = 4;
        Integer offset = 1;
        String fields = null;
        
        // When
        ListDevicesFull response = api.listAccountDevices(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        //Then
        assertNotNull(response);
        DevicesFull items = response.getItems();
        assertNotNull(items);
        
        FilterIdNameArray filters = response.getFilters();
        assertNotNull(filters);
        assertEquals(GREATER_THAN_FILTER, filters.getId());
        
        assertEquals(GREATER_THAN_FILTER, filters.getName());
        
        Integer limitActual = response.getLimit();
        assertNotNull(limitActual);
        assertEquals(limit, limitActual);
        
        Integer offsetActual = response.getOffset();
        assertNotNull(offsetActual);
        assertEquals(offset, offsetActual);
        
        SortIdName sort = response.getSort();
        assertNotNull(sort);
        assertEquals(sortId, sort.getId());
        
        assertEquals(sortName, sort.getName());
    }
    
    /**
     * Update the settings for an individual VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void replaceAccountDeviceTest() throws ApiException {
        Integer accountId = null;
        Integer deviceId = null;
        CreateDeviceParams data = null;
        DeviceFull response = api.replaceAccountDevice(accountId, deviceId, data);

        assertNotNull(response);
    }
    
}
