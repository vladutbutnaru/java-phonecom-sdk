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
import io.swagger.client.model.CreateSubaccountParams;
import io.swagger.client.model.AccountFull;
import io.swagger.client.model.ListAccountsFull;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubaccountsApi
 */
public class SubaccountsApiTest {

    private final SubaccountsApi api = new SubaccountsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Add a subaccount for the authenticated user or client
     *
     * This service shows the details of an individual Subaccount.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountSubaccountTest() throws ApiException {
        Integer accountId = null;
        CreateSubaccountParams data = null;
        // AccountFull response = api.createAccountSubaccount(accountId, data);

        // TODO: test validations
    }
    
    /**
     * Get a list of subaccounts for the authenticated user or client
     *
     * This service lists the Subaccount of the authenticated client. In most cases, there will not be any.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountSubaccountsTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        String sortId = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListAccountsFull response = api.listAccountSubaccounts(accountId, filtersId, sortId, limit, offset, fields);
        assertNotNull(response.getFilters());
        assertNotNull(response.getItems());
        assertNotNull(response.getLimit());
        assertNotNull(response.getOffset());
        assertNotNull(response.getSort());
        assertNotNull(response.getTotal());
        // TODO: test validations
    }
    
}
