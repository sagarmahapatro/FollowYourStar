package com.demo.struts.followyourstar.service;

import com.demo.struts.followyourstar.service.dtos.UserDTO;

public interface UserService {
	UserDTO login(String userEmail, String Password);

	UserDTO registerUser(String UserName, String firstName, String lastName,
			String mobileNumber, String emailId, String password);

	void logout(String userEmail);
}
