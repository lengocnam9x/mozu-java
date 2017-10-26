/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * The Soft Allocations resource allows you to temporarily hold a product from inventory while a shopper is filling out payment information. You create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class SoftAllocationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> mozuClient=GetSoftAllocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocationCollection softAllocationCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SoftAllocationCollection>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> getSoftAllocationsClient() throws Exception
	{
		return getSoftAllocationsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> mozuClient=GetSoftAllocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocationCollection softAllocationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SoftAllocationCollection>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> getSoftAllocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.getSoftAllocationsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SoftAllocationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> mozuClient=GetSoftAllocationClient( softAllocationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param softAllocationId The unique identifier of the soft allocation.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SoftAllocation>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> getSoftAllocationClient(Integer softAllocationId) throws Exception
	{
		return getSoftAllocationClient( softAllocationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> mozuClient=GetSoftAllocationClient( softAllocationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param softAllocationId The unique identifier of the soft allocation.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SoftAllocation>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> getSoftAllocationClient(Integer softAllocationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.getSoftAllocationUrl(responseFields, softAllocationId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SoftAllocation.class;
		MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=AddSoftAllocationsClient( softAllocationsIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocationsIn The details of the new soft allocation.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.SoftAllocation>>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> addSoftAllocationsClient(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocationsIn) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.addSoftAllocationsUrl();
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(softAllocationsIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=ConvertToProductReservationClient( softAllocations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations The details of the soft allocation which you want to convert into product reservations.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> convertToProductReservationClient(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.convertToProductReservationUrl();
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(softAllocations);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=RenewSoftAllocationsClient( softAllocationRenew);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocationRenew The details of the soft allocation that you want to renew.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.SoftAllocation>>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocationRenew
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> renewSoftAllocationsClient(com.mozu.api.contracts.productadmin.SoftAllocationRenew softAllocationRenew) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.renewSoftAllocationsUrl();
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(softAllocationRenew);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=UpdateSoftAllocationsClient( softAllocations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations The details of the updated soft allocations.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.SoftAllocation>>
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 * @see com.mozu.api.contracts.productadmin.SoftAllocation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> updateSoftAllocationsClient(List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.updateSoftAllocationsUrl();
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(softAllocations);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteSoftAllocationClient( softAllocationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param softAllocationId The unique identifier of the soft allocation.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteSoftAllocationClient(Integer softAllocationId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SoftAllocationUrl.deleteSoftAllocationUrl(softAllocationId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



