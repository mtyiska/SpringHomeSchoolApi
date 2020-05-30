package com.teched.app.ws.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class Project implements Serializable {
	
	private static final long serialVersionUID = -592129286256341695L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String projectName;
	private String projectIdentifier;
	@Lob
	private String description;
	private LocalDateTime createdAt;
	private LocalDateTime updateAt;
	
	private boolean completed;

	public Project() {
		super();
	}

	public Project(String projectName, String projectIdentifier, String description) {
		super();
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.completed = false;
	}

	public Project(String projectName, String projectIdentifier, String description, boolean completed) {
		super();
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.completed = completed;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
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
	
	@PrePersist
	public void preSave() {
		if(this.createdAt == null) {
			setCreatedAt(LocalDateTime.now());
		}
		if(this.updateAt == null) {
			setUpdateAt(LocalDateTime.now());
		}
	}
	
	@PreUpdate
	public void preUpdate() {setUpdateAt(LocalDateTime.now());}
	
	
}
