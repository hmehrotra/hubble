package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * WorkTagRaw generated by hbm2java
 */
public class WorkTagRaw implements java.io.Serializable {

	private WorkTagRawId id;
	private boolean isUpvote;

	public WorkTagRaw() {
	}

	public WorkTagRaw(WorkTagRawId id, boolean isUpvote) {
		this.id = id;
		this.isUpvote = isUpvote;
	}

	public WorkTagRawId getId() {
		return this.id;
	}

	public void setId(WorkTagRawId id) {
		this.id = id;
	}

	public boolean isIsUpvote() {
		return this.isUpvote;
	}

	public void setIsUpvote(boolean isUpvote) {
		this.isUpvote = isUpvote;
	}

}
