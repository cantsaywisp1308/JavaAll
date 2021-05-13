package demo;

import entities.Product;

public class Demo6 {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId("p01");
		product1.setName("Name 1");
		product1.setPrice(5.6);
		product1.setQuantity(2);
		product1.setStatus(true);
		System.out.println("total 1: " + product1.total());
		System.out.println("kiem tra 1: " + product1.kthang());
		
		Product product2 = new Product();
		product2.setId("p01");
		product2.setName("Name 1");
		product2.setPrice(3.4);
		product2.setQuantity(3);
		product2.setStatus(true);
		System.out.println("total 2: " + product2.total());
		System.out.println("kiem tra 2: " + product2.kthang());

	}

}
