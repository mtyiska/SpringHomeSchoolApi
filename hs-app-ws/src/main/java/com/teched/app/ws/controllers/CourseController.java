package com.teched.app.ws.controllers;


import com.teched.app.ws.entities.Course;
import com.teched.app.ws.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("v1/courses")
@RestController
public class CourseController {
	private CourseService courseService;

	@GetMapping
	public String getUsers() {
		return "user courses";
	}

	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody Course course){
		Course returnCourse =  courseService.saveOrUpdateCourse(course);
		return new ResponseEntity<Course>(returnCourse, HttpStatus.CREATED);
	}

}
