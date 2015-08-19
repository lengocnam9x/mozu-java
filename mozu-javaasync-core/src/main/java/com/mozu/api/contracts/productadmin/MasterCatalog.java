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

/**
 *	Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterCatalog implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean enableLiveEdit;

	public Boolean getEnableLiveEdit() {
		return this.enableLiveEdit;
	}

	public void setEnableLiveEdit(Boolean enableLiveEdit) {
		this.enableLiveEdit = enableLiveEdit;
	}

	/**
	 * The unique identifier of the master catalog associated with the entity.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object is deleted. If true, the object has been deleted. This may affect associated child members and objects. For example, a deleted master catalog affects all associated catalogs. 
	 */
	protected Boolean isDeleted;

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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
	 * The mode this master catalog uses for product updates. Possible values are "Pending" which saves product updates as a draft until they are published, and "Live" which publishes all product updates immediately.
	 */
	protected String productPublishingMode;

	public String getProductPublishingMode() {
		return this.productPublishingMode;
	}

	public void setProductPublishingMode(String productPublishingMode) {
		this.productPublishingMode = productPublishingMode;
	}

}
