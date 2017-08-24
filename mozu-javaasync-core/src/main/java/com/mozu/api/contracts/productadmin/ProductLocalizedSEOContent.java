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
 *	The localized product search engine optimized content in the language specified by the LocaleCode.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLocalizedSEOContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected  String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * The description of the metatag used for the product SEO content set to the locale code language. The metadata description is used to manage information internally.
	 */
	protected  String metaTagDescription;

	public String getMetaTagDescription() {
		return this.metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	/**
	 * The metatag keywords for the product SEO content set in the locale code language. The metatag keywords are used to manage information internally.
	 */
	protected  String metaTagKeywords;

	public String getMetaTagKeywords() {
		return this.metaTagKeywords;
	}

	public void setMetaTagKeywords(String metaTagKeywords) {
		this.metaTagKeywords = metaTagKeywords;
	}

	/**
	 * The metatag title for the product SEO content set in the locale code language. The metatag title is used to manage information internally.
	 */
	protected  String metaTagTitle;

	public String getMetaTagTitle() {
		return this.metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
	}

	/**
	 * The search engine optimized human-readable portion of the URL in the language of the product's locale code.
	 */
	protected  String seoFriendlyUrl;

	public String getSeoFriendlyUrl() {
		return this.seoFriendlyUrl;
	}

	public void setSeoFriendlyUrl(String seoFriendlyUrl) {
		this.seoFriendlyUrl = seoFriendlyUrl;
	}

	/**
	 * Customizes the HTML title tag within the header section of the product details page for the specified product.
	 */
	protected  String titleTagTitle;

	public String getTitleTagTitle() {
		return this.titleTagTitle;
	}

	public void setTitleTagTitle(String titleTagTitle) {
		this.titleTagTitle = titleTagTitle;
	}


}
