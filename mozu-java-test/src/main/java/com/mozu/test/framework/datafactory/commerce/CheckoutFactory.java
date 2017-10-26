/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.CheckoutResource;

/** <summary>
 * 
 * </summary>
 */
public class CheckoutFactory
{

	public static com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection getCheckouts(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCheckouts(apiContext,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection getCheckouts(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.getCheckouts( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
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

	public static List<String> getAvailableActions(ApiContext apiContext, String checkoutId, int expectedCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.getAvailableActions( checkoutId);
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

	public static List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates> getAvailableShippingMethods(ApiContext apiContext, String checkoutId, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates> returnObj = new ArrayList<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.getAvailableShippingMethods( checkoutId);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout getCheckout(ApiContext apiContext, String checkoutId, int expectedCode) throws Exception
	{
		return getCheckout(apiContext,  checkoutId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout getCheckout(ApiContext apiContext, String checkoutId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.getCheckout( checkoutId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout createCheckoutFromCart(ApiContext apiContext, String cartId, int expectedCode) throws Exception
	{
		return createCheckoutFromCart(apiContext,  cartId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout createCheckoutFromCart(ApiContext apiContext, String cartId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.createCheckoutFromCart( cartId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout performCheckoutAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, int expectedCode) throws Exception
	{
		return performCheckoutAction(apiContext,  action,  checkoutId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout performCheckoutAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.performCheckoutAction( action,  checkoutId,  responseFields);
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

	public static void resendCheckoutConfirmationEmail(ApiContext apiContext, String checkoutId, int expectedCode) throws Exception
	{
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			resource.resendCheckoutConfirmationEmail( checkoutId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout setShippingMethods(ApiContext apiContext, List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, int expectedCode) throws Exception
	{
		return setShippingMethods(apiContext,  groupShippingMethods,  checkoutId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout setShippingMethods(ApiContext apiContext, List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.setShippingMethods( groupShippingMethods,  checkoutId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateCheckout(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, int expectedCode) throws Exception
	{
		return updateCheckout(apiContext,  checkout,  checkoutId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateCheckout(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.updateCheckout( checkout,  checkoutId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout processDigitalWallet(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, int expectedCode) throws Exception
	{
		return processDigitalWallet(apiContext,  digitalWallet,  checkoutId,  digitalWalletType,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout processDigitalWallet(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout changeCheckoutPriceList(ApiContext apiContext, String priceListCode, String checkoutId, int expectedCode) throws Exception
	{
		return changeCheckoutPriceList(apiContext,  priceListCode,  checkoutId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout changeCheckoutPriceList(ApiContext apiContext, String priceListCode, String checkoutId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		CheckoutResource resource = new CheckoutResource(apiContext);
		try
		{
			returnObj = resource.changeCheckoutPriceList( priceListCode,  checkoutId,  responseFields);
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



