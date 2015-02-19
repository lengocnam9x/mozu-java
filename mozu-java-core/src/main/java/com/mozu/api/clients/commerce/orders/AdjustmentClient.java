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
 * Use this subresource to manage ad-hoc order level price adjustments.
 * </summary>
 */
public class AdjustmentClient {
	
	/**
	 * Applies a shipping adjustment to the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyShippingAdjustmentClient( adjustment,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyShippingAdjustmentClient(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyShippingAdjustmentClient( adjustment,  orderId,  null,  null,  null);
	}

	/**
	 * Applies a shipping adjustment to the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyShippingAdjustmentClient( adjustment,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyShippingAdjustmentClient(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AdjustmentUrl.applyShippingAdjustmentUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(adjustment);
		return mozuClient;

	}

	/**
	 * Applies a price adjustment to the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyAdjustmentClient( adjustment,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyAdjustmentClient(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyAdjustmentClient( adjustment,  orderId,  null,  null,  null);
	}

	/**
	 * Applies a price adjustment to the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyAdjustmentClient( adjustment,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyAdjustmentClient(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AdjustmentUrl.applyAdjustmentUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(adjustment);
		return mozuClient;

	}

	/**
	 * Removes a shipping adjustment previously applied to an order or draft.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveShippingAdjustmentClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeShippingAdjustmentClient(String orderId) throws Exception
	{
		return removeShippingAdjustmentClient( orderId,  null,  null);
	}

	/**
	 * Removes a shipping adjustment previously applied to an order or draft.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveShippingAdjustmentClient( orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeShippingAdjustmentClient(String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AdjustmentUrl.removeShippingAdjustmentUrl(orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes a price adjustment from the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveAdjustmentClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeAdjustmentClient(String orderId) throws Exception
	{
		return removeAdjustmentClient( orderId,  null,  null);
	}

	/**
	 * Removes a price adjustment from the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveAdjustmentClient( orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeAdjustmentClient(String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AdjustmentUrl.removeAdjustmentUrl(orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



