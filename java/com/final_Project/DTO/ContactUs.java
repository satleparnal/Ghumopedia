package com.final_Project.DTO;

public class ContactUs {
	
	private String name;
	private String phoneNumber;
	private String email;
	private String subject1;
	private String message;
	
	
	
	public ContactUs() {
		
	}

	public ContactUs(String name, String phoneNumber, String email, String subject1, String message) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.subject1 = subject1;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
