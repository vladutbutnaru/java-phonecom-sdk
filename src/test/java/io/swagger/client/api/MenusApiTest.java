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
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateMenuParams;
import io.swagger.client.model.DeleteMenu;
import io.swagger.client.model.ListMenus;
import io.swagger.client.model.MenuFull;
import io.swagger.client.model.ReplaceMenuParams;

/**
 * API tests for MenusApi
 */
public class MenusApiTest {

    private final MenusApi api = new MenusApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    @Test
    public void createGetReplaceDeleteMenu() throws ApiException {
        Integer accountId = 1315091;
        CreateMenuParams data = new CreateMenuParams();
        data.setAllowExtensionDial(true);
        data.setName("nccswfhjfetk");
        data.setKeypressWaitTime(3);
//        data.setMainMessage("testMess");
//        data.setInvalidKeypressMessage("testMess");
//        data.setTimeoutHandler("testASD");
        
         MenuFull response = api.createAccountMenu(accountId, data);
         assertNotNull(response.getId());
         assertNotNull(response.getAllowExtensionDial());
//         assertNotNull(response.getGreeting());
//         assertNotNull(response.getKeypressError());
         assertNotNull(response.getKeypressWaitTime());
         assertNotNull(response.getName());
         Integer menuID = response.getId();
         
         ReplaceMenuParams dataReplace = new ReplaceMenuParams();
         dataReplace.setName("nccswfeeeebk");
         dataReplace.setKeypressWaitTime(5);
        
         MenuFull responseReplace = api.replaceAccountMenu(accountId, menuID, dataReplace);
         assertEquals(false, responseReplace.getAllowExtensionDial());
         
         DeleteMenu responseDelete = api.deleteAccountMenu(accountId, menuID);
         assertTrue(responseDelete.getSuccess());
    }
    /**
     * Create an individual menu
     *
     * This service creates an individual menu. See Account Menus for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void createAccountMenuTest() throws ApiException {

        Integer accountId = 1315091;
        CreateMenuParams data = new CreateMenuParams();
        data.setAllowExtensionDial(true);
        data.setName("Test Menu");
        data.setKeypressWaitTime(2);
        data.setMainMessage("testMess");
        data.setInvalidKeypressMessage("testMess");
        data.setTimeoutHandler("testASD");
        
         MenuFull response = api.createAccountMenu(accountId, data);
         assertNotNull(response.getId());
    
       
    }
    
    /**
     * Delete an individual menu
     *
     * This service shows the details of an individual menu.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void deleteAccountMenuTest() throws ApiException {
        Integer accountId = null;
        Integer menuId = null;
        DeleteMenu response = api.deleteAccountMenu(accountId, menuId);
        assertNotNull(response);
    }
    
    /**
     * Show details of an individual menu
     *
     * This service shows the details of an individual Menu.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void getAccountMenuTest() throws ApiException {
        Integer accountId = 1315091;
        Integer menuId = 87926;
        MenuFull response = api.getAccountMenu(accountId, menuId);
        assertNotNull(response.getAllowExtensionDial());
        assertNotNull(response.getId());
        assertNotNull(response.getKeypressWaitTime());
        assertNotNull(response.getName());
        assertNotNull(response.getOptions());
    }
    
    /**
     * Get a list of menus for an account
     *
     * See Account Menus for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGetAccountMenusTest() throws ApiException {

        Integer accountId = 1315091;
        List<String> filtersId = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListMenus response = api.listAccountMenus(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        assertNotNull(response.getFilters());
        List<MenuFull> items = response.getItems();
		assertNotNull(items);
        assertNotNull(response.getLimit());
        assertNotNull(response.getOffset());
        assertNotNull(response.getSort());
        assertNotNull(response.getTotal());
        
        if (items.size() > 0) {
	        Integer firstItemId = items.get(0).getId();
	        MenuFull getMenuResponse = api.getAccountMenu(accountId, firstItemId);
	        assertNotNull(getMenuResponse.getId());
	//        assertNotNull(getMenuResponse.getKeypressError());
	        assertNotNull(getMenuResponse.getAllowExtensionDial());
	//        assertNotNull(getMenuResponse.getGreeting());
	        assertNotNull(getMenuResponse.getKeypressWaitTime());
	        assertNotNull(getMenuResponse.getName());
	        assertNotNull(getMenuResponse.getOptions());
	//        assertNotNull(getMenuResponse.getTimeoutHandler());
        }
    }
    
    /**
     * Replace an individual menu
     *
     * This service replaces the details of an individual Menu.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void replaceAccountMenuTest() throws ApiException {
        Integer accountId = null;
        Integer menuId = null;
        ReplaceMenuParams data = null;
        MenuFull response = api.replaceAccountMenu(accountId, menuId, data);
        assertNotNull(response);
    }
    
}
