package com.teched.app.ws.controllers;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("v1/users")
@RestController
public class UserController {
	
	@GetMapping
	public String getUsers() {
		return "user returned";
	}
	


}
