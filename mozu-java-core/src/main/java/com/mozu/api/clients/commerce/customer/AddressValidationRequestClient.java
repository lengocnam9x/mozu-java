/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Address Validation resource to validate addresses associated with a customer account contact.
 * </summary>
 */
public class AddressValidationRequestClient {
	
	/**
	 * Validates the customer address supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> mozuClient=ValidateAddressClient( addressValidationRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressValidationResponse addressValidationResponse = client.Result();
	 * </code></pre></p>
	 * @param addressValidationRequest Properties of the address to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.AddressValidationResponse>
	 * @see com.mozu.api.contracts.customer.AddressValidationResponse
	 * @see com.mozu.api.contracts.customer.AddressValidationRequest
	 */
	public static MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> validateAddressClient(com.mozu.api.contracts.customer.AddressValidationRequest addressValidationRequest) throws Exception
	{
		return validateAddressClient( addressValidationRequest,  null);
	}

	/**
	 * Validates the customer address supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> mozuClient=ValidateAddressClient( addressValidationRequest,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressValidationResponse addressValidationResponse = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param addressValidationRequest Properties of the address to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.AddressValidationResponse>
	 * @see com.mozu.api.contracts.customer.AddressValidationResponse
	 * @see com.mozu.api.contracts.customer.AddressValidationRequest
	 */
	public static MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> validateAddressClient(com.mozu.api.contracts.customer.AddressValidationRequest addressValidationRequest, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.AddressValidationRequestUrl.validateAddressUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.AddressValidationResponse.class;
		MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(addressValidationRequest);
		return mozuClient;

	}

}



