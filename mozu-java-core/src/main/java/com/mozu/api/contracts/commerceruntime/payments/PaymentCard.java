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

/**
 *	Properties of a credit card used to submit payment for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCard implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String cardNumberPartOrMask;

	public String getCardNumberPartOrMask() {
		return this.cardNumberPartOrMask;
	}

	public void setCardNumberPartOrMask(String cardNumberPartOrMask) {
		this.cardNumberPartOrMask = cardNumberPartOrMask;
	}

	protected  short expireMonth;

	public short getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(short expireMonth) {
		this.expireMonth = expireMonth;
	}

	protected  short expireYear;

	public short getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(short expireYear) {
		this.expireYear = expireYear;
	}

	protected  Boolean isCardInfoSaved;

	public Boolean getIsCardInfoSaved() {
		return this.isCardInfoSaved;
	}

	public void setIsCardInfoSaved(Boolean isCardInfoSaved) {
		this.isCardInfoSaved = isCardInfoSaved;
	}

	protected  Boolean isUsedRecurring;

	public Boolean getIsUsedRecurring() {
		return this.isUsedRecurring;
	}

	public void setIsUsedRecurring(Boolean isUsedRecurring) {
		this.isUsedRecurring = isUsedRecurring;
	}

	protected  String nameOnCard;

	public String getNameOnCard() {
		return this.nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	protected  String paymentOrCardType;

	public String getPaymentOrCardType() {
		return this.paymentOrCardType;
	}

	public void setPaymentOrCardType(String paymentOrCardType) {
		this.paymentOrCardType = paymentOrCardType;
	}

	protected  String paymentServiceCardId;

	public String getPaymentServiceCardId() {
		return this.paymentServiceCardId;
	}

	public void setPaymentServiceCardId(String paymentServiceCardId) {
		this.paymentServiceCardId = paymentServiceCardId;
	}


}
