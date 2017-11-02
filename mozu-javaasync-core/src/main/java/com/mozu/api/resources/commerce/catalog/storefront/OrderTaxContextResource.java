/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

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
 * Use the Storefront Tax resource to retrieve tax information from the storefront.
 * </summary>
 */
public class OrderTaxContextResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderTaxContextResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderTaxContext ordertaxcontext = new OrderTaxContext();
	 *	OrderTaxContext orderTaxContext = ordertaxcontext.estimateTaxes( taxableOrder);
	 * </code></pre></p>
	 * @param taxableOrder 
	 * @return com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public com.mozu.api.contracts.pricingruntime.OrderTaxContext estimateTaxes(com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder) throws Exception
	{
		return estimateTaxes( taxableOrder,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderTaxContext ordertaxcontext = new OrderTaxContext();
	 *	CountDownLatch latch = ordertaxcontext.estimateTaxes( taxableOrder, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param taxableOrder 
	 * @return com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public CountDownLatch estimateTaxesAsync(com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder, AsyncCallback<com.mozu.api.contracts.pricingruntime.OrderTaxContext> callback) throws Exception
	{
		return estimateTaxesAsync( taxableOrder,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderTaxContext ordertaxcontext = new OrderTaxContext();
	 *	OrderTaxContext orderTaxContext = ordertaxcontext.estimateTaxes( taxableOrder,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param taxableOrder 
	 * @return com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public com.mozu.api.contracts.pricingruntime.OrderTaxContext estimateTaxes(com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.pricingruntime.OrderTaxContext> client = com.mozu.api.clients.commerce.catalog.storefront.OrderTaxContextClient.estimateTaxesClient( taxableOrder,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderTaxContext ordertaxcontext = new OrderTaxContext();
	 *	CountDownLatch latch = ordertaxcontext.estimateTaxes( taxableOrder,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param taxableOrder 
	 * @return com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.OrderTaxContext
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public CountDownLatch estimateTaxesAsync(com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder, String responseFields, AsyncCallback<com.mozu.api.contracts.pricingruntime.OrderTaxContext> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.pricingruntime.OrderTaxContext> client = com.mozu.api.clients.commerce.catalog.storefront.OrderTaxContextClient.estimateTaxesClient( taxableOrder,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



