package entities;

import java.util.Scanner;

public class Rectangle {
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle() {
		this.length = length;
		this.width = width;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length = : ");
		this.length = scanner.nextDouble();
		System.out.println("Width = : ");
		this.width = scanner.nextDouble();
	}
	
	public void output() {
		System.out.println("Length: "+ this.length);
		System.out.println("Width: "+ this.width);
	}
	
	public double area() {
		double dt = this.length * this.width;
		return dt;
	}
	
	public double peripheral() {
		double p = (this.length + this.width)*2;
		return p;
	}
	

	
}
