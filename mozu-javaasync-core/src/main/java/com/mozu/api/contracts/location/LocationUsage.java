/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationUsage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<String> locationCodes;
	public List<String> getLocationCodes() {
		return this.locationCodes;
	}
	public void setLocationCodes(List<String> locationCodes) {
		this.locationCodes = locationCodes;
	}

	protected List<String> locationTypeCodes;
	public List<String> getLocationTypeCodes() {
		return this.locationTypeCodes;
	}
	public void setLocationTypeCodes(List<String> locationTypeCodes) {
		this.locationTypeCodes = locationTypeCodes;
	}

	protected  String locationUsageTypeCode;

	public String getLocationUsageTypeCode() {
		return this.locationUsageTypeCode;
	}

	public void setLocationUsageTypeCode(String locationUsageTypeCode) {
		this.locationUsageTypeCode = locationUsageTypeCode;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
