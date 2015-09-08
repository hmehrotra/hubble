package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Script generated by hbm2java
 */
public class Script implements java.io.Serializable {

	private int id;
	private String isoCode;
	private String isoNumber;
	private String name;
	private int frequency;

	public Script() {
	}

	public Script(int id, String isoCode, String isoNumber, String name,
			int frequency) {
		this.id = id;
		this.isoCode = isoCode;
		this.isoNumber = isoNumber;
		this.name = name;
		this.frequency = frequency;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsoCode() {
		return this.isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getIsoNumber() {
		return this.isoNumber;
	}

	public void setIsoNumber(String isoNumber) {
		this.isoNumber = isoNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
