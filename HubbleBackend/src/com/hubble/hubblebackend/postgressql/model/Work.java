package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * Work generated by hbm2java
 */
public class Work implements java.io.Serializable {

	private int id;
	private Serializable gid;
	private String name;
	private Integer type;
	private String comment;
	private int editsPending;
	private Date lastUpdated;
	private Integer language;

	public Work() {
	}

	public Work(int id, Serializable gid, String name, String comment,
			int editsPending) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.comment = comment;
		this.editsPending = editsPending;
	}

	public Work(int id, Serializable gid, String name, Integer type,
			String comment, int editsPending, Date lastUpdated, Integer language) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.type = type;
		this.comment = comment;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
		this.language = language;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public Integer getLanguage() {
		return this.language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

}
