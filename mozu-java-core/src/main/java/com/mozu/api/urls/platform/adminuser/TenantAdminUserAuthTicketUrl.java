/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.adminuser;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class TenantAdminUserAuthTicketUrl
{

	/**
	 * Get Resource Url for CreateUserAuthTicket
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @return   String Resource Url
	 */
	public static MozuUrl createUserAuthTicketUrl(String responseFields, Integer tenantId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/authtickets/tenants?tenantId={tenantId}&responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("tenantId", tenantId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for RefreshAuthTicket
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshAuthTicketUrl(String responseFields, Integer tenantId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/authtickets/tenants?tenantId={tenantId}&responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("tenantId", tenantId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeleteUserAuthTicket
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteUserAuthTicketUrl(String refreshToken)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/authtickets/?refreshToken={refreshToken}");
		formatter.formatUrl("refreshToken", refreshToken);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

