/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.checkouts;

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
 * 
 * </summary>
 */
public class OrderNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getCheckoutNotes( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getCheckoutNotes(String checkoutId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.getCheckoutNotesClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getCheckoutNotes( checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getCheckoutNotesAsync(String checkoutId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.getCheckoutNotesClient( checkoutId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getCheckoutNote( checkoutId,  noteId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote getCheckoutNote(String checkoutId, String noteId) throws Exception
	{
		return getCheckoutNote( checkoutId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getCheckoutNote( checkoutId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getCheckoutNoteAsync(String checkoutId, String noteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return getCheckoutNoteAsync( checkoutId,  noteId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getCheckoutNote( checkoutId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote getCheckoutNote(String checkoutId, String noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.getCheckoutNoteClient( checkoutId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getCheckoutNote( checkoutId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getCheckoutNoteAsync(String checkoutId, String noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.getCheckoutNoteClient( checkoutId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.createCheckoutNote( orderNote,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote createCheckoutNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId) throws Exception
	{
		return createCheckoutNote( orderNote,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.createCheckoutNote( orderNote,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch createCheckoutNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return createCheckoutNoteAsync( orderNote,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.createCheckoutNote( orderNote,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote createCheckoutNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.createCheckoutNoteClient( orderNote,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.createCheckoutNote( orderNote,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch createCheckoutNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.createCheckoutNoteClient( orderNote,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.updateCheckoutNote( orderNote,  checkoutId,  noteId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote updateCheckoutNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String noteId) throws Exception
	{
		return updateCheckoutNote( orderNote,  checkoutId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.updateCheckoutNote( orderNote,  checkoutId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch updateCheckoutNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String noteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return updateCheckoutNoteAsync( orderNote,  checkoutId,  noteId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.updateCheckoutNote( orderNote,  checkoutId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param responseFields 
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote updateCheckoutNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.updateCheckoutNoteClient( orderNote,  checkoutId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.updateCheckoutNote( orderNote,  checkoutId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch updateCheckoutNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String checkoutId, String noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.updateCheckoutNoteClient( orderNote,  checkoutId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	ordernote.deleteCheckoutNote( checkoutId,  noteId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param noteId 
	 * @return 
	 */
	public void deleteCheckoutNote(String checkoutId, String noteId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.checkouts.OrderNoteClient.deleteCheckoutNoteClient( checkoutId,  noteId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



