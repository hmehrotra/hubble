package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ArtistAnnotationId generated by hbm2java
 */
public class ArtistAnnotationId implements java.io.Serializable {

	private int artist;
	private int annotation;

	public ArtistAnnotationId() {
	}

	public ArtistAnnotationId(int artist, int annotation) {
		this.artist = artist;
		this.annotation = annotation;
	}

	public int getArtist() {
		return this.artist;
	}

	public void setArtist(int artist) {
		this.artist = artist;
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
		if (!(other instanceof ArtistAnnotationId))
			return false;
		ArtistAnnotationId castOther = (ArtistAnnotationId) other;

		return (this.getArtist() == castOther.getArtist())
				&& (this.getAnnotation() == castOther.getAnnotation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getArtist();
		result = 37 * result + this.getAnnotation();
		return result;
	}

}