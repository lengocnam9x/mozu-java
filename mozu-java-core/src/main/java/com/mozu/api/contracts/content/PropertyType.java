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
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Property type available for content. Property types are like templates that can be reused.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrator name associated with the object/data.
	 */
	protected  String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * The package of document lists and content documents to be installed.
	 */
	protected  String installationPackage;

	public String getInstallationPackage() {
		return this.installationPackage;
	}

	public void setInstallationPackage(String installationPackage) {
		this.installationPackage = installationPackage;
	}

	protected  Boolean isAggregatable;

	public Boolean getIsAggregatable() {
		return this.isAggregatable;
	}

	public void setIsAggregatable(Boolean isAggregatable) {
		this.isAggregatable = isAggregatable;
	}

	protected  Boolean isQueryable;

	public Boolean getIsQueryable() {
		return this.isQueryable;
	}

	public void setIsQueryable(Boolean isQueryable) {
		this.isQueryable = isQueryable;
	}

	protected  Boolean isSortable;

	public Boolean getIsSortable() {
		return this.isSortable;
	}

	public void setIsSortable(Boolean isSortable) {
		this.isSortable = isSortable;
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

	/**
	 * The fully qualified name for the property type for content.
	 */
	protected  String propertyTypeFQN;

	public String getPropertyTypeFQN() {
		return this.propertyTypeFQN;
	}

	public void setPropertyTypeFQN(String propertyTypeFQN) {
		this.propertyTypeFQN = propertyTypeFQN;
	}

	/**
	 * The current version number of the order, wish list, document list, or document type list.
	 */
	protected  String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}
