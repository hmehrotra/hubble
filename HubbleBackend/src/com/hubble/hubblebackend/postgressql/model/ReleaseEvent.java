package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReleaseEvent generated by hbm2java
 */
public class ReleaseEvent implements java.io.Serializable {

	private ReleaseEventId id;

	public ReleaseEvent() {
	}

	public ReleaseEvent(ReleaseEventId id) {
		this.id = id;
	}

	public ReleaseEventId getId() {
		return this.id;
	}

	public void setId(ReleaseEventId id) {
		this.id = id;
	}

}
