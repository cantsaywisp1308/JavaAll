package Entities;

import java.util.Date;

public class Invoice {
	private String id;
	private String name;
	private double total;
	private String payment;
	private String status;
	private Date created ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Invoice(String id, String name, double total, String payment, String status, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
		this.payment = payment;
		this.status = status;
		this.created = created;
	}
	public Invoice() {
		super();
	}
	
	
}
