/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ProductUrl
{

	/**
	 * Get Resource Url for GetProducts
	 * @param cursorMark In your first deep paged request, set this parameter to . Then, in all subsequent requests, set this parameter to the subsequent values of  that's returned in each response to continue paging through the results. Continue this pattern until  is null, which signifies the end of the paged results.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions Options you can specify for the response. This parameter is null by default.You can primarily use this parameter to return volume price band information in product details, which you can then display on category pages and search results depanding on your theme configuration. To return volume price band information, set this parameter to .
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductsUrl(String cursorMark, String filter, Integer pageSize, String responseFields, String responseOptions, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/?filter={filter}&startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&responseOptions={responseOptions}&cursorMark={cursorMark}&responseFields={responseFields}");
		formatter.formatUrl("cursorMark", cursorMark);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("responseOptions", responseOptions);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInventory
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInventoryUrl(String locationCodes, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/locationinventory?locationCodes={locationCodes}&responseFields={responseFields}");
		formatter.formatUrl("locationCodes", locationCodes);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProduct
	 * @param acceptVariantProductCode Specifies whether to accept a product variant's code as the .When you set this parameter to , you can pass in a product variant's code in the GetProduct call to retrieve the product variant details that are associated with the base product.
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation 
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param supressOutOfStock404 Specifies whether to supress the 404 error when the product is out of stock.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductUrl(Boolean acceptVariantProductCode, Boolean allowInactive, String productCode, String purchaseLocation, Integer quantity, String responseFields, Boolean skipInventoryCheck, Boolean supressOutOfStock404, String variationProductCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}?variationProductCode={variationProductCode}&allowInactive={allowInactive}&skipInventoryCheck={skipInventoryCheck}&supressOutOfStock404={supressOutOfStock404}&quantity={quantity}&acceptVariantProductCode={acceptVariantProductCode}&purchaseLocation={purchaseLocation}&responseFields={responseFields}");
		formatter.formatUrl("acceptVariantProductCode", acceptVariantProductCode);
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("purchaseLocation", purchaseLocation);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("supressOutOfStock404", supressOutOfStock404);
		formatter.formatUrl("variationProductCode", variationProductCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductForIndexing
	 * @param lastModifiedDate The date when the product was last updated.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productVersion The product version.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductForIndexingUrl(DateTime lastModifiedDate, String productCode, Long productVersion, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/indexing/{productCode}&productVersion={productVersion}&lastModifiedDate={lastModifiedDate}?responseFields={responseFields}");
		formatter.formatUrl("lastModifiedDate", lastModifiedDate);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("productVersion", productVersion);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ConfiguredProduct
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation 
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl configuredProductUrl(Boolean includeOptionDetails, String productCode, String purchaseLocation, Integer quantity, String responseFields, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/configure?includeOptionDetails={includeOptionDetails}&skipInventoryCheck={skipInventoryCheck}&quantity={quantity}&purchaseLocation={purchaseLocation}&responseFields={responseFields}");
		formatter.formatUrl("includeOptionDetails", includeOptionDetails);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("purchaseLocation", purchaseLocation);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateProduct
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation 
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipDefaults Normally, product validation applies default extras to products that do not have options specified. If , product validation does not apply default extras to products.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateProductUrl(String productCode, String purchaseLocation, Integer quantity, String responseFields, Boolean skipDefaults, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/validate?skipInventoryCheck={skipInventoryCheck}&quantity={quantity}&skipDefaults={skipDefaults}&purchaseLocation={purchaseLocation}&responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("purchaseLocation", purchaseLocation);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipDefaults", skipDefaults);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateDiscounts
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateDiscountsUrl(Boolean allowInactive, Integer customerAccountId, String productCode, String responseFields, Boolean skipInventoryCheck, String variationProductCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/validateDiscounts?variationProductCode={variationProductCode}&customerAccountId={customerAccountId}&allowInactive={allowInactive}&skipInventoryCheck={skipInventoryCheck}&responseFields={responseFields}");
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("variationProductCode", variationProductCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductCosts
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductCostsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/costs?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInventories
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInventoriesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/locationinventory?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

