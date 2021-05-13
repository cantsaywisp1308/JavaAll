package demo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("age: ");
		int age = scanner.nextInt();
		System.out.println("result : " + age);
		
		System.out.print("price: ");
		double price = scanner.nextDouble();
		System.out.println("price 1: " + price);
		
		System.out.print("Status: ");
		boolean status = scanner.nextBoolean();
		System.out.print("status 1: " + status);
		
		scanner.nextLine();
		System.out.println("username: ");
		String username = scanner.nextLine();
		System.out.println("username 1: " + username);
	}

}
