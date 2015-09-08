package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReleaseGroupAnnotationId generated by hbm2java
 */
public class ReleaseGroupAnnotationId implements java.io.Serializable {

	private int releaseGroup;
	private int annotation;

	public ReleaseGroupAnnotationId() {
	}

	public ReleaseGroupAnnotationId(int releaseGroup, int annotation) {
		this.releaseGroup = releaseGroup;
		this.annotation = annotation;
	}

	public int getReleaseGroup() {
		return this.releaseGroup;
	}

	public void setReleaseGroup(int releaseGroup) {
		this.releaseGroup = releaseGroup;
	}

	public int getAnnotation() {
		return this.annotation;
	}

	public void setAnnotation(int annotation) {
		this.annotation = annotation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReleaseGroupAnnotationId))
			return false;
		ReleaseGroupAnnotationId castOther = (ReleaseGroupAnnotationId) other;

		return (this.getReleaseGroup() == castOther.getReleaseGroup())
				&& (this.getAnnotation() == castOther.getAnnotation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getReleaseGroup();
		result = 37 * result + this.getAnnotation();
		return result;
	}

}
