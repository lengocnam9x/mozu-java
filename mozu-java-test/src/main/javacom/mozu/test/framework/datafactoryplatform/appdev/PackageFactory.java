/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactoryplatform.appdev;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.appdev.PackageResource;

/** <summary>
 * This resource is not public.
 * </summary>
 */
public class PackageFactory
{

	public static com.mozu.api.contracts.appdev.PackageSummaryCollection getAllPackages(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAllPackages(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.PackageSummaryCollection getAllPackages(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.PackageSummaryCollection returnObj = new com.mozu.api.contracts.appdev.PackageSummaryCollection();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getAllPackages( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.appdev.Package getPackage(ApiContext apiContext, String applicationKey, int expectedCode) throws Exception
	{
		return getPackage(apiContext,  applicationKey,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.Package getPackage(ApiContext apiContext, String applicationKey, Boolean includeChildren, Boolean skipDevAccountCheck, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.Package returnObj = new com.mozu.api.contracts.appdev.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getPackage( applicationKey,  includeChildren,  skipDevAccountCheck,  responseFields);
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

	public static com.mozu.api.contracts.appdev.PackageCollection getPackages(ApiContext apiContext, String applicationKey, int expectedCode) throws Exception
	{
		return getPackages(apiContext,  applicationKey,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.PackageCollection getPackages(ApiContext apiContext, String applicationKey, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.PackageCollection returnObj = new com.mozu.api.contracts.appdev.PackageCollection();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getPackages( applicationKey,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static List<com.mozu.api.contracts.appdev.ApplicationSummary> getApplicationSummaryChildren(ApiContext apiContext, String appId, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.appdev.ApplicationSummary> returnObj = new ArrayList<com.mozu.api.contracts.appdev.ApplicationSummary>();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getApplicationSummaryChildren( appId);
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

	public static com.mozu.api.contracts.appdev.ApplicationSummaryCollection getApplicationSummaryParents(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getApplicationSummaryParents(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.ApplicationSummaryCollection getApplicationSummaryParents(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.ApplicationSummaryCollection returnObj = new com.mozu.api.contracts.appdev.ApplicationSummaryCollection();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.getApplicationSummaryParents( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.appdev.Package clonePackage(ApiContext apiContext, String applicationKey, String packageName, int expectedCode) throws Exception
	{
		return clonePackage(apiContext,  applicationKey,  packageName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.Package clonePackage(ApiContext apiContext, String applicationKey, String packageName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.Package returnObj = new com.mozu.api.contracts.appdev.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.clonePackage( applicationKey,  packageName,  responseFields);
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

	public static com.mozu.api.contracts.appdev.Package createNewCorePackage(ApiContext apiContext, com.mozu.api.contracts.appdev.PackageRequest packageRequest, int expectedCode) throws Exception
	{
		return createNewCorePackage(apiContext,  packageRequest,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.Package createNewCorePackage(ApiContext apiContext, com.mozu.api.contracts.appdev.PackageRequest packageRequest, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.Package returnObj = new com.mozu.api.contracts.appdev.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.createNewCorePackage( packageRequest,  responseFields);
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

	public static com.mozu.api.contracts.appdev.Package createPackage(ApiContext apiContext, com.mozu.api.contracts.appdev.Package pkg, int expectedCode) throws Exception
	{
		return createPackage(apiContext,  pkg,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.Package createPackage(ApiContext apiContext, com.mozu.api.contracts.appdev.Package pkg, Integer projectId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.Package returnObj = new com.mozu.api.contracts.appdev.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.createPackage( pkg,  projectId,  responseFields);
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

	public static com.mozu.api.contracts.appdev.Package updatePackage(ApiContext apiContext, com.mozu.api.contracts.appdev.Package pkg, String applicationKey, int expectedCode) throws Exception
	{
		return updatePackage(apiContext,  pkg,  applicationKey,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.Package updatePackage(ApiContext apiContext, com.mozu.api.contracts.appdev.Package pkg, String applicationKey, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.Package returnObj = new com.mozu.api.contracts.appdev.Package();
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			returnObj = resource.updatePackage( pkg,  applicationKey,  responseFields);
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

	public static void deletePackage(ApiContext apiContext, String applicationKey, int expectedCode) throws Exception
	{
		PackageResource resource = new PackageResource(apiContext);
		try
		{
			resource.deletePackage( applicationKey);
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



