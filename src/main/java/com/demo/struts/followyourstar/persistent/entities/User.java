package com.demo.struts.followyourstar.persistent.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements DomainObject {

	@Id
	Long id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private byte[] portrait;
	
	public User(){
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getPortrait() {
		return portrait;
	}
	public void setPortrait(byte[] portrait) {
		this.portrait = portrait;
	}

}
