package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AreaTag generated by hbm2java
 */
public class AreaTag implements java.io.Serializable {

	private AreaTagId id;
	private int count;
	private Date lastUpdated;

	public AreaTag() {
	}

	public AreaTag(AreaTagId id, int count) {
		this.id = id;
		this.count = count;
	}

	public AreaTag(AreaTagId id, int count, Date lastUpdated) {
		this.id = id;
		this.count = count;
		this.lastUpdated = lastUpdated;
	}

	public AreaTagId getId() {
		return this.id;
	}

	public void setId(AreaTagId id) {
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
