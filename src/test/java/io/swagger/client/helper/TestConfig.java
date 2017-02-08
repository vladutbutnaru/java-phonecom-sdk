package io.swagger.client.helper;

import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.auth.ApiKeyAuth;

public final class TestConfig {

	private TestConfig() { }

	public static void setAuthorization() {

		ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKeyPrefix("Bearer");
        apiKey.setApiKey("FJxqBQcorvEVFPpDVPuZAeYdT5kMrWo1cFxwGE7u");
	}

}
