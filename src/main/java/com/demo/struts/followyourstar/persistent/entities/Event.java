package com.demo.struts.followyourstar.persistent.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event implements DomainObject {
	private long id;

	private String name;
	private Date startTime;
	private int timeZoneOffset = 0;
	private Date votingStartTime;
	private int duration;
	private Date lastUpdateTime;
	private Set<Voter> voters = new HashSet<Voter>();
	private Location location;
	private List<Contestant> options = new ArrayList<Contestant>();
	private Progress status;

	public Event() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "START_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "TZ_OFFSET")
	public int getTimeZoneOffset() {
		return timeZoneOffset;
	}

	public void setTimeZoneOffset(int timeZoneOffset) {
		this.timeZoneOffset = timeZoneOffset;
	}

	@Column(name = "VOTING_STARTS")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getVotingStartTime() {
		return votingStartTime;
	}

	public void setVotingStartTime(Date votingStartTime) {
		this.votingStartTime = votingStartTime;
	}

	@Column(name = "DURATION")
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name = "LAST_UPDATE")
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	public Set<Voter> getVoters() {
		return voters;
	}

	public void setVoters(Set<Voter> voters) {
		this.voters = voters;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LOCATION_FK")
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	public List<Contestant> getOptions() {
		return options;
	}

	public void setOptions(List<Contestant> options) {
		this.options = options;
	}

	@Column(name = "STATE")
	@Enumerated(EnumType.STRING)
	public Progress getStatus() {
		return status;
	}

	public void setStatus(Progress status) {
		this.status = status;
	}
}
