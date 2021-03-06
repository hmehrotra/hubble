package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditorCollectionArtistId generated by hbm2java
 */
public class EditorCollectionArtistId implements java.io.Serializable {

	private int collection;
	private int artist;

	public EditorCollectionArtistId() {
	}

	public EditorCollectionArtistId(int collection, int artist) {
		this.collection = collection;
		this.artist = artist;
	}

	public int getCollection() {
		return this.collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}

	public int getArtist() {
		return this.artist;
	}

	public void setArtist(int artist) {
		this.artist = artist;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EditorCollectionArtistId))
			return false;
		EditorCollectionArtistId castOther = (EditorCollectionArtistId) other;

		return (this.getCollection() == castOther.getCollection())
				&& (this.getArtist() == castOther.getArtist());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCollection();
		result = 37 * result + this.getArtist();
		return result;
	}

}
