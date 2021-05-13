package Models;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Entities.Product;

public class ProductModel {
	public boolean save(Product product) {
		try {
			String content = "id: "+product.getID();
			content += "\nname: "+product.getName();
			content += "\nquantity: " +product.getQuantity();
			content += "\nprice: "+product.getPrice();
			FileOutputStream fileOutputStream = new FileOutputStream("src/data/product.doc");
			fileOutputStream.write(content.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();
			return true; 
			
		} catch(Exception e) {
			return false; 
		}
	}
	
	public boolean save(List<Product> products) {
		try {
			String content =" ";
			for(Product product:products) {
				content += "id: "+product.getID() +"\n";
				content += "name: "+product.getName() +"\n";
				content += "quantity: " +product.getQuantity() +"\n";
				content += "price: "+product.getPrice() +"\n";	
				content += "========================\n";
			}
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
			String fileName = simpleDateFormat.format(new Date()) + ".doc";
			FileOutputStream fileOutputStream = new FileOutputStream("src/data/"+fileName);
			fileOutputStream.write(content.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();
			return true; 

		} catch(Exception e ) {
			return false; 
			}
	}
	
	public Product max(List<Product> products ) {
		Product m = products.get(0); 
		for(Product product:products ) {
			if(m.getPrice() < product.getPrice()) {
				m = product;
			}
		}
		return m;
	}
	
	public List<Product> sort(List<Product> products) {
		for(int i=0; i<products.size()-1 ; i++ ) {
			for(int j = i+1; j< products.size(); j++) {
				if(products.get(i).getPrice() < products.get(j).getPrice()) {
					Product temp = products.get(i);
					products.set(j, products.get(i));
					products.set(j, temp); 
				}
			}
		}
		return products;
	}
}
