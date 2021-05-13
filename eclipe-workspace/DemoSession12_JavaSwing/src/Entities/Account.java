package Entities;

public class Account {
	private String username;
	private String password;
	private String fullName;
	private byte[] photo;
	private String securityCode;
	private boolean status;
	private String email; 
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Account(String username, String password, String fullName, byte[] photo, String securityCode, boolean status,
			String email) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.photo = photo;
		this.securityCode = securityCode;
		this.status = status;
		this.email = email;
	}
	public Account() {
		super();
	}
	
}
