/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.entitylists;

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
 * Entity containers provide all properties and data for entities within a site/tenant. This data encapsulates all associated IDs including entity lists, entity views, site, tenant, entities, and more.
 * </summary>
 */
public class EntityContainerResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EntityContainerResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	EntityContainer entitycontainer = new EntityContainer();
	 *	EntityContainer entityContainer = entitycontainer.getEntityContainer( entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getEntityContainer(String entityListFullName, String id) throws Exception
	{
		return getEntityContainer( entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityContainer entitycontainer = new EntityContainer();
	 *	EntityContainer entityContainer = entitycontainer.getEntityContainer( entityListFullName,  id,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getEntityContainer(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> client = com.mozu.api.clients.platform.entitylists.EntityContainerClient.getEntityContainerClient( entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityContainer entitycontainer = new EntityContainer();
	 *	EntityContainerCollection entityContainerCollection = entitycontainer.getEntityContainers( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getEntityContainers(String entityListFullName) throws Exception
	{
		return getEntityContainers( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityContainer entitycontainer = new EntityContainer();
	 *	EntityContainerCollection entityContainerCollection = entitycontainer.getEntityContainers( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getEntityContainers(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> client = com.mozu.api.clients.platform.entitylists.EntityContainerClient.getEntityContainersClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



