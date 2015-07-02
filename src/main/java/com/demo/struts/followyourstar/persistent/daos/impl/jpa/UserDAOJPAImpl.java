package com.demo.struts.followyourstar.persistent.daos.impl.jpa;

import org.springframework.stereotype.Repository;

import com.demo.struts.followyourstar.persistent.daos.UserDAO;
import com.demo.struts.followyourstar.persistent.entities.User;

@Repository
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
