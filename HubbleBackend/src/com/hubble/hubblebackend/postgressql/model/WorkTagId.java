package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * WorkTagId generated by hbm2java
 */
public class WorkTagId implements java.io.Serializable {

	private int work;
	private int tag;

	public WorkTagId() {
	}

	public WorkTagId(int work, int tag) {
		this.work = work;
		this.tag = tag;
	}

	public int getWork() {
		return this.work;
	}

	public void setWork(int work) {
		this.work = work;
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
		if (!(other instanceof WorkTagId))
			return false;
		WorkTagId castOther = (WorkTagId) other;

		return (this.getWork() == castOther.getWork())
				&& (this.getTag() == castOther.getTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getWork();
		result = 37 * result + this.getTag();
		return result;
	}

}