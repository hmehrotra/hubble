package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditorCollectionReleaseGroupId generated by hbm2java
 */
public class EditorCollectionReleaseGroupId implements java.io.Serializable {

	private int collection;
	private int releaseGroup;

	public EditorCollectionReleaseGroupId() {
	}

	public EditorCollectionReleaseGroupId(int collection, int releaseGroup) {
		this.collection = collection;
		this.releaseGroup = releaseGroup;
	}

	public int getCollection() {
		return this.collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}

	public int getReleaseGroup() {
		return this.releaseGroup;
	}

	public void setReleaseGroup(int releaseGroup) {
		this.releaseGroup = releaseGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EditorCollectionReleaseGroupId))
			return false;
		EditorCollectionReleaseGroupId castOther = (EditorCollectionReleaseGroupId) other;

		return (this.getCollection() == castOther.getCollection())
				&& (this.getReleaseGroup() == castOther.getReleaseGroup());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCollection();
		result = 37 * result + this.getReleaseGroup();
		return result;
	}

}
