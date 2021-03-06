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

import static io.swagger.client.helper.TestConfig.GREATER_THAN_FILTER;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.ApplicationFull;
import io.swagger.client.model.FilterIdNameArray;
import io.swagger.client.model.ListApplications;
import io.swagger.client.model.SortIdName;

/**
 * API tests for ApplicationsApi
 */
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Show details of an individual application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in listget test")
    public void getAccountApplicationTest() throws ApiException {

    	Integer accountId = 1315091;
        Integer applicationId = 1356077;
        ApplicationFull response = api.getAccountApplication(accountId, applicationId);
        
        assertNotNull(response);
        
        Integer id = response.getId();
        assertNotNull(id);
        String name = response.getName();
        assertNotNull(name);

    }
    
    /**
     * Get a list of applications you have defined
     *
     * Get a list of an account available applications
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGetAccountApplicationsTest() throws ApiException {

        Integer accountId = 1315091;
        List<String> filtersId = TestConfig.createDefaultFilter();

        List<String> filtersName = null;

        String sortId = "asc";
        String sortName = null;
        Integer limit = 4;
        Integer offset = 1;
        String fields = null;
        ListApplications response = api.listAccountApplications(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        assertNotNull(response);
        List<ApplicationFull> items = response.getItems();
        assertNotNull(items);
        
        FilterIdNameArray filters = response.getFilters();
        assertNotNull(filters);
        assertEquals(GREATER_THAN_FILTER, filters.getId());
        
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

        if (items.size() > 0) {
	        Integer firstItemId = items.get(0).getId();
	        ApplicationFull getApplicationResponse = api.getAccountApplication(accountId, firstItemId);
	        assertNotNull(getApplicationResponse.getId());
	        assertNotNull(getApplicationResponse.getName());
        }
    }
    
}
