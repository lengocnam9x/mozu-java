/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CheckoutUrl
{

	/**
	 * Get Resource Url for GetCheckouts
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCheckoutsUrl(String filter, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableActions
	 * @param checkoutId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableActionsUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/actions");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableShipmentMethods
	 * @param checkoutId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableShipmentMethodsUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/shipments/methods");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCheckout
	 * @param checkoutId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCheckoutUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateCheckoutFromCart
	 * @param cartId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createCheckoutFromCartUrl(String cartId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/?cartId={cartId}&responseFields={responseFields}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformCheckoutAction
	 * @param checkoutId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl performCheckoutActionUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/actions?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for SetShippingMethods
	 * @param checkoutId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl setShippingMethodsUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/shippingMethods?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCheckout
	 * @param checkoutId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCheckoutUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResendCheckoutConfirmationEmail
	 * @param checkoutId 
	 * @return   String Resource Url
	 */
	public static MozuUrl resendCheckoutConfirmationEmailUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/email/resend");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

