package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ArtistRatingRaw generated by hbm2java
 */
public class ArtistRatingRaw implements java.io.Serializable {

	private ArtistRatingRawId id;
	private short rating;

	public ArtistRatingRaw() {
	}

	public ArtistRatingRaw(ArtistRatingRawId id, short rating) {
		this.id = id;
		this.rating = rating;
	}

	public ArtistRatingRawId getId() {
		return this.id;
	}

	public void setId(ArtistRatingRawId id) {
		this.id = id;
	}

	public short getRating() {
		return this.rating;
	}

	public void setRating(short rating) {
		this.rating = rating;
	}

}
