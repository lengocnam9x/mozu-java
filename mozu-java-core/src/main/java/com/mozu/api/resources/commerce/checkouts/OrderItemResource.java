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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this resource to manage the items a shopper adds to their cart while the Checkouts resource is active (the Checkouts resource only applies to sites that enable shipping to multiple destinations within the same order). The Checkouts resource remains active until the shopper submits their order.
 * </summary>
 */
public class OrderItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.splitItem( checkoutId,  itemId);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout splitItem(String checkoutId, String itemId) throws Exception
	{
		return splitItem( checkoutId,  itemId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.splitItem( checkoutId,  itemId,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout splitItem(String checkoutId, String itemId, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.OrderItemClient.splitItemClient( checkoutId,  itemId,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.bulkUpdateItemDestinations( itemsForDestination,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemsForDestination A collection of items to be associated with a destination.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout bulkUpdateItemDestinations(List<com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination> itemsForDestination, String checkoutId) throws Exception
	{
		return bulkUpdateItemDestinations( itemsForDestination,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.bulkUpdateItemDestinations( itemsForDestination,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param itemsForDestination A collection of items to be associated with a destination.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout bulkUpdateItemDestinations(List<com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination> itemsForDestination, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.OrderItemClient.bulkUpdateItemDestinationsClient( itemsForDestination,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.updateItemDestination( checkoutId,  itemId,  destinationId);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param itemId The unique identifier of the item.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateItemDestination(String checkoutId, String itemId, String destinationId) throws Exception
	{
		return updateItemDestination( checkoutId,  itemId,  destinationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Checkout checkout = orderitem.updateItemDestination( checkoutId,  itemId,  destinationId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param itemId The unique identifier of the item.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateItemDestination(String checkoutId, String itemId, String destinationId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.OrderItemClient.updateItemDestinationClient( checkoutId,  itemId,  destinationId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



