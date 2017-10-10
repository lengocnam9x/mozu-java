/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements;

/**
 *	Properties of a component product in a product bundle. A product bundle can represent either a collection of multiple products sold as a single entity, or a collection of the same product sold as a package. For example, a 10-pack of socks or multiple parts and devices in a technology bundle for a computer.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BundledProduct implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Allocation ID associated with this product on this order.
	 */
	protected  DateTime allocationExpiration;

	public DateTime getAllocationExpiration() {
		return this.allocationExpiration;
	}

	public void setAllocationExpiration(DateTime allocationExpiration) {
		this.allocationExpiration = allocationExpiration;
	}

	/**
	 * Allocation ID associated with this product on this order.
	 */
	protected  Integer allocationId;

	public Integer getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(Integer allocationId) {
		this.allocationId = allocationId;
	}

	/**
	 * The credit value of the product or bundled product. When the `goodsType `is `DigitalCredit`, this value is populated to indicate the value of the credit. This is used to create store credit in the fulfillment of gift cards.
	 */
	protected  Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	/**
	 * If the product is in relative pricing mode, this is the difference between associated prices for a product, variation option, or extra. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. For example, if a product with a defined monogram extra costs an additional $10, the `deltaPrice `value is "10". Between options, a price for a medium may be $10 and a large $12 giving a `deltaPrice `value of "2".Refer to [Product Variant Pricing and Weight](../../../guides/catalog/products.htm#product_variant_pricing_and_weight) in the Products guides topic for more information.
	 */
	protected  Double deltaPrice;

	public Double getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(Double deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Fulfillment status of the product.
	 */
	protected  String fulfillmentStatus;

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	/**
	 * The type of goods in a bundled product. A bundled product is composed of products associated to sell together. Possible values include â€œPhysicalâ€ and â€œDigitalCreditâ€. This comes from the `productType `of the product. Products are defaulted to a Physical `goodsType`. Gift cards have a `goodsType `of DigitalCredit.
	 */
	protected  String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * Indicates if the product must be shipped alone in a container. This is used for products and products within a bundle. If true, this product cannot be shipped in a package with other items and must ship in a package by itself.
	 */
	protected  Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected  String optionAttributeFQN;

	public String getOptionAttributeFQN() {
		return this.optionAttributeFQN;
	}

	public void setOptionAttributeFQN(String optionAttributeFQN) {
		this.optionAttributeFQN = optionAttributeFQN;
	}

	/**
	 * The value of the option attribute. These values are associated and used by product bundles and options.
	 */
	protected  Object optionValue;

	public Object getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(Object optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Unique identifier of the product reservation associated with the component product in a product bundle or item in a cart/order. System-supplied and read only.
	 */
	protected  Integer productReservationId;

	public Integer getProductReservationId() {
		return this.productReservationId;
	}

	public void setProductReservationId(Integer productReservationId) {
		this.productReservationId = productReservationId;
	}

	/**
	 * The specified quantity of objects and items. This property is used for numerous object types including products, options, components within a product bundle, cart and order items, returned items, shipping line items, items in a digital product. and items associated with types and reservations.
	 */
	protected  Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected  PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}


}
