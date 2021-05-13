package entities;

import java.util.Scanner;

public class Invoice {
	private String id;
	private	String name;
	private	double price;
	private String payment;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	

	
	public Invoice() {
		super(); 
	}
	
	public Invoice(String id, String name, double price, String payment) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.payment = payment;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập id hoá đơn: "); 
		this.id = scanner.nextLine();
		System.out.println("Nhập name hoá đơn: "); 
		this.name = scanner.nextLine();
		System.out.println("Nhập price hoá đơn: "); 
		this.price = scanner.nextDouble(); 
		scanner.nextLine(); 
		System.out.println("Nhập payment hoá đơn: "); 
		this.payment = scanner.nextLine();
	} 
	
	public void output() {
			System.out.println("ID: "+ this.id);
			System.out.println("Name: "+ this.name);
			System.out.println("Price: "+ this.price);
			System.out.println("Payment: "+ this.payment);
		
	} 
	
}
