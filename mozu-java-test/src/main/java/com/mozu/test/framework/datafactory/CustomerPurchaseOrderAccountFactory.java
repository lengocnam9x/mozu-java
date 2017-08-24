/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.accounts.CustomerPurchaseOrderAccountResource;

/** <summary>
 * 
 * </summary>
 */
public class CustomerPurchaseOrderAccountFactory
{

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getCustomerPurchaseOrderAccount(apiContext,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(ApiContext apiContext, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount returnObj = new com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount();
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			returnObj = resource.getCustomerPurchaseOrderAccount( accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getCustomerPurchaseOrderTransactions(apiContext,  accountId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(ApiContext apiContext, Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection returnObj = new com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection();
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			returnObj = resource.getCustomerPurchaseOrderTransactions( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, int expectedCode) throws Exception
	{
		return createCustomerPurchaseOrderAccount(apiContext,  customerPurchaseOrderAccount,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount returnObj = new com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount();
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			returnObj = resource.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, int expectedCode) throws Exception
	{
		return createPurchaseOrderTransaction(apiContext,  purchaseOrderTransaction,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.PurchaseOrderTransaction returnObj = new com.mozu.api.contracts.customer.PurchaseOrderTransaction();
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			returnObj = resource.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, int expectedCode) throws Exception
	{
		return updateCustomerPurchaseOrderAccount(apiContext,  customerPurchaseOrderAccount,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount returnObj = new com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount();
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			returnObj = resource.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
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

	public static void deleteCustomerPurchaseOrderAccount(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		CustomerPurchaseOrderAccountResource resource = new CustomerPurchaseOrderAccountResource(apiContext);
		try
		{
			resource.deleteCustomerPurchaseOrderAccount( accountId);
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

}



