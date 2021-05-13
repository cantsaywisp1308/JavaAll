package Demo;

import Entities.Product;
import Model.ProductModel;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductModel productModel = new ProductModel();
		Product product = productModel.find(2);
		if (product == null ) {
			System.out.println("Not Found");
		} else {
			System.out.println(product.toString());
			System.out.println("============================");
		}
	}

}
