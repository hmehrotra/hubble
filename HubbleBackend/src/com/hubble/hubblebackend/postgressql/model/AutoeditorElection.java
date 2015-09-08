package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AutoeditorElection generated by hbm2java
 */
public class AutoeditorElection implements java.io.Serializable {

	private int id;
	private int candidate;
	private int proposer;
	private Integer seconder1;
	private Integer seconder2;
	private int status;
	private int yesVotes;
	private int noVotes;
	private Date proposeTime;
	private Date openTime;
	private Date closeTime;

	public AutoeditorElection() {
	}

	public AutoeditorElection(int id, int candidate, int proposer, int status,
			int yesVotes, int noVotes, Date proposeTime) {
		this.id = id;
		this.candidate = candidate;
		this.proposer = proposer;
		this.status = status;
		this.yesVotes = yesVotes;
		this.noVotes = noVotes;
		this.proposeTime = proposeTime;
	}

	public AutoeditorElection(int id, int candidate, int proposer,
			Integer seconder1, Integer seconder2, int status, int yesVotes,
			int noVotes, Date proposeTime, Date openTime, Date closeTime) {
		this.id = id;
		this.candidate = candidate;
		this.proposer = proposer;
		this.seconder1 = seconder1;
		this.seconder2 = seconder2;
		this.status = status;
		this.yesVotes = yesVotes;
		this.noVotes = noVotes;
		this.proposeTime = proposeTime;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCandidate() {
		return this.candidate;
	}

	public void setCandidate(int candidate) {
		this.candidate = candidate;
	}

	public int getProposer() {
		return this.proposer;
	}

	public void setProposer(int proposer) {
		this.proposer = proposer;
	}

	public Integer getSeconder1() {
		return this.seconder1;
	}

	public void setSeconder1(Integer seconder1) {
		this.seconder1 = seconder1;
	}

	public Integer getSeconder2() {
		return this.seconder2;
	}

	public void setSeconder2(Integer seconder2) {
		this.seconder2 = seconder2;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getYesVotes() {
		return this.yesVotes;
	}

	public void setYesVotes(int yesVotes) {
		this.yesVotes = yesVotes;
	}

	public int getNoVotes() {
		return this.noVotes;
	}

	public void setNoVotes(int noVotes) {
		this.noVotes = noVotes;
	}

	public Date getProposeTime() {
		return this.proposeTime;
	}

	public void setProposeTime(Date proposeTime) {
		this.proposeTime = proposeTime;
	}

	public Date getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Date getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

}
