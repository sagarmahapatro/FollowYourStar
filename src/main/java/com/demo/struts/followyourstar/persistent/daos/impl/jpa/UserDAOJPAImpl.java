package com.demo.struts.followyourstar.persistent.daos.impl.jpa;

import com.demo.struts.followyourstar.persistent.daos.UserDAO;
import com.demo.struts.followyourstar.persistent.entities.User;


public class UserDAOJPAImpl extends GenaricDAOJPAImpl<User> implements UserDAO {

	public UserDAOJPAImpl() {
		super(User.class);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
