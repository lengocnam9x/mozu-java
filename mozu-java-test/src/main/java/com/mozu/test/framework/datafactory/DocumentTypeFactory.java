/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.DocumentTypeResource;

/** <summary>
 * The DocumentTypes resource is a part of the Content Service.
 * </summary>
 */
public class DocumentTypeFactory
{

	public static com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getDocumentTypes(apiContext, dataViewMode,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentTypeCollection returnObj = new com.mozu.api.contracts.content.DocumentTypeCollection();
		DocumentTypeResource resource = new DocumentTypeResource(apiContext);
		try
		{
			returnObj = resource.getDocumentTypes(dataViewMode,  pageSize,  startIndex);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.content.DocumentType getDocumentType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentTypeName, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentType returnObj = new com.mozu.api.contracts.content.DocumentType();
		DocumentTypeResource resource = new DocumentTypeResource(apiContext);
		try
		{
			returnObj = resource.getDocumentType(dataViewMode,  documentTypeName);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



