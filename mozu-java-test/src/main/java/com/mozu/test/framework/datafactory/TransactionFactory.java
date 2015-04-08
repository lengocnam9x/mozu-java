/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.accounts.TransactionResource;

/** <summary>
 * Use the Customer Account Transactions resource to manage the transactions associated with a customer account.
 * </summary>
 */
public class TransactionFactory
{

	public static List<com.mozu.api.contracts.customer.Transaction> getTransactions(ApiContext apiContext, Integer accountId, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.customer.Transaction> returnObj = new ArrayList<com.mozu.api.contracts.customer.Transaction>();
		TransactionResource resource = new TransactionResource(apiContext);
		try
		{
			returnObj = resource.getTransactions( accountId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.customer.Transaction addTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.Transaction transaction, Integer accountId, int expectedCode, int successCode) throws Exception
	{
		return addTransaction(apiContext,  transaction,  accountId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.Transaction addTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.Transaction transaction, Integer accountId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.Transaction returnObj = new com.mozu.api.contracts.customer.Transaction();
		TransactionResource resource = new TransactionResource(apiContext);
		try
		{
			returnObj = resource.addTransaction( transaction,  accountId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static void removeTransaction(ApiContext apiContext, Integer accountId, String transactionId, int expectedCode, int successCode) throws Exception
	{
		TransactionResource resource = new TransactionResource(apiContext);
		try
		{
			resource.removeTransaction( accountId,  transactionId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



