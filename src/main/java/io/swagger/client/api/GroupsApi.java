/*
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


import io.swagger.client.model.CreateGroupParams;
import io.swagger.client.model.DeleteGroup;
import io.swagger.client.model.GroupFull;
import io.swagger.client.model.ListGroups;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountExtensionContactGroup */
    private com.squareup.okhttp.Call createAccountExtensionContactGroupCall(Integer accountId, Integer extensionId, CreateGroupParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contact-groups".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()));

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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAccountExtensionContactGroupValidateBeforeCall(Integer accountId, Integer extensionId, CreateGroupParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling createAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createAccountExtensionContactGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountExtensionContactGroupCall(accountId, extensionId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Group name (required)
     * @return GroupFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupFull createAccountExtensionContactGroup(Integer accountId, Integer extensionId, CreateGroupParams data) throws ApiException {
        ApiResponse<GroupFull> resp = createAccountExtensionContactGroupWithHttpInfo(accountId, extensionId, data);
        return resp.getData();
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Group name (required)
     * @return ApiResponse&lt;GroupFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupFull> createAccountExtensionContactGroupWithHttpInfo(Integer accountId, Integer extensionId, CreateGroupParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, data, null, null);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Group name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountExtensionContactGroupAsync(Integer accountId, Integer extensionId, CreateGroupParams data, final ApiCallback<GroupFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAccountExtensionContactGroup */
    private com.squareup.okhttp.Call deleteAccountExtensionContactGroupCall(Integer accountId, Integer extensionId, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()))
        .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccountExtensionContactGroupValidateBeforeCall(Integer accountId, Integer extensionId, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling deleteAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling deleteAccountExtensionContactGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteAccountExtensionContactGroupCall(accountId, extensionId, groupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an addressbook group
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @return DeleteGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteGroup deleteAccountExtensionContactGroup(Integer accountId, Integer extensionId, Integer groupId) throws ApiException {
        ApiResponse<DeleteGroup> resp = deleteAccountExtensionContactGroupWithHttpInfo(accountId, extensionId, groupId);
        return resp.getData();
    }

    /**
     * Delete an addressbook group
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @return ApiResponse&lt;DeleteGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteGroup> deleteAccountExtensionContactGroupWithHttpInfo(Integer accountId, Integer extensionId, Integer groupId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, null, null);
        Type localVarReturnType = new TypeToken<DeleteGroup>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an addressbook group (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountExtensionContactGroupAsync(Integer accountId, Integer extensionId, Integer groupId, final ApiCallback<DeleteGroup> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteGroup>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountExtensionContactGroup */
    private com.squareup.okhttp.Call getAccountExtensionContactGroupCall(Integer accountId, Integer extensionId, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()))
        .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountExtensionContactGroupValidateBeforeCall(Integer accountId, Integer extensionId, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling getAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getAccountExtensionContactGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountExtensionContactGroupCall(accountId, extensionId, groupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @return GroupFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupFull getAccountExtensionContactGroup(Integer accountId, Integer extensionId, Integer groupId) throws ApiException {
        ApiResponse<GroupFull> resp = getAccountExtensionContactGroupWithHttpInfo(accountId, extensionId, groupId);
        return resp.getData();
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @return ApiResponse&lt;GroupFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupFull> getAccountExtensionContactGroupWithHttpInfo(Integer accountId, Integer extensionId, Integer groupId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, null, null);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountExtensionContactGroupAsync(Integer accountId, Integer extensionId, Integer groupId, final ApiCallback<GroupFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountExtensionContactGroups */
    private com.squareup.okhttp.Call listAccountExtensionContactGroupsCall(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contact-groups".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()));

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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAccountExtensionContactGroupsValidateBeforeCall(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountExtensionContactGroups(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling listAccountExtensionContactGroups(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountExtensionContactGroupsCall(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show a list of contact groups belonging to an extension
     * See Account Contact Groups for details on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListGroups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListGroups listAccountExtensionContactGroups(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListGroups> resp = listAccountExtensionContactGroupsWithHttpInfo(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Show a list of contact groups belonging to an extension
     * See Account Contact Groups for details on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListGroups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListGroups> listAccountExtensionContactGroupsWithHttpInfo(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountExtensionContactGroupsValidateBeforeCall(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListGroups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show a list of contact groups belonging to an extension (asynchronously)
     * See Account Contact Groups for details on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
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
    public com.squareup.okhttp.Call listAccountExtensionContactGroupsAsync(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListGroups> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountExtensionContactGroupsValidateBeforeCall(accountId, extensionId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListGroups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountExtensionContactGroup */
    private com.squareup.okhttp.Call replaceAccountExtensionContactGroupCall(Integer accountId, Integer extensionId, Integer groupId, CreateGroupParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()))
        .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceAccountExtensionContactGroupValidateBeforeCall(Integer accountId, Integer extensionId, Integer groupId, CreateGroupParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling replaceAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling replaceAccountExtensionContactGroup(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling replaceAccountExtensionContactGroup(Async)");
        }
        
        
        com.squareup.okhttp.Call call = replaceAccountExtensionContactGroupCall(accountId, extensionId, groupId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @param data Group name (required)
     * @return GroupFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupFull replaceAccountExtensionContactGroup(Integer accountId, Integer extensionId, Integer groupId, CreateGroupParams data) throws ApiException {
        ApiResponse<GroupFull> resp = replaceAccountExtensionContactGroupWithHttpInfo(accountId, extensionId, groupId, data);
        return resp.getData();
    }

    /**
     * 
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @param data Group name (required)
     * @return ApiResponse&lt;GroupFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupFull> replaceAccountExtensionContactGroupWithHttpInfo(Integer accountId, Integer extensionId, Integer groupId, CreateGroupParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, data, null, null);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * See Account Contact Groups for more info on the properties.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param groupId Group ID (required)
     * @param data Group name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountExtensionContactGroupAsync(Integer accountId, Integer extensionId, Integer groupId, CreateGroupParams data, final ApiCallback<GroupFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountExtensionContactGroupValidateBeforeCall(accountId, extensionId, groupId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
