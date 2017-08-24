/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
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
 * Use the order processing settings resource to define how orders and payments are processed for the site.
 * </summary>
 */
public class OrderProcessingSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderProcessingSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 *	OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	 *	OrderProcessingSettings orderProcessingSettings = orderprocessingsettings.getOrderProcessingSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings getOrderProcessingSettings() throws Exception
	{
		return getOrderProcessingSettings( null);
	}

	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 *	OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	 *	CountDownLatch latch = orderprocessingsettings.getOrderProcessingSettings( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public CountDownLatch getOrderProcessingSettingsAsync( AsyncCallback<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> callback) throws Exception
	{
		return getOrderProcessingSettingsAsync( null, callback);
	}

	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 *	OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	 *	OrderProcessingSettings orderProcessingSettings = orderprocessingsettings.getOrderProcessingSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings getOrderProcessingSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> client = com.mozu.api.clients.commerce.settings.checkout.OrderProcessingSettingsClient.getOrderProcessingSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 *	OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	 *	CountDownLatch latch = orderprocessingsettings.getOrderProcessingSettings( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public CountDownLatch getOrderProcessingSettingsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> client = com.mozu.api.clients.commerce.settings.checkout.OrderProcessingSettingsClient.getOrderProcessingSettingsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



