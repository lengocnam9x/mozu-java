/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.adminuser;

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
 * The Accounts resource displays the user accounts and account details associated with a developer or  tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AdminUserResource() 
		{
			_apiContext = null;
	}
public AdminUserResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	TenantCollection tenantCollection = adminuser.getTenantScopesForUser( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.tenant.TenantCollection
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(String userId) throws Exception
	{
		return getTenantScopesForUser( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	CountDownLatch latch = adminuser.getTenantScopesForUser( userId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.tenant.TenantCollection
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public CountDownLatch getTenantScopesForUserAsync(String userId, AsyncCallback<com.mozu.api.contracts.tenant.TenantCollection> callback) throws Exception
	{
		return getTenantScopesForUserAsync( userId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	TenantCollection tenantCollection = adminuser.getTenantScopesForUser( userId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.tenant.TenantCollection
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getTenantScopesForUserClient( userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	CountDownLatch latch = adminuser.getTenantScopesForUser( userId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.tenant.TenantCollection
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public CountDownLatch getTenantScopesForUserAsync(String userId, String responseFields, AsyncCallback<com.mozu.api.contracts.tenant.TenantCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getTenantScopesForUserClient( userId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	User user = adminuser.getUser( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public com.mozu.api.contracts.core.User getUser(String userId) throws Exception
	{
		return getUser( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	CountDownLatch latch = adminuser.getUser( userId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public CountDownLatch getUserAsync(String userId, AsyncCallback<com.mozu.api.contracts.core.User> callback) throws Exception
	{
		return getUserAsync( userId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	User user = adminuser.getUser( userId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public com.mozu.api.contracts.core.User getUser(String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.User> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getUserClient( userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	CountDownLatch latch = adminuser.getUser( userId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public CountDownLatch getUserAsync(String userId, String responseFields, AsyncCallback<com.mozu.api.contracts.core.User> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.User> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getUserClient( userId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



