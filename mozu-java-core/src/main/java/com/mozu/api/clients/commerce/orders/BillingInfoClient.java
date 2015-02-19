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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Use the Billing Info subresource to manage the billing information stored for an order.
 * </summary>
 */
public class BillingInfoClient {
	
	/**
	 * Retrieves the billing information associated with an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient=GetBillingInfoClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BillingInfo billingInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.BillingInfo>
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> getBillingInfoClient(String orderId) throws Exception
	{
		return getBillingInfoClient( orderId,  null,  null);
	}

	/**
	 * Retrieves the billing information associated with an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient=GetBillingInfoClient( orderId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BillingInfo billingInfo = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.BillingInfo>
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> getBillingInfoClient(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.BillingInfoUrl.getBillingInfoUrl(draft, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.BillingInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates the billing information supplied for an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient=SetBillingInfoClient( billingInfo,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BillingInfo billingInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.BillingInfo>
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> setBillingInfoClient(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId) throws Exception
	{
		return setBillingInfoClient( billingInfo,  orderId,  null,  null,  null);
	}

	/**
	 * Updates the billing information supplied for an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient=SetBillingInfoClient( billingInfo,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BillingInfo billingInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.BillingInfo>
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> setBillingInfoClient(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.BillingInfoUrl.setBillingInfoUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.BillingInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(billingInfo);
		return mozuClient;

	}

}



