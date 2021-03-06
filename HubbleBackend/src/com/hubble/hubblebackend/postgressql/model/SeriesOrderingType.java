package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * SeriesOrderingType generated by hbm2java
 */
public class SeriesOrderingType implements java.io.Serializable {

	private int id;
	private String name;
	private Integer parent;
	private int childOrder;
	private String description;

	public SeriesOrderingType() {
	}

	public SeriesOrderingType(int id, String name, int childOrder) {
		this.id = id;
		this.name = name;
		this.childOrder = childOrder;
	}

	public SeriesOrderingType(int id, String name, Integer parent,
			int childOrder, String description) {
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.childOrder = childOrder;
		this.description = description;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParent() {
		return this.parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public int getChildOrder() {
		return this.childOrder;
	}

	public void setChildOrder(int childOrder) {
		this.childOrder = childOrder;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
