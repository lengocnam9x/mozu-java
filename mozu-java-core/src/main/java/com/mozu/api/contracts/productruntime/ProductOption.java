/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.AttributeDetail;
import com.mozu.api.contracts.productruntime.ProductOptionValue;

/**
 *	Represents configurable options that a shopper can choose when ordering a product, such as a t-shirt color and size.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOption implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * If true, the product attribute or option has multiple values.
	 */
	protected  Boolean isMultiValue;

	public Boolean getIsMultiValue() {
		return this.isMultiValue;
	}

	public void setIsMultiValue(Boolean isMultiValue) {
		this.isMultiValue = isMultiValue;
	}

	/**
	 * If true, the entity is required for the request to return a valid response.
	 */
	protected  Boolean isRequired;

	public Boolean getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	/**
	 * Details of the product option attribute.
	 */
	protected  AttributeDetail attributeDetail;

	public AttributeDetail getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(AttributeDetail attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	/**
	 * List of possible values for a product option attribute.
	 */
	protected List<ProductOptionValue> values;
	public List<ProductOptionValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductOptionValue> values) {
		this.values = values;
	}


}
