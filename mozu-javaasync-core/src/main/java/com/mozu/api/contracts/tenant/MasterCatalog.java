/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.tenant;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.tenant.Catalog;

/**
 *	Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterCatalog implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * The default three-letter ISO currency code associated with this master catalog. At this time, only "USD" is supported.
	 */
	protected  String defaultCurrencyCode;

	public String getDefaultCurrencyCode() {
		return this.defaultCurrencyCode;
	}

	public void setDefaultCurrencyCode(String defaultCurrencyCode) {
		this.defaultCurrencyCode = defaultCurrencyCode;
	}

	/**
	 * The default locale code associated with this master catalog. At this time, only "en-US" is supported.
	 */
	protected  String defaultLocaleCode;

	public String getDefaultLocaleCode() {
		return this.defaultLocaleCode;
	}

	public void setDefaultLocaleCode(String defaultLocaleCode) {
		this.defaultLocaleCode = defaultLocaleCode;
	}

	/**
	 * The date and time the master catalog was deleted.
	 */
	protected  DateTime deleteDate;

	public DateTime getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(DateTime deleteDate) {
		this.deleteDate = deleteDate;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * If true, this master catalog and its associated catalogs have been deleted from the tenant.
	 */
	protected  Boolean isDeleted;

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * User-defined name of the master catalog.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The current status of the master catalog.
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Collection of product catalogs that use product definitions from the master catalog.
	 */
	protected List<Catalog> catalogs;
	public List<Catalog> getCatalogs() {
		return this.catalogs;
	}
	public void setCatalogs(List<Catalog> catalogs) {
		this.catalogs = catalogs;
	}


}
