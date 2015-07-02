package com.demo.struts.followyourstar.service;

import com.demo.struts.followyourstar.service.dtos.UserDTO;

public interface UserService {
    UserDTO authonticateUser(String userEmail, String Password);
    Boolean  registerUser(String UserName, String firstName, String lastName,String mobileNumber, String EmailId); 
}
