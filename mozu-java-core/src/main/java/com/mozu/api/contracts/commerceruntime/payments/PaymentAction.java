/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.payments.PaymentGatewayInteraction;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;

/**
 *	Properties of the payment action performed for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String actionName;

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	protected  Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	protected  String cancelUrl;

	public String getCancelUrl() {
		return this.cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	protected  String checkNumber;

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * An IDÂ provided by a third party external payment service to identify a transaction.
	 */
	protected  String externalTransactionId;

	public String getExternalTransactionId() {
		return this.externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	protected  DateTime interactionDate;

	public DateTime getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(DateTime interactionDate) {
		this.interactionDate = interactionDate;
	}

	protected  String referenceSourcePaymentId;

	public String getReferenceSourcePaymentId() {
		return this.referenceSourcePaymentId;
	}

	public void setReferenceSourcePaymentId(String referenceSourcePaymentId) {
		this.referenceSourcePaymentId = referenceSourcePaymentId;
	}

	protected  String returnUrl;

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * AÂ general field for data to be communicated from an external payment service. 
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected  PaymentGatewayInteraction manualGatewayInteraction;

	public PaymentGatewayInteraction getManualGatewayInteraction() {
		return this.manualGatewayInteraction;
	}

	public void setManualGatewayInteraction(PaymentGatewayInteraction manualGatewayInteraction) {
		this.manualGatewayInteraction = manualGatewayInteraction;
	}

	protected  BillingInfo newBillingInfo;

	public BillingInfo getNewBillingInfo() {
		return this.newBillingInfo;
	}

	public void setNewBillingInfo(BillingInfo newBillingInfo) {
		this.newBillingInfo = newBillingInfo;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
