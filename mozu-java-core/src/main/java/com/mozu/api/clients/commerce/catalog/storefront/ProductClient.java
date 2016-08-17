/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Storefront Products  resource to manage the shopper product selection process during a visit to the web storefront. You can update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductClient {
	
	/**
	 * Retrieves a list of products that appear on the web storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductsClient(dataViewMode,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of products that appear on the web storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient(dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseOptions,  cursorMark,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @param cursorMark 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseOptions, String cursorMark, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductsUrl(cursorMark, filter, pageSize, responseFields, responseOptions, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductInventoryClient(dataViewMode,  productCode,  null,  null);
	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient(dataViewMode,  productCode,  locationCodes,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCodes, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoryUrl(locationCodes, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductClient(dataViewMode,  productCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient(dataViewMode,  productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  supressOutOfStock404,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param supressOutOfStock404 Specifies whether to supress the 404 error when the product is out of stock.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, Boolean supressOutOfStock404, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductUrl(allowInactive, productCode, quantity, responseFields, skipInventoryCheck, supressOutOfStock404, variationProductCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Product.class;
		MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves information about a single product given its product code for Mozu to index in the search engine
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductForIndexingClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductForIndexingClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductForIndexingClient(dataViewMode,  productCode,  null,  null);
	}

	/**
	 * Retrieves information about a single product given its product code for Mozu to index in the search engine
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductForIndexingClient(dataViewMode,  productCode,  productVersion,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param productVersion 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductForIndexingClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Long productVersion, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductForIndexingUrl(productCode, productVersion, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Product.class;
		MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return configuredProductClient( productOptionSelections,  productCode,  null,  null,  null,  null);
	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.configuredProductUrl(includeOptionDetails, productCode, quantity, responseFields, skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ConfiguredProduct.class;
		MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return validateProductClient( productOptionSelections,  productCode,  null,  null,  null);
	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode,  skipInventoryCheck,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateProductUrl(productCode, quantity, responseFields, skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * Evaluates whether a collection of discounts specified in the request can be redeemed for the supplied product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode) throws Exception
	{
		return validateDiscountsClient( discountSelections,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Evaluates whether a collection of discounts specified in the request can be redeemed for the supplied product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateDiscountsUrl(allowInactive, customerAccountId, productCode, responseFields, skipInventoryCheck, variationProductCode);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.DiscountValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountSelections);
		return mozuClient;

	}

	/**
	 * Retrieves product inventories for the storefront displayed products.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient(dataViewMode,  query);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query) throws Exception
	{
		return getProductInventoriesClient(dataViewMode,  query,  null);
	}

	/**
	 * Retrieves product inventories for the storefront displayed products.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient(dataViewMode,  query,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoriesUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(query);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



