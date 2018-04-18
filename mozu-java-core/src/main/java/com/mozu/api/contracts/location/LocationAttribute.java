/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.extensible.Attribute;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	An attribute associated with the location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationAttribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the attribute definition.
	 */
	protected  Integer attributeDefinitionId;

	public Integer getAttributeDefinitionId() {
		return this.attributeDefinitionId;
	}

	public void setAttributeDefinitionId(Integer attributeDefinitionId) {
		this.attributeDefinitionId = attributeDefinitionId;
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

	/**
	 * List of value data for objects.
	 */
	protected List<Object> values;
	public List<Object> getValues() {
		return this.values;
	}
	public void setValues(List<Object> values) {
		this.values = values;
	}

	/**
	 * attributeDefinition ApiType DOCUMENT_HERE 
	 */
	protected  Attribute attributeDefinition;

	public Attribute getAttributeDefinition() {
		return this.attributeDefinition;
	}

	public void setAttributeDefinition(Attribute attributeDefinition) {
		this.attributeDefinition = attributeDefinition;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
