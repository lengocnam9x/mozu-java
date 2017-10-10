/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.admin.locations.attributedefinition;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.admin.locations.attributedefinition.AttributeResource;

/** <summary>
 * Attributes are used to add custom definitions and characteristics to the following objects:
*  â€” are attributes that define the characteristics of products, enabling you to uniquely describe a product. They consist of options, properties, and extras. Refer to [Product Attributes](https://www.mozu.com/docs/guides/catalog/product-attributes.htm) in the Guides section for more information.

*  â€” are custom attributes that you can apply to customer accounts to add further definition for special uses, such as marketing campaigns, or discounts. Refer to [Customer Attributes](https://www.mozu.com/docs/guides/customers/customers.htm#customer_attributes) in the Guides section for more information.

*  â€” are custom attributes that enable you to uniquely describe an aspect of an order. Depending on the attribute definition, either you or a shopper can enter values for the order attribute. Refer to [Order Attributes](https://www.mozu.com/docs/guides/orders/order-attributes.htm) in the Guides section for more information.

 * </summary>
 */
public class AttributeFactory
{

	public static com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAttributes(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.AttributeCollection returnObj = new com.mozu.api.contracts.core.extensible.AttributeCollection();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> getAttributeVocabularyValues(ApiContext apiContext, String attributeFQN, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValues( attributeFQN);
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

	public static com.mozu.api.contracts.core.extensible.Attribute getAttribute(ApiContext apiContext, String attributeFQN, int expectedCode) throws Exception
	{
		return getAttribute(apiContext,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.extensible.Attribute getAttribute(ApiContext apiContext, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.Attribute returnObj = new com.mozu.api.contracts.core.extensible.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttribute( attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.core.extensible.Attribute createAttribute(ApiContext apiContext, com.mozu.api.contracts.core.extensible.Attribute attribute, int expectedCode) throws Exception
	{
		return createAttribute(apiContext,  attribute,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.extensible.Attribute createAttribute(ApiContext apiContext, com.mozu.api.contracts.core.extensible.Attribute attribute, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.Attribute returnObj = new com.mozu.api.contracts.core.extensible.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.createAttribute( attribute,  responseFields);
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

	public static com.mozu.api.contracts.core.extensible.Attribute updateAttribute(ApiContext apiContext, com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, int expectedCode) throws Exception
	{
		return updateAttribute(apiContext,  attribute,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.extensible.Attribute updateAttribute(ApiContext apiContext, com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.Attribute returnObj = new com.mozu.api.contracts.core.extensible.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.updateAttribute( attribute,  attributeFQN,  responseFields);
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

}



