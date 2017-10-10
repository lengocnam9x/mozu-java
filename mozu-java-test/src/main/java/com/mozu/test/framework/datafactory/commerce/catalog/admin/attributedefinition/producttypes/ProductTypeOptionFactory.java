/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionResource;

/** <summary>
 * Use the Options subresource to define how an option attribute is used for a specific product type. Product attribute definitions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeOptionFactory
{

	public static List<com.mozu.api.contracts.productadmin.AttributeInProductType> getOptions(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeInProductType> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>();
		ProductTypeOptionResource resource = new ProductTypeOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getOptions( productTypeId);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType getOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, int expectedCode) throws Exception
	{
		return getOption(apiContext, dataViewMode,  productTypeId,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType getOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypeOptionResource resource = new ProductTypeOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getOption( productTypeId,  attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType addOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, int expectedCode) throws Exception
	{
		return addOption(apiContext, dataViewMode,  attributeInProductType,  productTypeId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType addOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypeOptionResource resource = new ProductTypeOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addOption( attributeInProductType,  productTypeId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeInProductType updateOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, int expectedCode) throws Exception
	{
		return updateOption(apiContext, dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeInProductType updateOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeInProductType returnObj = new com.mozu.api.contracts.productadmin.AttributeInProductType();
		ProductTypeOptionResource resource = new ProductTypeOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateOption( attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
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

	public static void deleteOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, int expectedCode) throws Exception
	{
		ProductTypeOptionResource resource = new ProductTypeOptionResource(apiContext, dataViewMode);
		try
		{
			resource.deleteOption( productTypeId,  attributeFQN);
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



