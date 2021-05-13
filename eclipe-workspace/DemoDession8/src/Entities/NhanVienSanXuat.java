package Entities;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
	private int Quantity;
	private double Overtime;
	
	

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getOvertime() {
		return Overtime;
	}

	public void setOvertime(double overtime) {
		Overtime = overtime;
	}
	
	

	public NhanVienSanXuat(String id, String name, String address, double index) {
		super(id, name, address, index);
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Production employee " +this.getName()+ " :");
		System.out.println("Quantity of products: ");
		int quantity = scanner.nextInt();
		this.setQuantity(quantity);
		System.out.println("Hours of overtime: ");
		double overtime = scanner.nextDouble();
		this.setOvertime(overtime);
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Quantity of products: " + this.Quantity);
		System.out.println("Hours of Overtime: "+ this.Overtime);
		System.out.println("Salary: " + this.salary());
		System.out.println("Benefits: " + this.benefits());
		System.out.println("============================="); 
		
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		double salary = this.Quantity * this.getIndex();
		return salary;
	}

	@Override
	public double benefits() {
		// TODO Auto-generated method stub
		double benefits = this.Overtime * 5000; 
		return benefits;
	} 
}
