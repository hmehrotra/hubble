package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * WorkSeriesId generated by hbm2java
 */
public class WorkSeriesId implements java.io.Serializable {

	private Integer work;
	private Integer series;
	private Integer relationship;
	private Integer linkOrder;
	private Integer link;
	private String textValue;

	public WorkSeriesId() {
	}

	public WorkSeriesId(Integer work, Integer series, Integer relationship,
			Integer linkOrder, Integer link, String textValue) {
		this.work = work;
		this.series = series;
		this.relationship = relationship;
		this.linkOrder = linkOrder;
		this.link = link;
		this.textValue = textValue;
	}

	public Integer getWork() {
		return this.work;
	}

	public void setWork(Integer work) {
		this.work = work;
	}

	public Integer getSeries() {
		return this.series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public Integer getRelationship() {
		return this.relationship;
	}

	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}

	public Integer getLinkOrder() {
		return this.linkOrder;
	}

	public void setLinkOrder(Integer linkOrder) {
		this.linkOrder = linkOrder;
	}

	public Integer getLink() {
		return this.link;
	}

	public void setLink(Integer link) {
		this.link = link;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WorkSeriesId))
			return false;
		WorkSeriesId castOther = (WorkSeriesId) other;

		return ((this.getWork() == castOther.getWork()) || (this.getWork() != null
				&& castOther.getWork() != null && this.getWork().equals(
				castOther.getWork())))
				&& ((this.getSeries() == castOther.getSeries()) || (this
						.getSeries() != null && castOther.getSeries() != null && this
						.getSeries().equals(castOther.getSeries())))
				&& ((this.getRelationship() == castOther.getRelationship()) || (this
						.getRelationship() != null
						&& castOther.getRelationship() != null && this
						.getRelationship().equals(castOther.getRelationship())))
				&& ((this.getLinkOrder() == castOther.getLinkOrder()) || (this
						.getLinkOrder() != null
						&& castOther.getLinkOrder() != null && this
						.getLinkOrder().equals(castOther.getLinkOrder())))
				&& ((this.getLink() == castOther.getLink()) || (this.getLink() != null
						&& castOther.getLink() != null && this.getLink()
						.equals(castOther.getLink())))
				&& ((this.getTextValue() == castOther.getTextValue()) || (this
						.getTextValue() != null
						&& castOther.getTextValue() != null && this
						.getTextValue().equals(castOther.getTextValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWork() == null ? 0 : this.getWork().hashCode());
		result = 37 * result
				+ (getSeries() == null ? 0 : this.getSeries().hashCode());
		result = 37
				* result
				+ (getRelationship() == null ? 0 : this.getRelationship()
						.hashCode());
		result = 37 * result
				+ (getLinkOrder() == null ? 0 : this.getLinkOrder().hashCode());
		result = 37 * result
				+ (getLink() == null ? 0 : this.getLink().hashCode());
		result = 37 * result
				+ (getTextValue() == null ? 0 : this.getTextValue().hashCode());
		return result;
	}

}
