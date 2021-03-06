/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

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
 * Use the Customer Segments resource to manage the segments that enable a client to manage groups of customers and target discounts for these segments. After a customer segment is defined, you can associate any number of customer accounts with it.
 * </summary>
 */
public class CustomerSegmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerSegmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.getSegments();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getSegments() throws Exception
	{
		return getSegments( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getSegments( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public CountDownLatch getSegmentsAsync( AsyncCallback<com.mozu.api.contracts.customer.CustomerSegmentCollection> callback) throws Exception
	{
		return getSegmentsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.getSegments( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getSegments(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.getSegmentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getSegments( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public CountDownLatch getSegmentsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegmentCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.getSegmentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.getSegment( id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment getSegment(Integer id) throws Exception
	{
		return getSegment( id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getSegment( id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch getSegmentAsync(Integer id, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		return getSegmentAsync( id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.getSegment( id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment getSegment(Integer id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.getSegmentClient( id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getSegment( id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch getSegmentAsync(Integer id, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.getSegmentClient( id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.addSegment( segment);
	 * </code></pre></p>
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment addSegment(com.mozu.api.contracts.customer.CustomerSegment segment) throws Exception
	{
		return addSegment( segment,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.addSegment( segment, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch addSegmentAsync(com.mozu.api.contracts.customer.CustomerSegment segment, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		return addSegmentAsync( segment,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.addSegment( segment,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment addSegment(com.mozu.api.contracts.customer.CustomerSegment segment, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.addSegmentClient( segment,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.addSegment( segment,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch addSegmentAsync(com.mozu.api.contracts.customer.CustomerSegment segment, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.addSegmentClient( segment,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	customersegment.addSegmentAccounts( accountIds,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param accountIds List of customer account IDs to add to the customer segment specified in the request.
	 * @return 
	 * @see int
	 */
	public void addSegmentAccounts(List<Integer> accountIds, Integer id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.addSegmentAccountsClient( accountIds,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.updateSegment( segment,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment updateSegment(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id) throws Exception
	{
		return updateSegment( segment,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.updateSegment( segment,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch updateSegmentAsync(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		return updateSegmentAsync( segment,  id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegment customerSegment = customersegment.updateSegment( segment,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public com.mozu.api.contracts.customer.CustomerSegment updateSegment(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.updateSegmentClient( segment,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.updateSegment( segment,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public CountDownLatch updateSegmentAsync(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegment> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.updateSegmentClient( segment,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	customersegment.deleteSegment( id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return 
	 */
	public void deleteSegment(Integer id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.deleteSegmentClient( id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	customersegment.removeSegmentAccount( id,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return 
	 */
	public void removeSegmentAccount(Integer id, Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerSegmentClient.removeSegmentAccountClient( id,  accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



