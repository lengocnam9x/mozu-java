/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

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
 * Entities are JSON entries within the MZDBÂ ( Mongo DB) for handling large data sets to heavily filter (&gt;2,000 items). Each entity is associated to an EntityList with schema, rules, and formatting for storing the content. This content can be accessed via the  API and  Hypr tags.
 * </summary>
 */
public class EntityClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetEntityClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getEntityClient(String entityListFullName, String id) throws Exception
	{
		return getEntityClient( entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetEntityClient( entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getEntityClient(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.getEntityUrl(entityListFullName, id, responseFields);
		String verb = "GET";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetEntitiesClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getEntitiesClient(String entityListFullName) throws Exception
	{
		return getEntitiesClient( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getEntitiesClient(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.getEntitiesUrl(entityListFullName, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=InsertEntityClient( item,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param item 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> insertEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName) throws Exception
	{
		return insertEntityClient( item,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=InsertEntityClient( item,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param item 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> insertEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.insertEntityUrl(entityListFullName, responseFields);
		String verb = "POST";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(item);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=UpdateEntityClient( item,  entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param item 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> updateEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id) throws Exception
	{
		return updateEntityClient( item,  entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=UpdateEntityClient( item,  entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @param responseFields 
	 * @param item 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> updateEntityClient(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.updateEntityUrl(entityListFullName, id, responseFields);
		String verb = "PUT";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(item);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param id 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityClient(String entityListFullName, String id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityUrl.deleteEntityUrl(entityListFullName, id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



