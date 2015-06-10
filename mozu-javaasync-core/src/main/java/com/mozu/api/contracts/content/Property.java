/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.content.PropertyType;

/**
 *	Provides details and data for properties for content in the site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Property implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the attribute can have more than one value.
	 */
	protected Boolean isMultiValued;

	public Boolean getIsMultiValued() {
		return this.isMultiValued;
	}

	public void setIsMultiValued(Boolean isMultiValued) {
		this.isMultiValued = isMultiValued;
	}

	/**
	 * Indicates if the property, attribute, product option, or product extra is required. If true, the object must have a defined value.
	 */
	protected Boolean isRequired;

	public Boolean getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The type of a property. These types are associated to properties for documents and document types.
	 */
	protected PropertyType propertyType;

	public PropertyType getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

}