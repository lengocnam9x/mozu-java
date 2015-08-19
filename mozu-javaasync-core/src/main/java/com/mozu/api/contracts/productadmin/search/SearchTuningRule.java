/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin.search;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.search.SearchTuningRuleExpression;
import com.mozu.api.contracts.productadmin.search.SearchTuningRuleFunction;
import com.mozu.api.contracts.productadmin.search.SearchTuningRuleFilter;
import com.mozu.api.contracts.core.AuditInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTuningRule implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean active;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	protected DateTime activeEndDate;

	public DateTime getActiveEndDate() {
		return this.activeEndDate;
	}

	public void setActiveEndDate(DateTime activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	protected DateTime activeStartDate;

	public DateTime getActiveStartDate() {
		return this.activeStartDate;
	}

	public void setActiveStartDate(DateTime activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	protected List<String> blockedProductCodes;
	public List<String> getBlockedProductCodes() {
		return this.blockedProductCodes;
	}
	public void setBlockedProductCodes(List<String> blockedProductCodes) {
		this.blockedProductCodes = blockedProductCodes;
	}

	protected List<String> boostedProductCodes;
	public List<String> getBoostedProductCodes() {
		return this.boostedProductCodes;
	}
	public void setBoostedProductCodes(List<String> boostedProductCodes) {
		this.boostedProductCodes = boostedProductCodes;
	}

	protected Boolean isDefault;

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	protected List<String> keywords;
	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	protected String searchTuningRuleCode;

	public String getSearchTuningRuleCode() {
		return this.searchTuningRuleCode;
	}

	public void setSearchTuningRuleCode(String searchTuningRuleCode) {
		this.searchTuningRuleCode = searchTuningRuleCode;
	}

	protected String searchTuningRuleName;

	public String getSearchTuningRuleName() {
		return this.searchTuningRuleName;
	}

	public void setSearchTuningRuleName(String searchTuningRuleName) {
		this.searchTuningRuleName = searchTuningRuleName;
	}

	protected List<SearchTuningRuleExpression> boostExpressions;
	public List<SearchTuningRuleExpression> getBoostExpressions() {
		return this.boostExpressions;
	}
	public void setBoostExpressions(List<SearchTuningRuleExpression> boostExpressions) {
		this.boostExpressions = boostExpressions;
	}

	protected List<SearchTuningRuleFunction> boostFunctions;
	public List<SearchTuningRuleFunction> getBoostFunctions() {
		return this.boostFunctions;
	}
	public void setBoostFunctions(List<SearchTuningRuleFunction> boostFunctions) {
		this.boostFunctions = boostFunctions;
	}

	protected List<SearchTuningRuleFilter> filters;
	public List<SearchTuningRuleFilter> getFilters() {
		return this.filters;
	}
	public void setFilters(List<SearchTuningRuleFilter> filters) {
		this.filters = filters;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
