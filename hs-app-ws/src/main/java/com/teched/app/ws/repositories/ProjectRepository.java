package com.teched.app.ws.repositories;

import com.teched.app.ws.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Course, Long>{

}
