package com.teched.app.ws.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teched.app.ws.models.request.UserRequest;

@RequestMapping("v1/users")
@RestController
public class UserController {
	
	@GetMapping
	public String getUsers() {
		return "user returned";
	}
	
	@PostMapping
	public String createuser(UserRequest userDetails) {
		return "";
	}
	
	@PutMapping
	public String updateUser(UserRequest userDetails) {
		return "";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "";
	}

}
