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
import com.mozu.api.contracts.reference.State;

/**
 *	A country and its states. Contrains the 2-letter geographic code representing the country and any states within the country.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryWithStates implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The two character country code.
	 */
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * The state code, name, and tags, if applicable. 
	 */
	protected List<State> states;
	public List<State> getStates() {
		return this.states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}

}
