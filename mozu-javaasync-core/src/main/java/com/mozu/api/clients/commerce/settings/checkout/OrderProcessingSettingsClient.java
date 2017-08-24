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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the order processing settings resource to define how orders and payments are processed for the site.
 * </summary>
 */
public class OrderProcessingSettingsClient {
	
	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> mozuClient=GetOrderProcessingSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderProcessingSettings orderProcessingSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> getOrderProcessingSettingsClient() throws Exception
	{
		return getOrderProcessingSettingsClient( null);
	}

	/**
	 * Retrieves a list of the order processing settings defined for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> mozuClient=GetOrderProcessingSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderProcessingSettings orderProcessingSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> getOrderProcessingSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.OrderProcessingSettingsUrl.getOrderProcessingSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



