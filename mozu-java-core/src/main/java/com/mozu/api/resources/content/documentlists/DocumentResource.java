/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

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
 * Use this subresource to manage documents in a document list.
 * </summary>
 */
public class DocumentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.getDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentContentClient(_dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId) throws Exception
	{
		return transformDocumentContent( documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * </code></pre></p>
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.transformDocumentContentClient( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId) throws Exception
	{
		return getDocument( documentListName,  documentId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param includeInactive Include inactive content.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentClient(_dataViewMode,  documentListName,  documentId,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName) throws Exception
	{
		return getDocuments( documentListName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeInactive Include inactive content.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentsClient(_dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		return createDocument( document,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.createDocumentClient(_dataViewMode,  document,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.updateDocumentContent( stream,  documentListName,  documentId,  contentType);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return 
	 * @see Stream
	 */
	public void updateDocumentContent(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		return updateDocument( document,  documentListName,  documentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId,  responseFields);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentClient( document,  documentListName,  documentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.deleteDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return 
	 */
	public void deleteDocument(String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.deleteDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return 
	 */
	public void deleteDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentContentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



