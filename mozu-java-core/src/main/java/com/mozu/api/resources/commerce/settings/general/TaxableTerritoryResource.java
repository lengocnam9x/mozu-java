/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.general;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the taxable territories subresource to manage the regional territories for this site that are subejct to sales tax.
 * </summary>
 */
public class TaxableTerritoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TaxableTerritoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the taxable territories configured for the site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.GetTaxableTerritories();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> getTaxableTerritories() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.getTaxableTerritoriesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new territory for which to calculate sales tax.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.AddTaxableTerritory( taxableTerritory);
	 * </code></pre></p>
	 * @param taxableTerritory Properties of the taxable territory to create.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.addTaxableTerritoryClient( taxableTerritory);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more taxable territories configured for a site.
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.UpdateTaxableTerritories( taxableterritories);
	 * </code></pre></p>
	 * @param taxableterritories Properties of the taxable territories to update.
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> updateTaxableTerritories(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.updateTaxableTerritoriesClient( taxableterritories);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



