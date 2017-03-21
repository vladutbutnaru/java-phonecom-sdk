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

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.AccountFull;
import io.swagger.client.model.ContactAccount;
import io.swagger.client.model.FilterIdArray;
import io.swagger.client.model.ListAccounts;
import io.swagger.client.model.SortId;

/**
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Retrieve details of an individual account
     *
     * This service shows the details of an individual account. See Accounts for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        
    	Integer accountId = 1315091;
    	
    	AccountFull response = api.getAccount(accountId);

    	assertNotNull(response);
    	
    	ContactAccount billingContact = response.getBillingContact();
    	assertNotNull(billingContact);
    	ContactAccount contact = response.getContact();
    	assertNotNull(contact);
    	Integer id = response.getId();
    	assertNotNull(id);
//    	AccountSummary masterAccount = response.getMasterAccount();
//    	assertNotNull(masterAccount);
    	String name = response.getName();
    	assertNotNull(name);
    	String password = response.getPassword();
    	assertNotNull(password);
    	String username = response.getUsername();
    	assertNotNull(username);
    	
    }
    
    /**
     * Get a list of accounts visible to the authenticated user or client
     *
     * This service lists the accounts accessible to the authenticated client. In most cases, there will only be one such account. See Accounts for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountsTest() throws ApiException {

        List<String> filtersId = new ArrayList<>();
        filtersId.add("lt:100000");
        String lastFilterId = "gt:1"; 
        filtersId.add(lastFilterId);
        
        String sortId = "asc";
        Integer limit = 4;
        Integer offset = 1;
        String fields = null;
        
        
         ListAccounts response = api.listAccounts(filtersId, sortId, limit, offset, fields);
         assertNotNull(response);
         List<AccountFull> items = response.getItems();
         assertNotNull(items);

         FilterIdArray filters = response.getFilters();
         assertNotNull(filters);
         assertEquals(lastFilterId, filters.getId());
         
         Integer limitActual = response.getLimit();
         assertNotNull(limitActual);
         assertEquals(limit, limitActual);
         
         Integer offsetActual = response.getOffset();
         assertNotNull(offsetActual);
         assertEquals(offset, offsetActual);
         
         SortId sort = response.getSort();
         assertNotNull(sort);
         assertEquals(sortId, sort.getId());
    }

	
    
}
