/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
 * Use the Applications resource to update and retrieve details about the applications installed for your tenant.
 * </summary>
 */
public class InstalledApplicationsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=GetApplicationClient( appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId appId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> getApplicationClient(String appId) throws Exception
	{
		return getApplicationClient( appId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=GetApplicationClient( appId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId appId parameter description DOCUMENT_HERE 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> getApplicationClient(String appId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.InstalledApplicationsUrl.getApplicationUrl(appId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.Application>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=UpdateApplicationClient( application,  appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId appId parameter description DOCUMENT_HERE 
	 * @param application Properties of an app installed in a tenant.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> updateApplicationClient(com.mozu.api.contracts.installedapplications.Application application, String appId) throws Exception
	{
		return updateApplicationClient( application,  appId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=UpdateApplicationClient( application,  appId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId appId parameter description DOCUMENT_HERE 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param application Properties of an app installed in a tenant.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> updateApplicationClient(com.mozu.api.contracts.installedapplications.Application application, String appId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.InstalledApplicationsUrl.updateApplicationUrl(appId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.Application>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(application);
		return mozuClient;

	}

}



