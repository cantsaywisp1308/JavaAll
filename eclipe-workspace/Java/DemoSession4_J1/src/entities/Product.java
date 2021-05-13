package entities;

public class Product {

	private String id;
	private String name;
	private double price;
	private int quantity;
	private boolean status;

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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void create() {
		System.out.println("Create Product");
	}

	public void delete(String id) {
		System.out.println("Delete Product: " + id);
	}

	public double total() {
		return this.price * this.quantity;
	}
	
	public String kthang() {
		return this.quantity == 0 ? "Het Hang" : "Con Hang";
	}
	
	
}
