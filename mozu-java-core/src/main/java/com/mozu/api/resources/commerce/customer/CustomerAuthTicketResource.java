/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Use the Customer Authentication Tickets resource to generate and refresh authentication tickets for customer accounts.
 * </summary>
 */
public class CustomerAuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Creates an authentication ticket for an anonymous shopper user.
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	Stream stream = customerauthticket.createAnonymousShopperAuthTicket();
	 * </code></pre></p>
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream createAnonymousShopperAuthTicket() throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.createAnonymousShopperAuthTicketClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generates a new authentication ticket for a customer account.
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.createUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo The authentication information required to generate an authentication ticket for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerUserAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicket( userAuthInfo,  null);
	}

	/**
	 * Generates a new authentication ticket for a customer account.
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.createUserAuthTicket( userAuthInfo,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userAuthInfo The authentication information required to generate an authentication ticket for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerUserAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.createUserAuthTicketClient( userAuthInfo,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Refreshes an existing authentication ticket for a customer account by providing the refresh token string.
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.refreshUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(String refreshToken) throws Exception
	{
		return refreshUserAuthTicket( refreshToken,  null);
	}

	/**
	 * Refreshes an existing authentication ticket for a customer account by providing the refresh token string.
	 * <p><pre><code>
	 *	CustomerAuthTicket customerauthticket = new CustomerAuthTicket();
	 *	CustomerAuthTicket customerAuthTicket = customerauthticket.refreshUserAuthTicket( refreshToken,  responseFields);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(String refreshToken, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAuthTicketClient.refreshUserAuthTicketClient( refreshToken,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



