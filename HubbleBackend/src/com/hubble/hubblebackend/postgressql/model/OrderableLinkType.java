package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

/**
 * OrderableLinkType generated by hbm2java
 */
public class OrderableLinkType implements java.io.Serializable {

	private int linkType;
	private short direction;

	public OrderableLinkType() {
	}

	public OrderableLinkType(int linkType, short direction) {
		this.linkType = linkType;
		this.direction = direction;
	}

	public int getLinkType() {
		return this.linkType;
	}

	public void setLinkType(int linkType) {
		this.linkType = linkType;
	}

	public short getDirection() {
		return this.direction;
	}

	public void setDirection(short direction) {
		this.direction = direction;
	}

}
