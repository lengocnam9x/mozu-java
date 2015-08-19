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
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.DiscountResource;

/** <summary>
 * Define and manage discounts to apply to products, product categories, or orders. The discounts can be a specified amount off the price, percentage off the price, or for free shipping. Create a coupon code that shoppers can use to redeem the discount.
 * </summary>
 */
public class DiscountFactory
{

	public static com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getDiscounts(apiContext, dataViewMode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DiscountCollection returnObj = new com.mozu.api.contracts.productadmin.DiscountCollection();
		DiscountResource resource = new DiscountResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDiscounts( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.DiscountLocalizedContent getDiscountContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, int expectedCode) throws Exception
	{
		return getDiscountContent(apiContext, dataViewMode,  discountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.DiscountLocalizedContent getDiscountContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DiscountLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.DiscountLocalizedContent();
		DiscountResource resource = new DiscountResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDiscountContent( discountId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Discount getDiscount(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, int expectedCode) throws Exception
	{
		return getDiscount(apiContext, dataViewMode,  discountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Discount getDiscount(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Discount returnObj = new com.mozu.api.contracts.productadmin.Discount();
		DiscountResource resource = new DiscountResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDiscount( discountId,  responseFields);
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

	public static String generateRandomCoupon(ApiContext apiContext, int expectedCode) throws Exception
	{
		return generateRandomCoupon(apiContext,  null, expectedCode);
	}

	public static String generateRandomCoupon(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		String returnObj = new String();
		DiscountResource resource = new DiscountResource(apiContext);
		try
		{
			returnObj = resource.generateRandomCoupon( responseFields);
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

	public static com.mozu.api.contracts.productadmin.Discount createDiscount(ApiContext apiContext, com.mozu.api.contracts.productadmin.Discount discount, int expectedCode) throws Exception
	{
		return createDiscount(apiContext,  discount,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Discount createDiscount(ApiContext apiContext, com.mozu.api.contracts.productadmin.Discount discount, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Discount returnObj = new com.mozu.api.contracts.productadmin.Discount();
		DiscountResource resource = new DiscountResource(apiContext);
		try
		{
			returnObj = resource.createDiscount( discount,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.DiscountLocalizedContent updateDiscountContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId, int expectedCode) throws Exception
	{
		return updateDiscountContent(apiContext,  content,  discountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.DiscountLocalizedContent updateDiscountContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DiscountLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.DiscountLocalizedContent();
		DiscountResource resource = new DiscountResource(apiContext);
		try
		{
			returnObj = resource.updateDiscountContent( content,  discountId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Discount updateDiscount(ApiContext apiContext, com.mozu.api.contracts.productadmin.Discount discount, Integer discountId, int expectedCode) throws Exception
	{
		return updateDiscount(apiContext,  discount,  discountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Discount updateDiscount(ApiContext apiContext, com.mozu.api.contracts.productadmin.Discount discount, Integer discountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Discount returnObj = new com.mozu.api.contracts.productadmin.Discount();
		DiscountResource resource = new DiscountResource(apiContext);
		try
		{
			returnObj = resource.updateDiscount( discount,  discountId,  responseFields);
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

	public static void deleteDiscount(ApiContext apiContext, Integer discountId, int expectedCode) throws Exception
	{
		DiscountResource resource = new DiscountResource(apiContext);
		try
		{
			resource.deleteDiscount( discountId);
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



