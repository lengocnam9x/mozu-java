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
import com.mozu.api.resources.commerce.payments.FraudScreenResponseResource;

/** <summary>
 * 
 * </summary>
 */
public class FraudScreenResponseFactory
{

	public static com.mozu.api.contracts.paymentservice.response.FraudScreenResponse screen(ApiContext apiContext, com.mozu.api.contracts.paymentservice.request.FraudScreenRequest request, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.paymentservice.response.FraudScreenResponse returnObj = new com.mozu.api.contracts.paymentservice.response.FraudScreenResponse();
		FraudScreenResponseResource resource = new FraudScreenResponseResource(apiContext);
		try
		{
			returnObj = resource.screen( request);
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



