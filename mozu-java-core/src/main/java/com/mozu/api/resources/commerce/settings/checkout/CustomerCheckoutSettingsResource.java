/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
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
public class CustomerCheckoutSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerCheckoutSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.getCustomerCheckoutSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings() throws Exception
	{
		return getCustomerCheckoutSettings( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.getCustomerCheckoutSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.getCustomerCheckoutSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.updateCustomerCheckoutSettings( customerCheckoutSettings);
	 * </code></pre></p>
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings) throws Exception
	{
		return updateCustomerCheckoutSettings( customerCheckoutSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.updateCustomerCheckoutSettings( customerCheckoutSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.updateCustomerCheckoutSettingsClient( customerCheckoutSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



