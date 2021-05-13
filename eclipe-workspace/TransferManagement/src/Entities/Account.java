package Entities;

import java.util.Date;

public class Account {

	private String username;
	private String password;
	private String fullName; 
	private String securityNumber;
	private boolean status;
	private Date birthday;
	private byte[] photo;
	private String phone;
	private String email; 
	private String role;
	private String location;
	private String department;
	private String project;
	
	
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


	public String getSecurityNumber() {
		return securityNumber;
	}


	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public Account(String username, String password, String fullName, String securityNumber, boolean status,
			Date birthday, byte[] photo, String phone, String email, String role, String location, String department,
			String project) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.securityNumber = securityNumber;
		this.status = status;
		this.birthday = birthday;
		this.photo = photo;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.location = location;
		this.department = department;
		this.project = project;
	}


	public Account() {
		super();
	}
	
	
}
