/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.payments;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/payments/cards related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublicCardClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=CreateClient( request);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> createClient(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		return createClient( request,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=CreateClient( request,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> createClient(com.mozu.api.contracts.paymentservice.PublicCard request, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.createUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=UpdateClient( request,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> updateClient(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		return updateClient( request,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=UpdateClient( request,  cardId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> updateClient(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.updateUrl(cardId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteClient( cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteClient(String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.deleteUrl(cardId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



