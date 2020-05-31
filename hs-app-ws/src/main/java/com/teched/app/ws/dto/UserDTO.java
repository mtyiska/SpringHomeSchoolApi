package com.teched.app.ws.dto;

import java.io.Serializable;
import java.util.UUID;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 8443428735567970745L;
	private long dbID;
	private final UUID userID;
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String password;
	private final String encryptedPassword;
	private final String emailVerificationToken;
	private final Boolean emailVerificationStatus;
	
	
	
	public UserDTO(long dbID, UUID userID, String firstName, String lastName, String email, String password,
			String encryptedPassword, String emailVerificationToken, Boolean emailVerificationStatus) {
		super();
		this.dbID = dbID;
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.emailVerificationToken = emailVerificationToken;
		this.emailVerificationStatus = emailVerificationStatus;
	}

	@Override
	public String toString() {
		return "UserDTO [dbID=" + dbID + ", userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", encryptedPassword=" + encryptedPassword
				+ ", emailVerificationToken=" + emailVerificationToken + ", emailVerificationStatus="
				+ emailVerificationStatus + "]";
	}
	
	public long getDbID() {
		return dbID;
	}
	public UUID getUserID() {
		return userID;
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
	public String getPassword() {
		return password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	
	
	
}
