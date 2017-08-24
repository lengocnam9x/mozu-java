/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * A digital package is a package in a digital format.
 * </summary>
 */
public class DigitalPackageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public DigitalPackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	string string = digitalpackage.getAvailableDigitalPackageFulfillmentActions( orderId,  digitalPackageId);
	 * </code></pre></p>
	 * @param digitalPackageId This parameter supplies package ID to get fulfillment actions for the digital package.
	 * @param orderId This parameter provides the unique identifier of the order on which to get a list of available actions.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableDigitalPackageFulfillmentActions(String orderId, String digitalPackageId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.DigitalPackageClient.getAvailableDigitalPackageFulfillmentActionsClient( orderId,  digitalPackageId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * This operation retreives a digital package within an order and it requires two parameters: orderId and digitalPackageId.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.getDigitalPackage( orderId,  digitalPackageId);
	 * </code></pre></p>
	 * @param digitalPackageId This parameter provides the digital package Id.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage getDigitalPackage(String orderId, String digitalPackageId) throws Exception
	{
		return getDigitalPackage( orderId,  digitalPackageId,  null);
	}

	/**
	 * This operation retreives a digital package within an order and it requires two parameters: orderId and digitalPackageId.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.getDigitalPackage( orderId,  digitalPackageId,  responseFields);
	 * </code></pre></p>
	 * @param digitalPackageId This parameter provides the digital package Id.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage getDigitalPackage(String orderId, String digitalPackageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> client = com.mozu.api.clients.commerce.orders.DigitalPackageClient.getDigitalPackageClient( orderId,  digitalPackageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Lets you apply a digital package to the order using the orderId and digitalPackage parameters.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.createDigitalPackage( digitalPackage,  orderId);
	 * </code></pre></p>
	 * @param orderId The orderID is a required paramter for the digitalpackages operation. The orderId is a unique identifier of the order with which to associate the digital package.
	 * @param digitalPackage The digitalPackage parameter is a required parameter for the CreateDigitalPackages operation. The digitalPackage is the digital package to create and add to the order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage createDigitalPackage(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId) throws Exception
	{
		return createDigitalPackage( digitalPackage,  orderId,  null);
	}

	/**
	 * Lets you apply a digital package to the order using the orderId and digitalPackage parameters.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.createDigitalPackage( digitalPackage,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId The orderID is a required paramter for the digitalpackages operation. The orderId is a unique identifier of the order with which to associate the digital package.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param digitalPackage The digitalPackage parameter is a required parameter for the CreateDigitalPackages operation. The digitalPackage is the digital package to create and add to the order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage createDigitalPackage(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> client = com.mozu.api.clients.commerce.orders.DigitalPackageClient.createDigitalPackageClient( digitalPackage,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * This method operates on one digital package, specified by the id given. This method ensures that the digital package ID provided is in the order with the id given, and then updates the properties of that package with the properties of the one passed in using the ‘digitalpackage’ parameter.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.updateDigitalPackage( digitalPackage,  orderId,  digitalPackageId);
	 * </code></pre></p>
	 * @param digitalPackageId This parameter specifies the digital package to update in the order.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @param digitalPackage This parameter provides the package content to update in the order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage updateDigitalPackage(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId) throws Exception
	{
		return updateDigitalPackage( digitalPackage,  orderId,  digitalPackageId,  null);
	}

	/**
	 * This method operates on one digital package, specified by the id given. This method ensures that the digital package ID provided is in the order with the id given, and then updates the properties of that package with the properties of the one passed in using the ‘digitalpackage’ parameter.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	DigitalPackage digitalPackage = digitalpackage.updateDigitalPackage( digitalPackage,  orderId,  digitalPackageId,  responseFields);
	 * </code></pre></p>
	 * @param digitalPackageId This parameter specifies the digital package to update in the order.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param digitalPackage This parameter provides the package content to update in the order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage updateDigitalPackage(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> client = com.mozu.api.clients.commerce.orders.DigitalPackageClient.updateDigitalPackageClient( digitalPackage,  orderId,  digitalPackageId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * This operation deletes a digital package from an order. This operation requires three parameters: orderId, digitalPackageId, and digitalPackage.
	 * <p><pre><code>
	 *	DigitalPackage digitalpackage = new DigitalPackage();
	 *	digitalpackage.deleteDigitalPackage( orderId,  digitalPackageId);
	 * </code></pre></p>
	 * @param digitalPackageId The digitalPackage ID is unique package ID to update on the order.
	 * @param orderId The orderId is unique identifier of the order with which to associate the package.
	 * @return 
	 */
	public void deleteDigitalPackage(String orderId, String digitalPackageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.DigitalPackageClient.deleteDigitalPackageClient( orderId,  digitalPackageId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



