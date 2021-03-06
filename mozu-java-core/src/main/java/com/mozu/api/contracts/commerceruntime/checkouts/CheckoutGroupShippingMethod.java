/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.checkouts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate;

/**
 *	Mozu.CommerceRuntime.Contracts.Checkouts.CheckoutGroupShippingMethod ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckoutGroupShippingMethod implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The grouping ID that the shipping method applies to.
	 */
	protected  String groupingId;

	public String getGroupingId() {
		return this.groupingId;
	}

	public void setGroupingId(String groupingId) {
		this.groupingId = groupingId;
	}

	/**
	 * The shipping rate applied to the grouping.
	 */
	protected  ShippingRate shippingRate;

	public ShippingRate getShippingRate() {
		return this.shippingRate;
	}

	public void setShippingRate(ShippingRate shippingRate) {
		this.shippingRate = shippingRate;
	}


}
