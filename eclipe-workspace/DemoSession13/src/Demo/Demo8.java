package Demo;

import java.util.List;

import Entities.Product;
import Model.ProductModel;

public class Demo8 {

	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.importCSV("src/Products");
		if(products == null ) {
			System.out.println("Failed ! ");
		} else {
			for(Product product:products ) {
				product.print();
				System.out.println("================="); 
			}
		}
	}

}
