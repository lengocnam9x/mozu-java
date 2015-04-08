/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PropertyTypeUrl
{

	/**
	 * Get Resource Url for GetPropertyTypes
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyTypesUrl(Integer pageSize, String responseFields, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/?pageSize={pageSize}&startIndex={startIndex}&responseFields={responseFields}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPropertyType
	 * @param propertyTypeName The name of the property type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyTypeUrl(String propertyTypeName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/{propertyTypeName}?responseFields={responseFields}");
		formatter.formatUrl("propertyTypeName", propertyTypeName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePropertyType
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPropertyTypeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePropertyType
	 * @param propertyTypeName The name of the property type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePropertyTypeUrl(String propertyTypeName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/{propertyTypeName}?responseFields={responseFields}");
		formatter.formatUrl("propertyTypeName", propertyTypeName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePropertyType
	 * @param propertyTypeName The name of the property type.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePropertyTypeUrl(String propertyTypeName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/propertytypes/{propertyTypeName}");
		formatter.formatUrl("propertyTypeName", propertyTypeName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

