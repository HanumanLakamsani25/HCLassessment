package com.dao;

import org.springframework.stereotype.Repository;

@Repository  //("UserDao")
public class UserDaoImp implements UserDao {
    public String getUSerName(int UserId, String Password) {
		String temp="";
		if(UserId == 1 && Password.equals("David"))
		{
			temp="David Warner";
		}
		if(UserId == 2 && Password.equals("Bairstow"))
		{
			temp="Jonny Bairstow";
		}
		if(UserId == 3 && Password.equals("Manish"))
		{
			temp="Manish Pandey";
		}
		if(UserId == 4 && Password.equals("Kane"))
		{
			temp="Kane Williamson";
		}
		if(UserId == 5 && Password.equals("Priyam"))
		{
			temp="Priyam Garg";
		}
		if(UserId == 6 && Password.equals("Jason"))
		{
			temp="Jason Holder";
		}
		if(UserId == 7 && Password.equals("Samad"))
		{
			temp="Abdul Samad";
		}
		if(UserId == 8 && Password.equals("Rashid"))
		{
			temp="Rashid Khan";
		}
		if(UserId == 9 && Password.equals("Kumar"))
		{
			temp="Bhuvaneshwar Kumarr";
		}
		if(UserId == 10 && Password.equals("Sandeep"))
		{
			temp="Sandeep Sharma";
		}
		if(UserId == 11 && Password.equals("Natarajan"))
		{
			temp="Natarajan Nattu";
		}
		return temp;
	}

}
