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
 * commerce/checkouts/checkoutpayments related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PaymentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PaymentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.performPaymentAction( action,  checkoutId,  paymentId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId) throws Exception
	{
		return performPaymentAction( action,  checkoutId,  paymentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.performPaymentAction( action,  checkoutId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.performPaymentActionClient( action,  checkoutId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.createPaymentAction( action,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId) throws Exception
	{
		return createPaymentAction( action,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.createPaymentAction( action,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.createPaymentActionClient( action,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



