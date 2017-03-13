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
import io.swagger.client.model.FilterIdArray;
import io.swagger.client.model.ListExpressServiceCodes;
import io.swagger.client.model.SortId;

/**
 * API tests for ExpressservicecodesApi
 */
public class ExpressServiceCodesApiTest {

    private final ExpressServiceCodesApi api = new ExpressServiceCodesApi();

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
        Integer codeId = 324202;
        ExpressServiceCodeFull response = api.getAccountExpressSrvCode(accountId, codeId);
        
        assertNotNull(response);
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
        ListExpressServiceCodes response = api.listAccountExpressSrvCodes(accountId, filtersId);

        assertNotNull(response);
        List<ExpressServiceCodeFull> items = response.getItems();
        assertNotNull(items);
        FilterIdArray filters = response.getFilters();
        assertNotNull(filters);
        assertEquals(TestConfig.GREATER_THAN_FILTER, filters.getId());
        
        Integer limit2 = response.getLimit();
        assertNotNull(limit2);
        Integer offset2 = response.getOffset();
        assertNotNull(offset2);
        List<SortId> sort = response.getSort();
        assertNotNull(sort);
    }
    
}
