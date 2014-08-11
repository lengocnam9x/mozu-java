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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Define and manage discounts to apply to products, product categories, or orders. The discounts can be a specified amount off the price, percentage off the price, or for free shipping. Create a coupon code that shoppers can use to redeem the discount.
 * </summary>
 */
public class DiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DiscountResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountCollection discountCollection = discount.GetDiscounts(_dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.DiscountCollection
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts() throws Exception
	{
		return getDiscounts( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountCollection discountCollection = discount.GetDiscounts(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.DiscountCollection
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountsClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the localized content specified for the specified discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountLocalizedContent discountLocalizedContent = discount.GetDiscountContent(_dataViewMode,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent getDiscountContent(Integer discountId) throws Exception
	{
		return getDiscountContent( discountId,  null);
	}

	/**
	 * Retrieves the localized content specified for the specified discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountLocalizedContent discountLocalizedContent = discount.GetDiscountContent(_dataViewMode,  discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent getDiscountContent(Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountContentClient(_dataViewMode,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.GetDiscount(_dataViewMode,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount getDiscount(Integer discountId) throws Exception
	{
		return getDiscount( discountId,  null);
	}

	/**
	 * Retrieves the details of a single discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.GetDiscount(_dataViewMode,  discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount getDiscount(Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountClient(_dataViewMode,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generates a random code for a coupon.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	string string = discount.GenerateRandomCoupon(_dataViewMode);
	 * </code></pre></p>
	 * @return string
	 * @see string
	 */
	public String generateRandomCoupon() throws Exception
	{
		return generateRandomCoupon( null);
	}

	/**
	 * Generates a random code for a coupon.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	string string = discount.GenerateRandomCoupon(_dataViewMode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return string
	 * @see string
	 */
	public String generateRandomCoupon(String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.generateRandomCouponClient(_dataViewMode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new discount or coupon to apply to a product, category, order, or shipping.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.CreateDiscount( discount);
	 * </code></pre></p>
	 * @param discount Properties of the discount to create. You must specify the discount name, amount type, start date, and target.
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount createDiscount(com.mozu.api.contracts.productadmin.Discount discount) throws Exception
	{
		return createDiscount( discount,  null);
	}

	/**
	 * Creates a new discount or coupon to apply to a product, category, order, or shipping.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.CreateDiscount( discount,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param discount Properties of the discount to create. You must specify the discount name, amount type, start date, and target.
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount createDiscount(com.mozu.api.contracts.productadmin.Discount discount, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.createDiscountClient( discount,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the localizable content for the specified discount or rename the discount without modifying its other properties.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountLocalizedContent discountLocalizedContent = discount.UpdateDiscountContent( content,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param content The discount content to update, including the discount name.
	 * @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent updateDiscountContent(com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId) throws Exception
	{
		return updateDiscountContent( content,  discountId,  null);
	}

	/**
	 * Updates the localizable content for the specified discount or rename the discount without modifying its other properties.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	DiscountLocalizedContent discountLocalizedContent = discount.UpdateDiscountContent( content,  discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param responseFields 
	 * @param content The discount content to update, including the discount name.
	 * @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent updateDiscountContent(com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.updateDiscountContentClient( content,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a defined discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.UpdateDiscount( discount,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount to update.
	 * @param discount Properties of the discount to update.
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount updateDiscount(com.mozu.api.contracts.productadmin.Discount discount, Integer discountId) throws Exception
	{
		return updateDiscount( discount,  discountId,  null);
	}

	/**
	 * Updates one or more properties of a defined discount.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	Discount discount = discount.UpdateDiscount( discount,  discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount to update.
	 * @param responseFields 
	 * @param discount Properties of the discount to update.
	 * @return com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public com.mozu.api.contracts.productadmin.Discount updateDiscount(com.mozu.api.contracts.productadmin.Discount discount, Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.updateDiscountClient( discount,  discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a discount specified by its discount ID.
	 * <p><pre><code>
	 *	Discount discount = new Discount();
	 *	discount.DeleteDiscount( discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @return 
	 */
	public void deleteDiscount(Integer discountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.deleteDiscountClient( discountId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



