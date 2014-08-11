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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class ShippingResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	RatesResponse ratesResponse = shipping.GetRates( rateRequest);
	 * </code></pre></p>
	 * @param rateRequest 
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public com.mozu.api.contracts.shippingruntime.RatesResponse getRates(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest) throws Exception
	{
		return getRates( rateRequest,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	RatesResponse ratesResponse = shipping.GetRates( rateRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param rateRequest 
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public com.mozu.api.contracts.shippingruntime.RatesResponse getRates(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> client = com.mozu.api.clients.commerce.catalog.storefront.ShippingClient.getRatesClient( rateRequest,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



