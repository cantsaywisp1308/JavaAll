package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class products {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private Date created;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public products(String id, String name, double price, int quantity, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.created = created;
	}
	public products() {
		super(); 
	}
	@Override
	public String toString() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/YYYY");
		return "products [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", created="
				+ simpleDateFormat.format(created) + "]";
	}
	
	
}
