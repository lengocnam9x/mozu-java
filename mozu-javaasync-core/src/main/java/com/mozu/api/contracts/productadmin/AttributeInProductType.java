/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.AttributeInProductTypeDisplayInfo;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueInProductType;

/**
 *	Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeInProductType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * If true, this property is not available on the storefront. If false, this property will be available on storefront. The IsHiddenProperty hides the property from the customer, but is still available from the API.
	 */
	protected Boolean isAdminOnlyProperty;

	public Boolean getIsAdminOnlyProperty() {
		return this.isAdminOnlyProperty;
	}

	public void setIsAdminOnlyProperty(Boolean isAdminOnlyProperty) {
		this.isAdminOnlyProperty = isAdminOnlyProperty;
	}

	/**
	 * If true, this property is hidden on the storefront. If false, this property is not hidden from the storefront.
	 */
	protected Boolean isHiddenProperty;

	public Boolean getIsHiddenProperty() {
		return this.isHiddenProperty;
	}

	public void setIsHiddenProperty(Boolean isHiddenProperty) {
		this.isHiddenProperty = isHiddenProperty;
	}

	/**
	 * If true, this entity is inherited from the base type. If false, this entity is not inherited from the base type.
	 */
	protected Boolean isInheritedFromBaseType;

	public Boolean getIsInheritedFromBaseType() {
		return this.isInheritedFromBaseType;
	}

	public void setIsInheritedFromBaseType(Boolean isInheritedFromBaseType) {
		this.isInheritedFromBaseType = isInheritedFromBaseType;
	}

	/**
	 * If true, this attribute has more than one possible value.
	 */
	protected Boolean isMultiValueProperty;

	public Boolean getIsMultiValueProperty() {
		return this.isMultiValueProperty;
	}

	public void setIsMultiValueProperty(Boolean isMultiValueProperty) {
		this.isMultiValueProperty = isMultiValueProperty;
	}

	/**
	 * If true, the entity is required by the admin. If false, the entity is not required by the admin.
	 */
	protected Boolean isRequiredByAdmin;

	public Boolean getIsRequiredByAdmin() {
		return this.isRequiredByAdmin;
	}

	public void setIsRequiredByAdmin(Boolean isRequiredByAdmin) {
		this.isRequiredByAdmin = isRequiredByAdmin;
	}

	/**
	 * Integer that represents the sequence order of the attribute.
	 */
	protected Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Detail data for a product or product options attribute. This acts as a wrapper for the properties to configure or generate from the system in the product Admin. Properties may include namespace, attribute code, attribute sequence, site group ID, input type, and value.
	 */
	protected Attribute attributeDetail;

	public Attribute getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(Attribute attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	/**
	 * Defines the intended display of this attribute in the storefront. Options include Drop Down, Image Picker, and Radio Buttons.
	 */
	protected AttributeInProductTypeDisplayInfo displayInfo;

	public AttributeInProductTypeDisplayInfo getDisplayInfo() {
		return this.displayInfo;
	}

	public void setDisplayInfo(AttributeInProductTypeDisplayInfo displayInfo) {
		this.displayInfo = displayInfo;
	}

	/**
	 * List of valid vocabulary values defined for an attribute.
	 */
	protected List<AttributeVocabularyValueInProductType> vocabularyValues;
	public List<AttributeVocabularyValueInProductType> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<AttributeVocabularyValueInProductType> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

}
