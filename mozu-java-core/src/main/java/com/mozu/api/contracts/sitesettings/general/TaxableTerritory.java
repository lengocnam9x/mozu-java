/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the territory which is subject to sales tax.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableTerritory implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	protected  Boolean isShippingTaxable;

	public Boolean getIsShippingTaxable() {
		return this.isShippingTaxable;
	}

	public void setIsShippingTaxable(Boolean isShippingTaxable) {
		this.isShippingTaxable = isShippingTaxable;
	}

	protected  String stateOrProvinceCode;

	public String getStateOrProvinceCode() {
		return this.stateOrProvinceCode;
	}

	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}


}
