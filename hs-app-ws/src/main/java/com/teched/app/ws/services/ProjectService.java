package com.teched.app.ws.services;

import com.teched.app.ws.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teched.app.ws.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Course saveOrUpdateProject(Course course) {
		return projectRepository.save(course);
	}
}
