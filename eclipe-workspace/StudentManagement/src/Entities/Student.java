package Entities;

import java.util.Date;

public class Student {
	
	private String username;
	private String password;
	private String fullName;
	private String gender;
	private Date birthday;
	private String ClassNumber;
	private String phone;
	private String email;
	private boolean status;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setClassNumber(String classNumber) {
		ClassNumber = classNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getClassNumber() {
		return ClassNumber;
	}
	public void setClass(String class1) {
		ClassNumber = class1;
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
	
	
	public Student(String username, String password, String fullName, String gender, Date birthday, String classNumber,
			String phone, String email, boolean status) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		ClassNumber = classNumber;
		this.phone = phone;
		this.email = email;
		this.status = status;
	}
	public Student() {
		super();
	}
	
	

}
