/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

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
 * Use the Cards subresource to manage stored credit cards for customer accounts. Mozu stores limited card data in the Customer service for expedited ordering purposes; however, the complete card data is stored in the Payment service.
 * </summary>
 */
public class CardResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CardResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of a credit card stored with a customer account billing contact.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.getAccountCard( accountId,  cardId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card getAccountCard(Integer accountId, String cardId) throws Exception
	{
		return getAccountCard( accountId,  cardId,  null);
	}

	/**
	 * Retrieves the details of a credit card stored with a customer account billing contact.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.getAccountCard( accountId,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card getAccountCard(Integer accountId, String cardId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Card> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.getAccountCardClient( accountId,  cardId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves all stored credit cards for the customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	CardCollection cardCollection = card.getAccountCards( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CardCollection
	 * @see com.mozu.api.contracts.customer.CardCollection
	 */
	public com.mozu.api.contracts.customer.CardCollection getAccountCards(Integer accountId) throws Exception
	{
		return getAccountCards( accountId,  null);
	}

	/**
	 * Retrieves all stored credit cards for the customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	CardCollection cardCollection = card.getAccountCards( accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.CardCollection
	 * @see com.mozu.api.contracts.customer.CardCollection
	 */
	public com.mozu.api.contracts.customer.CardCollection getAccountCards(Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CardCollection> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.getAccountCardsClient( accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new credit card record and stores it for the customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.addAccountCard( card,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param card Properties of the customer credit card to add to the account.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card addAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId) throws Exception
	{
		return addAccountCard( card,  accountId,  null);
	}

	/**
	 * Creates a new credit card record and stores it for the customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.addAccountCard( card,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param card Properties of the customer credit card to add to the account.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card addAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Card> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.addAccountCardClient( card,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update one or more properties of a credit card defined for a customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.updateAccountCard( card,  accountId,  cardId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card.
	 * @param card Properties of the customer account credit card to update.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card updateAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId, String cardId) throws Exception
	{
		return updateAccountCard( card,  accountId,  cardId,  null);
	}

	/**
	 * Update one or more properties of a credit card defined for a customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.updateAccountCard( card,  accountId,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param card Properties of the customer account credit card to update.
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card updateAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId, String cardId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Card> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.updateAccountCardClient( card,  accountId,  cardId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a stored credit card from a customer account.
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	card.deleteAccountCard( accountId,  cardId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card to delete.
	 * @return 
	 */
	public void deleteAccountCard(Integer accountId, String cardId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CardClient.deleteAccountCardClient( accountId,  cardId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



