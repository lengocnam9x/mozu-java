/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.CategoryResource;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryFactory
{

	public static com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getCategories(apiContext, dataViewMode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CategoryPagedCollection returnObj = new com.mozu.api.contracts.productadmin.CategoryPagedCollection();
		CategoryResource resource = new CategoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getCategories( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(ApiContext apiContext, Integer categoryId, int expectedCode) throws Exception
	{
		return getChildCategories(apiContext,  categoryId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(ApiContext apiContext, Integer categoryId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CategoryCollection returnObj = new com.mozu.api.contracts.productadmin.CategoryCollection();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.getChildCategories( categoryId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category getCategory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer categoryId, int expectedCode) throws Exception
	{
		return getCategory(apiContext, dataViewMode,  categoryId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Category getCategory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer categoryId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getCategory( categoryId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category addCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, int expectedCode) throws Exception
	{
		return addCategory(apiContext,  category,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Category addCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, Boolean useProvidedId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.addCategory( category,  incrementSequence,  useProvidedId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.DynamicExpression validateDynamicExpression(ApiContext apiContext, com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, int expectedCode) throws Exception
	{
		return validateDynamicExpression(apiContext,  dynamicExpressionIn,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.DynamicExpression validateDynamicExpression(ApiContext apiContext, com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DynamicExpression returnObj = new com.mozu.api.contracts.productadmin.DynamicExpression();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.validateDynamicExpression( dynamicExpressionIn,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.DynamicExpression validateRealTimeDynamicExpression(ApiContext apiContext, com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, int expectedCode) throws Exception
	{
		return validateRealTimeDynamicExpression(apiContext,  dynamicExpressionIn,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.DynamicExpression validateRealTimeDynamicExpression(ApiContext apiContext, com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.DynamicExpression returnObj = new com.mozu.api.contracts.productadmin.DynamicExpression();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.validateRealTimeDynamicExpression( dynamicExpressionIn,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.Category updateCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, int expectedCode) throws Exception
	{
		return updateCategory(apiContext,  category,  categoryId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Category updateCategory(ApiContext apiContext, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Category returnObj = new com.mozu.api.contracts.productadmin.Category();
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			returnObj = resource.updateCategory( category,  categoryId,  cascadeVisibility,  responseFields);
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

	public static void deleteCategoryById(ApiContext apiContext, Integer categoryId, int expectedCode) throws Exception
	{
		deleteCategoryById(apiContext,  categoryId,  null,  null,  null, expectedCode);
	}

	public static void deleteCategoryById(ApiContext apiContext, Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent, int expectedCode) throws Exception
	{
		CategoryResource resource = new CategoryResource(apiContext);
		try
		{
			resource.deleteCategoryById( categoryId,  cascadeDelete,  forceDelete,  reassignToParent);
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



