package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Entities.Product;
import Model.ProductModel;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date start = simpleDateFormat.parse("01/01/2021");
			Date end = simpleDateFormat.parse("10/01/2021");
			ProductModel productModel = new ProductModel();
			List<Product> products = productModel.findAll(start,end);
			System.out.println("size: "+products.size());
			for(Product product:products) {
				System.out.println(product.toString());
				System.out.println("==================");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
