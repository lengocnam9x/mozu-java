/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.wishlists;

import com.mozu.api.ApiContext;
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
 * Use the Wish List Items subresource to manage items in a shopper wish list. The same product can be defined as an item in any number of wish lists for the customer account. Use the Wish Lists resource to manage shopper wish lists.
 * </summary>
 */
public class WishlistItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public WishlistItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.getWishlistItem( wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem getWishlistItem(String wishlistId, String wishlistItemId) throws Exception
	{
		return getWishlistItem( wishlistId,  wishlistItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.getWishlistItem( wishlistId,  wishlistItemId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem getWishlistItem(String wishlistId, String wishlistItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemClient( wishlistId,  wishlistItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.getWishlistItems( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItems(String wishlistId) throws Exception
	{
		return getWishlistItems( wishlistId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.getWishlistItems( wishlistId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItems(String wishlistId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemsClient( wishlistId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.getWishlistItemsByWishlistName( customerAccountId,  wishlistName);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItemsByWishlistName(Integer customerAccountId, String wishlistName) throws Exception
	{
		return getWishlistItemsByWishlistName( customerAccountId,  wishlistName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.getWishlistItemsByWishlistName( customerAccountId,  wishlistName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItemsByWishlistName(Integer customerAccountId, String wishlistName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemsByWishlistNameClient( customerAccountId,  wishlistName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.addItemToWishlist( wishlistItem,  wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem addItemToWishlist(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId) throws Exception
	{
		return addItemToWishlist( wishlistItem,  wishlistId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.addItemToWishlist( wishlistItem,  wishlistId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem addItemToWishlist(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.addItemToWishlistClient( wishlistItem,  wishlistId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.updateWishlistItemQuantity( wishlistId,  wishlistItemId,  quantity);
	 * </code></pre></p>
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItemQuantity(String wishlistId, String wishlistItemId, Integer quantity) throws Exception
	{
		return updateWishlistItemQuantity( wishlistId,  wishlistItemId,  quantity,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.updateWishlistItemQuantity( wishlistId,  wishlistItemId,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItemQuantity(String wishlistId, String wishlistItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.updateWishlistItemQuantityClient( wishlistId,  wishlistItemId,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.updateWishlistItem( wishlistItem,  wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItem(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId) throws Exception
	{
		return updateWishlistItem( wishlistItem,  wishlistId,  wishlistItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.updateWishlistItem( wishlistItem,  wishlistId,  wishlistItemId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItem(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.updateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	Wishlist wishlist = wishlistitem.removeAllWishlistItems( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist removeAllWishlistItems(String wishlistId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.removeAllWishlistItemsClient( wishlistId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	wishlistitem.deleteWishlistItem( wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return 
	 */
	public void deleteWishlistItem(String wishlistId, String wishlistItemId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.deleteWishlistItemClient( wishlistId,  wishlistItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



