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
import com.mozu.api.resources.commerce.customer.CustomerSegmentResource;

/** <summary>
 * Use the Customer Segments resource to manage the segments that enable a client to manage groups of customers and target discounts for these segments. After a customer segment is defined, you can associate any number of customer accounts with it.
 * </summary>
 */
public class CustomerSegmentFactory
{

	public static com.mozu.api.contracts.customer.CustomerSegmentCollection getSegments(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSegments(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerSegmentCollection getSegments(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerSegmentCollection returnObj = new com.mozu.api.contracts.customer.CustomerSegmentCollection();
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			returnObj = resource.getSegments( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerSegment getSegment(ApiContext apiContext, Integer id, int expectedCode) throws Exception
	{
		return getSegment(apiContext,  id,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerSegment getSegment(ApiContext apiContext, Integer id, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerSegment returnObj = new com.mozu.api.contracts.customer.CustomerSegment();
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			returnObj = resource.getSegment( id,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerSegment addSegment(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerSegment segment, int expectedCode) throws Exception
	{
		return addSegment(apiContext,  segment,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerSegment addSegment(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerSegment segment, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerSegment returnObj = new com.mozu.api.contracts.customer.CustomerSegment();
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			returnObj = resource.addSegment( segment,  responseFields);
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

	public static void addSegmentAccounts(ApiContext apiContext, List<Integer> accountIds, Integer id, int expectedCode) throws Exception
	{
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			resource.addSegmentAccounts( accountIds,  id);
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

	public static com.mozu.api.contracts.customer.CustomerSegment updateSegment(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, int expectedCode) throws Exception
	{
		return updateSegment(apiContext,  segment,  id,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerSegment updateSegment(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerSegment segment, Integer id, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerSegment returnObj = new com.mozu.api.contracts.customer.CustomerSegment();
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			returnObj = resource.updateSegment( segment,  id,  responseFields);
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

	public static void deleteSegment(ApiContext apiContext, Integer id, int expectedCode) throws Exception
	{
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			resource.deleteSegment( id);
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

	public static void removeSegmentAccount(ApiContext apiContext, Integer id, Integer accountId, int expectedCode) throws Exception
	{
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			resource.removeSegmentAccount( id,  accountId);
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



