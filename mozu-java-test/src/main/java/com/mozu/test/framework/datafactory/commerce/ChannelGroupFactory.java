/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.ChannelGroupResource;

/** <summary>
 * Use the Channel Groups resource to manage groups of channels with common information.
 * </summary>
 */
public class ChannelGroupFactory
{

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getChannelGroups(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection returnObj = new com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection();
		ChannelGroupResource resource = new ChannelGroupResource(apiContext);
		try
		{
			returnObj = resource.getChannelGroups( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup getChannelGroup(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getChannelGroup(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup getChannelGroup(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.ChannelGroup returnObj = new com.mozu.api.contracts.commerceruntime.channels.ChannelGroup();
		ChannelGroupResource resource = new ChannelGroupResource(apiContext);
		try
		{
			returnObj = resource.getChannelGroup( code,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup createChannelGroup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, int expectedCode) throws Exception
	{
		return createChannelGroup(apiContext,  channelGroup,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup createChannelGroup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.ChannelGroup returnObj = new com.mozu.api.contracts.commerceruntime.channels.ChannelGroup();
		ChannelGroupResource resource = new ChannelGroupResource(apiContext);
		try
		{
			returnObj = resource.createChannelGroup( channelGroup,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup updateChannelGroup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, int expectedCode) throws Exception
	{
		return updateChannelGroup(apiContext,  channelGroup,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelGroup updateChannelGroup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.ChannelGroup returnObj = new com.mozu.api.contracts.commerceruntime.channels.ChannelGroup();
		ChannelGroupResource resource = new ChannelGroupResource(apiContext);
		try
		{
			returnObj = resource.updateChannelGroup( channelGroup,  code,  responseFields);
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

	public static void deleteChannelGroup(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		ChannelGroupResource resource = new ChannelGroupResource(apiContext);
		try
		{
			resource.deleteChannelGroup( code);
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



