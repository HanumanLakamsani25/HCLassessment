package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value="/")
public class SecongController {
	
    @GetMapping(value ="/one1")
	public String one()
	{
		System.out.println("Hello");
		return "redirect:/two2";
	}
    @GetMapping(value ="/two2")
	public String two()
	{
    	System.out.println("Welcome");
    	return "login";
	}
	
}
