package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReleaseGroupSeriesId generated by hbm2java
 */
public class ReleaseGroupSeriesId implements java.io.Serializable {

	private Integer releaseGroup;
	private Integer series;
	private Integer relationship;
	private Integer linkOrder;
	private Integer link;
	private String textValue;

	public ReleaseGroupSeriesId() {
	}

	public ReleaseGroupSeriesId(Integer releaseGroup, Integer series,
			Integer relationship, Integer linkOrder, Integer link,
			String textValue) {
		this.releaseGroup = releaseGroup;
		this.series = series;
		this.relationship = relationship;
		this.linkOrder = linkOrder;
		this.link = link;
		this.textValue = textValue;
	}

	public Integer getReleaseGroup() {
		return this.releaseGroup;
	}

	public void setReleaseGroup(Integer releaseGroup) {
		this.releaseGroup = releaseGroup;
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
		if (!(other instanceof ReleaseGroupSeriesId))
			return false;
		ReleaseGroupSeriesId castOther = (ReleaseGroupSeriesId) other;

		return ((this.getReleaseGroup() == castOther.getReleaseGroup()) || (this
				.getReleaseGroup() != null
				&& castOther.getReleaseGroup() != null && this
				.getReleaseGroup().equals(castOther.getReleaseGroup())))
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

		result = 37
				* result
				+ (getReleaseGroup() == null ? 0 : this.getReleaseGroup()
						.hashCode());
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
