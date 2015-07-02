package com.demo.struts.followyourstar.persistent.daos;

import com.demo.struts.followyourstar.persistent.entities.User;

public interface UserDAO extends GenaricDAO<User> {
   User findByEmail( String email );
 }
