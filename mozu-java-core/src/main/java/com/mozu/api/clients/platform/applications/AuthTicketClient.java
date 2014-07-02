/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.applications;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use this resource to manage authentication tickets for your applications.
 * </summary>
 */
public class AuthTicketClient {
	
	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=AuthenticateAppClient( appAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param appAuthInfo Authentication information required to generate an authentication ticket includes the application id and the shared secret.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> authenticateAppClient(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.authenticateAppUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.AuthTicket.class;
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(appAuthInfo);
		return mozuClient;

	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient=RefreshAppAuthTicketClient( authTicketRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AuthTicket authTicket = client.Result();
	 * </code></pre></p>
	 * @param authTicketRequest The refresh token string required to update the application authentication ticket.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.AuthTicket>
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.AuthTicket> refreshAppAuthTicketClient(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.refreshAppAuthTicketUrl();
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.appdev.AuthTicket.class;
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(authTicketRequest);
		return mozuClient;

	}

	/**
	 * Deletes an authentication for an application based on the specified refresh token.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAppAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param refreshToken The refresh token string from the application's authentication ticket.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAppAuthTicketClient(String refreshToken) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.applications.AuthTicketUrl.deleteAppAuthTicketUrl(refreshToken);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



