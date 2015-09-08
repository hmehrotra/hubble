package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ReleaseAlias generated by hbm2java
 */
public class ReleaseAlias implements java.io.Serializable {

	private int id;
	private int release;
	private String name;
	private String locale;
	private int editsPending;
	private Date lastUpdated;
	private Integer type;
	private String sortName;
	private Short beginDateYear;
	private Short beginDateMonth;
	private Short beginDateDay;
	private Short endDateYear;
	private Short endDateMonth;
	private Short endDateDay;
	private boolean primaryForLocale;
	private boolean ended;

	public ReleaseAlias() {
	}

	public ReleaseAlias(int id, int release, String name, int editsPending,
			String sortName, boolean primaryForLocale, boolean ended) {
		this.id = id;
		this.release = release;
		this.name = name;
		this.editsPending = editsPending;
		this.sortName = sortName;
		this.primaryForLocale = primaryForLocale;
		this.ended = ended;
	}

	public ReleaseAlias(int id, int release, String name, String locale,
			int editsPending, Date lastUpdated, Integer type, String sortName,
			Short beginDateYear, Short beginDateMonth, Short beginDateDay,
			Short endDateYear, Short endDateMonth, Short endDateDay,
			boolean primaryForLocale, boolean ended) {
		this.id = id;
		this.release = release;
		this.name = name;
		this.locale = locale;
		this.editsPending = editsPending;
		this.lastUpdated = lastUpdated;
		this.type = type;
		this.sortName = sortName;
		this.beginDateYear = beginDateYear;
		this.beginDateMonth = beginDateMonth;
		this.beginDateDay = beginDateDay;
		this.endDateYear = endDateYear;
		this.endDateMonth = endDateMonth;
		this.endDateDay = endDateDay;
		this.primaryForLocale = primaryForLocale;
		this.ended = ended;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRelease() {
		return this.release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
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

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSortName() {
		return this.sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
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

	public boolean isPrimaryForLocale() {
		return this.primaryForLocale;
	}

	public void setPrimaryForLocale(boolean primaryForLocale) {
		this.primaryForLocale = primaryForLocale;
	}

	public boolean isEnded() {
		return this.ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

}
