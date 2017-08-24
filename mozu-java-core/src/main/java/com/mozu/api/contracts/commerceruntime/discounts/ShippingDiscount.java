/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;

/**
 *	Properties of a discount that can apply to shipping an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Carrier-supplied code that represents the shipping method service type associated with the shipping discount.
	 */
	protected  String methodCode;

	public String getMethodCode() {
		return this.methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	/**
	 * Properties of the shipping discount.
	 */
	protected  AppliedDiscount discount;

	public AppliedDiscount getDiscount() {
		return this.discount;
	}

	public void setDiscount(AppliedDiscount discount) {
		this.discount = discount;
	}


}
