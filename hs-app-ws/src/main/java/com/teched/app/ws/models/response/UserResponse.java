package com.teched.app.ws.models.response;

import java.util.UUID;



public class UserResponse {

	private final UUID userID;
	private final String firstName;
	private final String lastName;
	private final String email;
	


	public UserResponse(UUID userID, String firstName, String lastName, String email) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public UUID getUserID() {
		return userID;
	}

	@Override
	public String toString() {
		return "UserResponse [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	

}
