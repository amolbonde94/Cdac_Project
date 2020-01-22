package com.cdac.dao;

import com.cdac.dto.User;

public interface UserDao {

	boolean create(User user);
	User validateUser(User user);
	User select(User user);
}
