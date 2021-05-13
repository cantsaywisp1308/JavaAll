package Demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import Entities.Product;
import Model.ProductModel;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			ProductModel productModel = new ProductModel();
			Product product = new Product();
			product.setId(1);
			product.setCreated(simpleDateFormat.parse("20/11/2020"));
			product.setDescription("bad");
			product.setName("name 2");
			product.setPrice(9.2);
			product.setQuantity(21);
			product.setStatus(false);
			System.out.println(productModel.update(product));
		} catch(Exception e) {
			e.getMessage(); 
		}

		
	}

}
