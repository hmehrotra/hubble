package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

/**
 * Event generated by hbm2java
 */
public class Event implements java.io.Serializable {

	private int id;
	private Serializable gid;
	private String name;
	private Short beginDateYear;
	private Short beginDateMonth;
	private Short beginDateDay;
	private Short endDateYear;
	private Short endDateMonth;
	private Short endDateDay;
	private Date time;
	private Integer type;
	private boolean cancelled;
	private String setlist;
	private String comment;
	private int editsPending;
	private Date lastUpdated;
	private boolean ended;

	public Event() {
	}

	public Event(int id, Serializable gid, String name, boolean cancelled,
			String comment, int editsPending, boolean ended) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.cancelled = cancelled;
		this.comment = comment;
		this.editsPending = editsPending;
		this.ended = ended;
	}

	public Event(int id, Serializable gid, String name, Short beginDateYear,
			Short beginDateMonth, Short beginDateDay, Short endDateYear,
			Short endDateMonth, Short endDateDay, Date time, Integer type,
			boolean cancelled, String setlist, String comment,
			int editsPending, Date lastUpdated, boolean ended) {
		this.id = id;
		this.gid = gid;
		this.name = name;
		this.beginDateYear = beginDateYear;
		this.beginDateMonth = beginDateMonth;
		this.beginDateDay = beginDateDay;
		this.endDateYear = endDateYear;
		this.endDateMonth = endDateMonth;
		this.endDateDay = endDateDay;
		this.time = time;
		this.type = type;
		this.cancelled = cancelled;
		this.setlist = setlist;
		this.comment = comment;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
		this.ended = ended;
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

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getSetlist() {
		return this.setlist;
	}

	public void setSetlist(String setlist) {
		this.setlist = setlist;
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

	public boolean isEnded() {
		return this.ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

}