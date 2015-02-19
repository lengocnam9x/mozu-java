/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
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
	protected String documentListType;

	public String getDocumentListType() {
		return this.documentListType;
	}

	public void setDocumentListType(String documentListType) {
		this.documentListType = documentListType;
	}

	/**
	 * List of document types associated with this document list.
	 */
	protected List<String> documentTypes;
	public List<String> getDocumentTypes() {
		return this.documentTypes;
	}
	public void setDocumentTypes(List<String> documentTypes) {
		this.documentTypes = documentTypes;
	}

	/**
	 * Indicates if the document list and document list type are enabled to publish. If true, publishing of draft documents in this document list/document list type is enabled for the site. If false, all document changes are immediately published in live mode.
	 */
	protected Boolean enablePublishing;

	public Boolean getEnablePublishing() {
		return this.enablePublishing;
	}

	public void setEnablePublishing(Boolean enablePublishing) {
		this.enablePublishing = enablePublishing;
	}

	/**
	 * The fully qualified name of the document list.
	 */
	protected String listFQN;

	public String getListFQN() {
		return this.listFQN;
	}

	public void setListFQN(String listFQN) {
		this.listFQN = listFQN;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * If applicable, the registered namespace associated with objects, used to generate the fully qualified name. If no namespace is defined, the namespace associated with the tenant is automatically assigned.
	 */
	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The ID of the specific scope for the object. 
	 */
	protected Integer scopeId;

	public Integer getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(Integer scopeId) {
		this.scopeId = scopeId;
	}

	/**
	 * The scope at which the object exists, such as "Tenant", "MasterCatalog", or "Site". Scope delineates the level and area of Mozu the object exists within or affects.
	 */
	protected String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	/**
	 * Indicates the security level for the document content as public, administrator, or owner.
	 */
	protected String security;

	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	/**
	 * Indicates if modified documents are published automatically or saved to publish at a later time. If true, changed documents in this list can be saved as drafts until they are published to the site. If false, all document changes are immediately published in live mode. System-supplied and read only.
	 */
	protected Boolean supportsPublishing;

	public Boolean getSupportsPublishing() {
		return this.supportsPublishing;
	}

	public void setSupportsPublishing(Boolean supportsPublishing) {
		this.supportsPublishing = supportsPublishing;
	}

	/**
	 * List description of usages for content within a view and scope.
	 */
	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected com.fasterxml.jackson.databind.JsonNode metadata;

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

}
