package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
@Service
public class UserServiceImp implements UserService {
    @Autowired
	private UserDao userDao;
	@Override
	public User getUserName(User user) {
		return userDao.getUserName(user);
		
	}

}
