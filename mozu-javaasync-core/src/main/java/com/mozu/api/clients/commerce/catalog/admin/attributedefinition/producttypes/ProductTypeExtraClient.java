/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Extras subresource to define how a product attribute classified as an "extra" is used for a specific product type. Product attribute defintions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeExtraClient {
	
	/**
	 * Retrieves a list of extra attributes defined for the specified product type.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetExtrasClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> getExtrasClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtrasUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of an extra attribute definition for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetExtraClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getExtraClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		return getExtraClient(dataViewMode,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an extra attribute definition for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetExtraClient(dataViewMode,  productTypeId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getExtraClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtraUrl(attributeFQN, productTypeId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Assigns a defined extra attribute to the product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddExtraClient(dataViewMode,  attributeInProductType,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		return addExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  null);
	}

	/**
	 * Assigns a defined extra attribute to the product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.addExtraUrl(productTypeId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Update the definition of an extra attribute for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		return updateExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * Update the definition of an extra attribute for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.updateExtraUrl(attributeFQN, productTypeId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Removes an extra attribute definition from the specified product type.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtraClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtraClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.deleteExtraUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}


