/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.pricingruntime.Discount;

/**
 *	The discount applied to the line item.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedLineItemProductDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies whether the line item discount applies to items that are on sale.
	 */
	protected  Boolean appliesToSalePrice;

	public Boolean getAppliesToSalePrice() {
		return this.appliesToSalePrice;
	}

	public void setAppliesToSalePrice(Boolean appliesToSalePrice) {
		this.appliesToSalePrice = appliesToSalePrice;
	}

	/**
	 * The coupon code that a shopper uses to redeem an associated discount  on a purchase. This is also the unique identifier of the coupon itself.
	 */
	protected  String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * The unique identifier of the coupon set for the discount applied to the line item.
	 */
	protected  Integer couponSetId;

	public Integer getCouponSetId() {
		return this.couponSetId;
	}

	public void setCouponSetId(Integer couponSetId) {
		this.couponSetId = couponSetId;
	}

	/**
	 * The value of the discount applied to the cart or order, represented as a negative currency amount to apply to the original price.
	 */
	protected  Double impact;

	public Double getImpact() {
		return this.impact;
	}

	public void setImpact(Double impact) {
		this.impact = impact;
	}

	/**
	 * The impact of a discount for each discount quantity.
	 */
	protected  Double impactPerUnit;

	public Double getImpactPerUnit() {
		return this.impactPerUnit;
	}

	public void setImpactPerUnit(Double impactPerUnit) {
		this.impactPerUnit = impactPerUnit;
	}

	/**
	 * Specifies whether to force the discount to apply to the line item.
	 */
	protected  Boolean isForced;

	public Boolean getIsForced() {
		return this.isForced;
	}

	public void setIsForced(Boolean isForced) {
		this.isForced = isForced;
	}

	/**
	 * The specified quantity of objects and items. This property is used for numerous object types including products, options, components within a product bundle, cart and order items, returned items, shipping line items, items in a digital product. and items associated with types and reservations.
	 */
	protected  Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Name of the discount added and applied to a shopping cart and order for a shopper's purchase.
	 */
	protected  Discount discount;

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}


}
