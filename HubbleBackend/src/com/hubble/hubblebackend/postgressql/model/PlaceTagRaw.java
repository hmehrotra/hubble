package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * PlaceTagRaw generated by hbm2java
 */
public class PlaceTagRaw implements java.io.Serializable {

	private PlaceTagRawId id;
	private boolean isUpvote;

	public PlaceTagRaw() {
	}

	public PlaceTagRaw(PlaceTagRawId id, boolean isUpvote) {
		this.id = id;
		this.isUpvote = isUpvote;
	}

	public PlaceTagRawId getId() {
		return this.id;
	}

	public void setId(PlaceTagRawId id) {
		this.id = id;
	}

	public boolean isIsUpvote() {
		return this.isUpvote;
	}

	public void setIsUpvote(boolean isUpvote) {
		this.isUpvote = isUpvote;
	}

}