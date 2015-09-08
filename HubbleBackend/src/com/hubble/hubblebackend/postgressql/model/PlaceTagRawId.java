package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * PlaceTagRawId generated by hbm2java
 */
public class PlaceTagRawId implements java.io.Serializable {

	private int place;
	private int editor;
	private int tag;

	public PlaceTagRawId() {
	}

	public PlaceTagRawId(int place, int editor, int tag) {
		this.place = place;
		this.editor = editor;
		this.tag = tag;
	}

	public int getPlace() {
		return this.place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getEditor() {
		return this.editor;
	}

	public void setEditor(int editor) {
		this.editor = editor;
	}

	public int getTag() {
		return this.tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PlaceTagRawId))
			return false;
		PlaceTagRawId castOther = (PlaceTagRawId) other;

		return (this.getPlace() == castOther.getPlace())
				&& (this.getEditor() == castOther.getEditor())
				&& (this.getTag() == castOther.getTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPlace();
		result = 37 * result + this.getEditor();
		result = 37 * result + this.getTag();
		return result;
	}

}