package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * InstrumentAnnotationId generated by hbm2java
 */
public class InstrumentAnnotationId implements java.io.Serializable {

	private int instrument;
	private int annotation;

	public InstrumentAnnotationId() {
	}

	public InstrumentAnnotationId(int instrument, int annotation) {
		this.instrument = instrument;
		this.annotation = annotation;
	}

	public int getInstrument() {
		return this.instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
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
		if (!(other instanceof InstrumentAnnotationId))
			return false;
		InstrumentAnnotationId castOther = (InstrumentAnnotationId) other;

		return (this.getInstrument() == castOther.getInstrument())
				&& (this.getAnnotation() == castOther.getAnnotation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getInstrument();
		result = 37 * result + this.getAnnotation();
		return result;
	}

}
