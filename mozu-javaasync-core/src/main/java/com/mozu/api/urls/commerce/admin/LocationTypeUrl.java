/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.admin;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class LocationTypeUrl
{

	/**
	 * Get Resource Url for GetLocationTypes
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationTypesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationtypes/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationType
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationTypeUrl(String locationTypeCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationtypes/{locationTypeCode}?responseFields={responseFields}");
		formatter.formatUrl("locationTypeCode", locationTypeCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddLocationType
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addLocationTypeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationtypes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocationType
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocationTypeUrl(String locationTypeCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationtypes/{locationTypeCode}?responseFields={responseFields}");
		formatter.formatUrl("locationTypeCode", locationTypeCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteLocationType
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteLocationTypeUrl(String locationTypeCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationtypes/{locationTypeCode}");
		formatter.formatUrl("locationTypeCode", locationTypeCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

