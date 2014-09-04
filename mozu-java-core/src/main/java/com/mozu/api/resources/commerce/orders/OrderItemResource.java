/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use this subresource to retrieve details about items in an active order.
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
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.GetOrderItem( orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order item to retrieve.
	 * @param orderItemId Unique identifier of the order item details to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(String orderId, String orderItemId) throws Exception
	{
		return getOrderItem( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.GetOrderItem( orderId,  orderItemId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of this order item, which might include uncommitted changes to the order item, the order, or other order components.
	 * @param orderId Unique identifier of the order item to retrieve.
	 * @param orderItemId Unique identifier of the order item details to retrieve.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getOrderItem(String orderId, String orderItemId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> client = com.mozu.api.clients.commerce.orders.OrderItemClient.getOrderItemClient( orderId,  orderItemId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItemCollection orderItemCollection = orderitem.GetOrderItems( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order items to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(String orderId) throws Exception
	{
		return getOrderItems( orderId,  null,  null);
	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItemCollection orderItemCollection = orderitem.GetOrderItems( orderId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order's items, which might include uncommitted changes to one or more order items, the order itself, or other order components.
	 * @param orderId Unique identifier of the order items to retrieve.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection getOrderItems(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> client = com.mozu.api.clients.commerce.orders.OrderItemClient.getOrderItemsClient( orderId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new item to an existing order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.CreateOrderItem( orderItem,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add the item.
	 * @param orderItem The properties of the item to create in the existing order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId) throws Exception
	{
		return createOrderItem( orderItem,  orderId,  null,  null,  null,  null);
	}

	/**
	 * Adds a new item to an existing order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.CreateOrderItem( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add the item.
	 * @param responseFields 
	 * @param skipInventoryCheck 
	 * @param updateMode Specifies whether to add the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The properties of the item to create in the existing order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.createOrderItemClient( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order associated with the item discount.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param discount Properties of the discount to modify for the order item.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId) throws Exception
	{
		return updateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId,  null,  null,  null);
	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateOrderItemDiscount( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order associated with the item discount.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param responseFields 
	 * @param updateMode Specifies whether to change the item discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of the discount to modify for the order item.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderItemDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemFulfillment( orderItem,  orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param orderItem 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId) throws Exception
	{
		return updateItemFulfillment( orderItem,  orderId,  orderItemId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemFulfillment( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param version 
	 * @param orderItem 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemFulfillment(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemProductPrice( orderId,  orderItemId,  price);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to price override.
	 * @param orderItemId Unique identifier of the item in the order to price override.
	 * @param price The override price to specify for this item in the specified order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(String orderId, String orderItemId, Double price) throws Exception
	{
		return updateItemProductPrice( orderId,  orderItemId,  price,  null,  null,  null);
	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemProductPrice( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to price override.
	 * @param orderItemId Unique identifier of the item in the order to price override.
	 * @param price The override price to specify for this item in the specified order.
	 * @param responseFields 
	 * @param updateMode Specifies whether to change the product price by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemProductPrice(String orderId, String orderItemId, Double price, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemProductPriceClient( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemQuantity( orderId,  orderItemId,  quantity);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to update quantity.
	 * @param orderItemId Unique identifier of the item in the order to update quantity.
	 * @param quantity The quantity of the item in the order to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(String orderId, String orderItemId, Integer quantity) throws Exception
	{
		return updateItemQuantity( orderId,  orderItemId,  quantity,  null,  null,  null);
	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.UpdateItemQuantity( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order containing the item to update quantity.
	 * @param orderItemId Unique identifier of the item in the order to update quantity.
	 * @param quantity The quantity of the item in the order to update.
	 * @param responseFields 
	 * @param updateMode Specifies whether to change the item quantity by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateItemQuantity(String orderId, String orderItemId, Integer quantity, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.updateItemQuantityClient( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a previously added item from an existing order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.DeleteOrderItem( orderId,  orderItemId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the item to remove.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(String orderId, String orderItemId) throws Exception
	{
		return deleteOrderItem( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Removes a previously added item from an existing order.
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Order order = orderitem.DeleteOrderItem( orderId,  orderItemId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the item to remove.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param updateMode Specifies whether to remove the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order deleteOrderItem(String orderId, String orderItemId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.OrderItemClient.deleteOrderItemClient( orderId,  orderItemId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



