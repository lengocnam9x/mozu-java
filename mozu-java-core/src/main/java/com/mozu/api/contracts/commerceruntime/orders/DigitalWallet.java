/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigitalWallet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String cartId;

	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	protected  String digitalWalletData;

	public String getDigitalWalletData() {
		return this.digitalWalletData;
	}

	public void setDigitalWalletData(String digitalWalletData) {
		this.digitalWalletData = digitalWalletData;
	}


}
