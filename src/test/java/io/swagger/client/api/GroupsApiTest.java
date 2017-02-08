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

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateGroupParams;
import io.swagger.client.model.GroupFull;
import io.swagger.client.model.DeleteGroup;
import io.swagger.client.model.ListGroupsFull;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
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
    public void createAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        CreateGroupParams data = null;
        // GroupFull response = api.createAccountExtensionContactGroup(accountId, extensionId, data);

        // TODO: test validations
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
    public void deleteAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        Integer groupId = null;
        // DeleteGroup response = api.deleteAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
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
    public void getAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        Integer groupId = null;
        // GroupFull response = api.getAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
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
        Integer accountId = null;
        Integer extensionId = null;
        List<String> filtersId = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        // ListGroupsFull response = api.listAccountExtensionContactGroups(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        // TODO: test validations
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
    public void replaceAccountExtensionContactGroupTest() throws ApiException {
        Integer accountId = null;
        Integer extensionId = null;
        Integer groupId = null;
        // GroupFull response = api.replaceAccountExtensionContactGroup(accountId, extensionId, groupId);

        // TODO: test validations
    }
    
}
