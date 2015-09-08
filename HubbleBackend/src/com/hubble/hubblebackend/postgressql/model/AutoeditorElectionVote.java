package com.hubble.hubblebackend.postgressql.model;

// Generated Sep 7, 2015 5:12:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AutoeditorElectionVote generated by hbm2java
 */
public class AutoeditorElectionVote implements java.io.Serializable {

	private int id;
	private int autoeditorElection;
	private int voter;
	private int vote;
	private Date voteTime;

	public AutoeditorElectionVote() {
	}

	public AutoeditorElectionVote(int id, int autoeditorElection, int voter,
			int vote, Date voteTime) {
		this.id = id;
		this.autoeditorElection = autoeditorElection;
		this.voter = voter;
		this.vote = vote;
		this.voteTime = voteTime;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAutoeditorElection() {
		return this.autoeditorElection;
	}

	public void setAutoeditorElection(int autoeditorElection) {
		this.autoeditorElection = autoeditorElection;
	}

	public int getVoter() {
		return this.voter;
	}

	public void setVoter(int voter) {
		this.voter = voter;
	}

	public int getVote() {
		return this.vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public Date getVoteTime() {
		return this.voteTime;
	}

	public void setVoteTime(Date voteTime) {
		this.voteTime = voteTime;
	}

}
