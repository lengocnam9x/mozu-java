/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Allows you to temporarily hold a product from inventory while a shopper is filling out payment information. You create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class SoftAllocationClient {
	
	/**
	 * Retrieves a list of sof allocations according to any specified filter criteria and sort options.
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
	 * Retrieves a list of sof allocations according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocationCollection> mozuClient=GetSoftAllocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocationCollection softAllocationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
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
	 * Retrieves the details of a soft allocation.
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
	 * Retrieves the details of a soft allocation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SoftAllocation> mozuClient=GetSoftAllocationClient( softAllocationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
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
	 * Creates a new product reservation for a product. This places a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=AddSoftAllocationsClient( softAllocationsIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocationsIn Mozu.ProductAdmin.Contracts.SoftAllocation ApiType DOCUMENT_HERE 
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
	 * Converts a set of existing softAllocations into productReservations
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=ConvertToProductReservationClient( softAllocations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations Mozu.ProductAdmin.Contracts.SoftAllocation ApiType DOCUMENT_HERE 
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
	 * Updates a set of softAllocations expiration time in a non trassactional batch
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=RenewSoftAllocationsClient( softAllocationRenew);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocationRenew Mozu.ProductAdmin.Contracts.SoftAllocationRenew ApiType DOCUMENT_HERE 
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
	 * Updates a soft allocationt. This updates a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.SoftAllocation>> mozuClient=UpdateSoftAllocationsClient( softAllocations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SoftAllocation softAllocation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param softAllocations Mozu.ProductAdmin.Contracts.SoftAllocation ApiType DOCUMENT_HERE 
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
	 * Deletes a soft allocation. You might delete a allocation when an order or cart is not processed to return the product quantity back to inventory.
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



