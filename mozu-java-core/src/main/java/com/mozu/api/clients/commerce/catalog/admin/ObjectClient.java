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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class ObjectClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient() throws Exception
	{
		return getSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient( fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param fields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient(String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ObjectUrl.getSettingsUrl(fields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param fields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ObjectUrl.updateSettingsUrl(fields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

}


