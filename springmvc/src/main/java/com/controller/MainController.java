package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.model.User;
import com.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;

	@GetMapping(value = "/login")
	public String loginForm(Model model) {
		model.addAttribute("uobject", new User());
		return "login";
	}

	@GetMapping(value = "/loginprocess")
	public String loginData(@Valid @ModelAttribute User user,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
		 return "login";	
		}
		else 
		{
		model.addAttribute("done", userService.getUserName(user));
	}
		return "afterlogin";
	}
}
	