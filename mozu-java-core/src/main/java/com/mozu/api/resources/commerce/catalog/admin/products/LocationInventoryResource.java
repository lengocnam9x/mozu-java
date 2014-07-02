/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Product Location Inventory resource to manage the levels of active product inventory to maintain across defined locations at the product level.
 * </summary>
 */
public class LocationInventoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public LocationInventoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.GetLocationInventories(dataViewMode,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getLocationInventories(dataViewMode,  productCode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.GetLocationInventories(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoriesClient(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the inventory of the product in the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.GetLocationInventory(dataViewMode,  productCode,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that identifies the location.
	 * @param productCode 
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoryClient(dataViewMode,  productCode,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.AddLocationInventory(dataViewMode,  locationInventoryList,  productCode);
	 * </code></pre></p>
	 * @param productCode ProductCodeBase
	 * @param locationInventoryList Array list of the location inventory definitions associated with the product code specified in the request. For each location, you must define the locationCode value and the stockOnHand value. All other properties in the array are system-supplied and read only.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode) throws Exception
	{
		return addLocationInventory(dataViewMode,  locationInventoryList,  productCode,  null);
	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.AddLocationInventory(dataViewMode,  locationInventoryList,  productCode,  performUpserts);
	 * </code></pre></p>
	 * @param performUpserts 
	 * @param productCode ProductCodeBase
	 * @param locationInventoryList Array list of the location inventory definitions associated with the product code specified in the request. For each location, you must define the locationCode value and the stockOnHand value. All other properties in the array are system-supplied and read only.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, Boolean performUpserts) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.addLocationInventoryClient(dataViewMode,  locationInventoryList,  productCode,  performUpserts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the current level of stock at each location associated with the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.UpdateLocationInventory(dataViewMode,  locationInventoryAdjustments,  productCode);
	 * </code></pre></p>
	 * @param productCode The product code of the product for which to update active stock on hand inventory at a specified location.
	 * @param locationInventoryAdjustments 
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.updateLocationInventoryClient(dataViewMode,  locationInventoryAdjustments,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	locationinventory.DeleteLocationInventory(dataViewMode,  productCode,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The code that identifies the location for which to delete product inventory.
	 * @param productCode The product code for which to delete a location's inventory.
	 * @return 
	 */
	public void deleteLocationInventory(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.deleteLocationInventoryClient(dataViewMode,  productCode,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



