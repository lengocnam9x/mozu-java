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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Use the Customer Credit Transactions subresource to manage the individual transactions performed using a store credit or gift card.
 * </summary>
 */
public class CreditTransactionClient {
	
	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> mozuClient=GetTransactionsClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditTransactionCollection creditTransactionCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditTransactionCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> getTransactionsClient(String code) throws Exception
	{
		return getTransactionsClient( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> mozuClient=GetTransactionsClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditTransactionCollection creditTransactionCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditTransactionCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> getTransactionsClient(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.credits.CreditTransactionUrl.getTransactionsUrl(code, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditTransactionCollection.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> mozuClient=AddTransactionClient( creditTransaction,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditTransaction creditTransaction = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditTransaction>
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> addTransactionClient(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code) throws Exception
	{
		return addTransactionClient( creditTransaction,  code,  null);
	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> mozuClient=AddTransactionClient( creditTransaction,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditTransaction creditTransaction = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditTransaction>
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> addTransactionClient(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.credits.CreditTransactionUrl.addTransactionUrl(code, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditTransaction.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(creditTransaction);
		return mozuClient;

	}

}



