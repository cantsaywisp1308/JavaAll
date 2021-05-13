package Entities;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String username;
	private String password;
	private String fullname;
	private String description; 
	private List<String> roles = new ArrayList<String>();
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public Account(String username, String password, String fullname, String description, List<String> roles) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.description = description;
		this.roles = roles;
	}
	public Account() {
		super();
	}
	
	
	
}
