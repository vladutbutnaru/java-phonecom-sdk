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
import io.swagger.client.model.CreateGroupParams;
import io.swagger.client.model.DeleteGroup;
import io.swagger.client.model.FilterIdNameArray;
import io.swagger.client.model.GroupFull;
import io.swagger.client.model.GroupsFull;
import io.swagger.client.model.ListGroupsFull;
import io.swagger.client.model.SortIdName;
/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    @Test
    public void createGetReplaceDeleteGroup() throws ApiException {

    	// Create
    	Integer accountId = 1315091;
        Integer extensionId = 1764590;
        CreateGroupParams data = new CreateGroupParams();
        String name = "Geordi";
		data.setName(name);

		// TODO: [API Error] Replace call doesn't have id of the group for which the replace should occur 

		GroupFull responseCreate = api.createAccountExtensionContactGroup(accountId, extensionId, data);
        assertNotNull(responseCreate);
        assertEquals(name, responseCreate.getName());

        // Get After Create
        GroupFull responseGetAfterCreate = 
        		api.getAccountExtensionContactGroup(accountId, extensionId, responseCreate.getId());
        assertNotNull(responseGetAfterCreate);
        assertEquals(name, responseCreate.getName());

        // Replace
//        data.setName("idroeG");
//        GroupFull responseReplace = api.replaceAccountExtensionContactGroup(accountId, extensionId, responseCreate.getId());
//        assertNotNull(responseReplace);

        // Get After Replace
//        GroupFull responseGetAfterReplace = 
//        		api.getAccountExtensionContactGroup(accountId, extensionId, responseCreate.getId());
//        assertNotNull(responseGetAfterReplace);
//        assertEquals(name, responseGetAfterReplace.getName());
        
        // Delete
        DeleteGroup responseDelete = api.deleteAccountExtensionContactGroup(accountId, extensionId, responseCreate.getId());
        assertNotNull(responseDelete);
        assertEquals(true, responseDelete.getSuccess());
    }
    
    /**
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void createAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        CreateGroupParams data = null;
        GroupFull response = api.createAccountExtensionContactGroup(accountId, extensionId, data);

        assertNotNull(response);
    }
    
    /**
     * Delete an addressbook group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void deleteAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        Integer groupId = null;
        DeleteGroup response = api.deleteAccountExtensionContactGroup(accountId, extensionId, groupId);

        assertNotNull(response);
    }
    
    /**
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void getAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer groupId = null;
        GroupFull response = api.getAccountExtensionContactGroup(accountId, extensionId, groupId);

        assertNotNull(response);
    }
    
    /**
     * Show a list of contact groups belonging to an extension
     *
     * See Account Contact Groups for details on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountExtensionContactGroupsTest() throws ApiException {

        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        List<String> filtersId = TestConfig.createDefaultFilter();
        List<String> filtersName = TestConfig.createDefaultFilter();
        String sortId = "asc";
        String sortName = "asc";
        Integer limit = 4;
        Integer offset = 1;
        String fields = null;
        
        // When
        ListGroupsFull response = api.listAccountExtensionContactGroups(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        // Then
        assertNotNull(response);
        GroupsFull items = response.getItems();
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
     * 
     *
     * See Account Contact Groups for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void replaceAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        Integer groupId = null;
        GroupFull response = api.replaceAccountExtensionContactGroup(accountId, extensionId, groupId);

        assertNotNull(response);
    }
    
}
