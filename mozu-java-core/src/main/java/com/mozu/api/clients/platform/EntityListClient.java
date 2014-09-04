/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class EntityListClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient=GetEntityListsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityListCollection entityListCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityListCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> getEntityListsClient() throws Exception
	{
		return getEntityListsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient=GetEntityListsClient( pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityListCollection entityListCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityListCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> getEntityListsClient(Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.getEntityListsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityListCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=GetEntityListClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> getEntityListClient(String entityListFullName) throws Exception
	{
		return getEntityListClient( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=GetEntityListClient( entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> getEntityListClient(String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.getEntityListUrl(entityListFullName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=CreateEntityListClient( entityList);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> createEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList) throws Exception
	{
		return createEntityListClient( entityList,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=CreateEntityListClient( entityList,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param entityList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> createEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.createEntityListUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(entityList);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=UpdateEntityListClient( entityList,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param entityList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> updateEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName) throws Exception
	{
		return updateEntityListClient( entityList,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=UpdateEntityListClient( entityList,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param entityList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> updateEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.updateEntityListUrl(entityListFullName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(entityList);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityListClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityListClient(String entityListFullName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.deleteEntityListUrl(entityListFullName);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



