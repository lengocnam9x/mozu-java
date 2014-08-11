/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.developer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Applications resource to manage the applications associated with a developer account.
 * </summary>
 */
public class ApplicationClient {
	
	/**
	 * Retrieves the list of applications associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> mozuClient=GetAllApplicationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationCollection applicationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> getAllApplicationsClient() throws Exception
	{
		return getAllApplicationsClient( null);
	}

	/**
	 * Retrieves the list of applications associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> mozuClient=GetAllApplicationsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationCollection applicationCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> getAllApplicationsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getAllApplicationsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the metadata of a file in a package for an application version. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageItemMetadataClient( applicationId,  packageId,  itempath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param itempath Complete file directory location and name of the item in the package to retrieve metadata.
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageItemMetadataClient(Integer applicationId, Integer packageId, String itempath) throws Exception
	{
		return getPackageItemMetadataClient( applicationId,  packageId,  itempath,  null);
	}

	/**
	 * Retrieves the metadata of a file in a package for an application version. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageItemMetadataClient( applicationId,  packageId,  itempath,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param itempath Complete file directory location and name of the item in the package to retrieve metadata.
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageItemMetadataClient(Integer applicationId, Integer packageId, String itempath, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getPackageItemMetadataUrl(applicationId, itempath, packageId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the metadata for items in a package associated with an application version, including a list of all files and subfolders. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageItemsMetadataClient( applicationId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageItemsMetadataClient(Integer applicationId, Integer packageId) throws Exception
	{
		return getPackageItemsMetadataClient( applicationId,  packageId,  null);
	}

	/**
	 * Retrieves the metadata for items in a package associated with an application version, including a list of all files and subfolders. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageItemsMetadataClient( applicationId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageItemsMetadataClient(Integer applicationId, Integer packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getPackageItemsMetadataUrl(applicationId, packageId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FolderMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the package of files and sends them to a compressed (zipped) archive.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageFilesZipClient( applicationId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param packageId The unique identifier of the package to zip.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageFilesZipClient(Integer applicationId, Integer packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getPackageFilesZipUrl(applicationId, packageId);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a package definition associated with an application version. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=GetPackageClient( packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the package to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> getPackageClient(Integer packageId) throws Exception
	{
		return getPackageClient( packageId,  null);
	}

	/**
	 * Retrieves the details of a package definition associated with an application version. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=GetPackageClient( packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> getPackageClient(Integer packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getPackageUrl(packageId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the package definitions created for an application version, including all development packages and release packages. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient=GetPackagesClient( applicationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageCollection packageCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageCollection>
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageCollection> getPackagesClient(Integer applicationId) throws Exception
	{
		return getPackagesClient( applicationId,  null);
	}

	/**
	 * Retrieves a list of the package definitions created for an application version, including all development packages and release packages. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient=GetPackagesClient( applicationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageCollection packageCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageCollection>
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageCollection> getPackagesClient(Integer applicationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getPackagesUrl(applicationId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the application specified in the request. The application specified in the request must be associated with the developer account scoped to the user claim specified in the request header, otherwise the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient=GetApplicationClient( applicationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param applicationId Unique identifier of the application.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Application>
	 * @see com.mozu.api.contracts.appdev.Application
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Application> getApplicationClient(Integer applicationId) throws Exception
	{
		return getApplicationClient( applicationId,  null);
	}

	/**
	 * Retrieves the details of the application specified in the request. The application specified in the request must be associated with the developer account scoped to the user claim specified in the request header, otherwise the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient=GetApplicationClient( applicationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param applicationId Unique identifier of the application.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Application>
	 * @see com.mozu.api.contracts.appdev.Application
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Application> getApplicationClient(Integer applicationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.getApplicationUrl(applicationId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.Application.class;
		MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Update the file name or file path of a development package or release package.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=ChangePackageFileNameOrPathClient( renameInfo,  applicationId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param packageId The unique identifier of the development or release package.
	 * @param renameInfo The file name or path to rename the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> changePackageFileNameOrPathClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, Integer applicationId, Integer packageId) throws Exception
	{
		return changePackageFileNameOrPathClient( renameInfo,  applicationId,  packageId,  null);
	}

	/**
	 * Update the file name or file path of a development package or release package.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=ChangePackageFileNameOrPathClient( renameInfo,  applicationId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param packageId The unique identifier of the development or release package.
	 * @param responseFields 
	 * @param renameInfo The file name or path to rename the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> changePackageFileNameOrPathClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, Integer applicationId, Integer packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.changePackageFileNameOrPathUrl(applicationId, packageId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(renameInfo);
		return mozuClient;

	}

	/**
	 * Uploads a file to a defined package for an application version in the file location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=AddPackageFileClient( stream,  applicationId,  packageId,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param filepath The file location to which to add the package file.
	 * @param packageId Unique identifier of the package.
	 * @param stream The contents of the package file to upload, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> addPackageFileClient(java.io.InputStream stream, Integer applicationId, Integer packageId, String filepath, String  contentType) throws Exception
	{
		return addPackageFileClient( stream,  applicationId,  packageId,  filepath,  null,  contentType);
	}

	/**
	 * Uploads a file to a defined package for an application version in the file location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=AddPackageFileClient( stream,  applicationId,  packageId,  filepath,  responseFields,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param filepath The file location to which to add the package file.
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @param stream The contents of the package file to upload, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> addPackageFileClient(java.io.InputStream stream, Integer applicationId, Integer packageId, String filepath, String responseFields, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.addPackageFileUrl(applicationId, filepath, packageId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * Creates a new development or release package for the application version specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=AddPackageClient( pkg,  applicationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param package Properties of the development or release package to define.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> addPackageClient(com.mozu.api.contracts.appdev.Package pkg, Integer applicationId) throws Exception
	{
		return addPackageClient( pkg,  applicationId,  null);
	}

	/**
	 * Creates a new development or release package for the application version specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=AddPackageClient( pkg,  applicationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param responseFields 
	 * @param package Properties of the development or release package to define.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> addPackageClient(com.mozu.api.contracts.appdev.Package pkg, Integer applicationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.addPackageUrl(applicationId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a file in a package associated with an application version.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpdatePackageFileClient( stream,  applicationId,  packageId,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param filepath The location path and name that identifies the package file to update.
	 * @param packageId The unique identifier of the package.
	 * @param stream The contents of the package file to update, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> updatePackageFileClient(java.io.InputStream stream, Integer applicationId, Integer packageId, String filepath, String  contentType) throws Exception
	{
		return updatePackageFileClient( stream,  applicationId,  packageId,  filepath,  null,  contentType);
	}

	/**
	 * Updates one or more properties of a file in a package associated with an application version.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpdatePackageFileClient( stream,  applicationId,  packageId,  filepath,  responseFields,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param filepath The location path and name that identifies the package file to update.
	 * @param packageId The unique identifier of the package.
	 * @param responseFields 
	 * @param stream The contents of the package file to update, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> updatePackageFileClient(java.io.InputStream stream, Integer applicationId, Integer packageId, String filepath, String responseFields, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.updatePackageFileUrl(applicationId, filepath, packageId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * Deletes the specified file from a package associated with an application version.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageFileClient( applicationId,  packageId,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param applicationId 
	 * @param filepath The file path and name of the file location to delete from the package.
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageFileClient(Integer applicationId, Integer packageId, String filepath) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationUrl.deletePackageFileUrl(applicationId, filepath, packageId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



