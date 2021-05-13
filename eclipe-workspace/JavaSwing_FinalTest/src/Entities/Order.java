package Entities;

import java.util.Date;

public class Order {

	private int id;
	private String name;
	private Date datecreation;
	private boolean status;
	private String payments;
	private int customerid;
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
	public java.sql.Date getDatecreation() {
		return (java.sql.Date) datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPayments() {
		return payments;
	}
	public void setPayments(String payments) {
		this.payments = payments;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public Order(int id, String name, Date datecreation, boolean status, String payments, int customerid) {
		super();
		this.id = id;
		this.name = name;
		this.datecreation = datecreation;
		this.status = status;
		this.payments = payments;
		this.customerid = customerid;
	}
	public Order() {
		super();
	}
	
	
}
