package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * Iso31661 generated by hbm2java
 */
public class Iso31661 implements java.io.Serializable {

	private String code;
	private int area;

	public Iso31661() {
	}

	public Iso31661(String code, int area) {
		this.code = code;
		this.area = area;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}