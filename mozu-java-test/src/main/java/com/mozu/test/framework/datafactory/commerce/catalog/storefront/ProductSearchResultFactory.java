/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.storefront;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.ProductSearchResultResource;

/** <summary>
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultFactory
{

	public static com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor getRandomAccessCursor(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getRandomAccessCursor(apiContext,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor getRandomAccessCursor(ApiContext apiContext, String query, String filter, Integer pageSize, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor returnObj = new com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor();
		ProductSearchResultResource resource = new ProductSearchResultResource(apiContext);
		try
		{
			returnObj = resource.getRandomAccessCursor( query,  filter,  pageSize,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.ProductSearchResult search(ApiContext apiContext, int expectedCode) throws Exception
	{
		return search(apiContext,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ProductSearchResult search(ApiContext apiContext, String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String facetTemplateExclude, String facetPrefix, String responseOptions, String cursorMark, String facetValueSort, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductSearchResult returnObj = new com.mozu.api.contracts.productruntime.ProductSearchResult();
		ProductSearchResultResource resource = new ProductSearchResultResource(apiContext);
		try
		{
			returnObj = resource.search( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  facetValueSort,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest(ApiContext apiContext, int expectedCode) throws Exception
	{
		return suggest(apiContext,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest(ApiContext apiContext, String query, String groups, Integer pageSize, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.SearchSuggestionResult returnObj = new com.mozu.api.contracts.productruntime.SearchSuggestionResult();
		ProductSearchResultResource resource = new ProductSearchResultResource(apiContext);
		try
		{
			returnObj = resource.suggest( query,  groups,  pageSize,  responseFields);
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



