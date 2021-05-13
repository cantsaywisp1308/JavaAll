package Demo;

import Entities.Product;
import Models.ProductModel;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product("ID01","Name 1",6,7.2);
		ProductModel productModel = new ProductModel();
		if(productModel.save(product)) {
			System.out.println("Success"); 
		} else {
			System.out.println("Fail"); 
		}
	}

}
