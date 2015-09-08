package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Isrc generated by hbm2java
 */
public class Isrc implements java.io.Serializable {

	private int id;
	private int recording;
	private String isrc;
	private Short source;
	private int editsPending;
	private Date created;

	public Isrc() {
	}

	public Isrc(int id, int recording, String isrc, int editsPending) {
		this.id = id;
		this.recording = recording;
		this.isrc = isrc;
		this.editsPending = editsPending;
	}

	public Isrc(int id, int recording, String isrc, Short source,
			int editsPending, Date created) {
		this.id = id;
		this.recording = recording;
		this.isrc = isrc;
		this.source = source;
		this.editsPending = editsPending;
		this.created = created;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRecording() {
		return this.recording;
	}

	public void setRecording(int recording) {
		this.recording = recording;
	}

	public String getIsrc() {
		return this.isrc;
	}

	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	public Short getSource() {
		return this.source;
	}

	public void setSource(Short source) {
		this.source = source;
	}

	public int getEditsPending() {
		return this.editsPending;
	}

	public void setEditsPending(int editsPending) {
		this.editsPending = editsPending;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}