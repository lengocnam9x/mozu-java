/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CategoryUrl
{

	/**
	 * Get Resource Url for GetCategories
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoriesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetChildCategories
	 * @param categoryId Unique identifier of the category for which to retrieve subcategories.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getChildCategoriesUrl(Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}/children?responseFields={responseFields}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCategory
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCategoryUrl(Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}?responseFields={responseFields}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCategory
	 * @param incrementSequence 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addCategoryUrl(Boolean incrementSequence, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/?incrementSequence={incrementSequence}&responseFields={responseFields}");
		formatter.formatUrl("incrementSequence", incrementSequence);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCategory
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCategoryUrl(Boolean cascadeVisibility, Integer categoryId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}?cascadeVisibility={cascadeVisibility}&responseFields={responseFields}");
		formatter.formatUrl("cascadeVisibility", cascadeVisibility);
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCategoryById
	 * @param cascadeDelete If true, also delete all subcategories associated with the specified category.
	 * @param categoryId Unique identifier of the category to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCategoryByIdUrl(Boolean cascadeDelete, Integer categoryId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/categories/{categoryId}/?cascadeDelete={cascadeDelete}");
		formatter.formatUrl("cascadeDelete", cascadeDelete);
		formatter.formatUrl("categoryId", categoryId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

