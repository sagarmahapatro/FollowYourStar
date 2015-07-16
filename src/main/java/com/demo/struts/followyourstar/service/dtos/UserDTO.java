package com.demo.struts.followyourstar.service.dtos;

import java.io.Serializable;

import com.demo.struts.followyourstar.persistent.entities.User;

public class UserDTO implements Serializable {
    public static UserDTO createUserDTO(User user){
    	UserDTO userDTO = new UserDTO();
    	userDTO.userName = user.getFirstName()+" "+user.getLastName();
    	userDTO.emailId = user.getEmail();
    	userDTO.role = user.getRole().toString();
    	
    	return userDTO;
    }
	public String userName;
	public String emailId;
	public boolean isAuthonticated = false;
	public String role;
}
