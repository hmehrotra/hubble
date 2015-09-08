package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditReleaseGroupId generated by hbm2java
 */
public class EditReleaseGroupId implements java.io.Serializable {

	private int edit;
	private int releaseGroup;

	public EditReleaseGroupId() {
	}

	public EditReleaseGroupId(int edit, int releaseGroup) {
		this.edit = edit;
		this.releaseGroup = releaseGroup;
	}

	public int getEdit() {
		return this.edit;
	}

	public void setEdit(int edit) {
		this.edit = edit;
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
		if (!(other instanceof EditReleaseGroupId))
			return false;
		EditReleaseGroupId castOther = (EditReleaseGroupId) other;

		return (this.getEdit() == castOther.getEdit())
				&& (this.getReleaseGroup() == castOther.getReleaseGroup());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEdit();
		result = 37 * result + this.getReleaseGroup();
		return result;
	}

}