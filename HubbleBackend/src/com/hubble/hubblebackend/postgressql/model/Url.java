package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * Url generated by hbm2java
 */
public class Url implements java.io.Serializable {

	private int id;
	private Serializable gid;
	private String url;
	private int editsPending;
	private Date lastUpdated;

	public Url() {
	}

	public Url(int id, Serializable gid, String url, int editsPending) {
		this.id = id;
		this.gid = gid;
		this.url = url;
		this.editsPending = editsPending;
	}

	public Url(int id, Serializable gid, String url, int editsPending,
			Date lastUpdated) {
		this.id = id;
		this.gid = gid;
		this.url = url;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Serializable getGid() {
		return this.gid;
	}

	public void setGid(Serializable gid) {
		this.gid = gid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

}