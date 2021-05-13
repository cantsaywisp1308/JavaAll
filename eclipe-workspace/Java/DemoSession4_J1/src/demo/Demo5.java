package demo;

import entities.Product;
import models.ProductModel;

public class Demo5 {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId("p01");
		product.setName("Name 1");
		product.setPrice(5.6);
		product.setQuantity(2);
		product.setStatus(true);
		
		ProductModel productModel = new ProductModel();
		productModel.create(product);
		
		Product product2 = productModel.find();
		productModel.create(product2);
		
		productModel.create(productModel.find());
		
	}

}
