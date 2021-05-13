package Demo;

import java.util.ArrayList;
import java.util.List;

import Entities.Product;
import Model.ProductModel;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProductModel productModel = new ProductModel();
			//List<Product> products = productModel.findAll();
			//List<Product> products = productModel.findAll(true);
			//List<Product> products = productModel.findAll(3,10);
			//List<Product> products = productModel.findAll("3");
			//List<Product> products = productModel.findAll(2021);
			//List<Product> products = productModel.findAll(2021,1);
			List<Product> products = productModel.findAll(2021,1,7);
			System.out.println("size: "+products.size());
			for(Product product:products) {
				System.out.println(product.toString());
				System.out.println("==================");
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}	
	}

}
