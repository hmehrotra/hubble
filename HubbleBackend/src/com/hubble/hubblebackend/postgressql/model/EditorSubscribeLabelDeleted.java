package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * EditorSubscribeLabelDeleted generated by hbm2java
 */
public class EditorSubscribeLabelDeleted implements java.io.Serializable {

	private EditorSubscribeLabelDeletedId id;
	private int deletedBy;

	public EditorSubscribeLabelDeleted() {
	}

	public EditorSubscribeLabelDeleted(EditorSubscribeLabelDeletedId id,
			int deletedBy) {
		this.id = id;
		this.deletedBy = deletedBy;
	}

	public EditorSubscribeLabelDeletedId getId() {
		return this.id;
	}

	public void setId(EditorSubscribeLabelDeletedId id) {
		this.id = id;
	}

	public int getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(int deletedBy) {
		this.deletedBy = deletedBy;
	}

}
