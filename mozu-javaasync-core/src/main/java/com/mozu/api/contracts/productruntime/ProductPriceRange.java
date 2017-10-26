/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.ProductPrice;

/**
 *	For products with options that vary the cost of the product, the range between lowest and highest possible price of the product based on the current selection of options.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPriceRange implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  ProductPrice lower;

	public ProductPrice getLower() {
		return this.lower;
	}

	public void setLower(ProductPrice lower) {
		this.lower = lower;
	}

	protected  ProductPrice upper;

	public ProductPrice getUpper() {
		return this.upper;
	}

	public void setUpper(ProductPrice upper) {
		this.upper = upper;
	}


}
