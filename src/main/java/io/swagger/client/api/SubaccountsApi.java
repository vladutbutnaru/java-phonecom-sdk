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


import io.swagger.client.model.AccountFull;
import io.swagger.client.model.CreateSubaccountParams;
import io.swagger.client.model.ListAccounts;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubaccountsApi {
    private ApiClient apiClient;

    public SubaccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubaccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountSubaccount */
    private com.squareup.okhttp.Call createAccountSubaccountCall(Integer accountId, CreateSubaccountParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/subaccounts".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call createAccountSubaccountValidateBeforeCall(Integer accountId, CreateSubaccountParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountSubaccount(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createAccountSubaccount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountSubaccountCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a subaccount for the authenticated user or client
     * This service shows the details of an individual Subaccount.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @return AccountFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountFull createAccountSubaccount(Integer accountId, CreateSubaccountParams data) throws ApiException {
        ApiResponse<AccountFull> resp = createAccountSubaccountWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Add a subaccount for the authenticated user or client
     * This service shows the details of an individual Subaccount.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @return ApiResponse&lt;AccountFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountFull> createAccountSubaccountWithHttpInfo(Integer accountId, CreateSubaccountParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountSubaccountValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<AccountFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a subaccount for the authenticated user or client (asynchronously)
     * This service shows the details of an individual Subaccount.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountSubaccountAsync(Integer accountId, CreateSubaccountParams data, final ApiCallback<AccountFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountSubaccountValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountSubaccounts */
    private com.squareup.okhttp.Call listAccountSubaccountsCall(Integer accountId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/subaccounts".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
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
    private com.squareup.okhttp.Call listAccountSubaccountsValidateBeforeCall(Integer accountId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountSubaccounts(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountSubaccountsCall(accountId, filtersId, sortId, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of subaccounts for the authenticated user or client
     * This service lists the Subaccount of the authenticated client. In most cases, there will not be any.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListAccounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListAccounts listAccountSubaccounts(Integer accountId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListAccounts> resp = listAccountSubaccountsWithHttpInfo(accountId, filtersId, sortId, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of subaccounts for the authenticated user or client
     * This service lists the Subaccount of the authenticated client. In most cases, there will not be any.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListAccounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListAccounts> listAccountSubaccountsWithHttpInfo(Integer accountId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountSubaccountsValidateBeforeCall(accountId, filtersId, sortId, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListAccounts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of subaccounts for the authenticated user or client (asynchronously)
     * This service lists the Subaccount of the authenticated client. In most cases, there will not be any.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountSubaccountsAsync(Integer accountId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields, final ApiCallback<ListAccounts> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountSubaccountsValidateBeforeCall(accountId, filtersId, sortId, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListAccounts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
