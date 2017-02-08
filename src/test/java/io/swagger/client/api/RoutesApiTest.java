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

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateRouteParams;
import io.swagger.client.model.ListRoutesFull;

/**
 * API tests for RoutesApi
 */
public class RoutesApiTest {

	private final RoutesApi api = new RoutesApi();

	@Before
	public void initTest() {
		TestConfig.setAuthorization();
	}

	/**
	 * Add a new address book contact for an extension
	 *
	 * For more on the input fields, see Intro to Routes.
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void createRouteTest() throws ApiException {
		Integer accountId = null;
		CreateRouteParams data = null;
		// RouteFull response = api.createRoute(accountId, data);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void deleteAccountRouteTest() throws ApiException {
		Integer accountId = null;
		Integer routeId = null;
		// DeleteRoute response = api.deleteAccountRoute(accountId, routeId);

		// TODO: test validations
	}

	/**
	 * Show details of an individual route
	 *
	 * This service shows the details of an individual route.
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getAccountRouteTest() throws ApiException {
		Integer accountId = null;
		Integer routeId = null;
		// RouteFull response = api.getAccountRoute(accountId, routeId);

		// TODO: test validations
	}

	/**
	 * Get a list of routes for an account
	 *
	 * See Intro to Routes for more info on the properties.
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void listAccountRoutesTest() throws ApiException {
		Integer accountId = 1315091;
		List<String> filtersId = null;
		List<String> filtersName = null;
		String sortId = null;
		String sortName = null;
		Integer limit = null;
		Integer offset = null;
		String fields = null;
		ListRoutesFull response = api.listAccountRoutes(accountId, filtersId, filtersName, sortId, sortName, limit,
				offset, fields);
		assertNotNull(response.getFilters());
		assertNotNull(response.getItems());
		assertNotNull(response.getLimit());
		assertNotNull(response.getOffset());
		assertNotNull(response.getSort());
		assertNotNull(response.getTotal());
		// TODO: test validations
	}

	/**
	 * 
	 *
	 * For more on the input fields, see Intro to Routes.
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void replaceAccountRouteTest() throws ApiException {
		Integer accountId = null;
		Integer routeId = null;
		CreateRouteParams data = null;
		// RouteFull response = api.replaceAccountRoute(accountId, routeId,
		// data);

		// TODO: test validations
	}

}
