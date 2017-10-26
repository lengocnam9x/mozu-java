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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Visits resource to manage all visits a customer makes to a tenant's sites and measure the level of transactions a customer performs during a unique visit for customer account analytics. Clients can track customer visits by site (including online and in-person interactions), the transactions a customer performs during the visit, and the device type associated with the visit, if any.
 * </summary>
 */
public class VisitClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient=GetVisitsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * VisitCollection visitCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.VisitCollection>
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.VisitCollection> getVisitsClient() throws Exception
	{
		return getVisitsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient=GetVisitsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * VisitCollection visitCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.VisitCollection>
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.VisitCollection> getVisitsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.getVisitsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.VisitCollection.class;
		MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.VisitCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=GetVisitClient( visitId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param visitId Unique identifier of the customer visit to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> getVisitClient(String visitId) throws Exception
	{
		return getVisitClient( visitId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=GetVisitClient( visitId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param visitId Unique identifier of the customer visit to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> getVisitClient(String visitId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.getVisitUrl(responseFields, visitId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Visit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=AddVisitClient( visit);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param visit Properties of a customer visit to one of a company's sites.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> addVisitClient(com.mozu.api.contracts.customer.Visit visit) throws Exception
	{
		return addVisitClient( visit,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=AddVisitClient( visit,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param visit Properties of a customer visit to one of a company's sites.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> addVisitClient(com.mozu.api.contracts.customer.Visit visit, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.addVisitUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Visit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(visit);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=UpdateVisitClient( visit,  visitId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param visitId Unique identifier of the customer visit to update.
	 * @param visit Properties of a customer visit to one of a company's sites.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> updateVisitClient(com.mozu.api.contracts.customer.Visit visit, String visitId) throws Exception
	{
		return updateVisitClient( visit,  visitId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=UpdateVisitClient( visit,  visitId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param visitId Unique identifier of the customer visit to update.
	 * @param visit Properties of a customer visit to one of a company's sites.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> updateVisitClient(com.mozu.api.contracts.customer.Visit visit, String visitId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.updateVisitUrl(responseFields, visitId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Visit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(visit);
		return mozuClient;

	}

}



