package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditWorkId generated by hbm2java
 */
public class EditWorkId implements java.io.Serializable {

	private int edit;
	private int work;

	public EditWorkId() {
	}

	public EditWorkId(int edit, int work) {
		this.edit = edit;
		this.work = work;
	}

	public int getEdit() {
		return this.edit;
	}

	public void setEdit(int edit) {
		this.edit = edit;
	}

	public int getWork() {
		return this.work;
	}

	public void setWork(int work) {
		this.work = work;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EditWorkId))
			return false;
		EditWorkId castOther = (EditWorkId) other;

		return (this.getEdit() == castOther.getEdit())
				&& (this.getWork() == castOther.getWork());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEdit();
		result = 37 * result + this.getWork();
		return result;
	}

}
