/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class DocumentUrl
{

	/**
	 * Get Resource Url for GetDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for TransformDocumentContent
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
	 * @return   String Resource Url
	 */
	public static MozuUrl transformDocumentContentUrl(String crop, String documentId, String documentListName, Integer height, Integer max, Integer maxHeight, Integer maxWidth, Integer quality, Integer width)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/transform?width={width}&height={height}&maxWidth={maxWidth}&maxHeight={maxHeight}&crop={crop}&quality={quality}");
		formatter.formatUrl("crop", crop);
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("height", height);
		formatter.formatUrl("max", max);
		formatter.formatUrl("maxHeight", maxHeight);
		formatter.formatUrl("maxWidth", maxWidth);
		formatter.formatUrl("quality", quality);
		formatter.formatUrl("width", width);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param includeInactive Include inactive content.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentUrl(String documentId, String documentListName, Boolean includeInactive, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}?includeInactive={includeInactive}&responseFields={responseFields}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("includeInactive", includeInactive);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocuments
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeInactive Include inactive content.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentsUrl(String documentListName, String filter, Boolean includeInactive, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents?filter={filter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}&includeInactive={includeInactive}&responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("includeInactive", includeInactive);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDocument
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDocumentUrl(String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentUrl(String documentId, String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}?responseFields={responseFields}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

