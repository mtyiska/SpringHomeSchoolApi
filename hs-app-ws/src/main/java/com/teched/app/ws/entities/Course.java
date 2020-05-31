package com.teched.app.ws.entities;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "course")
public class Course extends  TimestampedEntity{

    @NotBlank(message = "Course name is required.")
    @Column(nullable = false)
    private String courseName;

    @Size(min = 4, max = 8, message = "Please use 4 to 8 characters")
    @NotBlank(message = "Course identifier is required.")
    @Column(nullable = false, unique = true)
    private String courseIdentifier;

    @Type(type = "text")
    @NotBlank(message = "Course description is required.")
    @Lob
    @Size(min = 1, max = 140, message = "Please use no more than 140 characters")
    private String description;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    private boolean completed;

    public Course() {
        super();
    }

    public Course(String courseName, String courseIdentifier, String description) {
        super();
        this.courseName = courseName;
        this.courseIdentifier = courseIdentifier;
        this.description = description;
        this.completed = false;
    }

    public Course(String courseName, String courseIdentifier, String description, boolean completed) {
        super();
        this.courseName = courseName;
        this.courseIdentifier = courseIdentifier;
        this.description = description;
        this.completed = completed;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseIdentifier() {
        return courseIdentifier;
    }

    public void setCourseIdentifier(String courseIdentifier) {
        this.courseIdentifier = courseIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }



}
