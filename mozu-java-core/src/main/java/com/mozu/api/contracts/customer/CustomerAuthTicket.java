/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.customer.CustomerAccount;

/**
 *	Properties of an authentication ticket generated for a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAuthTicket implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Alphanumeric string used to authenticate the user in API request headers. The token stores an encrypted list of the application's configured behaviors and authenticates the application.
	 */
	protected  String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * The date and time the user access token expires. If the token will expire, a new token will need to be generated and assigned to the account to continue and restore access to the store, data, and account.
	 */
	protected  DateTime accessTokenExpiration;

	public DateTime getAccessTokenExpiration() {
		return this.accessTokenExpiration;
	}

	public void setAccessTokenExpiration(DateTime accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}

	/**
	 * Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 */
	protected  String refreshToken;

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * The date and time the developer account or application refresh token expires.
	 */
	protected  DateTime refreshTokenExpiration;

	public DateTime getRefreshTokenExpiration() {
		return this.refreshTokenExpiration;
	}

	public void setRefreshTokenExpiration(DateTime refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected  String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Properties of the customer account associated with the authentication ticket.
	 */
	protected  CustomerAccount customerAccount;

	public CustomerAccount getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}


}
