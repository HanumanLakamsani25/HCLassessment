package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

@Service ("UserService")
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public String getUSerName(int UserId, String Password) {
		return userDao.getUSerName(UserId, Password);
		
	}
	

}
