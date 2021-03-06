package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReleaseGroupTagRawId generated by hbm2java
 */
public class ReleaseGroupTagRawId implements java.io.Serializable {

	private int releaseGroup;
	private int editor;
	private int tag;

	public ReleaseGroupTagRawId() {
	}

	public ReleaseGroupTagRawId(int releaseGroup, int editor, int tag) {
		this.releaseGroup = releaseGroup;
		this.editor = editor;
		this.tag = tag;
	}

	public int getReleaseGroup() {
		return this.releaseGroup;
	}

	public void setReleaseGroup(int releaseGroup) {
		this.releaseGroup = releaseGroup;
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
		if (!(other instanceof ReleaseGroupTagRawId))
			return false;
		ReleaseGroupTagRawId castOther = (ReleaseGroupTagRawId) other;

		return (this.getReleaseGroup() == castOther.getReleaseGroup())
				&& (this.getEditor() == castOther.getEditor())
				&& (this.getTag() == castOther.getTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getReleaseGroup();
		result = 37 * result + this.getEditor();
		result = 37 * result + this.getTag();
		return result;
	}

}
