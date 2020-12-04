package com.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.service.UserService;

public class MainLogin {
	
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user id");
		int uId = scanner.nextInt();
		System.out.println("Enter Password");
		String pwd = scanner.next();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/loginconfig.xml");
		User user = (User) applicationContext.getBean("user");
		user.setUserId(uId);
		user.setPassword(pwd);
		System.out.println("Entered UserId:" + user.getUserId());
       UserService service =(UserService) applicationContext.getBean("UserService");
        String answer = service.getUSerName(uId, pwd);
        System.out.println("UserName:" + answer); 
	}

}
