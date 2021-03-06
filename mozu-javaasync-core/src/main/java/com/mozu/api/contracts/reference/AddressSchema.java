/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.reference.Field;

/**
 *	Describes the structure of postal addresses based on the country specified. Because addresses vary from country to country, this schema allows a flexible storage structure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressSchema implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	protected  String countryLabel;

	public String getCountryLabel() {
		return this.countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		this.countryLabel = countryLabel;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected List<Field> fields;
	public List<Field> getFields() {
		return this.fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}


}
