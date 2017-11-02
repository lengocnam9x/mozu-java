/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class PickupUrl
{

	/**
	 * Get Resource Url for GetAvailablePickupFulfillmentActions
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePickupFulfillmentActionsUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPickup
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPickupUrl(String orderId, String pickupId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePickup
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPickupUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePickup
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePickupUrl(String orderId, String pickupId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePickup
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePickupUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

