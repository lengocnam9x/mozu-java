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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Extras resource to configure an extra product attribute for products associated with the product type that uses the extra attribute.
 * </summary>
 */
public class ProductExtraResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductExtraResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductExtraResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of extras configured for the product according to any defined filter and sort criteria.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.getExtras( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return List<com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public List<com.mozu.api.contracts.productadmin.ProductExtra> getExtras(String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtrasClient(_dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.getExtraValueLocalizedDeltaPrices( productCode,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @return List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> getExtraValueLocalizedDeltaPrices(String productCode, String attributeFQN, String value) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtraValueLocalizedDeltaPricesClient(_dataViewMode,  productCode,  attributeFQN,  value);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.getExtraValueLocalizedDeltaPrice( productCode,  attributeFQN,  value,  currencyCode);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param value 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice getExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		return getExtraValueLocalizedDeltaPrice( productCode,  attributeFQN,  value,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.getExtraValueLocalizedDeltaPrice( productCode,  attributeFQN,  value,  currencyCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice getExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtraValueLocalizedDeltaPriceClient(_dataViewMode,  productCode,  attributeFQN,  value,  currencyCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.getExtra( productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra getExtra(String productCode, String attributeFQN) throws Exception
	{
		return getExtra( productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.getExtra( productCode,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra getExtra(String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.getExtraClient(_dataViewMode,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.addExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice addExtraValueLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value) throws Exception
	{
		return addExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.addExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice addExtraValueLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.addExtraValueLocalizedDeltaPriceClient(_dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.addExtra( productExtra,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the product extra to configure for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra addExtra(com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode) throws Exception
	{
		return addExtra( productExtra,  productCode,  null);
	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.addExtra( productExtra,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productExtra Properties of the product extra to configure for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra addExtra(com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.addExtraClient(_dataViewMode,  productExtra,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.updateExtraValueLocalizedDeltaPrices( localizedDeltaPrice,  productCode,  attributeFQN,  value);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @param localizedDeltaPrice 
	 * @return List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> updateExtraValueLocalizedDeltaPrices(List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> localizedDeltaPrice, String productCode, String attributeFQN, String value) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.updateExtraValueLocalizedDeltaPricesClient(_dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.updateExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param value 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice updateExtraValueLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		return updateExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtraValueDeltaPrice productExtraValueDeltaPrice = productextra.updateExtraValueLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice updateExtraValueLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.updateExtraValueLocalizedDeltaPriceClient(_dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.updateExtra( productExtra,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of the extra attribute to update for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra updateExtra(com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN) throws Exception
	{
		return updateExtra( productExtra,  productCode,  attributeFQN,  null);
	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	ProductExtra productExtra = productextra.updateExtra( productExtra,  productCode,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productExtra Properties of the extra attribute to update for the specified product.
	 * @return com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public com.mozu.api.contracts.productadmin.ProductExtra updateExtra(com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.updateExtraClient(_dataViewMode,  productExtra,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Delete a product extra configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	productextra.deleteExtra( productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return 
	 */
	public void deleteExtra(String productCode, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.deleteExtraClient(_dataViewMode,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductExtra productextra = new ProductExtra();
	 *	productextra.deleteExtraValueLocalizedDeltaPrice( productCode,  attributeFQN,  value,  currencyCode);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param currencyCode 
	 * @param productCode 
	 * @param value Use this field to include those fields which are not included by default.
	 * @return 
	 */
	public void deleteExtraValueLocalizedDeltaPrice(String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductExtraClient.deleteExtraValueLocalizedDeltaPriceClient(_dataViewMode,  productCode,  attributeFQN,  value,  currencyCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



