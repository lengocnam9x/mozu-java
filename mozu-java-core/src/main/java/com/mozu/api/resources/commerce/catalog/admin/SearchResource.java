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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Search resource to manage all settings and options for providing product search on your site, as well as search tuning rules.
 * </summary>
 */
public class SearchResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SearchResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		return getSearchTuningRule( searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules() throws Exception
	{
		return getSearchTuningRules( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleSortFields searchTuningRuleSortFields = search.getSearchTuningRuleSortFields();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields getSearchTuningRuleSortFields() throws Exception
	{
		return getSearchTuningRuleSortFields( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleSortFields searchTuningRuleSortFields = search.getSearchTuningRuleSortFields( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields getSearchTuningRuleSortFields(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleSortFieldsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings() throws Exception
	{
		return getSettings( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionCollection synonymDefinitionCollection = search.getSynonymDefinitionCollection( localeCode);
	 * </code></pre></p>
	 * @param localeCode 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection getSynonymDefinitionCollection(String localeCode) throws Exception
	{
		return getSynonymDefinitionCollection( localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionCollection synonymDefinitionCollection = search.getSynonymDefinitionCollection( localeCode,  responseFields);
	 * </code></pre></p>
	 * @param localeCode 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection getSynonymDefinitionCollection(String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSynonymDefinitionCollectionClient( localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionPagedCollection synonymDefinitionPagedCollection = search.getSynonymDefinitions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection getSynonymDefinitions() throws Exception
	{
		return getSynonymDefinitions( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionPagedCollection synonymDefinitionPagedCollection = search.getSynonymDefinitions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection getSynonymDefinitions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSynonymDefinitionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.getSynonymDefinition( synonymId);
	 * </code></pre></p>
	 * @param synonymId 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition getSynonymDefinition(Integer synonymId) throws Exception
	{
		return getSynonymDefinition( synonymId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.getSynonymDefinition( synonymId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymId 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition getSynonymDefinition(Integer synonymId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSynonymDefinitionClient( synonymId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn);
	 * </code></pre></p>
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn) throws Exception
	{
		return addSearchTuningRule( searchTuningRuleIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.addSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleSortFields searchTuningRuleSortFields = search.updateSearchTuningRuleSortFields( searchTuningRuleSortFieldsIn);
	 * </code></pre></p>
	 * @param searchTuningRuleSortFieldsIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields updateSearchTuningRuleSortFields(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn) throws Exception
	{
		return updateSearchTuningRuleSortFields( searchTuningRuleSortFieldsIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleSortFields searchTuningRuleSortFields = search.updateSearchTuningRuleSortFields( searchTuningRuleSortFieldsIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleSortFieldsIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields updateSearchTuningRuleSortFields(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionCollection synonymDefinitionCollection = search.updateSynonymDefinitionCollection( collection,  localeCode);
	 * </code></pre></p>
	 * @param localeCode 
	 * @param collection 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection updateSynonymDefinitionCollection(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode) throws Exception
	{
		return updateSynonymDefinitionCollection( collection,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinitionCollection synonymDefinitionCollection = search.updateSynonymDefinitionCollection( collection,  localeCode,  responseFields);
	 * </code></pre></p>
	 * @param localeCode 
	 * @param responseFields 
	 * @param collection 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection updateSynonymDefinitionCollection(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSynonymDefinitionCollectionClient( collection,  localeCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.addSynonymDefinition( synonymDefinition);
	 * </code></pre></p>
	 * @param synonymDefinition 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition addSynonymDefinition(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition) throws Exception
	{
		return addSynonymDefinition( synonymDefinition,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.addSynonymDefinition( synonymDefinition,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymDefinition 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition addSynonymDefinition(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.addSynonymDefinitionClient( synonymDefinition,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode) throws Exception
	{
		return updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings);
	 * </code></pre></p>
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettings( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param settings 
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.updateSynonymDefinition( synonymDefinition,  synonymId);
	 * </code></pre></p>
	 * @param synonymId 
	 * @param synonymDefinition 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition updateSynonymDefinition(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId) throws Exception
	{
		return updateSynonymDefinition( synonymDefinition,  synonymId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SynonymDefinition synonymDefinition = search.updateSynonymDefinition( synonymDefinition,  synonymId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymId 
	 * @param synonymDefinition 
	 * @return com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public com.mozu.api.contracts.productadmin.search.SynonymDefinition updateSynonymDefinition(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSynonymDefinitionClient( synonymDefinition,  synonymId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	search.deleteSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return 
	 */
	public void deleteSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.deleteSearchTuningRuleClient( searchTuningRuleCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	search.deleteSynonymDefinition( synonymId);
	 * </code></pre></p>
	 * @param synonymId 
	 * @return 
	 */
	public void deleteSynonymDefinition(Integer synonymId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.deleteSynonymDefinitionClient( synonymId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



