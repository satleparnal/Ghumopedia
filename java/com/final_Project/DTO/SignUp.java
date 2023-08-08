package com.final_Project.DTO;

public class SignUp {

	private String username;
	private String name;
	private String phone;
	private String email;
	private String password;
	
	
	
	public SignUp(String username, String password) {
		
		this.username = username;
		
		this.password = password;
	}



	public SignUp(String username, String name, String phone, String email, String password) {
		
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
