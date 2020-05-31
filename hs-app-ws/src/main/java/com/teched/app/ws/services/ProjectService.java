package com.teched.app.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teched.app.ws.entities.Project;
import com.teched.app.ws.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}
}
