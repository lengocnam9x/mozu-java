/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.checkout;

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
 * Use the Customer Checkout Settings resource to define login settings that apply when shoppers proceed to checkout.
 * </summary>
 */
public class CustomerCheckoutSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=GetCustomerCheckoutSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> getCustomerCheckoutSettingsClient() throws Exception
	{
		return getCustomerCheckoutSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=GetCustomerCheckoutSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> getCustomerCheckoutSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.CustomerCheckoutSettingsUrl.getCustomerCheckoutSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=UpdateCustomerCheckoutSettingsClient( customerCheckoutSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> updateCustomerCheckoutSettingsClient(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings) throws Exception
	{
		return updateCustomerCheckoutSettingsClient( customerCheckoutSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=UpdateCustomerCheckoutSettingsClient( customerCheckoutSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> updateCustomerCheckoutSettingsClient(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.CustomerCheckoutSettingsUrl.updateCustomerCheckoutSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerCheckoutSettings);
		return mozuClient;

	}

}



