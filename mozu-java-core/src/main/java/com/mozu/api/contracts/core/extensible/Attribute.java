/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.extensible.AttributeMetadataItem;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.extensible.AttributeLocalizedContent;
import com.mozu.api.contracts.core.extensible.AttributeValidation;
import com.mozu.api.contracts.core.extensible.AttributeVocabularyValue;

/**
 *	Properties of an attribute used to describe customers or orders.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Name of this extensible attribute defined in Mozu Admin.
	 */
	protected  String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Merchant-defined code for an extensible attribute.
	 */
	protected  String attributeCode;

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * The data type of the customer or order attribute, which is Bool, DateTime, Number, or String.
	 */
	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * Whether the customer or order attribute appears in Mozu Admin only, or in both Mozu Admin and the website storefront. Possible values are Admin and AdminAndStorefront.
	 */
	protected  String displayGroup;

	public String getDisplayGroup() {
		return this.displayGroup;
	}

	public void setDisplayGroup(String displayGroup) {
		this.displayGroup = displayGroup;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The type of input selection used to define a value for the attribute, which is YesNo, Date, DateTime, List, TextBox, or TextArea.
	 */
	protected  String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * If true, the customer or order attribute is active.
	 */
	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, the attribute can have more than one value.
	 */
	protected  Boolean isMultiValued;

	public Boolean getIsMultiValued() {
		return this.isMultiValued;
	}

	public void setIsMultiValued(Boolean isMultiValued) {
		this.isMultiValued = isMultiValued;
	}

	protected  Boolean isReadOnly;

	public Boolean getIsReadOnly() {
		return this.isReadOnly;
	}

	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	/**
	 * If true, the attribute must have a defined value.
	 */
	protected  Boolean isRequired;

	public Boolean getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	/**
	 * If true, the attribute is visible in its defined display group.
	 */
	protected  Boolean isVisible;

	public Boolean getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	/**
	 * Namespace associated with this extensible attribute.
	 */
	protected  String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * Integer that represents the sequence of the attribute.
	 */
	protected  Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * An attribute value type is either predefined vocabulary by the admin during attribute set up or it can be "AdminEntered" or "ShopperEntered". The difference between predefined values versus manually entered values is such that the first choice is a set of options to choose from. AdminEntered and ShopperEntered are values that are entered rather than system-supplied and are not stored in the database, but captured during a live commerce operations such as during an order.
	 */
	protected  String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	/**
	 * List of metadata key-value pairs defined for an extensible attribute.
	 */
	protected List<AttributeMetadataItem> attributeMetadata;
	public List<AttributeMetadataItem> getAttributeMetadata() {
		return this.attributeMetadata;
	}
	public void setAttributeMetadata(List<AttributeMetadataItem> attributeMetadata) {
		this.attributeMetadata = attributeMetadata;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * The localized name and description of the attribute, displayed in the locale code specified for the master catalog.
	 */
	protected  AttributeLocalizedContent content;

	public AttributeLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeLocalizedContent content) {
		this.content = content;
	}

	/**
	 * Properties used when validating a value entered for an extensible attribute.
	 */
	protected  AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

	/**
	 * List of valid vocabulary values defined for an attribute.
	 */
	protected List<AttributeVocabularyValue> vocabularyValues;
	public List<AttributeVocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<AttributeVocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}


}
