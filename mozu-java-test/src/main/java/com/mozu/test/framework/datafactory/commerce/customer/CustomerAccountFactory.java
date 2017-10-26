/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.customer;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.CustomerAccountResource;

/** <summary>
 * Use the Customer Accounts resource to manage the components of shopper accounts, including attributes, contact information, company notes, and groups associated with the customer account.
 * </summary>
 */
public class CustomerAccountFactory
{

	public static com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAccounts(apiContext,  null,  null,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, Boolean isAnonymous, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAccountCollection returnObj = new com.mozu.api.contracts.customer.CustomerAccountCollection();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getAccounts( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous,  responseFields);
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

	public static com.mozu.api.contracts.customer.LoginState getLoginState(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getLoginState(apiContext,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.LoginState getLoginState(ApiContext apiContext, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.LoginState returnObj = new com.mozu.api.contracts.customer.LoginState();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getLoginState( accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerAccount getAccount(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getAccount(apiContext,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAccount getAccount(ApiContext apiContext, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAccount returnObj = new com.mozu.api.contracts.customer.CustomerAccount();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getAccount( accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerAccount addAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccount account, int expectedCode) throws Exception
	{
		return addAccount(apiContext,  account,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAccount addAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccount account, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAccount returnObj = new com.mozu.api.contracts.customer.CustomerAccount();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.addAccount( account,  responseFields);
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

	public static void changePassword(ApiContext apiContext, com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId, int expectedCode) throws Exception
	{
		changePassword(apiContext,  passwordInfo,  accountId,  null, expectedCode);
	}

	public static void changePassword(ApiContext apiContext, com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId, Boolean unlockAccount, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.changePassword( passwordInfo,  accountId,  unlockAccount);
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

	public static com.mozu.api.contracts.customer.CustomerAuthTicket addLoginToExistingCustomer(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId, int expectedCode) throws Exception
	{
		return addLoginToExistingCustomer(apiContext,  customerAuthInfo,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket addLoginToExistingCustomer(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAuthTicket returnObj = new com.mozu.api.contracts.customer.CustomerAuthTicket();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.addLoginToExistingCustomer( customerAuthInfo,  accountId,  responseFields);
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

	public static void recomputeCustomerLifetimeValue(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.recomputeCustomerLifetimeValue( accountId);
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

	public static void setLoginLocked(ApiContext apiContext, Boolean isLocked, Integer accountId, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.setLoginLocked( isLocked,  accountId);
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

	public static void setPasswordChangeRequired(ApiContext apiContext, Boolean isPasswordChangeRequired, Integer accountId, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.setPasswordChangeRequired( isPasswordChangeRequired,  accountId);
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

	public static com.mozu.api.contracts.customer.CustomerAuthTicket addAccountAndLogin(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo, int expectedCode) throws Exception
	{
		return addAccountAndLogin(apiContext,  accountAndAuthInfo,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket addAccountAndLogin(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAuthTicket returnObj = new com.mozu.api.contracts.customer.CustomerAuthTicket();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.addAccountAndLogin( accountAndAuthInfo,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerAccountCollection addAccounts(ApiContext apiContext, List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers, int expectedCode) throws Exception
	{
		return addAccounts(apiContext,  customers,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAccountCollection addAccounts(ApiContext apiContext, List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAccountCollection returnObj = new com.mozu.api.contracts.customer.CustomerAccountCollection();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.addAccounts( customers,  responseFields);
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

	public static com.mozu.api.contracts.customer.ChangePasswordResultCollection changePasswords(ApiContext apiContext, com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos, int expectedCode) throws Exception
	{
		return changePasswords(apiContext,  accountPasswordInfos,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.ChangePasswordResultCollection changePasswords(ApiContext apiContext, com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.ChangePasswordResultCollection returnObj = new com.mozu.api.contracts.customer.ChangePasswordResultCollection();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.changePasswords( accountPasswordInfos,  responseFields);
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

	public static com.mozu.api.contracts.customer.LoginState getLoginStateByEmailAddress(ApiContext apiContext, String emailAddress, int expectedCode) throws Exception
	{
		return getLoginStateByEmailAddress(apiContext,  emailAddress,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.LoginState getLoginStateByEmailAddress(ApiContext apiContext, String emailAddress, String customerSetCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.LoginState returnObj = new com.mozu.api.contracts.customer.LoginState();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getLoginStateByEmailAddress( emailAddress,  customerSetCode,  responseFields);
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

	public static com.mozu.api.contracts.customer.LoginState getLoginStateByUserName(ApiContext apiContext, String userName, int expectedCode) throws Exception
	{
		return getLoginStateByUserName(apiContext,  userName,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.LoginState getLoginStateByUserName(ApiContext apiContext, String userName, String customerSetCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.LoginState returnObj = new com.mozu.api.contracts.customer.LoginState();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getLoginStateByUserName( userName,  customerSetCode,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection getCustomersPurchaseOrderAccounts(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCustomersPurchaseOrderAccounts(apiContext,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection getCustomersPurchaseOrderAccounts(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection returnObj = new com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.getCustomersPurchaseOrderAccounts( startIndex,  pageSize,  sortBy,  responseFields);
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

	public static void resetPassword(ApiContext apiContext, com.mozu.api.contracts.customer.ResetPasswordInfo resetPasswordInfo, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.resetPassword( resetPasswordInfo);
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

	public static com.mozu.api.contracts.customer.CustomerAccount updateAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId, int expectedCode) throws Exception
	{
		return updateAccount(apiContext,  account,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAccount updateAccount(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAccount returnObj = new com.mozu.api.contracts.customer.CustomerAccount();
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			returnObj = resource.updateAccount( account,  accountId,  responseFields);
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

	public static void deleteAccount(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		CustomerAccountResource resource = new CustomerAccountResource(apiContext);
		try
		{
			resource.deleteAccount( accountId);
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



