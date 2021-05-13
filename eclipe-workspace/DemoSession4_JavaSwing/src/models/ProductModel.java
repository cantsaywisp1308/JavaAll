package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Product;

public class ProductModel {

	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p01", "Name 1", 2, 4, true, new Date()));
		products.add(new Product("p02", "Name 2", 1, 2, false, new Date()));
		products.add(new Product("p03", "Name 3", 3, 11, true, new Date()));
		products.add(new Product("p04", "Name 4", 7, 8, false, new Date()));
		return products;
	}

	public Product find(String id) {
		for (Product product : findAll()) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

}
