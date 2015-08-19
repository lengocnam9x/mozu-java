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
import com.mozu.api.contracts.customer.CustomerAccount;

/**
 *	The authentication information associated with a customer account. The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAccountAndAuthInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.Customer.Contracts.CustomerAccountAndAuthInfo externalPassword ApiTypeMember DOCUMENT_HERE 
	 */
	protected String externalPassword;

	public String getExternalPassword() {
		return this.externalPassword;
	}

	public void setExternalPassword(String externalPassword) {
		this.externalPassword = externalPassword;
	}

	/**
	 * Indicates if this object/data was imported from an outside source such as a data import or synchronization via an app or service. If true, this data was originally imported into Mozu and accessible through your store database. Examples of imported objects/data include orders and customer accounts.
	 */
	protected Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * The saved password for the customer account. 
	 */
	protected String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * The unique identifier of the customer account.
	 */
	protected CustomerAccount account;

	public CustomerAccount getAccount() {
		return this.account;
	}

	public void setAccount(CustomerAccount account) {
		this.account = account;
	}

}
