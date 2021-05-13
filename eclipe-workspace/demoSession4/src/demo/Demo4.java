package demo;

import java.util.Scanner;

import Entity.Product;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		Product product1 = new Product(); 
		System.out.println("Nhập ID sản phẩm : ");
		product1.setId(scanner.nextLine());
		System.out.println("Nhập name sản phẩm : ");
		product1.setName(scanner.nextLine());
		System.out.println("Nhập price sản phẩm : ");
		product1.setPrice(scanner.nextDouble());
		System.out.println("Nhập quantity sản phẩm : ");
		product1.setQuantity(scanner.nextInt());
		System.out.println("Nhập status sản phẩm : ");
		product1.setStatus(scanner.nextBoolean());
		
		double tongTien = product1.getPrice() * product1.getQuantity();
		System.out.println("Tổng tiền là: " + tongTien);
		
		if(product1.getQuantity()==0 ) {
			System.out.println("Hết hàng! ");
		} else {
			System.out.println("Còn hàng! ");
		}
		
		if(product1.isStatus()) {
			System.out.println("Kích hoạt ");
		} else {
			System.out.println("Hết hạn ");
		}
		
		product1.create();
		
	}

}
