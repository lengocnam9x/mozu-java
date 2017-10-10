/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient=GetRandomAccessCursorClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchRandomAccessCursor productSearchRandomAccessCursor = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> getRandomAccessCursorClient() throws Exception
	{
		return getRandomAccessCursorClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient=GetRandomAccessCursorClient( query,  filter,  pageSize,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchRandomAccessCursor productSearchRandomAccessCursor = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> getRandomAccessCursorClient(String query, String filter, Integer pageSize, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.getRandomAccessCursorUrl(filter, pageSize, query, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient() throws Exception
	{
		return searchClient( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  facetValueSort,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @param cursorMark In your first deep paged request, set this parameter to . Then, in all subsequent requests, set this parameter to the subsequent values of  that's returned in each response to continue paging through the results. Continue this pattern until  is null, which signifies the end of the paged results.
	 * @param enableSearchTuningRules Enables search tuning rules on your site.
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetPrefix Use this parameter to filter facet values that are returned by an associated search result by a prefix.For example, to filter on colors that start with b, such as blue, black, or brown you can specify the following:
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateExclude A comma-separated list of the facets to exclude from the facetTemplate.
        
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param facetValueSort Use this parameter to specify facet sorting outside the predefined facet definitions (which require a category). The most common options are:
*  (default)â€”Sorts by product count (highest count first).

* â€”Sorts by lexicographic order. In most cases, this means alphabetical order.
The following code demonstrates an example of  sort:
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions Options you can specify for the response. This parameter is null by default.You can primarily use this parameter to return volume price band information in product details, which you can then display on category pages and search results depanding on your theme configuration. To return volume price band information, set this parameter to .
	 * @param searchSettings The settings to control product search and indexing behavior.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleContext The category ID that the search tuning rule applies to.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String facetTemplateExclude, String facetPrefix, String responseOptions, String cursorMark, String facetValueSort, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.searchUrl(cursorMark, enableSearchTuningRules, facet, facetFieldRangeQuery, facetHierDepth, facetHierPrefix, facetHierValue, facetPageSize, facetPrefix, facetSettings, facetStartIndex, facetTemplate, facetTemplateExclude, facetTemplateSubset, facetValueFilter, facetValueSort, filter, pageSize, query, responseFields, responseOptions, searchSettings, searchTuningRuleCode, searchTuningRuleContext, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient() throws Exception
	{
		return suggestClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient( query,  groups,  pageSize,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @param groups Specifies the group that you want this operation to return in the response. This parameter accepts one or more values, separated by comma.For example, if you set this parameter to , then this operation returns a  object that contains suggestions for products that match the user entered characters in the search field.The valid values for this parameter are the following:
*  â€” Indicates that products should be matched against and returned in the response. The search  value is compared against product name and code. The response contains a  with a name of  and a collection of . Each collection item has a  of Product and contains a  equal to a complete product object.

*  â€” Indicates that categories should be matched against and returned in the response. The search  value is compared to category name.  The response contains a  with a name of  and a collection of . Each collection item has a  of Category and contains a  equal to a complete category object.

*  â€” Indicates that previously used search terms (keywords) should be matched against and returned in the response, sorted by frequency of use. Keep in mind that it is not currently possible to edit or remove search terms that may be considered undesirable via the  API. The response contains a  with a name of  and a collection of . Each collection item has a  of Term and contains a  equal to a string value of the matched search term.
The default value is ; however, the  Core Theme only integrates  and ignores the  group.This operation only returns data that is then made available to your theme. If you set this paramter to multiple values,  returns multiple  in the response. Depending on your requirements, you can then customize your theme to display the groups together or as separate lists in the displayed search suggestions.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient(String query, String groups, Integer pageSize, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.suggestUrl(groups, pageSize, query, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.SearchSuggestionResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



