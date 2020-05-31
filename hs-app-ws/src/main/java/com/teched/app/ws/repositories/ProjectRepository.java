package com.teched.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teched.app.ws.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
}
