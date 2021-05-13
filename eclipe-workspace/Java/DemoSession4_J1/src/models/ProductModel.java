package models;

import entities.Product;

public class ProductModel {

	public void create(Product product) {
		System.out.println("Saved");
		System.out.println("id: " + product.getId());
		System.out.println("name: " + product.getName());
	}
	
	public Product find() {
		Product product = new Product();
		product.setId("p01");
		product.setName("Name 1");
		product.setPrice(5.6);
		product.setQuantity(2);
		product.setStatus(true);
		return product;
	}
	
}
