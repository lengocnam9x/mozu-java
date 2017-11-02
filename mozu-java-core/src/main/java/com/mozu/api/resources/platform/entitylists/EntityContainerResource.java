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
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
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
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
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
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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



