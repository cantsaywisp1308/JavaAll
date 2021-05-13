package models;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;

import java.util.List;

import entities.Product;

public class ProductModel {
	
	public List<Product> importCSV(String folderName){
		List<Product> products = new ArrayList<Product>();
		try {
			File file = new File(folderName);
			File[] files = file.listFiles();
			for (File fi : files) {
				List<String> lines = Files.readAllLines(Paths.get(fi.getAbsolutePath()));
				for(String line : lines) {
					String[] result = line.split(",");
					Product product = new Product();
					product.setId(result[0]);
					product.setName(result[1]);
					product.setPrice(Double.parseDouble(result[2].trim()));
					product.setQuantity(Integer.parseInt(result[3].trim()));
					products.add(product);
				}
			}
		} catch (Exception e) {
			products = null;
		}
		return products;
	}  

}
