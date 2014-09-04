/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class DocumentListTypeUrl
{

	/**
	 * Get Resource Url for CreateDocumentListType
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createDocumentListTypeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlistTypes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentListType
	 * @param documentListTypeFQN 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentListTypeUrl(String documentListTypeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlistTypes/{documentListTypeName}?responseFields={responseFields}");
		formatter.formatUrl("documentListTypeFQN", documentListTypeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

