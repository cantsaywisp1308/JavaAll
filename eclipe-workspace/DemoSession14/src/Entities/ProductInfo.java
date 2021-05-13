package Entities;

public class ProductInfo {
	private int id;
	private String name;
	private double price;
	private String categoryName;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public ProductInfo(int id, String name, double price, String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryName = categoryName;
	}
	public ProductInfo() {
		super();
	}
	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", name=" + name + ", price=" + price + ", categoryName=" + categoryName + "]";
	}
	
	
}
