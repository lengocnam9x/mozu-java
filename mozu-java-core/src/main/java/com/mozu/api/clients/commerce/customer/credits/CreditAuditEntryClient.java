/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.credits;

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
 * Use the Customer Credit Audit Entries subresource to retrieve entries logged in the audit report of a store credit or gift card applied to a customer account. The system creates a new audit entry when the credit is created, deleted, activated, or deactivated. The system then creates a new audit entry each time the credit is updated or redeemed in a transaction.
 * </summary>
 */
public class CreditAuditEntryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient=GetAuditEntriesClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditAuditEntryCollection creditAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> getAuditEntriesClient(String code) throws Exception
	{
		return getAuditEntriesClient( code,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient=GetAuditEntriesClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditAuditEntryCollection creditAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> getAuditEntriesClient(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.credits.CreditAuditEntryUrl.getAuditEntriesUrl(code, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



