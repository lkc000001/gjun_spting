package com.spring.core.session03.mvc.Repository;

import org.springframework.stereotype.Repository;

import com.spring.core.session03.mvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void creatUser(User user) {
		System.out.println("Repository - Creat User : " + user);
	}

}
