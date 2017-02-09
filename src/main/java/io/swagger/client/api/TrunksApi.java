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


import io.swagger.client.model.CreateTrunkParams;
import io.swagger.client.model.DeleteTrunk;
import io.swagger.client.model.ListTrunksFull;
import io.swagger.client.model.TrunkFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrunksApi {
    private ApiClient apiClient;

    public TrunksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrunksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountTrunk */
    private com.squareup.okhttp.Call createAccountTrunkCall(Integer accountId, CreateTrunkParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/trunks".replaceAll("\\{format\\}","json")
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAccountTrunkValidateBeforeCall(Integer accountId, CreateTrunkParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountTrunk(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createAccountTrunk(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountTrunkCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a trunk record with SIP information
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param data Trunk data (required)
     * @return TrunkFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrunkFull createAccountTrunk(Integer accountId, CreateTrunkParams data) throws ApiException {
        ApiResponse<TrunkFull> resp = createAccountTrunkWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Add a trunk record with SIP information
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param data Trunk data (required)
     * @return ApiResponse&lt;TrunkFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrunkFull> createAccountTrunkWithHttpInfo(Integer accountId, CreateTrunkParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountTrunkValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a trunk record with SIP information (asynchronously)
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param data Trunk data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountTrunkAsync(Integer accountId, CreateTrunkParams data, final ApiCallback<TrunkFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountTrunkValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAccountTrunk */
    private com.squareup.okhttp.Call deleteAccountTrunkCall(Integer accountId, Integer trunkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/trunks/{trunk_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "trunk_id" + "\\}", apiClient.escapeString(trunkId.toString()));

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
    private com.squareup.okhttp.Call deleteAccountTrunkValidateBeforeCall(Integer accountId, Integer trunkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccountTrunk(Async)");
        }
        
        // verify the required parameter 'trunkId' is set
        if (trunkId == null) {
            throw new ApiException("Missing the required parameter 'trunkId' when calling deleteAccountTrunk(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteAccountTrunkCall(accountId, trunkId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a trunk from account
     * This service deletes a trunk from the account. For more on the properties of trunks, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @return DeleteTrunk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteTrunk deleteAccountTrunk(Integer accountId, Integer trunkId) throws ApiException {
        ApiResponse<DeleteTrunk> resp = deleteAccountTrunkWithHttpInfo(accountId, trunkId);
        return resp.getData();
    }

    /**
     * Delete a trunk from account
     * This service deletes a trunk from the account. For more on the properties of trunks, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @return ApiResponse&lt;DeleteTrunk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteTrunk> deleteAccountTrunkWithHttpInfo(Integer accountId, Integer trunkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountTrunkValidateBeforeCall(accountId, trunkId, null, null);
        Type localVarReturnType = new TypeToken<DeleteTrunk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a trunk from account (asynchronously)
     * This service deletes a trunk from the account. For more on the properties of trunks, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountTrunkAsync(Integer accountId, Integer trunkId, final ApiCallback<DeleteTrunk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccountTrunkValidateBeforeCall(accountId, trunkId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteTrunk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountTrunk */
    private com.squareup.okhttp.Call getAccountTrunkCall(Integer accountId, Integer trunkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/trunks/{trunk_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "trunk_id" + "\\}", apiClient.escapeString(trunkId.toString()));

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
    private com.squareup.okhttp.Call getAccountTrunkValidateBeforeCall(Integer accountId, Integer trunkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountTrunk(Async)");
        }
        
        // verify the required parameter 'trunkId' is set
        if (trunkId == null) {
            throw new ApiException("Missing the required parameter 'trunkId' when calling getAccountTrunk(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountTrunkCall(accountId, trunkId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual trunk
     * This service shows the details of an individual Trunk.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @return TrunkFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrunkFull getAccountTrunk(Integer accountId, Integer trunkId) throws ApiException {
        ApiResponse<TrunkFull> resp = getAccountTrunkWithHttpInfo(accountId, trunkId);
        return resp.getData();
    }

    /**
     * Show details of an individual trunk
     * This service shows the details of an individual Trunk.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @return ApiResponse&lt;TrunkFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrunkFull> getAccountTrunkWithHttpInfo(Integer accountId, Integer trunkId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountTrunkValidateBeforeCall(accountId, trunkId, null, null);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual trunk (asynchronously)
     * This service shows the details of an individual Trunk.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountTrunkAsync(Integer accountId, Integer trunkId, final ApiCallback<TrunkFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountTrunkValidateBeforeCall(accountId, trunkId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountTrunks */
    private com.squareup.okhttp.Call listAccountTrunksCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/trunks".replaceAll("\\{format\\}","json")
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAccountTrunksValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountTrunks(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountTrunksCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of trunks for an account
     * See Account Trunks for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListTrunksFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListTrunksFull listAccountTrunks(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListTrunksFull> resp = listAccountTrunksWithHttpInfo(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of trunks for an account
     * See Account Trunks for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListTrunksFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListTrunksFull> listAccountTrunksWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountTrunksValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListTrunksFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of trunks for an account (asynchronously)
     * See Account Trunks for more info on the properties.
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
    public com.squareup.okhttp.Call listAccountTrunksAsync(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListTrunksFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountTrunksValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListTrunksFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountTrunk */
    private com.squareup.okhttp.Call replaceAccountTrunkCall(Integer accountId, Integer trunkId, CreateTrunkParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/trunks/{trunk_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "trunk_id" + "\\}", apiClient.escapeString(trunkId.toString()));

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
    private com.squareup.okhttp.Call replaceAccountTrunkValidateBeforeCall(Integer accountId, Integer trunkId, CreateTrunkParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountTrunk(Async)");
        }
        
        // verify the required parameter 'trunkId' is set
        if (trunkId == null) {
            throw new ApiException("Missing the required parameter 'trunkId' when calling replaceAccountTrunk(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling replaceAccountTrunk(Async)");
        }
        
        
        com.squareup.okhttp.Call call = replaceAccountTrunkCall(accountId, trunkId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Replace parameters in a trunk
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @param data Trunk data (required)
     * @return TrunkFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrunkFull replaceAccountTrunk(Integer accountId, Integer trunkId, CreateTrunkParams data) throws ApiException {
        ApiResponse<TrunkFull> resp = replaceAccountTrunkWithHttpInfo(accountId, trunkId, data);
        return resp.getData();
    }

    /**
     * Replace parameters in a trunk
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @param data Trunk data (required)
     * @return ApiResponse&lt;TrunkFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrunkFull> replaceAccountTrunkWithHttpInfo(Integer accountId, Integer trunkId, CreateTrunkParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountTrunkValidateBeforeCall(accountId, trunkId, data, null, null);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace parameters in a trunk (asynchronously)
     * For more on the input fields, see Account Trunks.
     * @param accountId Account ID (required)
     * @param trunkId Trunk ID (required)
     * @param data Trunk data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountTrunkAsync(Integer accountId, Integer trunkId, CreateTrunkParams data, final ApiCallback<TrunkFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountTrunkValidateBeforeCall(accountId, trunkId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrunkFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
