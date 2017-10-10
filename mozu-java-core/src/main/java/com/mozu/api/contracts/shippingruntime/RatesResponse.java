/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingruntime.CarrierRatesResponse;

/**
 *	Properties of the calculated shipping rate based on the information supplied in the request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatesResponse implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Resolved Shipping Zone Code. This value can be null if the tenant/site does not have shipping zones defined or there are no matching shipping zones for the request (e.g. the only zone defined is "UNITED-STATES" and the destination address of the rate request is in Canada)
	 */
	protected  String resolvedShippingZoneCode;

	public String getResolvedShippingZoneCode() {
		return this.resolvedShippingZoneCode;
	}

	public void setResolvedShippingZoneCode(String resolvedShippingZoneCode) {
		this.resolvedShippingZoneCode = resolvedShippingZoneCode;
	}

	/**
	 * A code denoting a zone for shipping rates. Zip and postal codes are associated to these zones, determining set rates and costs for shipping origin and destination points.
	 */
	protected List<String> shippingZoneCodes;
	public List<String> getShippingZoneCodes() {
		return this.shippingZoneCodes;
	}
	public void setShippingZoneCodes(List<String> shippingZoneCodes) {
		this.shippingZoneCodes = shippingZoneCodes;
	}

	protected List<CarrierRatesResponse> rates;
	public List<CarrierRatesResponse> getRates() {
		return this.rates;
	}
	public void setRates(List<CarrierRatesResponse> rates) {
		this.rates = rates;
	}


}
