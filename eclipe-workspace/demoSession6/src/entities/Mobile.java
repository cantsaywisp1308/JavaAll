package entities;

public class Mobile {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private String category;
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Mobile() {
		super();
	}
	
	public Mobile(String id, String name, double price, int quantity, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public void output() {
		System.out.println("ID: "+ this.id);
		System.out.println("Name: "+ this.name);
		System.out.println("Price: "+ this.price);
		System.out.println("Quantity: "+ this.quantity);
		System.out.println("Category: "+ this.category);
		System.out.println("--------------------------");
	}
	
}
