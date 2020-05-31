package com.teched.app.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teched.app.ws.entities.Project;
import com.teched.app.ws.services.ProjectService;


@RestController
@RequestMapping("/v1")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping
	public ResponseEntity<Project> createProject(@RequestBody Project project){
		//return new ResponseEntity<Project> (project, HttpStatus.CREATED);
		return null;
	}
	
}
