/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Storefront Categories resource to view the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class CategoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public CategoryResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories( filter,  startIndex,  pageSize,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoriesClient(_dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public com.mozu.api.contracts.productruntime.Category getCategory(Integer categoryId) throws Exception
	{
		return getCategory( categoryId,  null,  null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId,  allowInactive,  responseFields);
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public com.mozu.api.contracts.productruntime.Category getCategory(Integer categoryId, Boolean allowInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Category> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryClient(_dataViewMode,  categoryId,  allowInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getCategoryTree();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree() throws Exception
	{
		return getCategoryTree( null);
	}

	/**
	 * Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getCategoryTree( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryTreeClient(_dataViewMode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



