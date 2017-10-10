/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

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
 * Use the Location Usages resource to define the locations and location types that interact with the specified site. The system creates three default location usage types for each site after provisioning a new tenant - one for direct ship (DS), one for in-store pickup (SP), and one for store finder (storeFinder). Each site can only use a single location for the direct ship location usage type, and the location must support the direct ship fulfillment type (DS). For the in-store pickup location usage type, each site can use one or more location types. The location service identifies all locations of the specified type that support the in-store pickup fulfillment type (SP). For the store finder location usage type, each site can use one or more location types. The location service identifies all locations of the type. Locations configured for the store finder type do not typically maintain inventory. You cannot create additional location usage types at this time.
 * </summary>
 */
public class LocationUsageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationUsageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsageCollection locationUsageCollection = locationusage.getLocationUsages();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationUsageCollection
	 * @see com.mozu.api.contracts.location.LocationUsageCollection
	 */
	public com.mozu.api.contracts.location.LocationUsageCollection getLocationUsages() throws Exception
	{
		return getLocationUsages( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsageCollection locationUsageCollection = locationusage.getLocationUsages( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.location.LocationUsageCollection
	 * @see com.mozu.api.contracts.location.LocationUsageCollection
	 */
	public com.mozu.api.contracts.location.LocationUsageCollection getLocationUsages(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.getLocationUsagesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.getLocationUsage( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage getLocationUsage(String code) throws Exception
	{
		return getLocationUsage( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.getLocationUsage( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage getLocationUsage(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsage> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.getLocationUsageClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.updateLocationUsage( usage,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param usage Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage updateLocationUsage(com.mozu.api.contracts.location.LocationUsage usage, String code) throws Exception
	{
		return updateLocationUsage( usage,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.updateLocationUsage( usage,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param usage Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage updateLocationUsage(com.mozu.api.contracts.location.LocationUsage usage, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsage> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.updateLocationUsageClient( usage,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



