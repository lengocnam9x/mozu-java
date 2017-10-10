/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.discounts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=GetDiscountTargetClient(dataViewMode,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> getDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId) throws Exception
	{
		return getDiscountTargetClient(dataViewMode,  discountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=GetDiscountTargetClient(dataViewMode,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> getDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.getDiscountTargetUrl(discountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=UpdateDiscountTargetClient( discountTarget,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> updateDiscountTargetClient(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId) throws Exception
	{
		return updateDiscountTargetClient( discountTarget,  discountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=UpdateDiscountTargetClient( discountTarget,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> updateDiscountTargetClient(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.updateDiscountTargetUrl(discountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountTarget);
		return mozuClient;

	}

}



