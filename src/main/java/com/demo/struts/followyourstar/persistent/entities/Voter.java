package com.demo.struts.followyourstar.persistent.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voter implements DomainObject {
 
	private long id;
	private Date enrollmentTime;
    private Date voteRecordedTime;
    private Contestant votedForOption;
    private User user;
	private Event event;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EVENT_FK")
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Column(name="ENROLLMENT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnrollmentTime() {
		return enrollmentTime;
	}

	public void setEnrollmentTime(Date enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}

	@Column(name="VOTED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getVoteRecordedTime() {
		return voteRecordedTime;
	}

	public void setVoteRecordedTime(Date voteRecordedTime) {
		this.voteRecordedTime = voteRecordedTime;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CONTESTANT_FK")
	public Contestant getVotedForOption() {
		return votedForOption;
	}

	public void setVotedForOption(Contestant votedForOption) {
		this.votedForOption = votedForOption;
	}

	@ManyToOne
	@JoinColumn(name="USER_FK")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
