package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * Area generated by hbm2java
 */
public class Area implements java.io.Serializable {

	private int id;
	private Serializable gid;
	private String name;
	private Integer type;
	private int editsPending;
	private Date lastUpdated;
	private Short beginDateYear;
	private Short beginDateMonth;
	private Short beginDateDay;
	private Short endDateYear;
	private Short endDateMonth;
	private Short endDateDay;
	private boolean ended;
	private String comment;

	public Area() {
	}

	public Area(int id, Serializable gid, String name, int editsPending,
			boolean ended, String comment) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.editsPending = editsPending;
		this.ended = ended;
		this.comment = comment;
	}

	public Area(int id, Serializable gid, String name, Integer type,
			int editsPending, Date lastUpdated, Short beginDateYear,
			Short beginDateMonth, Short beginDateDay, Short endDateYear,
			Short endDateMonth, Short endDateDay, boolean ended, String comment) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.type = type;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
		this.beginDateYear = beginDateYear;
		this.beginDateMonth = beginDateMonth;
		this.beginDateDay = beginDateDay;
		this.endDateYear = endDateYear;
		this.endDateMonth = endDateMonth;
		this.endDateDay = endDateDay;
		this.ended = ended;
		this.comment = comment;
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

	public Short getBeginDateYear() {
		return this.beginDateYear;
	}

	public void setBeginDateYear(Short beginDateYear) {
		this.beginDateYear = beginDateYear;
	}

	public Short getBeginDateMonth() {
		return this.beginDateMonth;
	}

	public void setBeginDateMonth(Short beginDateMonth) {
		this.beginDateMonth = beginDateMonth;
	}

	public Short getBeginDateDay() {
		return this.beginDateDay;
	}

	public void setBeginDateDay(Short beginDateDay) {
		this.beginDateDay = beginDateDay;
	}

	public Short getEndDateYear() {
		return this.endDateYear;
	}

	public void setEndDateYear(Short endDateYear) {
		this.endDateYear = endDateYear;
	}

	public Short getEndDateMonth() {
		return this.endDateMonth;
	}

	public void setEndDateMonth(Short endDateMonth) {
		this.endDateMonth = endDateMonth;
	}

	public Short getEndDateDay() {
		return this.endDateDay;
	}

	public void setEndDateDay(Short endDateDay) {
		this.endDateDay = endDateDay;
	}

	public boolean isEnded() {
		return this.ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
