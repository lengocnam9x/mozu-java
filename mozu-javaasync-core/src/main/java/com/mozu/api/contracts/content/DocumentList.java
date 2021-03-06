/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.content.View;

/**
 *	The list of document types and related properties that define content used by the content management system (CMS).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The type of the document list, containing content for a site. For example, a list type could be web pages.
	 */
	protected  String documentListType;

	public String getDocumentListType() {
		return this.documentListType;
	}

	public void setDocumentListType(String documentListType) {
		this.documentListType = documentListType;
	}

	protected List<String> documentTypes;
	public List<String> getDocumentTypes() {
		return this.documentTypes;
	}
	public void setDocumentTypes(List<String> documentTypes) {
		this.documentTypes = documentTypes;
	}

	/**
	 * If set, documents in this list will only be returned if the date queried for their is within their ActiveDateRange.
	 */
	protected  Boolean enableActiveDateRanges;

	public Boolean getEnableActiveDateRanges() {
		return this.enableActiveDateRanges;
	}

	public void setEnableActiveDateRanges(Boolean enableActiveDateRanges) {
		this.enableActiveDateRanges = enableActiveDateRanges;
	}

	protected  Boolean enablePublishing;

	public Boolean getEnablePublishing() {
		return this.enablePublishing;
	}

	public void setEnablePublishing(Boolean enablePublishing) {
		this.enablePublishing = enablePublishing;
	}

	/**
	 * The fully qualified name of the document list.
	 */
	protected  String listFQN;

	public String getListFQN() {
		return this.listFQN;
	}

	public void setListFQN(String listFQN) {
		this.listFQN = listFQN;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The namespace for the accessible APIs and source capabilities in the core of  APIs.
	 */
	protected  String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The unique identifier of the scope. For example, if your scope type is site, then this value would be the site id.
	 */
	protected  Integer scopeId;

	public Integer getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(Integer scopeId) {
		this.scopeId = scopeId;
	}

	/**
	 * The type of scope associated with the documentList. For example, if the documentList is pageTemplateContent, the scopeType is Site.Valid values are: "Tenant", "MasterCatalog", and "Site".
	 */
	protected  String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	/**
	 * Indicates the security level for the document content as public, administrator, or owner.
	 */
	protected  String security;

	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	/**
	 * Determines if the documentList will support ranges of dates that documents are considered 'active'. This field defaults to false and cannot be updated. If the documentList is based on a documentListType, then this value will be derived from the documentListType.
	 */
	protected  Boolean supportsActiveDateRanges;

	public Boolean getSupportsActiveDateRanges() {
		return this.supportsActiveDateRanges;
	}

	public void setSupportsActiveDateRanges(Boolean supportsActiveDateRanges) {
		this.supportsActiveDateRanges = supportsActiveDateRanges;
	}

	protected  Boolean supportsPublishing;

	public Boolean getSupportsPublishing() {
		return this.supportsPublishing;
	}

	public void setSupportsPublishing(Boolean supportsPublishing) {
		this.supportsPublishing = supportsPublishing;
	}

	/**
	 * A string array that determines where the document or entity list displays. The options are , for displaying content in the Custom Schema page in  , and , for displaying content in the site tree in Site Builder (applies only to document lists). The following example demonstrates how to display content across both options:
	 */
	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	/**
	 * The view in the site used by associated entities or document lists/list types.
	 */
	protected List<View> views;
	public List<View> getViews() {
		return this.views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(metadata == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, metadata);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.metadata = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
