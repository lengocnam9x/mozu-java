/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ShippingUrl
{

	/**
	 * Get Resource Url for GetMultiRates
	 * @param includeRawResponse 
	 * @return   String Resource Url
	 */
	public static MozuUrl getMultiRatesUrl(Boolean includeRawResponse)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/shipping/request-multi-rates");
		formatter.formatUrl("includeRawResponse", includeRawResponse);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetRates
	 * @param includeRawResponse 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getRatesUrl(Boolean includeRawResponse, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/shipping/request-rates?responseFields={responseFields}");
		formatter.formatUrl("includeRawResponse", includeRawResponse);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

