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
 *	Describes the source of the facet data. It can be a product field (such as price and category) or a product attribute. All fields are System-supplied and read only.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetSource implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean allowsRangeQuery;

	public Boolean getAllowsRangeQuery() {
		return this.allowsRangeQuery;
	}

	public void setAllowsRangeQuery(Boolean allowsRangeQuery) {
		this.allowsRangeQuery = allowsRangeQuery;
	}

	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
