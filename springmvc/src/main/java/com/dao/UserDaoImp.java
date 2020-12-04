package com.dao;

import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImp implements UserDao {
	// JDBC
	@Override
	public User getUserName(User user) {
		if(user.getUserId() > 0  && user.getPassword().length() > 0 && user.getPassword().equals("Sunrisers"))
		{
			user.setUserName("Sunrisers");
		}
		
		if(user.getUserId() == 1  && user.getPassword().length() > 0 && user.getPassword().equals("David"))
		{
			user.setUserName("David Warner");
		}
		if(user.getUserId() == 2  && user.getPassword().length() > 0  && user.getPassword().equals("Bairstow"))
		{
			user.setUserName("Jonny Bairstow");
		}
		if(user.getUserId() == 3  && user.getPassword().length() > 0 && user.getPassword().equals("Manish"))
		{
			user.setUserName("Manish Pandey");
		}
		if(user.getUserId() == 4  && user.getPassword().length() > 0 && user.getPassword().equals("Kane"))
		{
			user.setUserName("Kane Williamson");
		}
		if(user.getUserId() == 5  && user.getPassword().length() > 0 && user.getPassword().equals("Priyam"))
		{
			user.setUserName("Priyam Garg");
		}
		if(user.getUserId() == 6  && user.getPassword().length() > 0 && user.getPassword().equals("Jason"))
		{
			user.setUserName("Jason Holder");
		}
		if(user.getUserId() == 7  && user.getPassword().length() > 0 && user.getPassword().equals("Samad"))
		{
			user.setUserName("Abdul Samad");
		}
		if(user.getUserId() == 8  && user.getPassword().length() > 0 && user.getPassword().equals("Rashid"))
		{
			user.setUserName("Rashid Khan");
		}
		if(user.getUserId() == 9 && user.getPassword().length() > 0 && user.getPassword().equals("Kumar"))
		{
			user.setUserName("Bhuvaneshwar Kumarr");
		}
		if(user.getUserId() == 10 && user.getPassword().length() > 0 && user.getPassword().equals("Sandeep"))
		{
			user.setUserName("Sandeep Sharma");
		}
		if(user.getUserId() == 11  && user.getPassword().length() > 0 && user.getPassword().equals("Natarajan"))
		{
			user.setUserName("Natarajan Nattu");
		}
		return user;

	}
}
