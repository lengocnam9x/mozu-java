/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.appdev;

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
 * This resource is not public.
 * </summary>
 */
public class PackageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	PackageSummaryCollection packageSummaryCollection = package.getAllPackages();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.appdev.PackageSummaryCollection
	 * @see com.mozu.api.contracts.appdev.PackageSummaryCollection
	 */
	public com.mozu.api.contracts.appdev.PackageSummaryCollection getAllPackages() throws Exception
	{
		return getAllPackages( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	PackageSummaryCollection packageSummaryCollection = package.getAllPackages( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.appdev.PackageSummaryCollection
	 * @see com.mozu.api.contracts.appdev.PackageSummaryCollection
	 */
	public com.mozu.api.contracts.appdev.PackageSummaryCollection getAllPackages(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> client = com.mozu.api.clients.platform.appdev.PackageClient.getAllPackagesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package getPackage(String applicationKey) throws Exception
	{
		return getPackage( applicationKey,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.getPackage( applicationKey,  includeChildren,  skipDevAccountCheck,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param includeChildren 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipDevAccountCheck 
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package getPackage(String applicationKey, Boolean includeChildren, Boolean skipDevAccountCheck, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.Package> client = com.mozu.api.clients.platform.appdev.PackageClient.getPackageClient( applicationKey,  includeChildren,  skipDevAccountCheck,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	PackageCollection packageCollection = package.getPackages( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return com.mozu.api.contracts.appdev.PackageCollection
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public com.mozu.api.contracts.appdev.PackageCollection getPackages(String applicationKey) throws Exception
	{
		return getPackages( applicationKey,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	PackageCollection packageCollection = package.getPackages( applicationKey,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.appdev.PackageCollection
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public com.mozu.api.contracts.appdev.PackageCollection getPackages(String applicationKey, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.PackageCollection> client = com.mozu.api.clients.platform.appdev.PackageClient.getPackagesClient( applicationKey,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	ApplicationSummary applicationSummary = package.getApplicationSummaryChildren( appId);
	 * </code></pre></p>
	 * @param appId appId parameter description DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.appdev.ApplicationSummary>
	 * @see com.mozu.api.contracts.appdev.ApplicationSummary
	 */
	public List<com.mozu.api.contracts.appdev.ApplicationSummary> getApplicationSummaryChildren(String appId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.appdev.ApplicationSummary>> client = com.mozu.api.clients.platform.appdev.PackageClient.getApplicationSummaryChildrenClient( appId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	ApplicationSummaryCollection applicationSummaryCollection = package.getApplicationSummaryParents();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationSummaryCollection getApplicationSummaryParents() throws Exception
	{
		return getApplicationSummaryParents( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	ApplicationSummaryCollection applicationSummaryCollection = package.getApplicationSummaryParents( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationSummaryCollection getApplicationSummaryParents(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> client = com.mozu.api.clients.platform.appdev.PackageClient.getApplicationSummaryParentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.clonePackage( applicationKey,  packageName);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}. 
	 * @param packageName 
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package clonePackage(String applicationKey, String packageName) throws Exception
	{
		return clonePackage( applicationKey,  packageName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.clonePackage( applicationKey,  packageName,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}. 
	 * @param packageName 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package clonePackage(String applicationKey, String packageName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.Package> client = com.mozu.api.clients.platform.appdev.PackageClient.clonePackageClient( applicationKey,  packageName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createNewCorePackage( packageRequest);
	 * </code></pre></p>
	 * @param packageRequest This operation is not public.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.PackageRequest
	 */
	public com.mozu.api.contracts.appdev.Package createNewCorePackage(com.mozu.api.contracts.appdev.PackageRequest packageRequest) throws Exception
	{
		return createNewCorePackage( packageRequest,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createNewCorePackage( packageRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param packageRequest This operation is not public.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.PackageRequest
	 */
	public com.mozu.api.contracts.appdev.Package createNewCorePackage(com.mozu.api.contracts.appdev.PackageRequest packageRequest, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.Package> client = com.mozu.api.clients.platform.appdev.PackageClient.createNewCorePackageClient( packageRequest,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg);
	 * </code></pre></p>
	 * @param package Properties for a package for fulfillment and shipment. A package may include one to many products, or a bundle of products.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package createPackage(com.mozu.api.contracts.appdev.Package pkg) throws Exception
	{
		return createPackage( pkg,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.createPackage( pkg,  projectId,  responseFields);
	 * </code></pre></p>
	 * @param projectId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param package Properties for a package for fulfillment and shipment. A package may include one to many products, or a bundle of products.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package createPackage(com.mozu.api.contracts.appdev.Package pkg, Integer projectId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.Package> client = com.mozu.api.clients.platform.appdev.PackageClient.createPackageClient( pkg,  projectId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  applicationKey);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}. 
	 * @param package Properties for a package for fulfillment and shipment. A package may include one to many products, or a bundle of products.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package updatePackage(com.mozu.api.contracts.appdev.Package pkg, String applicationKey) throws Exception
	{
		return updatePackage( pkg,  applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.updatePackage( pkg,  applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}. 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param package Properties for a package for fulfillment and shipment. A package may include one to many products, or a bundle of products.
	 * @return com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public com.mozu.api.contracts.appdev.Package updatePackage(com.mozu.api.contracts.appdev.Package pkg, String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.Package> client = com.mozu.api.clients.platform.appdev.PackageClient.updatePackageClient( pkg,  applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.deletePackage( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey : The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return 
	 */
	public void deletePackage(String applicationKey) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.appdev.PackageClient.deletePackageClient( applicationKey);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



