package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EventAnnotationId generated by hbm2java
 */
public class EventAnnotationId implements java.io.Serializable {

	private int event;
	private int annotation;

	public EventAnnotationId() {
	}

	public EventAnnotationId(int event, int annotation) {
		this.event = event;
		this.annotation = annotation;
	}

	public int getEvent() {
		return this.event;
	}

	public void setEvent(int event) {
		this.event = event;
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
		if (!(other instanceof EventAnnotationId))
			return false;
		EventAnnotationId castOther = (EventAnnotationId) other;

		return (this.getEvent() == castOther.getEvent())
				&& (this.getAnnotation() == castOther.getAnnotation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEvent();
		result = 37 * result + this.getAnnotation();
		return result;
	}

}