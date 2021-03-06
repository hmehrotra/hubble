package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Link generated by hbm2java
 */
public class Link implements java.io.Serializable {

	private int id;
	private int linkType;
	private Short beginDateYear;
	private Short beginDateMonth;
	private Short beginDateDay;
	private Short endDateYear;
	private Short endDateMonth;
	private Short endDateDay;
	private int attributeCount;
	private Date created;
	private boolean ended;

	public Link() {
	}

	public Link(int id, int linkType, int attributeCount, boolean ended) {
		this.id = id;
		this.linkType = linkType;
		this.attributeCount = attributeCount;
		this.ended = ended;
	}

	public Link(int id, int linkType, Short beginDateYear,
			Short beginDateMonth, Short beginDateDay, Short endDateYear,
			Short endDateMonth, Short endDateDay, int attributeCount,
			Date created, boolean ended) {
		this.id = id;
		this.linkType = linkType;
		this.beginDateYear = beginDateYear;
		this.beginDateMonth = beginDateMonth;
		this.beginDateDay = beginDateDay;
		this.endDateYear = endDateYear;
		this.endDateMonth = endDateMonth;
		this.endDateDay = endDateDay;
		this.attributeCount = attributeCount;
		this.created = created;
		this.ended = ended;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLinkType() {
		return this.linkType;
	}

	public void setLinkType(int linkType) {
		this.linkType = linkType;
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

	public int getAttributeCount() {
		return this.attributeCount;
	}

	public void setAttributeCount(int attributeCount) {
		this.attributeCount = attributeCount;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isEnded() {
		return this.ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

}
