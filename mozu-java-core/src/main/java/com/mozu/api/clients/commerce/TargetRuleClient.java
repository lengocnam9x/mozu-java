/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the TargetRules resource to manage your target rules for products and zones. For example, you can set specific rules that dictate shipping options for specific products.
 * </summary>
 */
public class TargetRuleClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> mozuClient=GetTargetRulesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRuleCollection targetRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> getTargetRulesClient() throws Exception
	{
		return getTargetRulesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> mozuClient=GetTargetRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRuleCollection targetRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> getTargetRulesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.getTargetRulesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.TargetRuleCollection.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=GetTargetRuleClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> getTargetRuleClient(String code) throws Exception
	{
		return getTargetRuleClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=GetTargetRuleClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> getTargetRuleClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.getTargetRuleUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.TargetRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=CreateTargetRuleClient( targetRule);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> createTargetRuleClient(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		return createTargetRuleClient( targetRule,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=CreateTargetRuleClient( targetRule,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> createTargetRuleClient(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.createTargetRuleUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.TargetRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(targetRule);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ValidateTargetRuleClient( targetRule);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the target rule you want to validate.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient validateTargetRuleClient(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.validateTargetRuleUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(targetRule);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=UpdateTargetRuleClient( targetRule,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> updateTargetRuleClient(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code) throws Exception
	{
		return updateTargetRuleClient( targetRule,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient=UpdateTargetRuleClient( targetRule,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TargetRule targetRule = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.TargetRule>
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> updateTargetRuleClient(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.updateTargetRuleUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.TargetRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(targetRule);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteTargetRuleClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteTargetRuleClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.TargetRuleUrl.deleteTargetRuleUrl(code);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



