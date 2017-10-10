/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Pricing details for a product in a cart or an order, including the original price, discount amount, and final price.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceUnitPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Double extendedAmount;

	public Double getExtendedAmount() {
		return this.extendedAmount;
	}

	public void setExtendedAmount(Double extendedAmount) {
		this.extendedAmount = extendedAmount;
	}

	protected  Double listAmount;

	public Double getListAmount() {
		return this.listAmount;
	}

	public void setListAmount(Double listAmount) {
		this.listAmount = listAmount;
	}

	protected  Double overrideAmount;

	public Double getOverrideAmount() {
		return this.overrideAmount;
	}

	public void setOverrideAmount(Double overrideAmount) {
		this.overrideAmount = overrideAmount;
	}

	protected  Double saleAmount;

	public Double getSaleAmount() {
		return this.saleAmount;
	}

	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}


}
