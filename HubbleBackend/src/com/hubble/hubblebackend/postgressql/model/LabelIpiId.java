package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * LabelIpiId generated by hbm2java
 */
public class LabelIpiId implements java.io.Serializable {

	private int label;
	private String ipi;

	public LabelIpiId() {
	}

	public LabelIpiId(int label, String ipi) {
		this.label = label;
		this.ipi = ipi;
	}

	public int getLabel() {
		return this.label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public String getIpi() {
		return this.ipi;
	}

	public void setIpi(String ipi) {
		this.ipi = ipi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LabelIpiId))
			return false;
		LabelIpiId castOther = (LabelIpiId) other;

		return (this.getLabel() == castOther.getLabel())
				&& ((this.getIpi() == castOther.getIpi()) || (this.getIpi() != null
						&& castOther.getIpi() != null && this.getIpi().equals(
						castOther.getIpi())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLabel();
		result = 37 * result
				+ (getIpi() == null ? 0 : this.getIpi().hashCode());
		return result;
	}

}
