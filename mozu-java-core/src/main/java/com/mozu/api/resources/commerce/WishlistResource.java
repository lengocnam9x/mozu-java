/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
 * Use the Wish Lists resource to manage the shopper wish lists of products associated with a customer account. Although customer accounts are managed at the tenant level, the system stores shopper wish lists at the site level. This enables the same customer to have wish lists for each of a merchant's sites. Use the Wish List Items resource to manage items in a wish list.
 * </summary>
 */
public class WishlistResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public WishlistResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	WishlistCollection wishlistCollection = wishlist.getWishlists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists() throws Exception
	{
		return getWishlists( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	WishlistCollection wishlistCollection = wishlist.getWishlists( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlist( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlist(String wishlistId) throws Exception
	{
		return getWishlist( wishlistId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlist( wishlistId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlist(String wishlistId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistClient( wishlistId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlistByName( customerAccountId,  wishlistName);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlistByName(Integer customerAccountId, String wishlistName) throws Exception
	{
		return getWishlistByName( customerAccountId,  wishlistName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlistByName( customerAccountId,  wishlistName,  responseFields);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlistByName(Integer customerAccountId, String wishlistName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistByNameClient( customerAccountId,  wishlistName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.createWishlist( wishlist);
	 * </code></pre></p>
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist createWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist) throws Exception
	{
		return createWishlist( wishlist,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.createWishlist( wishlist,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist createWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.createWishlistClient( wishlist,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.updateWishlist( wishlist,  wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist updateWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId) throws Exception
	{
		return updateWishlist( wishlist,  wishlistId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.updateWishlist( wishlist,  wishlistId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist updateWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.updateWishlistClient( wishlist,  wishlistId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	wishlist.deleteWishlist( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return 
	 */
	public void deleteWishlist(String wishlistId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.WishlistClient.deleteWishlistClient( wishlistId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



