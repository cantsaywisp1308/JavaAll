package demo;

import Entity.Product;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(); 
		product1.setId("pd01");
		product1.setName("Name 01");
		product1.setPrice(5.6);
		product1.setQuantity(2);
		product1.setStatus(true);
		System.out.println("Total 1: " + product1.total()); 
		System.out.println("Tình trạng 1: " + product1.kthang()); 
		
		Product product2 = new Product(); 
		product2.setId("pd02");
		product2.setName("Name 02");
		product2.setPrice(9.2);
		product2.setQuantity(12);
		product2.setStatus(false);
		System.out.println("Total 2: " + product2.total()); 
		System.out.println("tình trạng 2: " + product1.kthang()); 
	}

}
