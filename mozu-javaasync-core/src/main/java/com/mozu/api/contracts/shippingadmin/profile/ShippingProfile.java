/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.profile;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule;
import com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingProfile implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	protected List<Integer> targetedSiteIds;
	public List<Integer> getTargetedSiteIds() {
		return this.targetedSiteIds;
	}
	public void setTargetedSiteIds(List<Integer> targetedSiteIds) {
		this.targetedSiteIds = targetedSiteIds;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<HandlingFeeRule> orderHandlingFeeRules;
	public List<HandlingFeeRule> getOrderHandlingFeeRules() {
		return this.orderHandlingFeeRules;
	}
	public void setOrderHandlingFeeRules(List<HandlingFeeRule> orderHandlingFeeRules) {
		this.orderHandlingFeeRules = orderHandlingFeeRules;
	}

	protected List<HandlingFeeRule> productHandlingFeeRules;
	public List<HandlingFeeRule> getProductHandlingFeeRules() {
		return this.productHandlingFeeRules;
	}
	public void setProductHandlingFeeRules(List<HandlingFeeRule> productHandlingFeeRules) {
		this.productHandlingFeeRules = productHandlingFeeRules;
	}

	protected List<ShippingInclusionRule> shippingInclusionRules;
	public List<ShippingInclusionRule> getShippingInclusionRules() {
		return this.shippingInclusionRules;
	}
	public void setShippingInclusionRules(List<ShippingInclusionRule> shippingInclusionRules) {
		this.shippingInclusionRules = shippingInclusionRules;
	}


}
