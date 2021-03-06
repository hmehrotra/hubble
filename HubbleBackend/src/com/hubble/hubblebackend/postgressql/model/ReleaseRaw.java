package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ReleaseRaw generated by hbm2java
 */
public class ReleaseRaw implements java.io.Serializable {

	private int id;
	private String title;
	private String artist;
	private Date added;
	private Date lastModified;
	private Integer lookupCount;
	private Integer modifyCount;
	private Integer source;
	private String barcode;
	private String comment;

	public ReleaseRaw() {
	}

	public ReleaseRaw(int id, String title, String comment) {
		this.id = id;
		this.title = title;
		this.comment = comment;
	}

	public ReleaseRaw(int id, String title, String artist, Date added,
			Date lastModified, Integer lookupCount, Integer modifyCount,
			Integer source, String barcode, String comment) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.added = added;
		this.lastModified = lastModified;
		this.lookupCount = lookupCount;
		this.modifyCount = modifyCount;
		this.source = source;
		this.barcode = barcode;
		this.comment = comment;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Date getAdded() {
		return this.added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Integer getLookupCount() {
		return this.lookupCount;
	}

	public void setLookupCount(Integer lookupCount) {
		this.lookupCount = lookupCount;
	}

	public Integer getModifyCount() {
		return this.modifyCount;
	}

	public void setModifyCount(Integer modifyCount) {
		this.modifyCount = modifyCount;
	}

	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
