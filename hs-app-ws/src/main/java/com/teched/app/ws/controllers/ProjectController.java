package com.teched.app.ws.controllers;

import com.teched.app.ws.entities.Course;
import com.teched.app.ws.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping
	public String getProjects() {
		return "Projects returned";
	}

	@PostMapping
	public ResponseEntity<Course> createProject(@RequestBody Course course){
		Course course1 = projectService.saveOrUpdateProject(course);
		return new ResponseEntity<Course>(course, HttpStatus.CREATED);
	}
}
