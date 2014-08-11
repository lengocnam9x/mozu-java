/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer.credit;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditTransaction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The type of transaction to perform for the customer credit. To decrease the balance, set this parameter to "Debit". To increase the balance, set this parameter to "Credit".
	 */
	protected String transactionType;

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Comments entered for a transaction. Depending on the interface, these comments might be visible to authorized shoppers and users.
	 */
	protected String comments;

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * Unique identifier of the customer credit transaction.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The amount to apply to the credit balance. The defined transaction type determines whether this amount represents a positive or negative integer.
	 */
	protected Double impactAmount;

	public Double getImpactAmount() {
		return this.impactAmount;
	}

	public void setImpactAmount(Double impactAmount) {
		this.impactAmount = impactAmount;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
