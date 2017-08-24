/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Customer In-Stock Notification Subscription resource to manage the subscriptions customer accounts use to send product notifications. This resource can send a notification when a product in a catalog returns to a site's active inventory after it is out of stock, or when a new product becomes available for the first time.
 * </summary>
 */
public class InStockNotificationSubscriptionClient {
	
	/**
	 * Retrieves a list of in-stock notification subscriptions.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient=GetInStockNotificationSubscriptionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> getInStockNotificationSubscriptionsClient() throws Exception
	{
		return getInStockNotificationSubscriptionsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of in-stock notification subscriptions.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient=GetInStockNotificationSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> getInStockNotificationSubscriptionsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.getInStockNotificationSubscriptionsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a subscription that sends a push notification when a product is available in a site's active stock.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=GetInStockNotificationSubscriptionClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the in-stock notification subscription to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> getInStockNotificationSubscriptionClient(Integer id) throws Exception
	{
		return getInStockNotificationSubscriptionClient( id,  null);
	}

	/**
	 * Retrieves the details of a subscription that sends a push notification when a product is available in a site's active stock.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=GetInStockNotificationSubscriptionClient( id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the in-stock notification subscription to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> getInStockNotificationSubscriptionClient(Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.getInStockNotificationSubscriptionUrl(id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscription.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new subscription that notifies the customer when the product specified in the request is available in the active inventory of the defined location.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=AddInStockNotificationSubscriptionClient( inStockNotificationSubscription);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param inStockNotificationSubscription Properties of a subscription that sends the customer a notification when a product is available in a site's active stock.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> addInStockNotificationSubscriptionClient(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription) throws Exception
	{
		return addInStockNotificationSubscriptionClient( inStockNotificationSubscription,  null);
	}

	/**
	 * Creates a new subscription that notifies the customer when the product specified in the request is available in the active inventory of the defined location.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=AddInStockNotificationSubscriptionClient( inStockNotificationSubscription,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param inStockNotificationSubscription Properties of a subscription that sends the customer a notification when a product is available in a site's active stock.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> addInStockNotificationSubscriptionClient(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.addInStockNotificationSubscriptionUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscription.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(inStockNotificationSubscription);
		return mozuClient;

	}

	/**
	 * Deletes a subscription for a customer in-stock notification.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteInStockNotificationSubscriptionClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer in-stock notification subscription to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteInStockNotificationSubscriptionClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.deleteInStockNotificationSubscriptionUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



