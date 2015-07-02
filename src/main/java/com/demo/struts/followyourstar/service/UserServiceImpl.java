package com.demo.struts.followyourstar.service;

import org.springframework.stereotype.Service;

import com.demo.struts.followyourstar.persistent.daos.UserDAO;
import com.demo.struts.followyourstar.persistent.entities.User;
import com.demo.struts.followyourstar.service.dtos.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	UserDAO userDAO = null;

	@Override
	public UserDTO authonticateUser(String userEmail, String Password) {
		UserDTO userDTO = new UserDTO();
		// TODO Auto-generated method stub
		User  user = userDAO.findByEmail(userEmail);
		
		return null;
	}

	@Override
	public Boolean registerUser(String UserName, String firstName,
			String lastName, String mobileNumber, String EmailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
