package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * RecordingGidRedirect generated by hbm2java
 */
public class RecordingGidRedirect implements java.io.Serializable {

	private Serializable gid;
	private int newId;
	private Date created;

	public RecordingGidRedirect() {
	}

	public RecordingGidRedirect(Serializable gid, int newId) {
		this.gid = gid;
		this.newId = newId;
	}

	public RecordingGidRedirect(Serializable gid, int newId, Date created) {
		this.gid = gid;
		this.newId = newId;
		this.created = created;
	}

	public Serializable getGid() {
		return this.gid;
	}

	public void setGid(Serializable gid) {
		this.gid = gid;
	}

	public int getNewId() {
		return this.newId;
	}

	public void setNewId(int newId) {
		this.newId = newId;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
