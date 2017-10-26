/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.general;

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
 * Use the Custom Routes resource to manage your custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to conventional  resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.To learn more about custom routing, refer to the [Custom Route Settings](../../../guides/settings/custom-routes.htm) topic.
 * </summary>
 */
public class CustomRouteSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomRouteSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.getCustomRouteSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings() throws Exception
	{
		return getCustomRouteSettings( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.getCustomRouteSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.getCustomRouteSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.createCustomRouteSettings( settings);
	 * </code></pre></p>
	 * @param settings The details of the new custom route setting.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return createCustomRouteSettings( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.createCustomRouteSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param settings The details of the new custom route setting.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.createCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.updateCustomRouteSettings( settings);
	 * </code></pre></p>
	 * @param settings The updated details of the custom route settings.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return updateCustomRouteSettings( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.updateCustomRouteSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param settings The updated details of the custom route settings.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.updateCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	customroutesettings.deleteCustomRouteSettings();
	 * </code></pre></p>
	 * @return 
	 */
	public void deleteCustomRouteSettings() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.deleteCustomRouteSettingsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



