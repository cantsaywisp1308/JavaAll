package Models;

import Entity.Product;

public class ProductModel {
	
	public void create(Product product) {
		System.out.println("Saved");
		System.out.println("Saved " + product.getId());
		System.out.println("Saved " + product.getName());
	}
	
	public Product find() {
		Product product1 = new Product(); 
		product1.setId("pd01");
		product1.setName("Name 01");
		product1.setPrice(5.6);
		product1.setQuantity(2);
		product1.setStatus(true);
		return product1; 
	}
}
