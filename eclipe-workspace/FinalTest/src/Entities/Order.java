package Entities;

import java.util.Date;

public class Order {

	private int id;
	private String Name;
	private Date DateCreation;
	private boolean status;
	private String payment;
	private int CustomerId;
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
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public Order(int id, String name, Date dateCreation, boolean status, String payment, int customerId) {
		super();
		this.id = id;
		Name = name;
		DateCreation = dateCreation;
		this.status = status;
		this.payment = payment;
		CustomerId = customerId;
	}
	public Order() {
		super();
	}
	
	
}
