/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CouponSetClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient=GetCouponSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSetCollection couponSetCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSetCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> getCouponSetsClient() throws Exception
	{
		return getCouponSetsClient( null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient=GetCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSetCollection couponSetCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param includeCounts 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSetCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> getCouponSetsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.getCouponSetsUrl(filter, includeCounts, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSetCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetUniqueCouponSetCodeClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getUniqueCouponSetCodeClient() throws Exception
	{
		return getUniqueCouponSetCodeClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetUniqueCouponSetCodeClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getUniqueCouponSetCodeClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.getUniqueCouponSetCodeUrl(responseFields);
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = (MozuClient<String>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> addCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSetClient( couponSet,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param couponSet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> addCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.addCouponSetUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(couponSet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ValidateUniqueCouponSetCodeClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient validateUniqueCouponSetCodeClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.validateUniqueCouponSetCodeUrl(code);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



