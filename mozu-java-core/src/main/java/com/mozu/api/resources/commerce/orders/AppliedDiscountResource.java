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
 * Use this subresource to apply coupons to or remove coupons from an order based on a supplied coupon code.
 * </summary>
 */
public class AppliedDiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AppliedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.applyCoupon( orderId,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String orderId, String couponCode) throws Exception
	{
		return applyCoupon( orderId,  couponCode,  null,  null,  null);
	}

	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.applyCoupon( orderId,  couponCode,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to apply the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String orderId, String couponCode, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.applyCouponClient( orderId,  couponCode,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupon( orderId,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order with the coupon to remove.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String orderId, String couponCode) throws Exception
	{
		return removeCoupon( orderId,  couponCode,  null,  null);
	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupon( orderId,  couponCode,  updateMode,  version);
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order with the coupon to remove.
	 * @param updateMode Specifies whether to remove the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String orderId, String couponCode, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponClient( orderId,  couponCode,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupons( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the coupons to remove.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId) throws Exception
	{
		return removeCoupons( orderId,  null,  null);
	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Order order = applieddiscount.removeCoupons( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the coupons to remove.
	 * @param updateMode Specifies whether to remove coupons by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponsClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



