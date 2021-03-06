package com.peoplecloud.smpp.persistable.vo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {

	public static final String MO = "MO";
	public static final String MT = "MT";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Basic
	private String message;

	@Basic
	private String fromNumber;

	@Basic
	private String toNumber;

	@Basic
	private Date receivedDate;

	@Basic
	private Date sentDate;

	@Basic
	private String messageType;

	@Basic
	private String status;

	@Basic
	private String messageServer;

	@Basic
	private String application;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFromNumber() {
		return fromNumber;
	}

	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}

	public String getToNumber() {
		return toNumber;
	}

	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessageServer() {
		return messageServer;
	}

	public void setMessageServer(String messageServer) {
		this.messageServer = messageServer;
	}
}