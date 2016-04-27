/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.event;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.event.EventDeliveryAttempt;
import com.mozu.api.contracts.event.EventSummary;

/**
 *	Data for event deliveries. Returned content details a summary of actions, events, and results for a delivery event.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDeliverySummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The date time in UTC format set when the object was created. 
	 */
	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * Status of the delivery process `EventDeliveryStatusType`. System-supplied and read-only.
	 */
	protected String deliveryStatus;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates whether delivery of the event is currently being attempted at this moment in time
	 */
	protected Boolean isRunning;

	public Boolean getIsRunning() {
		return this.isRunning;
	}

	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}

	/**
	 * The date that the delivery was last attempted (either successfully or not)
	 */
	protected DateTime lastExecutionDate;

	public DateTime getLastExecutionDate() {
		return this.lastExecutionDate;
	}

	public void setLastExecutionDate(DateTime lastExecutionDate) {
		this.lastExecutionDate = lastExecutionDate;
	}

	/**
	 * The date that the delivery will next be attempted, if the event has not been successfully delivered yet and there are still retries remaining
	 */
	protected DateTime nextExecutionDate;

	public DateTime getNextExecutionDate() {
		return this.nextExecutionDate;
	}

	public void setNextExecutionDate(DateTime nextExecutionDate) {
		this.nextExecutionDate = nextExecutionDate;
	}

	/**
	 * Number of delivery attempts remaining
	 */
	protected Integer retriesRemaining;

	public Integer getRetriesRemaining() {
		return this.retriesRemaining;
	}

	public void setRetriesRemaining(Integer retriesRemaining) {
		this.retriesRemaining = retriesRemaining;
	}

	/**
	 * The date and time the object was updated most recently. The date is in UTC format.
	 */
	protected DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Details about each attempted delivery of the event to the endpoint
	 */
	protected List<EventDeliveryAttempt> deliveryAttempts;
	public List<EventDeliveryAttempt> getDeliveryAttempts() {
		return this.deliveryAttempts;
	}
	public void setDeliveryAttempts(List<EventDeliveryAttempt> deliveryAttempts) {
		this.deliveryAttempts = deliveryAttempts;
	}

	/**
	 * Event Summary
	 */
	protected EventSummary eventSummary;

	public EventSummary getEventSummary() {
		return this.eventSummary;
	}

	public void setEventSummary(EventSummary eventSummary) {
		this.eventSummary = eventSummary;
	}

}
