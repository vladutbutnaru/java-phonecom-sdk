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
import io.swagger.client.model.CreatePhoneNumberParams;
import io.swagger.client.model.FilterIdNamePhoneNumberArray;
import io.swagger.client.model.ListPhoneNumbersFull;
import io.swagger.client.model.PhoneNumberFull;
import io.swagger.client.model.PhoneNumbersFull;
import io.swagger.client.model.ReplacePhoneNumberParams;
import io.swagger.client.model.SortIdNamePhoneNumber;

/**
 * API tests for PhonenumbersApi
 */
public class PhonenumbersApiTest {

    private final PhonenumbersApi api = new PhonenumbersApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    @Test
    public void createGetReplacePhoneNumber() throws ApiException {

    	// Create
    	Integer accountId = 1315091;
        CreatePhoneNumberParams data = new CreatePhoneNumberParams();
		Boolean blockAnonymous = true;
		data.setBlockAnonymous(blockAnonymous);
		Boolean blockIncoming = true;
		data.setBlockIncoming(blockIncoming);
		String callerIdName = "Caller Id Name";
		data.setCallerIdName(callerIdName);
		String callerIdType = "Caller Id Type";
		data.setCallerIdType(callerIdType);
		String callNotificationsSms = "Call Notifications Sms";
		data.setCallNotificationsSms(callNotificationsSms);
		String name = "Geordi";
		data.setName(name);
		String smsForwardingType = "Sms Forwarding Type";
		data.setSmsForwardingType(smsForwardingType);
		

		// TODO: [API Error] Create: Unprocessable entity

		PhoneNumberFull responseCreate = api.createAccountPhoneNumber(accountId, data);
        assertNotNull(responseCreate);
        assertEquals(blockAnonymous, responseCreate.getBlockAnonymous());
        assertEquals(blockIncoming, responseCreate.getBlockIncoming());
        assertEquals(callerIdName, responseCreate.getCallerId().getName());
        assertEquals(callerIdType, responseCreate.getCallerId().getType());
        assertEquals(callNotificationsSms, responseCreate.getCallNotifications().getSms());
        assertEquals(name, responseCreate.getName());
        assertEquals(smsForwardingType, responseCreate.getSmsForwarding().getType());
        

        // Get After Create
        PhoneNumberFull responseGetAfterCreate = api.getAccountPhoneNumber(accountId, responseCreate.getId());
        assertNotNull(responseGetAfterCreate);
        assertEquals(blockAnonymous, responseCreate.getBlockAnonymous());
        assertEquals(blockIncoming, responseCreate.getBlockIncoming());
        assertEquals(callerIdName, responseCreate.getCallerId().getName());
        assertEquals(callerIdType, responseCreate.getCallerId().getType());
        assertEquals(callNotificationsSms, responseCreate.getCallNotifications().getSms());
        assertEquals(name, responseCreate.getName());
        assertEquals(smsForwardingType, responseCreate.getSmsForwarding().getType());

        // Replace
        ReplacePhoneNumberParams data2 = new ReplacePhoneNumberParams();
        Boolean blockAnonymous2 = true;
		data2.setBlockAnonymous(blockAnonymous2);
		Boolean blockIncoming2 = true;
		data2.setBlockIncoming(blockIncoming2);
		String callerIdName2 = "Caller Id Name";
		data2.setCallerIdName(callerIdName2);
		String callerIdType2 = "Caller Id Type";
		data2.setCallerIdType(callerIdType2);
		String callNotificationsSms2 = "Call Notifications Sms";
		data2.setCallNotificationsSms(callNotificationsSms2);
		String name2 = "Geordi";
		data2.setName(name2);
		String smsForwardingType2 = "Sms Forwarding Type";
		data2.setSmsForwardingType(smsForwardingType2);
        PhoneNumberFull responseReplace = api.replaceAccountPhoneNumber(accountId, responseCreate.getId(), data2);
        assertNotNull(responseReplace);

        // Get After Replace
        PhoneNumberFull responseGetAfterReplace = api.getAccountPhoneNumber(accountId, responseCreate.getId());
        assertNotNull(responseGetAfterReplace);
        assertEquals(blockAnonymous2, responseCreate.getBlockAnonymous());
        assertEquals(blockIncoming2, responseCreate.getBlockIncoming());
        assertEquals(callerIdName2, responseCreate.getCallerId().getName());
        assertEquals(callerIdType2, responseCreate.getCallerId().getType());
        assertEquals(callNotificationsSms2, responseCreate.getCallNotifications().getSms());
        assertEquals(name2, responseCreate.getName());
        assertEquals(smsForwardingType2, responseCreate.getSmsForwarding().getType());
    }
    
    /**
     * Add a phone number to an account
     *
     * See Intro to Account Phone Numbers for more info on the properties to use.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void createAccountPhoneNumberTest() throws ApiException {

        Integer accountId = null;
        CreatePhoneNumberParams data = null;
        PhoneNumberFull response = api.createAccountPhoneNumber(accountId, data);

        assertNotNull(response);
    }
    
    /**
     * Show details of an individual phone number
     *
     * See Intro to Account Phone Numbers for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountPhoneNumberTest() throws ApiException {
        Integer accountId = 1315091;
        Integer numberId = 2116986;
        PhoneNumberFull response = api.getAccountPhoneNumber(accountId, numberId);
        
        assertNotNull(response);
        
        Boolean blockAnonymous = response.getBlockAnonymous();
        assertNotNull(blockAnonymous);
        Boolean blockIncoming = response.getBlockIncoming();
        assertNotNull(blockIncoming);
//        CallerIdPhoneNumber callerId = response.getCallerId();
//        assertNotNull(callerId);
//        CallNotifications callNotifications = response.getCallNotifications();
//        assertNotNull(callNotifications);
        Integer id = response.getId();
        assertNotNull(id);
        String name = response.getName();
        assertNotNull(name);
        String phoneNumber = response.getPhoneNumber();
        assertNotNull(phoneNumber);
//        RouteSummary route = response.getRoute();
//        assertNotNull(route);
//        SmsForwarding smsForwarding = response.getSmsForwarding();
//        assertNotNull(smsForwarding);

    }
    
    /**
     * Get a list of phone numbers registered to an account
     *
     * See Intro to Account Phone Numbers for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountPhoneNumbersTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = TestConfig.createDefaultFilter();
        List<String> filtersName = TestConfig.createDefaultFilter();

        // TODO API response: filter.phone_number "Unsupported filter type"
        List<String> filtersPhoneNumber = null;

        String sortId = "asc";
        String sortName = "asc";

        // TODO API response: sort.phone_number "Invalid"
        String sortPhoneNumber = null;
        Integer limit = 4;
        Integer offset = 1;
        String fields = null;
        ListPhoneNumbersFull response = api.listAccountPhoneNumbers(accountId, filtersId, filtersName, filtersPhoneNumber, sortId, sortName, sortPhoneNumber, limit, offset, fields);

        assertNotNull(response);
        PhoneNumbersFull items = response.getItems();
        assertNotNull(items);
        
        FilterIdNamePhoneNumberArray filters = response.getFilters();
        assertNotNull(filters);
        assertEquals(GREATER_THAN_FILTER, filters.getId());

        assertEquals(GREATER_THAN_FILTER, filters.getName());
        
//        assertEquals(lastFilterPhoneNumber, filters.getPhoneNumber());
        
        Integer limitActual = response.getLimit();
        assertNotNull(limitActual);
        assertEquals(limit, limitActual);
        
        Integer offsetActual = response.getOffset();
        assertNotNull(offsetActual);
        assertEquals(offset, offsetActual);
        
        SortIdNamePhoneNumber sort = response.getSort();
        assertNotNull(sort);
        assertEquals(sortId, sort.getId());
        
        assertEquals(sortName, sort.getName());
        
//        assertEquals(sortPhoneNumber, sort.getPhoneNumber());
    }
    
    /**
     * Update the settings for an existing phone number on your account
     *
     * See Intro to Account Phone Numbers for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Tested in previous test")
    public void replaceAccountPhoneNumberTest() throws ApiException {
        Integer accountId = null;
        Integer numberId = null;
        ReplacePhoneNumberParams data = null;
        PhoneNumberFull response = api.replaceAccountPhoneNumber(accountId, numberId, data);

        assertNotNull(response);
    }
    
}
