/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.reference.CountryWithStates;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryWithStatesCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	protected List<CountryWithStates> items;
	public List<CountryWithStates> getItems() {
		return this.items;
	}
	public void setItems(List<CountryWithStates> items) {
		this.items = items;
	}

}
