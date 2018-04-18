/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.sitesettings.order.ThirdPartyCredentialField;

/**
 *	Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPaymentWorkflowDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Fully qualified name of the attribute for the order or customer.
	 */
	protected  String fullyQualifiedName;

	public String getFullyQualifiedName() {
		return this.fullyQualifiedName;
	}

	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
	}

	protected  Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The namespace for the accessible APIs and source capabilities in the core of  APIs.
	 */
	protected  String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	protected List<ThirdPartyCredentialField> credentials;
	public List<ThirdPartyCredentialField> getCredentials() {
		return this.credentials;
	}
	public void setCredentials(List<ThirdPartyCredentialField> credentials) {
		this.credentials = credentials;
	}


}
