package demo;

import entities.Product;

public class Demo4 {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId("p01");
		product.setName("Name 1");
		product.setPrice(5.6);
		product.setQuantity(2);
		product.setStatus(true);

		double total = product.getPrice() * product.getQuantity();
		System.out.println("total: " + total);

		if (product.getQuantity() == 0) {
			System.out.println("Het Hang");
		} else {
			System.out.println("Con Hang");
		}

		if (product.isStatus()) {
			System.out.println("Kich Hoat");
		} else {
			System.out.println("Khong Kich Hoat");
		}
		
		product.create();
		product.delete("p02");
		
		

	}

}
