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

import io.swagger.client.model.ContactFull;
import io.swagger.client.model.CreateContactParams;
import io.swagger.client.model.DeleteContact;
import io.swagger.client.model.ListContactsFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsApi {
    private ApiClient apiClient;

    public ContactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountExtensionContact */
    private com.squareup.okhttp.Call createAccountExtensionContactCall(Integer accountId, Integer extensionId, CreateContactParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling createAccountExtensionContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json")
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

    /**
     * Add a new address book contact for an extension
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @return ContactFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactFull createAccountExtensionContact(Integer accountId, Integer extensionId, CreateContactParams data) throws ApiException {
        ApiResponse<ContactFull> resp = createAccountExtensionContactWithHttpInfo(accountId, extensionId, data);
        return resp.getData();
    }

    /**
     * Add a new address book contact for an extension
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @return ApiResponse&lt;ContactFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactFull> createAccountExtensionContactWithHttpInfo(Integer accountId, Integer extensionId, CreateContactParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountExtensionContactCall(accountId, extensionId, data, null, null);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new address book contact for an extension (asynchronously)
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountExtensionContactAsync(Integer accountId, Integer extensionId, CreateContactParams data, final ApiCallback<ContactFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountExtensionContactCall(accountId, extensionId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAccountExtensionContact */
    private com.squareup.okhttp.Call deleteAccountExtensionContactCall(Integer accountId, Integer extensionId, Integer contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling deleteAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling deleteAccountExtensionContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()))
        .replaceAll("\\{" + "contact_id" + "\\}", apiClient.escapeString(contactId.toString()));

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
     * 
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @return DeleteContact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteContact deleteAccountExtensionContact(Integer accountId, Integer extensionId, Integer contactId) throws ApiException {
        ApiResponse<DeleteContact> resp = deleteAccountExtensionContactWithHttpInfo(accountId, extensionId, contactId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @return ApiResponse&lt;DeleteContact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteContact> deleteAccountExtensionContactWithHttpInfo(Integer accountId, Integer extensionId, Integer contactId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountExtensionContactCall(accountId, extensionId, contactId, null, null);
        Type localVarReturnType = new TypeToken<DeleteContact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountExtensionContactAsync(Integer accountId, Integer extensionId, Integer contactId, final ApiCallback<DeleteContact> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccountExtensionContactCall(accountId, extensionId, contactId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteContact>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountExtensionContact */
    private com.squareup.okhttp.Call getAccountExtensionContactCall(Integer accountId, Integer extensionId, Integer contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling getAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling getAccountExtensionContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()))
        .replaceAll("\\{" + "contact_id" + "\\}", apiClient.escapeString(contactId.toString()));

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
     * Retrieve the details of an address book contact
     * For more info on the fields shown, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @return ContactFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactFull getAccountExtensionContact(Integer accountId, Integer extensionId, Integer contactId) throws ApiException {
        ApiResponse<ContactFull> resp = getAccountExtensionContactWithHttpInfo(accountId, extensionId, contactId);
        return resp.getData();
    }

    /**
     * Retrieve the details of an address book contact
     * For more info on the fields shown, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @return ApiResponse&lt;ContactFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactFull> getAccountExtensionContactWithHttpInfo(Integer accountId, Integer extensionId, Integer contactId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountExtensionContactCall(accountId, extensionId, contactId, null, null);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve the details of an address book contact (asynchronously)
     * For more info on the fields shown, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param contactId Contact ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountExtensionContactAsync(Integer accountId, Integer extensionId, Integer contactId, final ApiCallback<ContactFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountExtensionContactCall(accountId, extensionId, contactId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountExtensionContacts */
    private com.squareup.okhttp.Call listAccountExtensionContactsCall(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountExtensionContacts(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling listAccountExtensionContacts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "extension_id" + "\\}", apiClient.escapeString(extensionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[group_id]", filtersGroupId));
        if (filtersUpdatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[updated_at]", filtersUpdatedAt));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortUpdatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[updated_at]", sortUpdatedAt));
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
     * Show a list of address book contacts
     * See Account Contacts for more info on the fields in each item.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersGroupId Group filter (optional)
     * @param filtersUpdatedAt Updated At filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortUpdatedAt Updated At sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListContactsFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListContactsFull listAccountExtensionContacts(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListContactsFull> resp = listAccountExtensionContactsWithHttpInfo(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Show a list of address book contacts
     * See Account Contacts for more info on the fields in each item.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersGroupId Group filter (optional)
     * @param filtersUpdatedAt Updated At filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortUpdatedAt Updated At sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListContactsFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListContactsFull> listAccountExtensionContactsWithHttpInfo(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountExtensionContactsCall(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListContactsFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show a list of address book contacts (asynchronously)
     * See Account Contacts for more info on the fields in each item.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersGroupId Group filter (optional)
     * @param filtersUpdatedAt Updated At filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortUpdatedAt Updated At sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountExtensionContactsAsync(Integer accountId, Integer extensionId, List<String> filtersId, List<String> filtersGroupId, List<String> filtersUpdatedAt, String sortId, String sortUpdatedAt, Integer limit, Integer offset, String fields, final ApiCallback<ListContactsFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountExtensionContactsCall(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListContactsFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountExtensionContact */
    private com.squareup.okhttp.Call replaceAccountExtensionContactCall(Integer accountId, Integer extensionId, CreateContactParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountExtensionContact(Async)");
        }
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new ApiException("Missing the required parameter 'extensionId' when calling replaceAccountExtensionContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/extensions/{extension_id}/contacts".replaceAll("\\{format\\}","json")
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

    /**
     * 
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @return ContactFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactFull replaceAccountExtensionContact(Integer accountId, Integer extensionId, CreateContactParams data) throws ApiException {
        ApiResponse<ContactFull> resp = replaceAccountExtensionContactWithHttpInfo(accountId, extensionId, data);
        return resp.getData();
    }

    /**
     * 
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @return ApiResponse&lt;ContactFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactFull> replaceAccountExtensionContactWithHttpInfo(Integer accountId, Integer extensionId, CreateContactParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountExtensionContactCall(accountId, extensionId, data, null, null);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * For more on the input fields, see Account Contacts.
     * @param accountId Account ID (required)
     * @param extensionId Extension ID (required)
     * @param data Contact data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountExtensionContactAsync(Integer accountId, Integer extensionId, CreateContactParams data, final ApiCallback<ContactFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountExtensionContactCall(accountId, extensionId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
