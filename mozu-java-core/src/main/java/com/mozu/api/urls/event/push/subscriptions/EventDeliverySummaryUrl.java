/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.event.push.subscriptions;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class EventDeliverySummaryUrl
{

	/**
	 * Get Resource Url for GetDeliveryAttemptSummary
	 * @param processId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDeliveryAttemptSummaryUrl(Integer processId, String responseFields, String subscriptionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/event/push/subscriptions/{subscriptionId}/deliveryattempts/{id}?responseFields={responseFields}");
		formatter.formatUrl("processId", processId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("subscriptionId", subscriptionId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDeliveryAttemptSummaries
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDeliveryAttemptSummariesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String subscriptionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/event/push/subscriptions/{subscriptionId}/deliveryattempts?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("subscriptionId", subscriptionId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

