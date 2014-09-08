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
import com.mozu.api.resources.commerce.customer.credits.CreditTransactionResource;

/** <summary>
 * Use the Customer Credit Transactions subresource to manage the individual transactions performed using a store credit or gift card.
 * </summary>
 */
public class CreditTransactionFactory
{

	public static com.mozu.api.contracts.customer.credit.CreditTransactionCollection getTransactions(ApiContext apiContext, String code, int expectedCode, int successCode) throws Exception
	{
		return getTransactions(apiContext,  code,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.credit.CreditTransactionCollection getTransactions(ApiContext apiContext, String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.CreditTransactionCollection returnObj = new com.mozu.api.contracts.customer.credit.CreditTransactionCollection();
		CreditTransactionResource resource = new CreditTransactionResource(apiContext);
		try
		{
			returnObj = resource.getTransactions( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.credit.CreditTransaction addTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, int expectedCode, int successCode) throws Exception
	{
		return addTransaction(apiContext,  creditTransaction,  code,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.credit.CreditTransaction addTransaction(ApiContext apiContext, com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.CreditTransaction returnObj = new com.mozu.api.contracts.customer.credit.CreditTransaction();
		CreditTransactionResource resource = new CreditTransactionResource(apiContext);
		try
		{
			returnObj = resource.addTransaction( creditTransaction,  code,  responseFields);
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

}


