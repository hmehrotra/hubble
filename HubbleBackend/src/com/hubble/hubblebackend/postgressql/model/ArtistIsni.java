package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ArtistIsni generated by hbm2java
 */
public class ArtistIsni implements java.io.Serializable {

	private ArtistIsniId id;
	private int editsPending;
	private Date created;

	public ArtistIsni() {
	}

	public ArtistIsni(ArtistIsniId id, int editsPending) {
		this.id = id;
		this.editsPending = editsPending;
	}

	public ArtistIsni(ArtistIsniId id, int editsPending, Date created) {
		this.id = id;
		this.editsPending = editsPending;
		this.created = created;
	}

	public ArtistIsniId getId() {
		return this.id;
	}

	public void setId(ArtistIsniId id) {
		this.id = id;
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