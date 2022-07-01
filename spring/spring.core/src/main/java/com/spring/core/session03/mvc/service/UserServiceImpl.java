package com.spring.core.session03.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.session03.mvc.Repository.UserDao;
import com.spring.core.session03.mvc.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		System.out.println("Service - Add User : " + user);
		userDao.creatUser(user);
	}

}
