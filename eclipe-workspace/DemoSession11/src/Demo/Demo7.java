package Demo;

import java.util.List;

import Entities.products;
import Modal.ProductModel;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductModel productModel = new ProductModel();
		List<products> products = productModel.findAll();
		productModel.print(products);
		//System.out.println(productModel.total(products));
		//productModel.print(productModel.search("tape", products));
		productModel.print(productModel.search(10,2019, products));
	}

}
