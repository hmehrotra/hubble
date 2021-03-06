package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * LinkTypeAttributeTypeId generated by hbm2java
 */
public class LinkTypeAttributeTypeId implements java.io.Serializable {

	private int linkType;
	private int attributeType;

	public LinkTypeAttributeTypeId() {
	}

	public LinkTypeAttributeTypeId(int linkType, int attributeType) {
		this.linkType = linkType;
		this.attributeType = attributeType;
	}

	public int getLinkType() {
		return this.linkType;
	}

	public void setLinkType(int linkType) {
		this.linkType = linkType;
	}

	public int getAttributeType() {
		return this.attributeType;
	}

	public void setAttributeType(int attributeType) {
		this.attributeType = attributeType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LinkTypeAttributeTypeId))
			return false;
		LinkTypeAttributeTypeId castOther = (LinkTypeAttributeTypeId) other;

		return (this.getLinkType() == castOther.getLinkType())
				&& (this.getAttributeType() == castOther.getAttributeType());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLinkType();
		result = 37 * result + this.getAttributeType();
		return result;
	}

}
