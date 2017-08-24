/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

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
 * Use the Master Catalog resource to view details of the master catalogs associated with a tenant and to manage the product publishing mode for each master catalog.
 * </summary>
 */
public class MasterCatalogResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public MasterCatalogResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalogCollection masterCatalogCollection = mastercatalog.getMasterCatalogs();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs() throws Exception
	{
		return getMasterCatalogs( null);
	}

	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.getMasterCatalogs( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public CountDownLatch getMasterCatalogsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalogCollection> callback) throws Exception
	{
		return getMasterCatalogsAsync( null, callback);
	}

	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalogCollection masterCatalogCollection = mastercatalog.getMasterCatalogs( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.getMasterCatalogs( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public CountDownLatch getMasterCatalogsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalogCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.getMasterCatalog( masterCatalogId);
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(Integer masterCatalogId) throws Exception
	{
		return getMasterCatalog( masterCatalogId,  null);
	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.getMasterCatalog( masterCatalogId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public CountDownLatch getMasterCatalogAsync(Integer masterCatalogId, AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalog> callback) throws Exception
	{
		return getMasterCatalogAsync( masterCatalogId,  null, callback);
	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.getMasterCatalog( masterCatalogId,  responseFields);
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogClient( masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.getMasterCatalog( masterCatalogId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public CountDownLatch getMasterCatalogAsync(Integer masterCatalogId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalog> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogClient( masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId);
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param masterCatalog Properties of the master catalog to update, which consists of the product publishing mode. Possible values are "Pending" which saves product updates in draft mode until they are published, and "Live" which publishes all product changes immediately.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId) throws Exception
	{
		return updateMasterCatalog( masterCatalog,  masterCatalogId,  null);
	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param  callback callback handler for asynchronous operations
	 * @param masterCatalog Properties of the master catalog to update, which consists of the product publishing mode. Possible values are "Pending" which saves product updates in draft mode until they are published, and "Live" which publishes all product changes immediately.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public CountDownLatch updateMasterCatalogAsync(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalog> callback) throws Exception
	{
		return updateMasterCatalogAsync( masterCatalog,  masterCatalogId,  null, callback);
	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId,  responseFields);
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param masterCatalog Properties of the master catalog to update, which consists of the product publishing mode. Possible values are "Pending" which saves product updates in draft mode until they are published, and "Live" which publishes all product changes immediately.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.updateMasterCatalogClient( masterCatalog,  masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	CountDownLatch latch = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param masterCatalog Properties of the master catalog to update, which consists of the product publishing mode. Possible values are "Pending" which saves product updates in draft mode until they are published, and "Live" which publishes all product changes immediately.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public CountDownLatch updateMasterCatalogAsync(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.MasterCatalog> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.updateMasterCatalogClient( masterCatalog,  masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



