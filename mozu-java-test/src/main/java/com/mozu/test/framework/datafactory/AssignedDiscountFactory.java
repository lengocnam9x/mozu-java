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
import com.mozu.api.resources.commerce.catalog.admin.couponsets.AssignedDiscountResource;

/** <summary>
 * 
 * </summary>
 */
public class AssignedDiscountFactory
{

	public static List<com.mozu.api.contracts.productadmin.AssignedDiscount> getAssignedDiscounts(ApiContext apiContext, String couponSetCode, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AssignedDiscount> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AssignedDiscount>();
		AssignedDiscountResource resource = new AssignedDiscountResource(apiContext);
		try
		{
			returnObj = resource.getAssignedDiscounts( couponSetCode);
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

	public static void assignDiscount(ApiContext apiContext, com.mozu.api.contracts.productadmin.AssignedDiscount assignedDiscount, String couponSetCode, int expectedCode) throws Exception
	{
		AssignedDiscountResource resource = new AssignedDiscountResource(apiContext);
		try
		{
			resource.assignDiscount( assignedDiscount,  couponSetCode);
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

	public static void unAssignDiscount(ApiContext apiContext, String couponSetCode, Integer discountId, int expectedCode) throws Exception
	{
		AssignedDiscountResource resource = new AssignedDiscountResource(apiContext);
		try
		{
			resource.unAssignDiscount( couponSetCode,  discountId);
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



