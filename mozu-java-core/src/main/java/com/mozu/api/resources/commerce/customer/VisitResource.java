/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Visits resource to manage all visits a customer makes to a tenant's sites and measure the level of transactions a customer performs during a unique visit for customer account analytics. Clients can track customer visits by site (including online and in-person interactions), the transactions a customer performs during the visit, and the device type associated with the visit, if any.
 * </summary>
 */
public class VisitResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public VisitResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of customer visits according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	VisitCollection visitCollection = visit.getVisits();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.VisitCollection
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public com.mozu.api.contracts.customer.VisitCollection getVisits() throws Exception
	{
		return getVisits( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of customer visits according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	VisitCollection visitCollection = visit.getVisits( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.VisitCollection
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public com.mozu.api.contracts.customer.VisitCollection getVisits(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.VisitCollection> client = com.mozu.api.clients.commerce.customer.VisitClient.getVisitsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the customer visit specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.getVisit( visitId);
	 * </code></pre></p>
	 * @param visitId Unique identifier of the customer visit to retrieve.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit getVisit(String visitId) throws Exception
	{
		return getVisit( visitId,  null);
	}

	/**
	 * Retrieves the details of the customer visit specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.getVisit( visitId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param visitId Unique identifier of the customer visit to retrieve.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit getVisit(String visitId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.getVisitClient( visitId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new visit for the customer account specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.addVisit( visit);
	 * </code></pre></p>
	 * @param visit Properties of the visit to add to the customer account.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit addVisit(com.mozu.api.contracts.customer.Visit visit) throws Exception
	{
		return addVisit( visit,  null);
	}

	/**
	 * Creates a new visit for the customer account specified in the request.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.addVisit( visit,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param visit Properties of the visit to add to the customer account.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit addVisit(com.mozu.api.contracts.customer.Visit visit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.addVisitClient( visit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a defined customer visit.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.updateVisit( visit,  visitId);
	 * </code></pre></p>
	 * @param visitId Unique identifier of the customer visit to update.
	 * @param visit Properties of the customer visit to update.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit updateVisit(com.mozu.api.contracts.customer.Visit visit, String visitId) throws Exception
	{
		return updateVisit( visit,  visitId,  null);
	}

	/**
	 * Updates one or more properties of a defined customer visit.
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.updateVisit( visit,  visitId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param visitId Unique identifier of the customer visit to update.
	 * @param visit Properties of the customer visit to update.
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit updateVisit(com.mozu.api.contracts.customer.Visit visit, String visitId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.updateVisitClient( visit,  visitId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



