/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.admin.LocationTypeResource;

/** <summary>
 * Use the Location Types resource to manage the types of locations your tenant maintains, such as warehouses, physical storefronts, and kiosks.
 * </summary>
 */
public class LocationTypeFactory
{

	public static List<com.mozu.api.contracts.location.LocationType> getLocationTypes(ApiContext apiContext, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.location.LocationType> returnObj = new ArrayList<com.mozu.api.contracts.location.LocationType>();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.getLocationTypes();
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

	public static com.mozu.api.contracts.location.LocationType getLocationType(ApiContext apiContext, String locationTypeCode, int expectedCode) throws Exception
	{
		return getLocationType(apiContext,  locationTypeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationType getLocationType(ApiContext apiContext, String locationTypeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.getLocationType( locationTypeCode,  responseFields);
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

	public static com.mozu.api.contracts.location.LocationType addLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, int expectedCode) throws Exception
	{
		return addLocationType(apiContext,  locationType,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationType addLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.addLocationType( locationType,  responseFields);
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

	public static com.mozu.api.contracts.location.LocationType updateLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, int expectedCode) throws Exception
	{
		return updateLocationType(apiContext,  locationType,  locationTypeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationType updateLocationType(ApiContext apiContext, com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationType returnObj = new com.mozu.api.contracts.location.LocationType();
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			returnObj = resource.updateLocationType( locationType,  locationTypeCode,  responseFields);
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

	public static void deleteLocationType(ApiContext apiContext, String locationTypeCode, int expectedCode) throws Exception
	{
		LocationTypeResource resource = new LocationTypeResource(apiContext);
		try
		{
			resource.deleteLocationType( locationTypeCode);
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



