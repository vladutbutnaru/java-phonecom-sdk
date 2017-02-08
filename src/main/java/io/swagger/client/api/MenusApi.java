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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.CreateMenuParams;
import io.swagger.client.model.MenuFull;
import io.swagger.client.model.DeleteMenu;
import io.swagger.client.model.ListMenusFull;
import io.swagger.client.model.ReplaceMenuParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenusApi {
    private ApiClient apiClient;

    public MenusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MenusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountMenu */
    private com.squareup.okhttp.Call createAccountMenuCall(Integer accountId, CreateMenuParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountMenu(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/menus".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create an individual menu
     * This service creates an individual menu. See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param data Menu data (optional)
     * @return MenuFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MenuFull createAccountMenu(Integer accountId, CreateMenuParams data) throws ApiException {
        ApiResponse<MenuFull> resp = createAccountMenuWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Create an individual menu
     * This service creates an individual menu. See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param data Menu data (optional)
     * @return ApiResponse&lt;MenuFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MenuFull> createAccountMenuWithHttpInfo(Integer accountId, CreateMenuParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountMenuCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an individual menu (asynchronously)
     * This service creates an individual menu. See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param data Menu data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountMenuAsync(Integer accountId, CreateMenuParams data, final ApiCallback<MenuFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createAccountMenuCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAccountMenu */
    private com.squareup.okhttp.Call deleteAccountMenuCall(Integer accountId, Integer menuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccountMenu(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling deleteAccountMenu(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/menus/{menu_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "menu_id" + "\\}", apiClient.escapeString(menuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete an individual menu
     * This service shows the details of an individual menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @return DeleteMenu
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteMenu deleteAccountMenu(Integer accountId, Integer menuId) throws ApiException {
        ApiResponse<DeleteMenu> resp = deleteAccountMenuWithHttpInfo(accountId, menuId);
        return resp.getData();
    }

    /**
     * Delete an individual menu
     * This service shows the details of an individual menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @return ApiResponse&lt;DeleteMenu&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteMenu> deleteAccountMenuWithHttpInfo(Integer accountId, Integer menuId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountMenuCall(accountId, menuId, null, null);
        Type localVarReturnType = new TypeToken<DeleteMenu>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an individual menu (asynchronously)
     * This service shows the details of an individual menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountMenuAsync(Integer accountId, Integer menuId, final ApiCallback<DeleteMenu> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteAccountMenuCall(accountId, menuId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteMenu>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountMenu */
    private com.squareup.okhttp.Call getAccountMenuCall(Integer accountId, Integer menuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountMenu(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling getAccountMenu(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/menus/{menu_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "menu_id" + "\\}", apiClient.escapeString(menuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Show details of an individual menu
     * This service shows the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @return MenuFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MenuFull getAccountMenu(Integer accountId, Integer menuId) throws ApiException {
        ApiResponse<MenuFull> resp = getAccountMenuWithHttpInfo(accountId, menuId);
        return resp.getData();
    }

    /**
     * Show details of an individual menu
     * This service shows the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @return ApiResponse&lt;MenuFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MenuFull> getAccountMenuWithHttpInfo(Integer accountId, Integer menuId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountMenuCall(accountId, menuId, null, null);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual menu (asynchronously)
     * This service shows the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountMenuAsync(Integer accountId, Integer menuId, final ApiCallback<MenuFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountMenuCall(accountId, menuId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountMenus */
    private com.squareup.okhttp.Call listAccountMenusCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountMenus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/menus".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[name]", filtersName));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[name]", sortName));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get a list of menus for an account
     * See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListMenusFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListMenusFull listAccountMenus(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListMenusFull> resp = listAccountMenusWithHttpInfo(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of menus for an account
     * See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListMenusFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListMenusFull> listAccountMenusWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountMenusCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListMenusFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of menus for an account (asynchronously)
     * See Account Menus for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountMenusAsync(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListMenusFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAccountMenusCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListMenusFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountMenu */
    private com.squareup.okhttp.Call replaceAccountMenuCall(Integer accountId, Integer menuId, ReplaceMenuParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountMenu(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling replaceAccountMenu(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/menus/{menu_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "menu_id" + "\\}", apiClient.escapeString(menuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Replace an individual menu
     * This service replaces the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @param data Menu data (optional)
     * @return MenuFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MenuFull replaceAccountMenu(Integer accountId, Integer menuId, ReplaceMenuParams data) throws ApiException {
        ApiResponse<MenuFull> resp = replaceAccountMenuWithHttpInfo(accountId, menuId, data);
        return resp.getData();
    }

    /**
     * Replace an individual menu
     * This service replaces the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @param data Menu data (optional)
     * @return ApiResponse&lt;MenuFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MenuFull> replaceAccountMenuWithHttpInfo(Integer accountId, Integer menuId, ReplaceMenuParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountMenuCall(accountId, menuId, data, null, null);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace an individual menu (asynchronously)
     * This service replaces the details of an individual Menu.
     * @param accountId Account ID (required)
     * @param menuId Menu ID (required)
     * @param data Menu data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountMenuAsync(Integer accountId, Integer menuId, ReplaceMenuParams data, final ApiCallback<MenuFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = replaceAccountMenuCall(accountId, menuId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MenuFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
