package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * RecordingTagRawId generated by hbm2java
 */
public class RecordingTagRawId implements java.io.Serializable {

	private int recording;
	private int editor;
	private int tag;

	public RecordingTagRawId() {
	}

	public RecordingTagRawId(int recording, int editor, int tag) {
		this.recording = recording;
		this.editor = editor;
		this.tag = tag;
	}

	public int getRecording() {
		return this.recording;
	}

	public void setRecording(int recording) {
		this.recording = recording;
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
		if (!(other instanceof RecordingTagRawId))
			return false;
		RecordingTagRawId castOther = (RecordingTagRawId) other;

		return (this.getRecording() == castOther.getRecording())
				&& (this.getEditor() == castOther.getEditor())
				&& (this.getTag() == castOther.getTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRecording();
		result = 37 * result + this.getEditor();
		result = 37 * result + this.getTag();
		return result;
	}

}