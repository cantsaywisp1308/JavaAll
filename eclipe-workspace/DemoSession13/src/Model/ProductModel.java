package Model;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public class ProductModel {
	
	public List<Product> importCSV(String folderName) {
		List<Product> products = new ArrayList<Product>();
		try {
			File folder = new File(folderName);
			File[] files = folder.listFiles();
			for(File file:files) {
				List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
				for(String line:lines ) {
					String[] result = line.split(",");
					Product product = new Product();
					product.setId(result[0]);
					product.setName(result[1]);
					product.setPrice(Double.parseDouble(result[2]));
					products.add(product);
				}
			}
		} catch(Exception e) {
			e.getMessage();
			return null;
		} return products;
	}
}
