package com.demo.struts.followyourstar.persistent.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="LOCATION_PK")
public class Broadcast extends Location implements DomainObject {

	private String stationIdentifier;
	private String network;
	public String getStationIdentifier() {
		return stationIdentifier;
	}
	public void setStationIdentifier(String stationIdentifier) {
		this.stationIdentifier = stationIdentifier;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
}
