package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * LabelTagId generated by hbm2java
 */
public class LabelTagId implements java.io.Serializable {

	private int label;
	private int tag;

	public LabelTagId() {
	}

	public LabelTagId(int label, int tag) {
		this.label = label;
		this.tag = tag;
	}

	public int getLabel() {
		return this.label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public int getTag() {
		return this.tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LabelTagId))
			return false;
		LabelTagId castOther = (LabelTagId) other;

		return (this.getLabel() == castOther.getLabel())
				&& (this.getTag() == castOther.getTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLabel();
		result = 37 * result + this.getTag();
		return result;
	}

}
