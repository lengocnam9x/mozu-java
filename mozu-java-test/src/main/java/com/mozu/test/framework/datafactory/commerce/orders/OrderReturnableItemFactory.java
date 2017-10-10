/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.orders;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.OrderReturnableItemResource;

/** <summary>
 * Use this subresource to view which order items are eligible for return.
 * </summary>
 */
public class OrderReturnableItemFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection getOrderReturnableItems(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return getOrderReturnableItems(apiContext,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection getOrderReturnableItems(ApiContext apiContext, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection();
		OrderReturnableItemResource resource = new OrderReturnableItemResource(apiContext);
		try
		{
			returnObj = resource.getOrderReturnableItems( orderId,  responseFields);
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



