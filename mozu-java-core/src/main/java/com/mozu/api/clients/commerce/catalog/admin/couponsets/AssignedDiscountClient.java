/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.couponsets;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the AssignedDiscounts resource to manage the discounts assigned to coupon sets.
 * </summary>
 */
public class AssignedDiscountClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> mozuClient=GetAssignedDiscountsClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AssignedDiscount assignedDiscount = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AssignedDiscount>>
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> getAssignedDiscountsClient(String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.AssignedDiscountUrl.getAssignedDiscountsUrl(couponSetCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AssignedDiscount>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AssignDiscountClient( assignedDiscount,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param assignedDiscount The details of the discount assigned to the coupon set.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public static MozuClient assignDiscountClient(com.mozu.api.contracts.productadmin.AssignedDiscount assignedDiscount, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.AssignedDiscountUrl.assignDiscountUrl(couponSetCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(assignedDiscount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UnAssignDiscountClient( couponSetCode,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient unAssignDiscountClient(String couponSetCode, Integer discountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.AssignedDiscountUrl.unAssignDiscountUrl(couponSetCode, discountId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



