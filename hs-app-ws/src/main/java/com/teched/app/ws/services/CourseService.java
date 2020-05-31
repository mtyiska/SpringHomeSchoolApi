package com.teched.app.ws.services;

import com.teched.app.ws.entities.Course;
import com.teched.app.ws.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    public Course saveOrUpdateCourse(Course course){return courseRepository.save(course);}
}
