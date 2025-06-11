package com.vtechstorms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/")
	public void welcome() {
		System.out.println("Welcome To Web Application Developement");
	}

	@RequestMapping("/message")
	@ResponseBody
	public String message() {
		return "<center><b><h1>Welcome To Web Application Developement</h1></b></center>";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}


}
