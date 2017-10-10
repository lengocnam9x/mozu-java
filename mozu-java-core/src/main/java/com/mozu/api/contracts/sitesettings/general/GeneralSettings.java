/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.sitesettings.general.CacheSettings;
import com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings;
import com.mozu.api.contracts.sitesettings.general.EmailTransactionSettings;
import com.mozu.api.contracts.sitesettings.general.EmailTypeSetting;
import com.mozu.api.contracts.sitesettings.general.TaxableTerritory;
import com.mozu.api.contracts.sitesettings.general.general.ViewAuthorizations;

/**
 *	General settings used on the storefront site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean allowInvalidAddresses;

	public Boolean getAllowInvalidAddresses() {
		return this.allowInvalidAddresses;
	}

	public void setAllowInvalidAddresses(Boolean allowInvalidAddresses) {
		this.allowInvalidAddresses = allowInvalidAddresses;
	}

	/**
	 * An email address to blind carbon copy anytime an automatic email is sent from  to a shopper.
	 */
	protected  String bccEmailAddress;

	public String getBccEmailAddress() {
		return this.bccEmailAddress;
	}

	public void setBccEmailAddress(String bccEmailAddress) {
		this.bccEmailAddress = bccEmailAddress;
	}

	/**
	 * Custom override of the default subdomain for CDN-hosted content. For example, for SEO reasons you may prefer that the subdomain for your CDN content be  instead of the default subdomain, which might be something like .
	 */
	protected  String customCdnHostName;

	public String getCustomCdnHostName() {
		return this.customCdnHostName;
	}

	public void setCustomCdnHostName(String customCdnHostName) {
		this.customCdnHostName = customCdnHostName;
	}

	protected  String favIconMobilePath;

	public String getFavIconMobilePath() {
		return this.favIconMobilePath;
	}

	public void setFavIconMobilePath(String favIconMobilePath) {
		this.favIconMobilePath = favIconMobilePath;
	}

	protected  String favIconPath;

	public String getFavIconPath() {
		return this.favIconPath;
	}

	public void setFavIconPath(String favIconPath) {
		this.favIconPath = favIconPath;
	}

	protected  String googleAnalyticsCode;

	public String getGoogleAnalyticsCode() {
		return this.googleAnalyticsCode;
	}

	public void setGoogleAnalyticsCode(String googleAnalyticsCode) {
		this.googleAnalyticsCode = googleAnalyticsCode;
	}

	protected  Boolean isAddressValidationEnabled;

	public Boolean getIsAddressValidationEnabled() {
		return this.isAddressValidationEnabled;
	}

	public void setIsAddressValidationEnabled(Boolean isAddressValidationEnabled) {
		this.isAddressValidationEnabled = isAddressValidationEnabled;
	}

	protected  Boolean isGoogleAnalyticsEcommerceEnabled;

	public Boolean getIsGoogleAnalyticsEcommerceEnabled() {
		return this.isGoogleAnalyticsEcommerceEnabled;
	}

	public void setIsGoogleAnalyticsEcommerceEnabled(Boolean isGoogleAnalyticsEcommerceEnabled) {
		this.isGoogleAnalyticsEcommerceEnabled = isGoogleAnalyticsEcommerceEnabled;
	}

	protected  Boolean isGoogleAnalyticsEnabled;

	public Boolean getIsGoogleAnalyticsEnabled() {
		return this.isGoogleAnalyticsEnabled;
	}

	public void setIsGoogleAnalyticsEnabled(Boolean isGoogleAnalyticsEnabled) {
		this.isGoogleAnalyticsEnabled = isGoogleAnalyticsEnabled;
	}

	protected  Boolean isMozuWebSite;

	public Boolean getIsMozuWebSite() {
		return this.isMozuWebSite;
	}

	public void setIsMozuWebSite(Boolean isMozuWebSite) {
		this.isMozuWebSite = isMozuWebSite;
	}

	protected  Boolean isMultishipEnabled;

	public Boolean getIsMultishipEnabled() {
		return this.isMultishipEnabled;
	}

	public void setIsMultishipEnabled(Boolean isMultishipEnabled) {
		this.isMultishipEnabled = isMultishipEnabled;
	}

	protected  Boolean isWishlistCreationEnabled;

	public Boolean getIsWishlistCreationEnabled() {
		return this.isWishlistCreationEnabled;
	}

	public void setIsWishlistCreationEnabled(Boolean isWishlistCreationEnabled) {
		this.isWishlistCreationEnabled = isWishlistCreationEnabled;
	}

	protected  String logoPath;

	public String getLogoPath() {
		return this.logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	protected  String logoText;

	public String getLogoText() {
		return this.logoText;
	}

	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	/**
	 * Assigns an image to render in place of broken images and unspecified product images (and unspecified category images, if your theme developer has enabled category images). Specified by the name or ID of the CMS image within .
	 */
	protected  String missingImageSubstitute;

	public String getMissingImageSubstitute() {
		return this.missingImageSubstitute;
	}

	public void setMissingImageSubstitute(String missingImageSubstitute) {
		this.missingImageSubstitute = missingImageSubstitute;
	}

	protected  String mobileTheme;

	public String getMobileTheme() {
		return this.mobileTheme;
	}

	public void setMobileTheme(String mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	protected  String replyToEmailAddress;

	public String getReplyToEmailAddress() {
		return this.replyToEmailAddress;
	}

	public void setReplyToEmailAddress(String replyToEmailAddress) {
		this.replyToEmailAddress = replyToEmailAddress;
	}

	protected  String senderEmailAddress;

	public String getSenderEmailAddress() {
		return this.senderEmailAddress;
	}

	public void setSenderEmailAddress(String senderEmailAddress) {
		this.senderEmailAddress = senderEmailAddress;
	}

	/**
	 * An alternate name for the sender email. For example, if your sender email is , you might want to use an alias of .
	 */
	protected  String senderEmailAlias;

	public String getSenderEmailAlias() {
		return this.senderEmailAlias;
	}

	public void setSenderEmailAlias(String senderEmailAlias) {
		this.senderEmailAlias = senderEmailAlias;
	}

	protected  String siteTimeFormat;

	public String getSiteTimeFormat() {
		return this.siteTimeFormat;
	}

	public void setSiteTimeFormat(String siteTimeFormat) {
		this.siteTimeFormat = siteTimeFormat;
	}

	protected  String siteTimeZone;

	public String getSiteTimeZone() {
		return this.siteTimeZone;
	}

	public void setSiteTimeZone(String siteTimeZone) {
		this.siteTimeZone = siteTimeZone;
	}

	/**
	 * The name of the theme to use when viewing the website on a mobile device.
	 */
	protected  String tabletTheme;

	public String getTabletTheme() {
		return this.tabletTheme;
	}

	public void setTabletTheme(String tabletTheme) {
		this.tabletTheme = tabletTheme;
	}

	protected  Integer templateSiteId;

	public Integer getTemplateSiteId() {
		return this.templateSiteId;
	}

	public void setTemplateSiteId(Integer templateSiteId) {
		this.templateSiteId = templateSiteId;
	}

	protected  String theme;

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	protected  String websiteName;

	public String getWebsiteName() {
		return this.websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Set of settings to deal with site caching.
	 */
	protected  CacheSettings cacheSettings;

	public CacheSettings getCacheSettings() {
		return this.cacheSettings;
	}

	public void setCacheSettings(CacheSettings cacheSettings) {
		this.cacheSettings = cacheSettings;
	}

	/**
	 * Site-level settings for custom routing, which allows you to use your own custom URL patterns for common  pages.
	 */
	protected  CustomRouteSettings customRoutes;

	public CustomRouteSettings getCustomRoutes() {
		return this.customRoutes;
	}

	public void setCustomRoutes(CustomRouteSettings customRoutes) {
		this.customRoutes = customRoutes;
	}

	/**
	 * Set this property to  to disable automatically sending order confirmation emails after an order is submitted. If you enable this property, order confirmation emails are triggered only by the  API operation or a Resend Order Confirmation Email event (which can be triggered by an  user).
	 */
	protected  EmailTransactionSettings emailTransactionsOnlyOnRequest;

	public EmailTransactionSettings getEmailTransactionsOnlyOnRequest() {
		return this.emailTransactionsOnlyOnRequest;
	}

	public void setEmailTransactionsOnlyOnRequest(EmailTransactionSettings emailTransactionsOnlyOnRequest) {
		this.emailTransactionsOnlyOnRequest = emailTransactionsOnlyOnRequest;
	}

	/**
	 * A collection of overrides that allow you to apply unique email settings to the email template(s) of your choice.
	 */
	protected List<EmailTypeSetting> emailTypes;
	public List<EmailTypeSetting> getEmailTypes() {
		return this.emailTypes;
	}
	public void setEmailTypes(List<EmailTypeSetting> emailTypes) {
		this.emailTypes = emailTypes;
	}

	/**
	 * Supressed emails. Setting any of these to 'true' will block  from sending that email and an event will be published instead.
	 */
	protected  EmailTransactionSettings supressedEmailTransactions;

	public EmailTransactionSettings getSupressedEmailTransactions() {
		return this.supressedEmailTransactions;
	}

	public void setSupressedEmailTransactions(EmailTransactionSettings supressedEmailTransactions) {
		this.supressedEmailTransactions = supressedEmailTransactions;
	}

	protected List<TaxableTerritory> taxableTerritories;
	public List<TaxableTerritory> getTaxableTerritories() {
		return this.taxableTerritories;
	}
	public void setTaxableTerritories(List<TaxableTerritory> taxableTerritories) {
		this.taxableTerritories = taxableTerritories;
	}

	/**
	 * A collection of authorizations that control access to viewing the pending and live sites.
	 */
	protected  ViewAuthorizations viewAuthorizations;

	public ViewAuthorizations getViewAuthorizations() {
		return this.viewAuthorizations;
	}

	public void setViewAuthorizations(ViewAuthorizations viewAuthorizations) {
		this.viewAuthorizations = viewAuthorizations;
	}


}
