package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImple;
import com.cdac.dto.User;

public class ServiceInterfaceImple implements ServiceInterface {

	
	private UserDao userDao = new UserDaoImple(); 
	
	@Override
	public User login(User user) {
		
	User temp=userDao.validateUser(user);
		
		return temp;
	}

	@Override
	public boolean create(User user){
		boolean b =userDao.create(user);
		// TODO Auto-generated method stub
		return b;
	}
	

}
