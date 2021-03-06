/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.content.ActiveDateRange;

/**
 *	The document properties that define the content used by the content management system (CMS).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Long contentLength;

	public Long getContentLength() {
		return this.contentLength;
	}

	public void setContentLength(Long contentLength) {
		this.contentLength = contentLength;
	}

	protected  String contentMimeType;

	public String getContentMimeType() {
		return this.contentMimeType;
	}

	public void setContentMimeType(String contentMimeType) {
		this.contentMimeType = contentMimeType;
	}

	protected  DateTime contentUpdateDate;

	public DateTime getContentUpdateDate() {
		return this.contentUpdateDate;
	}

	public void setContentUpdateDate(DateTime contentUpdateDate) {
		this.contentUpdateDate = contentUpdateDate;
	}

	/**
	 * Fully qualified name of the document type. 
	 */
	protected  String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	protected  String extension;

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  DateTime insertDate;

	public DateTime getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(DateTime insertDate) {
		this.insertDate = insertDate;
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
	 * The name of the publish set that this document belongs to, if any.
	 */
	protected  String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}

	protected  String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Mozu.Content.Contracts.Document activeDateRange ApiTypeMember DOCUMENT_HERE 
	 */
	protected  ActiveDateRange activeDateRange;

	public ActiveDateRange getActiveDateRange() {
		return this.activeDateRange;
	}

	public void setActiveDateRange(ActiveDateRange activeDateRange) {
		this.activeDateRange = activeDateRange;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode properties;

	public com.fasterxml.jackson.databind.JsonNode getProperties() {
		return this.properties;
	}

	public void setProperties(com.fasterxml.jackson.databind.JsonNode properties) {
		this.properties = properties;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(properties == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, properties);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.properties = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
