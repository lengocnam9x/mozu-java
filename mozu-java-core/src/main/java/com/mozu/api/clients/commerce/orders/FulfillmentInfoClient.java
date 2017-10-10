/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Use the Fulfillment Information resource to manage shipping or pickup information for orders.
 * </summary>
 */
public class FulfillmentInfoClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=GetFulfillmentInfoClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> getFulfillmentInfoClient(String orderId) throws Exception
	{
		return getFulfillmentInfoClient( orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=GetFulfillmentInfoClient( orderId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> getFulfillmentInfoClient(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentInfoUrl.getFulfillmentInfoUrl(draft, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param fulfillmentInfo Properties of the information needed to fulfill an order, whether via in-store pickup or direct shipping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId) throws Exception
	{
		return setFulFillmentInfoClient( fulfillmentInfo,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param fulfillmentInfo Properties of the information needed to fulfill an order, whether via in-store pickup or direct shipping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentInfoUrl.setFulFillmentInfoUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(fulfillmentInfo);
		return mozuClient;

	}

}



