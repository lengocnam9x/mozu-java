/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.response;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.paymentservice.FraudScreenResponseData;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FraudScreenResponse implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected String transactionId;

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	protected List<FraudScreenResponseData> fraudScreenResponseData;
	public List<FraudScreenResponseData> getFraudScreenResponseData() {
		return this.fraudScreenResponseData;
	}
	public void setFraudScreenResponseData(List<FraudScreenResponseData> fraudScreenResponseData) {
		this.fraudScreenResponseData = fraudScreenResponseData;
	}

}
