/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.PaymentResource;

/** <summary>
 * Use the Payments subresource to manage payment transactions for orders. Each transaction performed for an order represents an individual payment. For example, if an order totals $75.00 but the shopper has a $50.00 gift certificate, both the gift certificate transaction and the credit card transaction for the remaining $25.00 are recorded as payments for the order.
 * </summary>
 */
public class PaymentFactory
{

	public static com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return getPayments(apiContext,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(ApiContext apiContext, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.payments.PaymentCollection returnObj = new com.mozu.api.contracts.commerceruntime.payments.PaymentCollection();
		PaymentResource resource = new PaymentResource(apiContext);
		try
		{
			returnObj = resource.getPayments( orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static List<String> getAvailablePaymentActions(ApiContext apiContext, String orderId, String paymentId, int expectedCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		PaymentResource resource = new PaymentResource(apiContext);
		try
		{
			returnObj = resource.getAvailablePaymentActions( orderId,  paymentId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(ApiContext apiContext, String orderId, String paymentId, int expectedCode) throws Exception
	{
		return getPayment(apiContext,  orderId,  paymentId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(ApiContext apiContext, String orderId, String paymentId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.payments.Payment returnObj = new com.mozu.api.contracts.commerceruntime.payments.Payment();
		PaymentResource resource = new PaymentResource(apiContext);
		try
		{
			returnObj = resource.getPayment( orderId,  paymentId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order performPaymentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId, int expectedCode) throws Exception
	{
		return performPaymentAction(apiContext,  action,  orderId,  paymentId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order performPaymentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String paymentId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		PaymentResource resource = new PaymentResource(apiContext);
		try
		{
			returnObj = resource.performPaymentAction( action,  orderId,  paymentId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createPaymentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, int expectedCode) throws Exception
	{
		return createPaymentAction(apiContext,  action,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order createPaymentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		PaymentResource resource = new PaymentResource(apiContext);
		try
		{
			returnObj = resource.createPaymentAction( action,  orderId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



