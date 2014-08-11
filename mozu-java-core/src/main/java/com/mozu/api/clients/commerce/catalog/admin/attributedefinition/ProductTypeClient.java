/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeClient {
	
	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient=GetProductTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductTypeCollection productTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductTypeCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> getProductTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductTypesClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient=GetProductTypesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductTypeCollection productTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product type search results by any of its properties. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Name+cont+shoes"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductTypeCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> getProductTypesClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.getProductTypesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductTypeCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=GetProductTypeClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> getProductTypeClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		return getProductTypeClient(dataViewMode,  productTypeId,  null);
	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=GetProductTypeClient(dataViewMode,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> getProductTypeClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.getProductTypeUrl(productTypeId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=AddProductTypeClient( productType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productType Properties of the product type to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> addProductTypeClient(com.mozu.api.contracts.productadmin.ProductType productType) throws Exception
	{
		return addProductTypeClient( productType,  null);
	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=AddProductTypeClient( productType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param productType Properties of the product type to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> addProductTypeClient(com.mozu.api.contracts.productadmin.ProductType productType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.addProductTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productType);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=UpdateProductTypeClient( productType,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to update.
	 * @param dataViewMode DataViewMode
	 * @param productType The details of the product type to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> updateProductTypeClient(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId) throws Exception
	{
		return updateProductTypeClient( productType,  productTypeId,  null);
	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=UpdateProductTypeClient( productType,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to update.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param productType The details of the product type to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> updateProductTypeClient(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.updateProductTypeUrl(productTypeId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productType);
		return mozuClient;

	}

	/**
	 * Deletes the product type by providing the product type ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductTypeClient( productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to delete.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductTypeClient(Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.deleteProductTypeUrl(productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



