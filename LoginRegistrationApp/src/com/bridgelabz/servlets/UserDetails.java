package com.bridgelabz.servlets;

public class UserDetails {
	private	String username;
	private	String Password ;
	private String lastname;
	private String email;
	private String mobileno;
	
	 //constructor 
	UserDetails(){
		username=null;
		Password =null;
		lastname=null;
		email=null;
		mobileno=null;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

}
