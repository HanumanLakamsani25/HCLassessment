package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	@RequestMapping(value = "/one")
	public String first() {
		return "hello";
	}

	@GetMapping(value = { "/two", "/three" })
	public String second() {
		return "hello1";
	}

	@GetMapping(value = "/four")
	public String third(@RequestParam("UserId") String udata) {
		System.out.println("UI data is recieved" + udata);
		return udata;
	}

	@GetMapping(value = "/five")
	public String four(@RequestParam("UserId") int udata, @RequestParam("UserName") String uname, Model model) {
		System.out.println("Received UserId" + udata);
		System.out.println("Received UserName" + uname);
		model.addAttribute("Key1", uname);
		return "success";

	}
}