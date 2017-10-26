/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the attribute type rule.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeTypeRule implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String attributeDataType;

	public String getAttributeDataType() {
		return this.attributeDataType;
	}

	public void setAttributeDataType(String attributeDataType) {
		this.attributeDataType = attributeDataType;
	}

	protected  String attributeInputType;

	public String getAttributeInputType() {
		return this.attributeInputType;
	}

	public void setAttributeInputType(String attributeInputType) {
		this.attributeInputType = attributeInputType;
	}

	protected  String attributeUsageType;

	public String getAttributeUsageType() {
		return this.attributeUsageType;
	}

	public void setAttributeUsageType(String attributeUsageType) {
		this.attributeUsageType = attributeUsageType;
	}

	protected  String attributeValueType;

	public String getAttributeValueType() {
		return this.attributeValueType;
	}

	public void setAttributeValueType(String attributeValueType) {
		this.attributeValueType = attributeValueType;
	}


}
