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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Attributes are used to add custom definitions and characteristics to the following objects:
*  â€” are attributes that define the characteristics of products, enabling you to uniquely describe a product. They consist of options, properties, and extras. Refer to [Product Attributes](https://www.mozu.com/docs/guides/catalog/product-attributes.htm) in the Guides section for more information.

*  â€” are custom attributes that you can apply to customer accounts to add further definition for special uses, such as marketing campaigns, or discounts. Refer to [Customer Attributes](https://www.mozu.com/docs/guides/customers/customers.htm#customer_attributes) in the Guides section for more information.

*  â€” are custom attributes that enable you to uniquely describe an aspect of an order. Depending on the attribute definition, either you or a shopper can enter values for the order attribute. Refer to [Order Attributes](https://www.mozu.com/docs/guides/orders/order-attributes.htm) in the Guides section for more information.

 * </summary>
 */
public class AttributeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN) throws Exception
	{
		return getAttributeClient( attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributeUrl(attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		return addAttributeClient( attribute,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.addAttributeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttributeClient( attribute,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.updateAttributeUrl(attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAttributeClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.deleteAttributeUrl(attributeFQN);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



