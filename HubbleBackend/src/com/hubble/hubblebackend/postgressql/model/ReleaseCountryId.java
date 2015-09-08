package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReleaseCountryId generated by hbm2java
 */
public class ReleaseCountryId implements java.io.Serializable {

	private int release;
	private int country;

	public ReleaseCountryId() {
	}

	public ReleaseCountryId(int release, int country) {
		this.release = release;
		this.country = country;
	}

	public int getRelease() {
		return this.release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReleaseCountryId))
			return false;
		ReleaseCountryId castOther = (ReleaseCountryId) other;

		return (this.getRelease() == castOther.getRelease())
				&& (this.getCountry() == castOther.getCountry());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRelease();
		result = 37 * result + this.getCountry();
		return result;
	}

}