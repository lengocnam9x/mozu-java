/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.wishlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class WishlistItemUrl
{

	/**
	 * Get Resource Url for GetWishlistItem
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistItemUrl(String responseFields, String wishlistId, String wishlistItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items/{wishlistItemId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		formatter.formatUrl("wishlistItemId", wishlistItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlistItems
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistItemsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlistItemsByWishlistName
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistItemsByWishlistNameUrl(Integer customerAccountId, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String wishlistName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/customers/{customerAccountId}/{wishlistName}/items?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("wishlistName", wishlistName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddItemToWishlist
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl addItemToWishlistUrl(String responseFields, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateWishlistItemQuantity
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateWishlistItemQuantityUrl(Integer quantity, String responseFields, String wishlistId, String wishlistItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items/{wishlistItemId}/{quantity}?responseFields={responseFields}");
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		formatter.formatUrl("wishlistItemId", wishlistItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateWishlistItem
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateWishlistItemUrl(String responseFields, String wishlistId, String wishlistItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items/{wishlistItemId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		formatter.formatUrl("wishlistItemId", wishlistItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveAllWishlistItems
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeAllWishlistItemsUrl(String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items");
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteWishlistItem
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteWishlistItemUrl(String wishlistId, String wishlistItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}/items/{wishlistItemId}");
		formatter.formatUrl("wishlistId", wishlistId);
		formatter.formatUrl("wishlistItemId", wishlistItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

