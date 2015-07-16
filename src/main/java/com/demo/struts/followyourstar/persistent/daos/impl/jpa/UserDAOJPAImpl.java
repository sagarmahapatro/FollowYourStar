package com.demo.struts.followyourstar.persistent.daos.impl.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

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
		User user = null;
		TypedQuery<User> query = entityManager.createNamedQuery(
				"User.findByEmail", User.class);
		query.setParameter("email", email);
		List<User> users = query.getResultList();
		if (users != null && users.size() > 0) {
			user = users.get(0);
		
		}
		return user;
	}

}
