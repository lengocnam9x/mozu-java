/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.returns;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Return Packages subresource to manage physical packages used to ship return replacement items.
 * </summary>
 */
public class PackageClient {
	
	/**
	 * Retrieves the package label image supplied by the carrier for a return replacement.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageLabelClient( returnId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package for which to retrieve the label.
	 * @param returnId Unique identifier of the return associated with the replacement package label to retrieve.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageLabelClient(String returnId, String packageId) throws Exception
	{
		return getPackageLabelClient( returnId,  packageId,  null);
	}

	/**
	 * Retrieves the package label image supplied by the carrier for a return replacement.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageLabelClient( returnId,  packageId,  returnAsBase64Png);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package for which to retrieve the label.
	 * @param returnAsBase64Png 
	 * @param returnId Unique identifier of the return associated with the replacement package label to retrieve.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageLabelClient(String returnId, String packageId, Boolean returnAsBase64Png) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.getPackageLabelUrl(packageId, returnAsBase64Png, returnId);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( returnId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to retrieve.
	 * @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String returnId, String packageId) throws Exception
	{
		return getPackageClient( returnId,  packageId,  null);
	}

	/**
	 * Retrieves the details of a package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( returnId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String returnId, String packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.getPackageUrl(packageId, responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new physical package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to create a replacement package.
	 * @param package Properties of the physical package for a return replacement.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId) throws Exception
	{
		return createPackageClient( pkg,  returnId,  null);
	}

	/**
	 * Creates a new physical package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return for which to create a replacement package.
	 * @param package Properties of the physical package for a return replacement.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.createPackageUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a package associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  returnId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to update.
	 * @param returnId Unique identifier of the return associated with the replacement package to update.
	 * @param package Properties of the return replacement package to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId) throws Exception
	{
		return updatePackageClient( pkg,  returnId,  packageId,  null);
	}

	/**
	 * Updates one or more properties of a package associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  returnId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the replacement package to update.
	 * @param package Properties of the return replacement package to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.updatePackageUrl(packageId, responseFields, returnId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * Deletes a package associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageClient( returnId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to delete.
	 * @param returnId Unique identifier of the return associated with the replacement package to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageClient(String returnId, String packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.deletePackageUrl(packageId, returnId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



