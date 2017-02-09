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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.ExpressServiceCodeFull;
import io.swagger.client.model.ExpressServiceCodesFull;
import io.swagger.client.model.FilterIdArray;
import io.swagger.client.model.ListExpressServiceCodesFull;
import io.swagger.client.model.SortId;
import io.swagger.client.model.SortIdArray;

/**
 * API tests for ExpressservicecodesApi
 */
public class ExpressservicecodesApiTest {

    private final ExpressservicecodesApi api = new ExpressservicecodesApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Show details of an account Express Service Code
     *
     * This service shows the details of an Account Express Service Code.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountExpressSrvCodeTest() throws ApiException {
        Integer accountId = 1315091;
        Integer codeId = 323446;
        ExpressServiceCodeFull response = api.getAccountExpressSrvCode(accountId, codeId);
        
        

        // TODO: test validations
    }
    
    /**
     * Get the Express Service Code associated with your account in list format
     *
     * See Express Service Codes for more detail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountExpressSrvCodesTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = TestConfig.createDefaultFilter();
        ListExpressServiceCodesFull response = api.listAccountExpressSrvCodes(accountId, filtersId);

        assertNotNull(response);
        ExpressServiceCodesFull items = response.getItems();
        assertNotNull(items);
        FilterIdArray filters = response.getFilters();
        assertNotNull(filters);
        assertEquals(TestConfig.GREATER_THAN_FILTER, filters.getId());
        
        Integer limit2 = response.getLimit();
        assertNotNull(limit2);
        Integer offset2 = response.getOffset();
        assertNotNull(offset2);
        SortIdArray sort = response.getSort();
        assertNotNull(sort);
    }
    
}
