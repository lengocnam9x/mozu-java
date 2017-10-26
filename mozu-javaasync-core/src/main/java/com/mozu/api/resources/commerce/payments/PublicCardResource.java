/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.payments;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/payments/cards related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublicCardResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublicCardResource() 
		{
			_apiContext = null;
	}
public PublicCardResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.create( request);
	 * </code></pre></p>
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse create(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		return create( request,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.create( request, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch createAsync(com.mozu.api.contracts.paymentservice.PublicCard request, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return createAsync( request,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.create( request,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse create(com.mozu.api.contracts.paymentservice.PublicCard request, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.createClient( request,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.create( request,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch createAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.createClient( request,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse update(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		return update( request,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.update( request,  cardId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param  callback callback handler for asynchronous operations
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch updateAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return updateAsync( request,  cardId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse update(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.updateClient( request,  cardId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.update( request,  cardId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch updateAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.updateClient( request,  cardId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	publiccard.delete( cardId);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return 
	 */
	public void delete(String cardId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.payments.PublicCardClient.deleteClient( cardId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



