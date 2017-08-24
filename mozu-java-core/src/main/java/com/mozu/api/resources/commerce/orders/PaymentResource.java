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
 * Use the Payments subresource to manage payment transactions for orders. Each transaction performed for an order represents an individual payment. For example, if an order totals $75.00 but the shopper has a $50.00 gift certificate, both the gift certificate transaction and the credit card transaction for the remaining $25.00 are recorded as payments for the order.
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
	 * Retrieves information about all payment transactions submitted for the specified order.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	PaymentCollection paymentCollection = payment.getPayments( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(String orderId) throws Exception
	{
		return getPayments( orderId,  null);
	}

	/**
	 * Retrieves information about all payment transactions submitted for the specified order.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	PaymentCollection paymentCollection = payment.getPayments( orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> client = com.mozu.api.clients.commerce.orders.PaymentClient.getPaymentsClient( orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of all available payment actions dependent on the order payment status by specifying the order ID.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	string string = payment.getAvailablePaymentActions( orderId,  paymentId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the payment.
	 * @param paymentId Unique identifer of the payment for which to retrieve available actions.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailablePaymentActions(String orderId, String paymentId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PaymentClient.getAvailablePaymentActionsClient( orderId,  paymentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves information about a specific payment transaction submitted for the specified order.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Payment payment = payment.getPayment( orderId,  paymentId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the payment transaction.
	 * @param paymentId Unique identifier of the payment transaction submitted for the order.
	 * @return com.mozu.api.contracts.commerceruntime.payments.Payment
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(String orderId, String paymentId) throws Exception
	{
		return getPayment( orderId,  paymentId,  null);
	}

	/**
	 * Retrieves information about a specific payment transaction submitted for the specified order.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Payment payment = payment.getPayment( orderId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the payment transaction.
	 * @param paymentId Unique identifier of the payment transaction submitted for the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.payments.Payment
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(String orderId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> client = com.mozu.api.clients.commerce.orders.PaymentClient.getPaymentClient( orderId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Performs the specified action for an individual order payment transaction.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Order order = payment.performPaymentAction( action,  orderId,  paymentId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the payment.
	 * @param paymentId Unique identifer of the payment for which to perform the action.
	 * @param action The action to perform for the payment. Possible values are AuthAndCapture, AuthorizePayment, CapturePayment, VoidPayment, CreditPayment, RequestCheck, ApplyCheck, DeclineCheck.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId) throws Exception
	{
		return performPaymentAction( action,  orderId,  paymentId,  null);
	}

	/**
	 * Performs the specified action for an individual order payment transaction.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Order order = payment.performPaymentAction( action,  orderId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the payment.
	 * @param paymentId Unique identifer of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action The action to perform for the payment. Possible values are AuthAndCapture, AuthorizePayment, CapturePayment, VoidPayment, CreditPayment, RequestCheck, ApplyCheck, DeclineCheck.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.PaymentClient.performPaymentActionClient( action,  orderId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new payment transaction for the specified order and performs the specified action.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Order order = payment.createPaymentAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to apply the payment.
	 * @param action To action to perform for the newly created payment. Possible values are AuthAndCapture, AuthorizePayment, CapturePayment, VoidPayment, CreditPayment, RequestCheck, ApplyCheck, DeclineCheck.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId) throws Exception
	{
		return createPaymentAction( action,  orderId,  null);
	}

	/**
	 * Creates a new payment transaction for the specified order and performs the specified action.
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Order order = payment.createPaymentAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to apply the payment.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action To action to perform for the newly created payment. Possible values are AuthAndCapture, AuthorizePayment, CapturePayment, VoidPayment, CreditPayment, RequestCheck, ApplyCheck, DeclineCheck.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.PaymentClient.createPaymentActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



