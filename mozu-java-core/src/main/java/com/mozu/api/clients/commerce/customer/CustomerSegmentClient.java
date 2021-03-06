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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Segments resource to manage the segments that enable a client to manage groups of customers and target discounts for these segments. After a customer segment is defined, you can associate any number of customer accounts with it.
 * </summary>
 */
public class CustomerSegmentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient() throws Exception
	{
		return getSegmentsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient=GetSegmentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegmentCollection customerSegmentCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegmentCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> getSegmentsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegmentCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=GetSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> getSegmentClient(Integer id) throws Exception
	{
		return getSegmentClient( id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=GetSegmentClient( id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> getSegmentClient(Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.getSegmentUrl(id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=AddSegmentClient( segment);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> addSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment) throws Exception
	{
		return addSegmentClient( segment,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=AddSegmentClient( segment,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> addSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AddSegmentAccountsClient( accountIds,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param accountIds List of customer account IDs to add to the customer segment specified in the request.
	 * @return Mozu.Api.MozuClient 
	 * @see int
	 */
	public static MozuClient addSegmentAccountsClient(List<Integer> accountIds, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.addSegmentAccountsUrl(id);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountIds);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=UpdateSegmentClient( segment,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> updateSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id) throws Exception
	{
		return updateSegmentClient( segment,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient=UpdateSegmentClient( segment,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSegment customerSegment = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param segment The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSegment>
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 * @see com.mozu.api.contracts.customer.CustomerSegment
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSegment> updateSegmentClient(com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.updateSegmentUrl(id, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSegment.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSegment> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSegment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(segment);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSegmentClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteSegmentClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.deleteSegmentUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveSegmentAccountClient( id,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeSegmentAccountClient(Integer id, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSegmentUrl.removeSegmentAccountUrl(accountId, id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



