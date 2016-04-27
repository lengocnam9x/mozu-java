/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Cart Coupons subresource to apply a coupon to a defined cart or remove a coupon from a cart. When the shopper proceeds to checkout, the coupons applied to the cart apply to the order.
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
	 * Applies a defined coupon to the cart specified in the request.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.applyCoupon( cartId,  couponCode);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart applyCoupon(String cartId, String couponCode) throws Exception
	{
		return applyCoupon( cartId,  couponCode,  null);
	}

	/**
	 * Applies a defined coupon to the cart specified in the request.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.applyCoupon( cartId,  couponCode,  responseFields);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart applyCoupon(String cartId, String couponCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.applyCouponClient( cartId,  couponCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all coupons from the cart specified in the request.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.removeCoupons( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupons(String cartId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.removeCouponsClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes an applied coupon from the cart specified in the request.
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.removeCoupon( cartId,  couponCode);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupon(String cartId, String couponCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.removeCouponClient( cartId,  couponCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



