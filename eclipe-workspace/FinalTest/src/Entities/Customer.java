package Entities;

import java.util.Date;

public class Customer {

	private int id; 
	private String Name;
	private String Address;
	private Date birthday;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer(int id, String name, String address, Date birthday, String phone) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		this.birthday = birthday;
		this.phone = phone;
	}
	public Customer() {
		super();
	}
	
	
}
