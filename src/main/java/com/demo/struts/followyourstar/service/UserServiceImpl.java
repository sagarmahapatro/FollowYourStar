package com.demo.struts.followyourstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.struts.followyourstar.persistent.daos.UserDAO;
import com.demo.struts.followyourstar.persistent.entities.User;
import com.demo.struts.followyourstar.service.dtos.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO = null;

	@Override
	@Transactional()
	public UserDTO login(String userEmail, String password) {
		// TODO Auto-generated method stub
		User  user = userDAO.findByEmail(userEmail);
		 if(user != null && user.getPassword().equals(password)){
			 UserDTO userDTO = UserDTO.createUserDTO(user);
			 userDTO.isAuthonticated = true;
			 return userDTO;
		 }
		return null;
	}

	@Override
	@Transactional()
	public UserDTO registerUser(String UserName, String firstName,
			String lastName, String mobileNumber, String emailId,String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(emailId);
		user.setPassword(password);
		userDAO.save(user);
		
		return null;
	}
	
	@Override	
	public void logout(String userEmail) {
		
	}

}
