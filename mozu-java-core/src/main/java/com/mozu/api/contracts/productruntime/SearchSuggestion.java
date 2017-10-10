/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Suggest product search terms to a customer based on defined queries.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSuggestion implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * A suggested entity based on the search query. Use the SuggestionType to determine the type of entity. Could be a SearchTerm, Product, or Category
	 */
	protected  Object suggestion;

	public Object getSuggestion() {
		return this.suggestion;
	}

	public void setSuggestion(Object suggestion) {
		this.suggestion = suggestion;
	}

	/**
	 * The type of Suggestion (e.g. Term, Product, Category). Will be one of the values of the SuggestionTypeConst type.
	 */
	protected  String suggestionType;

	public String getSuggestionType() {
		return this.suggestionType;
	}

	public void setSuggestionType(String suggestionType) {
		this.suggestionType = suggestionType;
	}


}
