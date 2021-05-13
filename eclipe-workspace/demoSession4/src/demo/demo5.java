package demo;

import Entity.Product;
import Models.ProductModel;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(); 
		product1.setId("pd01");
		product1.setName("Name 01");
		product1.setPrice(5.6);
		product1.setQuantity(2);
		product1.setStatus(true);
		
		ProductModel productmodel1 = new ProductModel();
		productmodel1.create(product1);
		
		Product product2 = ProductModel.find();
		ProductModel.create(product2);
		
		ProductModel.create(ProductModel.find());
		
	}

}
