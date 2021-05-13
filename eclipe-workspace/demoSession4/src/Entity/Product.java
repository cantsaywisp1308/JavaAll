package Entity;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void create() {
		System.out.println("create ");
	}
	
	public void delete(String id) {
		System.out.println("delete: "+id); 
	}
	
	public double total() {
		return this.price * this.quantity; 
	}
	
	public String kthang() {
		return this.quantity == 0 ? "Het hàng" : "Còn hàng"; 
	}
}
