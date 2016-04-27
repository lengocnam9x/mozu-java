/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The type of preauthorization gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAuthorizeTransactionTypeDataContract implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The type of preauthorization transaction.
	 */
	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
