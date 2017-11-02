/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Payment Settings resource to specify settings when creating payments for order checkout on the site.
 * </summary>
 */
public class PaymentSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PaymentSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName);
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition getThirdPartyPaymentWorkflowWithValues(String fullyQualifiedName) throws Exception
	{
		return getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowWithValuesAsync(String fullyQualifiedName, AsyncCallback<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> callback) throws Exception
	{
		return getThirdPartyPaymentWorkflowWithValuesAsync( fullyQualifiedName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  responseFields);
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition getThirdPartyPaymentWorkflowWithValues(String fullyQualifiedName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowWithValuesAsync(String fullyQualifiedName, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflows();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> getThirdPartyPaymentWorkflows() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflows( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowsAsync( AsyncCallback<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowsClient();
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	paymentsettings.addThirdPartyPaymentWorkflow( definition);
	 * </code></pre></p>
	 * @param definition Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
	 * @return 
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public void addThirdPartyPaymentWorkflow(com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition definition) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.addThirdPartyPaymentWorkflowClient( definition);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	paymentsettings.deleteThirdPartyPaymentWorkflow( fullyQualifiedName);
	 * </code></pre></p>
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @return 
	 */
	public void deleteThirdPartyPaymentWorkflow(String fullyQualifiedName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.deleteThirdPartyPaymentWorkflowClient( fullyQualifiedName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



