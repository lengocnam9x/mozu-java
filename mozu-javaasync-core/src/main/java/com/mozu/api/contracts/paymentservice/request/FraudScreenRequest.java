/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.request;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.paymentservice.Address;
import com.mozu.api.contracts.paymentservice.Contact;
import com.mozu.api.contracts.paymentservice.GatewayCredentialFieldValue;
import com.mozu.api.contracts.paymentservice.CustomData;
import com.mozu.api.contracts.paymentservice.OrderItem;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FraudScreenRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String avsCodes;

	public String getAvsCodes() {
		return this.avsCodes;
	}

	public void setAvsCodes(String avsCodes) {
		this.avsCodes = avsCodes;
	}

	protected  String cardId;

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	protected  String cardNumberPart;

	public String getCardNumberPart() {
		return this.cardNumberPart;
	}

	public void setCardNumberPart(String cardNumberPart) {
		this.cardNumberPart = cardNumberPart;
	}

	protected  String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected  String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	protected  String cvV2Codes;

	public String getCvV2Codes() {
		return this.cvV2Codes;
	}

	public void setCvV2Codes(String cvV2Codes) {
		this.cvV2Codes = cvV2Codes;
	}

	protected  Integer expireMonth;

	public Integer getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	protected  Integer expireYear;

	public Integer getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}

	protected  String gatewayAccountId;

	public String getGatewayAccountId() {
		return this.gatewayAccountId;
	}

	public void setGatewayAccountId(String gatewayAccountId) {
		this.gatewayAccountId = gatewayAccountId;
	}

	protected  String merchantTransactionId;

	public String getMerchantTransactionId() {
		return this.merchantTransactionId;
	}

	public void setMerchantTransactionId(String merchantTransactionId) {
		this.merchantTransactionId = merchantTransactionId;
	}

	protected  Integer orderNumber;

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	protected  String paymentTransactionId;

	public String getPaymentTransactionId() {
		return this.paymentTransactionId;
	}

	public void setPaymentTransactionId(String paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
	}

	protected  String paymentType;

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	protected  String requestorIp;

	public String getRequestorIp() {
		return this.requestorIp;
	}

	public void setRequestorIp(String requestorIp) {
		this.requestorIp = requestorIp;
	}

	protected  String requestorUrl;

	public String getRequestorUrl() {
		return this.requestorUrl;
	}

	public void setRequestorUrl(String requestorUrl) {
		this.requestorUrl = requestorUrl;
	}

	protected  String requestorUserAgent;

	public String getRequestorUserAgent() {
		return this.requestorUserAgent;
	}

	public void setRequestorUserAgent(String requestorUserAgent) {
		this.requestorUserAgent = requestorUserAgent;
	}

	protected  String shipType;

	public String getShipType() {
		return this.shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	protected  Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	protected  Address billingAddress;

	public Address getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	protected  Contact billingContact;

	public Contact getBillingContact() {
		return this.billingContact;
	}

	public void setBillingContact(Contact billingContact) {
		this.billingContact = billingContact;
	}

	protected List<GatewayCredentialFieldValue> credentialFieldsOverride;
	public List<GatewayCredentialFieldValue> getCredentialFieldsOverride() {
		return this.credentialFieldsOverride;
	}
	public void setCredentialFieldsOverride(List<GatewayCredentialFieldValue> credentialFieldsOverride) {
		this.credentialFieldsOverride = credentialFieldsOverride;
	}

	protected List<CustomData> customData;
	public List<CustomData> getCustomData() {
		return this.customData;
	}
	public void setCustomData(List<CustomData> customData) {
		this.customData = customData;
	}

	protected List<OrderItem> orderItems;
	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	protected  Address shippingAddress;

	public Address getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	protected  Contact shippingContact;

	public Contact getShippingContact() {
		return this.shippingContact;
	}

	public void setShippingContact(Contact shippingContact) {
		this.shippingContact = shippingContact;
	}


}
