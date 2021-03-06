/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.Discount;

/**
 *	The discount currently applied to the cart or order, represented as a negative currency amount to be subtracted from the final price. If multiple discounts are applied to the same order, the Applied Discount displays the most valuable discount for the shopper.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	protected  Double impact;

	public Double getImpact() {
		return this.impact;
	}

	public void setImpact(Double impact) {
		this.impact = impact;
	}

	protected  Discount discount;

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}


}
