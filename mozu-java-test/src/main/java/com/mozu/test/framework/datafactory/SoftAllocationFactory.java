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
import com.mozu.api.resources.commerce.catalog.admin.SoftAllocationResource;

/** <summary>
 * Allows you to temporarily hold a product from inventory while a shopper is filling out payment information. You create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class SoftAllocationFactory
{

	public static com.mozu.api.contracts.productadmin.SoftAllocationCollection getSoftAllocations(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSoftAllocations(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.SoftAllocationCollection getSoftAllocations(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SoftAllocationCollection returnObj = new com.mozu.api.contracts.productadmin.SoftAllocationCollection();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.getSoftAllocations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.SoftAllocation getSoftAllocation(ApiContext apiContext, Integer softAllocationId, int expectedCode) throws Exception
	{
		return getSoftAllocation(apiContext,  softAllocationId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.SoftAllocation getSoftAllocation(ApiContext apiContext, Integer softAllocationId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SoftAllocation returnObj = new com.mozu.api.contracts.productadmin.SoftAllocation();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.getSoftAllocation( softAllocationId,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.SoftAllocation> addSoftAllocations(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocationsIn, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.SoftAllocation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.addSoftAllocations( softAllocationsIn);
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

	public static List<com.mozu.api.contracts.productadmin.ProductReservation> convertToProductReservation(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductReservation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.convertToProductReservation( softAllocations);
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

	public static List<com.mozu.api.contracts.productadmin.SoftAllocation> renewSoftAllocations(ApiContext apiContext, com.mozu.api.contracts.productadmin.SoftAllocationRenew softAllocationRenew, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.SoftAllocation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.renewSoftAllocations( softAllocationRenew);
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

	public static List<com.mozu.api.contracts.productadmin.SoftAllocation> updateSoftAllocations(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.SoftAllocation> softAllocations, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.SoftAllocation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.SoftAllocation>();
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			returnObj = resource.updateSoftAllocations( softAllocations);
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

	public static void deleteSoftAllocation(ApiContext apiContext, Integer softAllocationId, int expectedCode) throws Exception
	{
		SoftAllocationResource resource = new SoftAllocationResource(apiContext);
		try
		{
			resource.deleteSoftAllocation( softAllocationId);
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



