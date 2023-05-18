package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@GetMapping("/check")
	public String check()
	{
		return "welcome to check user-1";
	}
}
