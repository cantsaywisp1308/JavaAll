package Demo;
import java.util.List;

import Entities.ProductInfo;
import Model.ProductModel;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ProductModel productModel = new ProductModel();
		List<ProductInfo> products = productModel.findAll2();
		System.out.println("Size: "+products.size());
		for(ProductInfo product: products) {
			System.out.println(product.toString());
			System.out.println("=====================");
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
