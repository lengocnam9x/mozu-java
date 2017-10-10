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
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		return getAccountAttribute( accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributeClient( accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId) throws Exception
	{
		return getAccountAttributes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addAccountAttribute( attribute,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.addAccountAttributeClient( attribute,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateAccountAttribute( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	customerattribute.deleteAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return 
	 */
	public void deleteAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.deleteAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



