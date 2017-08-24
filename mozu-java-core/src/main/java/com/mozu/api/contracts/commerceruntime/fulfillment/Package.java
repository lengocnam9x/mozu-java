/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.fulfillment.PackageItem;
import com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements;

/**
 *	Properties of a physical package shipped for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Package implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The actions that a user can perform for a package at this time.
	 */
	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

	/**
	 * The code of the product to be fulfilled.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * The date and time the package shipped to the customer.
	 */
	protected  DateTime fulfillmentDate;

	public DateTime getFulfillmentDate() {
		return this.fulfillmentDate;
	}

	public void setFulfillmentDate(DateTime fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

	/**
	 * The location code that represents the location from which this package will ship.
	 */
	protected  String fulfillmentLocationCode;

	public String getFulfillmentLocationCode() {
		return this.fulfillmentLocationCode;
	}

	public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
		this.fulfillmentLocationCode = fulfillmentLocationCode;
	}

	protected  Boolean hasLabel;

	public Boolean getHasLabel() {
		return this.hasLabel;
	}

	public void setHasLabel(Boolean hasLabel) {
		this.hasLabel = hasLabel;
	}

	/**
	 * Unique identifier of a package.
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The package type associated with this physical package. Possible values include Tube, Letter, Pak, Small Box (carrier_box_small), Medium Box (carrier_box_medium), Large Box (carrier_box_large), or Custom.
	 */
	protected  String packagingType;

	public String getPackagingType() {
		return this.packagingType;
	}

	public void setPackagingType(String packagingType) {
		this.packagingType = packagingType;
	}

	/**
	 * Unique identifier of the shipment associated with this package.
	 */
	protected  String shipmentId;

	public String getShipmentId() {
		return this.shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	/**
	 * The code associated with the carrier's shipping method service type. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD
	 */
	protected  String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * Name of the shipping method associated with the package. For example: UPS Ground or 2nd Day Air.
	 */
	protected  String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	/**
	 * Status of the package, which is "Fulfilled" or "NotFulfilled".
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Tracking number for the package supplied by the carrier.
	 */
	protected  String trackingNumber;

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * List of change messages associated with the package.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<PackageItem> items;
	public List<PackageItem> getItems() {
		return this.items;
	}
	public void setItems(List<PackageItem> items) {
		this.items = items;
	}

	/**
	 * Dimensional properties of the package.
	 */
	protected  PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}


}
