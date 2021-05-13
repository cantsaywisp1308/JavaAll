package Demo;

import java.util.Date;

import Entities.Product;
import Model.ProductModel;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setCreated(new Date());
		product.setDescription("fairly good");
		product.setName("name 3");
		product.setPrice(2.6);
		product.setQuantity(25);
		product.setStatus(true);
		
		ProductModel productModel = new ProductModel();
		System.out.println(productModel.create(product)); 
	}

}
