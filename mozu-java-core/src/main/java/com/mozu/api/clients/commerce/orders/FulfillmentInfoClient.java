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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Fulfillment Information resource to manage shipping or pickup information for orders.
 * </summary>
 */
public class FulfillmentInfoClient {
	
	/**
	 * Retrieves a list of the fulfillment information for the specified order.
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
	 * Retrieves a list of the fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=GetFulfillmentInfoClient( orderId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order's fulfillment information, which might include uncommitted changes.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> getFulfillmentInfoClient(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentInfoUrl.getFulfillmentInfoUrl(draft, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param fulfillmentInfo Array list of fulfillment information associated with an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId) throws Exception
	{
		return setFulFillmentInfoClient( fulfillmentInfo,  orderId,  null,  null,  null);
	}

	/**
	 * Updates one or more properties of fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @param updateMode Specifies whether to set the fulfillment information by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param fulfillmentInfo Array list of fulfillment information associated with an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentInfoUrl.setFulFillmentInfoUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(fulfillmentInfo);
		return mozuClient;

	}

}



