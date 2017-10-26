/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.AttributeValidation;

/**
 *	The product attribute details common between all attribute types - properties, options, and extras.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeDetail implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates whether the attribute should be able to be used in filters, facets, and sorting on the public storefront.
	 */
	protected  Boolean allowFilteringAndSortingInStorefront;

	public Boolean getAllowFilteringAndSortingInStorefront() {
		return this.allowFilteringAndSortingInStorefront;
	}

	public void setAllowFilteringAndSortingInStorefront(Boolean allowFilteringAndSortingInStorefront) {
		this.allowFilteringAndSortingInStorefront = allowFilteringAndSortingInStorefront;
	}

	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	protected  Integer dataTypeSequence;

	public Integer getDataTypeSequence() {
		return this.dataTypeSequence;
	}

	public void setDataTypeSequence(Integer dataTypeSequence) {
		this.dataTypeSequence = dataTypeSequence;
	}

	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Defines the intended display of this attribute in the storefront. Options include Drop Down, Image Picker, and Radio Buttons.
	 */
	protected  String displayIntention;

	public String getDisplayIntention() {
		return this.displayIntention;
	}

	public void setDisplayIntention(String displayIntention) {
		this.displayIntention = displayIntention;
	}

	/**
	 * Specifies whether to create a case-sensitive Solr search index. The default is .
	 */
	protected  Boolean indexValueWithCase;

	public Boolean getIndexValueWithCase() {
		return this.indexValueWithCase;
	}

	public void setIndexValueWithCase(Boolean indexValueWithCase) {
		this.indexValueWithCase = indexValueWithCase;
	}

	protected  String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Indicates if the attribute value is searchable on the public storefront.
	 */
	protected  Boolean searchableInStorefront;

	public Boolean getSearchableInStorefront() {
		return this.searchableInStorefront;
	}

	public void setSearchableInStorefront(Boolean searchableInStorefront) {
		this.searchableInStorefront = searchableInStorefront;
	}

	/**
	 * Indicates what kind of values search queries and returns. If true, the system indexes the display value of string attributes instead of the canonical value for searching. Always use the canonical value for filtering. This does not apply for non-string attributes.
	 */
	protected  Boolean searchDisplayValue;

	public Boolean getSearchDisplayValue() {
		return this.searchDisplayValue;
	}

	public void setSearchDisplayValue(Boolean searchDisplayValue) {
		this.searchDisplayValue = searchDisplayValue;
	}

	protected  String usageType;

	public String getUsageType() {
		return this.usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	protected  String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	protected  AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}


}
