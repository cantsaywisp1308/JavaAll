package Entities;

import java.sql.Date;

public class Customer {

	private int id;
	private String name;
	private String address;
	private Date birthday;
	private String phone;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.phone = phone;
	}

	public Customer() {
		super();
	}
	
	
}
