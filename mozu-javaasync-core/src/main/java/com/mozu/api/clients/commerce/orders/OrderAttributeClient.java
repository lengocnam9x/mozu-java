/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Use the Order Attributes resource to define how an order attribute definition applies to a specific order.
 * </summary>
 */
public class OrderAttributeClient {
	
	/**
	 * Retrieves a list of the attributes defined for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient=GetOrderAttributesClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderAttribute orderAttribute = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to retrieve a list of defined attributes.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> getOrderAttributesClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderAttributeUrl.getOrderAttributesUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Applies a list of attributes to the order specified in the request and defines a value for each attribute in the request body.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient=CreateOrderAttributesClient( orderAttributes,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderAttribute orderAttribute = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to assign the attributes.
	 * @param orderAttributes The list of attributes to associate with the order, and the properties of each attribute to define for the order.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> createOrderAttributesClient(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderAttributeUrl.createOrderAttributesUrl(orderId);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderAttributes);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of an attribute defined for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient=UpdateOrderAttributesClient( orderAttributes,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderAttribute orderAttribute = client.Result();
	 * </code></pre></p>
	 * @param orderId Identifier of the order for which to update attributes.
	 * @param orderAttributes List of order attributes to update, including the properties of each defined attribute in the list.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> updateOrderAttributesClient(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId) throws Exception
	{
		return updateOrderAttributesClient( orderAttributes,  orderId,  null);
	}

	/**
	 * Updates one or more properties of an attribute defined for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient=UpdateOrderAttributesClient( orderAttributes,  orderId,  removeMissing);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderAttribute orderAttribute = client.Result();
	 * </code></pre></p>
	 * @param orderId Identifier of the order for which to update attributes.
	 * @param removeMissing If true, the operation removes missing properties so that the updated order attributes will not show properties with a null value.
	 * @param orderAttributes List of order attributes to update, including the properties of each defined attribute in the list.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> updateOrderAttributesClient(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> orderAttributes, String orderId, Boolean removeMissing) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderAttributeUrl.updateOrderAttributesUrl(orderId, removeMissing);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderAttributes);
		return mozuClient;

	}

}



