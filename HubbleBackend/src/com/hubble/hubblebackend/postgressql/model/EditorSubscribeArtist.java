package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditorSubscribeArtist generated by hbm2java
 */
public class EditorSubscribeArtist implements java.io.Serializable {

	private int id;
	private int editor;
	private int artist;
	private int lastEditSent;

	public EditorSubscribeArtist() {
	}

	public EditorSubscribeArtist(int id, int editor, int artist,
			int lastEditSent) {
		this.id = id;
		this.editor = editor;
		this.artist = artist;
		this.lastEditSent = lastEditSent;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEditor() {
		return this.editor;
	}

	public void setEditor(int editor) {
		this.editor = editor;
	}

	public int getArtist() {
		return this.artist;
	}

	public void setArtist(int artist) {
		this.artist = artist;
	}

	public int getLastEditSent() {
		return this.lastEditSent;
	}

	public void setLastEditSent(int lastEditSent) {
		this.lastEditSent = lastEditSent;
	}

}
