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


import io.swagger.client.model.CreateExtensionParams;
import io.swagger.client.model.ExtensionFull;
import io.swagger.client.model.ListExtensions;
import io.swagger.client.model.ReplaceExtensionParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtensionsApi {
    private ApiClient apiClient;

    public ExtensionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExtensionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountExtension */
    private com.squareup.okhttp.Call createAccountExtensionCall(Integer accountId, CreateExtensionParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call createAccountExtensionValidateBeforeCall(Integer accountId, CreateExtensionParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountExtension(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountExtensionCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an individual extension
     * This service shows how to create a virtual extension.
     * @param accountId Account ID (required)
     * @param data Account Extensions Data (optional)
     * @return ExtensionFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtensionFull createAccountExtension(Integer accountId, CreateExtensionParams data) throws ApiException {
        ApiResponse<ExtensionFull> resp = createAccountExtensionWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Create an individual extension
     * This service shows how to create a virtual extension.
     * @param accountId Account ID (required)
     * @param data Account Extensions Data (optional)
     * @return ApiResponse&lt;ExtensionFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExtensionFull> createAccountExtensionWithHttpInfo(Integer accountId, CreateExtensionParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountExtensionValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an individual extension (asynchronously)
     * This service shows how to create a virtual extension.
     * @param accountId Account ID (required)
     * @param data Account Extensions Data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountExtensionAsync(Integer accountId, CreateExtensionParams data, final ApiCallback<ExtensionFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountExtensionValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountExtension */
    private com.squareup.okhttp.Call getAccountExtensionCall(Integer accountId, Integer extensionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountExtensionValidateBeforeCall(Integer accountId, Integer extensionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountExtension(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling getAccountExtension(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountExtensionCall(accountId, extensionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual extension
     * This service shows the details of an individual Extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @return ExtensionFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtensionFull getAccountExtension(Integer accountId, Integer extensionId) throws ApiException {
        ApiResponse<ExtensionFull> resp = getAccountExtensionWithHttpInfo(accountId, extensionId);
        return resp.getData();
    }

    /**
     * Show details of an individual extension
     * This service shows the details of an individual Extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @return ApiResponse&lt;ExtensionFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExtensionFull> getAccountExtensionWithHttpInfo(Integer accountId, Integer extensionId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountExtensionValidateBeforeCall(accountId, extensionId, null, null);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual extension (asynchronously)
     * This service shows the details of an individual Extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountExtensionAsync(Integer accountId, Integer extensionId, final ApiCallback<ExtensionFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountExtensionValidateBeforeCall(accountId, extensionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountExtensions */
    private com.squareup.okhttp.Call listAccountExtensionsCall(Integer accountId, List<String> filtersId, List<String> filtersExtension, List<String> filtersName, String sortId, String sortExtension, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersExtension != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[extension]", filtersExtension));
        if (filtersName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[name]", filtersName));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortExtension != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[extension]", sortExtension));
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
    private com.squareup.okhttp.Call listAccountExtensionsValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersExtension, List<String> filtersName, String sortId, String sortExtension, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountExtensions(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountExtensionsCall(accountId, filtersId, filtersExtension, filtersName, sortId, sortExtension, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of extensions visible to the authenticated user or client
     * This service lists the visible extensions on a given account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersExtension Extension filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortExtension Extension sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListExtensions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListExtensions listAccountExtensions(Integer accountId, List<String> filtersId, List<String> filtersExtension, List<String> filtersName, String sortId, String sortExtension, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListExtensions> resp = listAccountExtensionsWithHttpInfo(accountId, filtersId, filtersExtension, filtersName, sortId, sortExtension, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of extensions visible to the authenticated user or client
     * This service lists the visible extensions on a given account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersExtension Extension filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortExtension Extension sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListExtensions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListExtensions> listAccountExtensionsWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersExtension, List<String> filtersName, String sortId, String sortExtension, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountExtensionsValidateBeforeCall(accountId, filtersId, filtersExtension, filtersName, sortId, sortExtension, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListExtensions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of extensions visible to the authenticated user or client (asynchronously)
     * This service lists the visible extensions on a given account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersExtension Extension filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortExtension Extension sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountExtensionsAsync(Integer accountId, List<String> filtersId, List<String> filtersExtension, List<String> filtersName, String sortId, String sortExtension, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListExtensions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountExtensionsValidateBeforeCall(accountId, filtersId, filtersExtension, filtersName, sortId, sortExtension, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListExtensions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountExtension */
    private com.squareup.okhttp.Call replaceAccountExtensionCall(Integer accountId, Integer extensionId, ReplaceExtensionParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceAccountExtensionValidateBeforeCall(Integer accountId, Integer extensionId, ReplaceExtensionParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountExtension(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling replaceAccountExtension(Async)");
        }
        
        
        com.squareup.okhttp.Call call = replaceAccountExtensionCall(accountId, extensionId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Replace an individual extension
     * This service shows how to update an individual extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Account Extensions Data (optional)
     * @return ExtensionFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtensionFull replaceAccountExtension(Integer accountId, Integer extensionId, ReplaceExtensionParams data) throws ApiException {
        ApiResponse<ExtensionFull> resp = replaceAccountExtensionWithHttpInfo(accountId, extensionId, data);
        return resp.getData();
    }

    /**
     * Replace an individual extension
     * This service shows how to update an individual extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Account Extensions Data (optional)
     * @return ApiResponse&lt;ExtensionFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExtensionFull> replaceAccountExtensionWithHttpInfo(Integer accountId, Integer extensionId, ReplaceExtensionParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountExtensionValidateBeforeCall(accountId, extensionId, data, null, null);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace an individual extension (asynchronously)
     * This service shows how to update an individual extension.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Account Extensions Data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountExtensionAsync(Integer accountId, Integer extensionId, ReplaceExtensionParams data, final ApiCallback<ExtensionFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountExtensionValidateBeforeCall(accountId, extensionId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExtensionFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
