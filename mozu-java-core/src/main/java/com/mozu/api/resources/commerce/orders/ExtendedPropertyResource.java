/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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

/** <summary>
 * Use the Extended Properties resource to store tracking strings for your orders. Extended properties can help you track affiliate sources.
 * </summary>
 */
public class ExtendedPropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ExtendedPropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId) throws Exception
	{
		return getExtendedProperties( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId,  draft);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId, Boolean draft) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.getExtendedPropertiesClient( orderId,  draft);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties The details of the extended property.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return addExtendedProperties( extendedProperties,  orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties The details of the extended property.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key);
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key) throws Exception
	{
		return updateExtendedProperty( extendedProperty,  orderId,  key,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates an extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, String updateMode, String version, Boolean upsert, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return updateExtendedProperties( extendedProperties,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId,  updateMode,  version,  upsert);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates the extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, Boolean upsert) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version,  upsert);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key);
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key) throws Exception
	{
		deleteExtendedProperty( orderId,  key,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key,  updateMode,  version);
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertyClient( orderId,  key,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param keys The extended property keys.
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId) throws Exception
	{
		deleteExtendedProperties( keys,  orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param keys The extended property keys.
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertiesClient( keys,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



