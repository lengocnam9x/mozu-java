/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.AppDev.Contracts.PackageRequest ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PackageRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.AppDev.Contracts.PackageRequest appKey ApiTypeMember DOCUMENT_HERE
	 */
	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Mozu.AppDev.Contracts.PackageRequest parentThemeAppKey ApiTypeMember DOCUMENT_HERE
	 */
	protected  String parentThemeAppKey;

	public String getParentThemeAppKey() {
		return this.parentThemeAppKey;
	}

	public void setParentThemeAppKey(String parentThemeAppKey) {
		this.parentThemeAppKey = parentThemeAppKey;
	}


}
