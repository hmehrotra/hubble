package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * PlaceAnnotationId generated by hbm2java
 */
public class PlaceAnnotationId implements java.io.Serializable {

	private int place;
	private int annotation;

	public PlaceAnnotationId() {
	}

	public PlaceAnnotationId(int place, int annotation) {
		this.place = place;
		this.annotation = annotation;
	}

	public int getPlace() {
		return this.place;
	}

	public void setPlace(int place) {
		this.place = place;
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
		if (!(other instanceof PlaceAnnotationId))
			return false;
		PlaceAnnotationId castOther = (PlaceAnnotationId) other;

		return (this.getPlace() == castOther.getPlace())
				&& (this.getAnnotation() == castOther.getAnnotation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPlace();
		result = 37 * result + this.getAnnotation();
		return result;
	}

}
