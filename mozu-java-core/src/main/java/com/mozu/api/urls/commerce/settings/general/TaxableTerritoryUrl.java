/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.general;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class TaxableTerritoryUrl
{

	/**
	 * Get Resource Url for GetTaxableTerritories
	 * @return   String Resource Url
	 */
	public static MozuUrl getTaxableTerritoriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddTaxableTerritory
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl addTaxableTerritoryUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateTaxableTerritories
	 * @return   String Resource Url
	 */
	public static MozuUrl updateTaxableTerritoriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

