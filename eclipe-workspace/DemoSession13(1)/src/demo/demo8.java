package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class demo8 {

	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.importCSV("C:\\data1");
		if (products == null) {
			System.out.println("Failed");
			
		} else {
			for (Product product : products) {
				System.out.println(product.toString());
			}
		}

	}

}
