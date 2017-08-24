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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Order Attributes resource to define how an order attribute definition applies to a specific order.
 * </summary>
 */
public class OrderAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the attributes defined for the order specified in the request.
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.getOrderAttributes( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to retrieve a list of defined attributes.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> getOrderAttributes(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.orders.OrderAttributeClient.getOrderAttributesClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Applies a list of attributes to the order specified in the request and defines a value for each attribute in the request body.
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.createOrderAttributes( orderAttributes,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to assign the attributes.
	 * @param orderAttributes The list of attributes to associate with the order, and the properties of each attribute to define for the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> createOrderAttributes(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.orders.OrderAttributeClient.createOrderAttributesClient( orderAttributes,  orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of an attribute defined for the order specified in the request.
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.updateOrderAttributes( orderAttributes,  orderId);
	 * </code></pre></p>
	 * @param orderId Identifier of the order for which to update attributes.
	 * @param orderAttributes List of order attributes to update, including the properties of each defined attribute in the list.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> updateOrderAttributes(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId) throws Exception
	{
		return updateOrderAttributes( orderAttributes,  orderId,  null);
	}

	/**
	 * Updates one or more properties of an attribute defined for the order specified in the request.
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.updateOrderAttributes( orderAttributes,  orderId,  removeMissing);
	 * </code></pre></p>
	 * @param orderId Identifier of the order for which to update attributes.
	 * @param removeMissing If true, the operation removes missing properties so that the updated order attributes will not show properties with a null value.
	 * @param orderAttributes List of order attributes to update, including the properties of each defined attribute in the list.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> updateOrderAttributes(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId, Boolean removeMissing) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.orders.OrderAttributeClient.updateOrderAttributesClient( orderAttributes,  orderId,  removeMissing);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



