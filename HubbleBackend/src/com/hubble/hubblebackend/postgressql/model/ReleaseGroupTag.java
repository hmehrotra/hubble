package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ReleaseGroupTag generated by hbm2java
 */
public class ReleaseGroupTag implements java.io.Serializable {

	private ReleaseGroupTagId id;
	private int count;
	private Date lastUpdated;

	public ReleaseGroupTag() {
	}

	public ReleaseGroupTag(ReleaseGroupTagId id, int count) {
		this.id = id;
		this.count = count;
	}

	public ReleaseGroupTag(ReleaseGroupTagId id, int count, Date lastUpdated) {
		this.id = id;
		this.count = count;
		this.lastUpdated = lastUpdated;
	}

	public ReleaseGroupTagId getId() {
		return this.id;
	}

	public void setId(ReleaseGroupTagId id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
