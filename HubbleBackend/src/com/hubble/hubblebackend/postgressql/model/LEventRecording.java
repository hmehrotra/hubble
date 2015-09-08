package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * LEventRecording generated by hbm2java
 */
public class LEventRecording implements java.io.Serializable {

	private int id;
	private int link;
	private int entity0;
	private int entity1;
	private int editsPending;
	private Date lastUpdated;
	private int linkOrder;
	private String entity0Credit;
	private String entity1Credit;

	public LEventRecording() {
	}

	public LEventRecording(int id, int link, int entity0, int entity1,
			int editsPending, int linkOrder, String entity0Credit,
			String entity1Credit) {
		this.id = id;
		this.link = link;
		this.entity0 = entity0;
		this.entity1 = entity1;
		this.editsPending = editsPending;
		this.linkOrder = linkOrder;
		this.entity0Credit = entity0Credit;
		this.entity1Credit = entity1Credit;
	}

	public LEventRecording(int id, int link, int entity0, int entity1,
			int editsPending, Date lastUpdated, int linkOrder,
			String entity0Credit, String entity1Credit) {
		this.id = id;
		this.link = link;
		this.entity0 = entity0;
		this.entity1 = entity1;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
		this.linkOrder = linkOrder;
		this.entity0Credit = entity0Credit;
		this.entity1Credit = entity1Credit;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLink() {
		return this.link;
	}

	public void setLink(int link) {
		this.link = link;
	}

	public int getEntity0() {
		return this.entity0;
	}

	public void setEntity0(int entity0) {
		this.entity0 = entity0;
	}

	public int getEntity1() {
		return this.entity1;
	}

	public void setEntity1(int entity1) {
		this.entity1 = entity1;
	}

	public int getEditsPending() {
		return this.editsPending;
	}

	public void setEditsPending(int editsPending) {
		this.editsPending = editsPending;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public int getLinkOrder() {
		return this.linkOrder;
	}

	public void setLinkOrder(int linkOrder) {
		this.linkOrder = linkOrder;
	}

	public String getEntity0Credit() {
		return this.entity0Credit;
	}

	public void setEntity0Credit(String entity0Credit) {
		this.entity0Credit = entity0Credit;
	}

	public String getEntity1Credit() {
		return this.entity1Credit;
	}

	public void setEntity1Credit(String entity1Credit) {
		this.entity1Credit = entity1Credit;
	}

}
